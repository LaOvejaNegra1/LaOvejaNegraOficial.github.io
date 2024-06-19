let currentSlide = 0;

function showSlide(index) {
    const slides = document.querySelectorAll('.carousel-inner img');
    slides.forEach((slide, i) => {
        slide.classList.remove('active');
        if (i === index) {
            slide.classList.add('active');
        }
    });
}

function nextSlide() {
    const slides = document.querySelectorAll('.carousel-inner img');
    currentSlide = (currentSlide + 1) % slides.length;
    showSlide(currentSlide);
}

function prevSlide() {
    const slides = document.querySelectorAll('.carousel-inner img');
    currentSlide = (currentSlide - 1 + slides.length) % slides.length;
    showSlide(currentSlide);
}

// Inicializar el carrusel
document.addEventListener('DOMContentLoaded', () => {
    showSlide(currentSlide);
});

$(document).ready(function(){
    $('.productos-carousel').slick({
        infinite: true,
        slidesToShow: 3,
        slidesToScroll: 1,
        arrows: true,
        dots: true
    });
});
