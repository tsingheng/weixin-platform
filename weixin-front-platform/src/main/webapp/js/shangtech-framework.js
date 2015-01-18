$(document).ready(function(){
	$('form').each(function(){
		var form  = this;
		this.onsubmit = function(){
			$(this).ajaxSubmit({
				success: function(data){
					
				}
			});
			return false;
		}
	});
});