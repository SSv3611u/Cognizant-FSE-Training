function Event(name, date, seats) {
    this.name = name;
    this.date = date;
    this.seats = seats;
}

Event.prototype.checkAvailability = function() {
    return this.seats > 0;
};

let event1 = new Event("Community Cleanup", "2026-07-10", 20);
let output = "";

output += "Available: " + event1.checkAvailability() + "<br><br>";

Object.entries(event1).forEach(function(item) {
    output += item[0] + ": " + item[1] + "<br>";
});

document.getElementById("output").innerHTML = output;
