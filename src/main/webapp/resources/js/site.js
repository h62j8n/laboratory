function openLayer(url) {
	var layer = '<div id="layer"></div>';
	$(layer).bPopup({
		positionStyle: 'fixed',
		closeClass: 'btn_close',
		opacity: 0.5,
		loadUrl: url,
		onOpen: function() {},
		onClose: function() {
			console.log($(this));
			$(this).remove();
		},
	}, function() {});
}

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

function logout() {
	$('#logoutForm').on('submit', function(e) {
		e.preventDefault();
		
		var url = e.target.getAttribute('action');
		var dest = e.target.getAttribute('data-dest');
		$.post(url, function() {
			location.href = dest;
		});
	});
}

$(document).ready(function() {
	$('.btn_layer').on('click', function(e) {
		e.preventDefault();
		var url = e.target.getAttribute('href');
		openLayer(url);
	});
});