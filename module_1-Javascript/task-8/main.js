let events = [
    { name: "Guitar Show", category: "music" },
    { name: "Baking Class", category: "workshop" },
    { name: "Drum Night", category: "music" }
];

let selectedCategory = "all";
let searchText = "";

document.getElementById("category").onchange = function() {
    selectedCategory = this.value;
    showEvents();
};

document.getElementById("search").onkeydown = function() {
    setTimeout(function() {
        searchText = document.getElementById("search").value.toLowerCase();
        showEvents();
    }, 50);
};

function showEvents() {
    let eventList = document.getElementById("eventList");
    eventList.innerHTML = "";

    events.forEach(function(event) {
        let categoryMatch = selectedCategory === "all" || event.category === selectedCategory;
        let nameMatch = event.name.toLowerCase().includes(searchText);

        if (categoryMatch && nameMatch) {
            let div = document.createElement("div");
            div.innerHTML = event.name + " <button>Register</button>";
            div.querySelector("button").onclick = function() {
                alert("Registered for " + event.name);
            };
            eventList.appendChild(div);
        }
    });
}

showEvents();
