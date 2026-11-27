const slides = document.querySelectorAll('input[name="slide"]');
const carousel = document.querySelector('.carousel');

let currentSlide = 0;
let autoplay;

function showNextSlide() {
    currentSlide = (currentSlide + 1) % slides.length;
    slides[currentSlide].checked = true;
}

function startAutoplay() {
    clearInterval(autoplay);
    autoplay = setInterval(showNextSlide, 5000);
}

slides.forEach((slide, index) => {
    slide.addEventListener('change', () => {
        currentSlide = index;
        startAutoplay();
    });
});

carousel.addEventListener('mouseenter', () => clearInterval(autoplay));
carousel.addEventListener('mouseleave', startAutoplay);

startAutoplay();
