/* =====================================
 * 레이어 팝업
 * ===================================== */
function openLayer(url, beforeOpen, afterOpen, afterClose) {
	var isBeforeOpen = beforeOpen != 'undefined' && beforeOpen != '' && beforeOpen != null,
		isAfterOpen = afterOpen != 'undefined' && afterOpen != '' && afterOpen != null,
		isAfterClose = afterClose != 'undefined' && afterClose != '' && afterClose != null;

	var layer = '<div id="layer"></div>';
	
	$(layer).bPopup({
		positionStyle: 'fixed',
		closeClass: 'btn_close',
		opacity: 0.5,
		loadUrl: url,
		onOpen: function() {
			if (isBeforeOpen) beforeOpen;
		},
		onClose: function() {
			if (isAfterClose) afterClose;
			$(this).remove();
		},
	}, function() {
		if (isAfterOpen) afterOpen;
	});
}

/* =====================================
 * $.POST
 * ===================================== */
function requestData(form) {
	var form = $('#'+form),
		data = '',
		formData = [
		form.find('input'),
		form.find('select'),
	];
	
	var dName, dValue;
	for (i=0; i<formData.length; i++) {
		for (j=0; j<formData[i].length; j++) {
			var d = formData[i][j];
			dName = d.getAttribute('name');
			dValue = d.value;
			
			if (!(i == 0 && j == 0)) data += '&';
			
			data += dName + '=' + dValue;
		}
	}
	return data;
}

// 로그인 폼
function login() {
	$('#loginForm').on('submit', function(e) {
		e.preventDefault();
		
		var form = $(this);
		var url = e.target.getAttribute('action'),
			data = requestData(form.attr('id'));
		
		$.post(url, data, function(result) {
			if (result.login == 1) {	// success
				location.reload();
			} else {
				form.addClass('err');	
			}
		});
	});
}

$(document).ready(function() {
	$('.btn_layer').on('click', function(e) {
		e.stopPropagation();
		// e.preventDefault();
		var url = e.target.getAttribute('href');
		openLayer(url);
		return false;
	});
});