<!DOCTYPE html>
<html>
<head>
<title>jQuery goes to DOM-ville</title>
<style>
#change_me {
	position: absolute;
	top: 100px;
	left: 400px;
	font: 24px arial;
}

#move_up #move_down #color #disappear {
	padding: 5px;
}
</style>
<script src="js/jquery-2.1.0.js"></script>
</head>
<body>
	<button id="move_up">Move Up</button>
	<button id="move_down">Move Down</button>
	<button id="color">Change Color</button>
	<button id="disappear">Disappear/Re-appear</button>
	<div id="change_me">Make Me Do Stuff!</div>
	<script>
		$(document).ready(function() {
			$("#move_up").click(function() {
				$("#change_me").animate({
					top : 30
				}, 200);
			});//end move_up
			$("#move_down").click(function() {
				$("#change_me").animate({
					top : 500
				}, 2000);
			});//end move_down
			$("#color").click(function() {
				$("#change_me").css("color", "purple");
			});//end color
			$("#disappear").click(function() {
				$("#change_me").toggle("slow");
			});//end disappear
		});//end doc ready
	</script>
</body>
</html>