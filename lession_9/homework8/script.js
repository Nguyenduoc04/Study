const good = document.getElementById("good");
const cheap = document.getElementById("cheap");
const fast = document.getElementById("fast");

// Lưu thứ tự tick
let history = [];

function update(event) {
    const changed = event.target;

    if (changed.checked) {
        history.push(changed.id);
    } else {
        history = history.filter(id => id !== changed.id);
    }

    // Luật Good-Cheap-Fast
    if (good.checked && cheap.checked && fast.checked) {
        const toTurnOff = history.find(id => id !== changed.id);
        document.getElementById(toTurnOff).checked = false;
        history = history.filter(id => id !== toTurnOff);
    }

    if (fast.checked && good.checked && cheap.checked) {
        const toTurnOff = history.find(id => id !== changed.id);
        document.getElementById(toTurnOff).checked = false;
        history = history.filter(id => id !== toTurnOff);
    }

    if (fast.checked && cheap.checked && good.checked) {
        const toTurnOff = history.find(id => id !== changed.id);
        document.getElementById(toTurnOff).checked = false;
        history = history.filter(id => id !== toTurnOff);
    }
}

[good, cheap, fast].forEach(cb => cb.addEventListener("change", update));
