async function generatePassword() {
    alert("Password Generated!");
    const length = parseInt(document.getElementById('length').value);
    const upper = document.getElementById('upper').checked;
    const lower = document.getElementById('lower').checked;
    const numbers = document.getElementById('numbers').checked;
    const symbols = document.getElementById('symbols').checked;

    try {
        // const response = await fetch('http://localhost:8082/generate', {
        //     method: 'POST',
        //     headers: { 'Content-Type': 'application/json' },
        //     body: JSON.stringify({ length, upper, lower, numbers, symbols })
        // });
        const response = await fetch('http://127.0.0.1:8082/generate', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ length, upper, lower, numbers, symbols })
        });


        const password = await response.text();
        alert("Generated password from backend: " + password);  // ⬅️ DEBUG ALERT
        document.getElementById("result").innerText = "Generated Password: " + password;
    } catch (err) {
        console.error("Error generating password:", err);
        alert("Error: " + err);
    }
}
