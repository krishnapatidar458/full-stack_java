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


document.getElementById('registrationForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent the form from submitting the traditional way

    // Form validation logic
    const firstName = document.getElementById('firstName').value;
    const lastName = document.getElementById('lastName').value;
    const email = document.getElementById('email').value;
    const mobileNo = document.getElementById('mobileNo').value;
    const branch = document.getElementById('branch').value;
    const college = document.getElementById('college').value;
    const enrollmentNo = document.getElementById('enrollmentNo').value;
    const whyAttend = document.getElementById('whyAttend').value;
    const expectation = document.getElementById('expectation').value;

    if (firstName && lastName && email && mobileNo && branch && college && enrollmentNo && whyAttend && expectation) {
        // If all fields are filled, show success message
        document.getElementById('successMessage').style.display = 'block';
    } else {
        alert('Please fill out all required fields.');
    }
});

