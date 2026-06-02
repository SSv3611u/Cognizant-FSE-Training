const events = [
    { name: "Food Festival", category: "food", seats: 20 },
    { name: "Music Night", category: "music", seats: 10 }
];

function showEvent(event, prefix = "Event") {
    const { name, category, seats } = event;
    return `${prefix}: ${name}, Category: ${category}, Seats: ${seats}`;
}

const copiedEvents = [...events];

let filtered = copiedEvents.filter(function(event) {
    return event.seats > 10;
});

document.getElementById("output").innerHTML =
    filtered.map(function(event) {
        return showEvent(event, "Available Event");
    }).join("<br>");
