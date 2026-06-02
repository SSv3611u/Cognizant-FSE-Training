let events = [
    { name: "Food Festival", seats: 3 },
    { name: "Music Night", seats: 2 },
    { name: "Art Workshop", seats: 1 }
];

const eventBox = document.querySelector("#events");

function showEvents() {
    eventBox.innerHTML = "";

    events.forEach(function(event, index) {
        let card = document.createElement("div");
        card.style.border = "1px solid gray";
        card.style.padding = "10px";
        card.style.margin = "10px";

        let title = document.createElement("h3");
        title.innerHTML = event.name;

        let seats = document.createElement("p");
        seats.innerHTML = "Seats: " + event.seats;

        let regBtn = document.createElement("button");
        regBtn.innerHTML = "Register";
        regBtn.onclick = function() {
            if (event.seats > 0) {
                event.seats--;
                showEvents();
            }
        };

        let cancelBtn = document.createElement("button");
        cancelBtn.innerHTML = "Cancel";
        cancelBtn.onclick = function() {
            event.seats++;
            showEvents();
        };

        card.appendChild(title);
        card.appendChild(seats);
        card.appendChild(regBtn);
        card.appendChild(cancelBtn);
        eventBox.appendChild(card);
    });
}

showEvents();
