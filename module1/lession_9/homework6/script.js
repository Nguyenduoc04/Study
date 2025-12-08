const container = document.getElementById("puzzle-container");
const pieces = document.querySelectorAll(".piece");
const message = document.getElementById("message");

function updatePieceImage(piece) {
    const imgIndex = piece.dataset.image;
    const part = piece.dataset.part;
    piece.src = "img/" + imgIndex + part + ".jpg";
}

pieces.forEach(piece => {
    const randomImg = Math.floor(Math.random() * 3) + 1;
    piece.dataset.image = String(randomImg);
    updatePieceImage(piece);
});

pieces.forEach(piece => {
    piece.addEventListener("click", () => {
        let current = Number(piece.dataset.image);
        current = current === 3 ? 1 : current + 1;
        piece.dataset.image = String(current);
        updatePieceImage(piece);
        checkComplete();
    });
});

function checkComplete() {
    const firstImage = pieces[0].dataset.image;
    let allSame = true;

    pieces.forEach(p => {
        if (p.dataset.image !== firstImage) {
            allSame = false;
        }
    });

    if (allSame) {
        container.classList.add("complete");
        message.textContent = "Bạn đã ghép đúng ảnh số " + firstImage + "!";
    } else {
        container.classList.remove("complete");
        message.textContent = "";
    }
}
