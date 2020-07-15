function bg() {
	var container = $('#profile > div');
	// var bbb = $('#profile').outerHeight()+;
	$('#profile').css('min-height', $('#profile > div').outerHeight());
	// var aaa = $('#visual').outerHeight() + $('#profile').outerHeight();
	var aaa = $('#visual').outerHeight();
	console.log(aaa);
	$(window).on('scroll', function(){
		// var scrBottom = $(window).scrollTop() + $(window).height();
		var scrTop = $(window).scrollTop();
		if (aaa <= scrTop) {
			$('#profile').css('background-attachment', 'fixed');
			container.addClass('fix');
		} else {
			$('#profile').css('background-attachment', 'initial');
			container.removeClass('fix');

		}
		// console.log(scrBottom);
	});
}

function slider() {
	var projectSlider = new Swiper ('#projectSlider', {
		// If we need pagination
		pagination: {
			el: '.swiper-pagination',
		},
		speed: 1000,
		autoplay: {
			delay: 5000,
		},
	
		// Navigation arrows
		navigation: {
			nextEl: '.swiper-button-next',
			prevEl: '.swiper-button-prev',
		},

		slidesPerView: 3,
/*		// Responsive breakpoints
		breakpoints: {
			// when window width is >= 320px
			320: {
			slidesPerView: 2,
			},
			// when window width is >= 480px
			480: {
				slidesPerView: 3,
			},
			// when window width is >= 640px
			1025: {
				slidesPerView: 3,
			}
		}*/
	  })
}

$(document).ready(function() {
	bg();
	slider();

});