function toggleDiv() {
    const myDiv = document.getElementById("myDiv");
    if (myDiv.style.display === "none") {
        myDiv.style.display = "block";
    } else {
        myDiv.style.display = "none";
    }
}
const boxes = document.querySelectorAll('.card-title');

boxes.forEach(box => {
    const text = box.textContent;
    const numOfChars = 78;
    if (text.length > numOfChars) {
        const truncatedText = text.substring(0, numOfChars) + '...';
        box.textContent = truncatedText;
    }
});