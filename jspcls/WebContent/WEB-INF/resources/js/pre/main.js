$(document).ready(function(){
	$('#lbtn').click(function(){
		$(location).attr('href','/jspcls/meber/login.cls');
	});
	$('#obtn').click(function(){
		$(location).attr('href','/jspcls/day03/logout.cls');
	});
});
