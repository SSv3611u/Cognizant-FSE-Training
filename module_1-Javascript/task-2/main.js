const eventName = "Food Festival";
const eventDate = "15 June 2026";
let seats = 5;

document.getElementById("eventInfo").innerHTML = `${eventName} will be held on ${eventDate}`;
document.getElementById("seatInfo").innerHTML = `Available seats: ${seats}`;

function register() {
    if (seats > 0) {
        seats--;
        document.getElementById("seatInfo").innerHTML = `Available seats: ${seats}`;
    } else {
        document.getElementById("seatInfo").innerHTML = "No seats available";
    }
}
