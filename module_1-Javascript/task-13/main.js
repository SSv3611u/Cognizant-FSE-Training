console.log("debug page loaded");

document.getElementById("debugForm").addEventListener("submit", function(event) {
    event.preventDefault();
    console.log("form submit started");

    let form = event.target;
    let payload = {
        name: form.elements["name"].value,
        email: form.elements["email"].value
    };

    console.log("payload is", payload);

    fetch("https://jsonplaceholder.typicode.com/posts", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(payload)
    })
    .then(function(response) {
        console.log("response status", response.status);
        return response.json();
    })
    .then(function(data) {
        console.log("server data", data);
        document.getElementById("msg").innerHTML = "Check console and network tab";
    })
    .catch(function(error) {
        console.log("fetch error", error);
        document.getElementById("msg").innerHTML = "Something went wrong";
    });
});
