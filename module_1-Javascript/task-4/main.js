let events = [
    { name: "Guitar Show", category: "music" },
    { name: "Baking Class", category: "workshop" }
];

function addEvent(name, category) {
    events.push({ name: name, category: category });
    document.getElementById("output").innerHTML = "Event added";
}

function createRegistrationCounter() {
    let count = 0;

    return function(category) {
        count++;
        document.getElementById("output").innerHTML =
            "Total registrations for " + category + ": " + count;
    };
}

const registerUser = createRegistrationCounter();

function filterEventsByCategory(category, callback) {
    let result = events.filter(function(event) {
        return event.category === category;
    });

    callback(result);
}

function showMusicEvents() {
    filterEventsByCategory("music", function(result) {
        let text = "";
        result.forEach(function(event) {
            text += event.name + "<br>";
        });
        document.getElementById("output").innerHTML = text;
    });
}
