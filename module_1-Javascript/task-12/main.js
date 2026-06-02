document.getElementById("registerForm").addEventListener("submit", function(event) {
    event.preventDefault();

    let form = event.target;
    let userData = {
        name: form.elements["name"].value,
        email: form.elements["email"].value
    };

    document.getElementById("msg").innerHTML = "Sending data...";

    setTimeout(function() {
        fetch("https://jsonplaceholder.typicode.com/posts", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(userData)
        })
        .then(function(response) {
            return response.json();
        })
        .then(function() {
            document.getElementById("msg").innerHTML = "Registration sent successfully";
        })
        .catch(function() {
            document.getElementById("msg").innerHTML = "Failed to send registration";
        });
    }, 1000);
});
