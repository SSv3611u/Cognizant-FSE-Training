let events = [
    { name: "Guitar Show", category: "music" },
    { name: "Baking", category: "workshop" },
    { name: "Drum Night", category: "music" }
];

events.push({ name: "Painting", category: "workshop" });

let musicEvents = events.filter(function(event) {
    return event.category === "music";
});

let cards = events.map(function(event) {
    return "Workshop on " + event.name;
});

document.getElementById("output").innerHTML =
    "Music Events:<br>" +
    musicEvents.map(function(event) { return event.name; }).join("<br>") +
    "<br><br>Cards:<br>" +
    cards.join("<br>");
