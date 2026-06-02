const events = [
    { name: "Food Festival", date: "2026-06-20", seats: 10 },
    { name: "Old Music Show", date: "2024-01-10", seats: 20 },
    { name: "Health Camp", date: "2026-07-05", seats: 0 },
    { name: "Art Workshop", date: "2026-08-12", seats: 5 }
];

const today = new Date();
const eventList = document.getElementById("eventList");

events.forEach(function(event) {
    const eventDate = new Date(event.date);

    if (eventDate > today && event.seats > 0) {
        let item = document.createElement("p");
        item.innerHTML = event.name + " - Seats: " + event.seats;
        eventList.appendChild(item);
    }
});

function registerUser(eventName) {
    try {
        let event = events.find(function(item) {
            return item.name === eventName;
        });

        if (!event) {
            throw new Error("Event not found");
        }

        if (event.seats <= 0) {
            throw new Error("No seats available");
        }

        event.seats--;
        document.getElementById("msg").innerHTML = "Registered successfully";
    } catch (error) {
        document.getElementById("msg").innerHTML = error.message;
    }
}
