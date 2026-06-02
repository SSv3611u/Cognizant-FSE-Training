document.getElementById("registerForm").addEventListener("submit", function(event) {
    event.preventDefault();

    let form = event.target;
    let name = form.elements["name"].value;
    let email = form.elements["email"].value;
    let selectedEvent = form.elements["event"].value;
    let valid = true;

    document.getElementById("nameError").innerHTML = "";
    document.getElementById("emailError").innerHTML = "";
    document.getElementById("eventError").innerHTML = "";

    if (name === "") {
        document.getElementById("nameError").innerHTML = " enter name";
        valid = false;
    }

    if (email === "") {
        document.getElementById("emailError").innerHTML = " enter email";
        valid = false;
    }

    if (selectedEvent === "") {
        document.getElementById("eventError").innerHTML = " select event";
        valid = false;
    }

    if (valid) {
        document.getElementById("msg").innerHTML = "Registered for " + selectedEvent;
    }
});
