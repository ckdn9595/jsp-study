$(document).ready(function(){
	$('#btn1').click(function(){
		
	})
	$('#btn2').click(function(){
		var sid = $('#id').val();
		var spw = $('#pw').val();
		
		if(!(sid&&spw)){
			return;
		}
		
		$('#frm').submit();
	});
	
})