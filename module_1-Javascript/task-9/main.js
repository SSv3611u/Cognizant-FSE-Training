function showData(data) {
    let output = "";
    data.forEach(function(event) {
        output += event.name + " - " + event.category + "<br>";
    });
    document.getElementById("output").innerHTML = output;
}

function loadWithThen() {
    document.getElementById("loading").style.display = "block";

    fetch("events.json")
        .then(function(response) {
            return response.json();
        })
        .then(function(data) {
            showData(data);
            document.getElementById("loading").style.display = "none";
        })
        .catch(function() {
            document.getElementById("output").innerHTML = "Error loading events";
            document.getElementById("loading").style.display = "none";
        });
}

async function loadWithAsync() {
    try {
        document.getElementById("loading").style.display = "block";
        let response = await fetch("events.json");
        let data = await response.json();
        showData(data);
    } catch (error) {
        document.getElementById("output").innerHTML = "Error loading events";
    }

    document.getElementById("loading").style.display = "none";
}
