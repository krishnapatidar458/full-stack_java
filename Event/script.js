function handleResize() {
    var width = window.innerWidth;
    var header = document.getElementById('header');
    if (width < 768) {
        header.classList.add('bg-dark');
    } else {
        header.classList.remove('bg-dark');
    }
}

window.addEventListener('resize', handleResize);
window.addEventListener('load', handleResize);


function changeText(elementId, textArray, delay) {
    const element = document.getElementById(elementId);
    let currentIndex = 0;
    let charIndex = 0;
    let currentText = textArray[currentIndex];

    setInterval(() => {
        if (charIndex < currentText.length) {
            element.textContent += currentText[charIndex];
            charIndex++;
        } else {
            charIndex = 0;
            currentIndex = (currentIndex + 1) % textArray.length;
            currentText = textArray[currentIndex];
            element.textContent = '';
        }
    }, delay);
}

window.onload = function() {
    changeText('changingText', ['FROM IDEA TO EMPIRE','JUNE 7, 2024', 'PRESENTS'], 180);
};


