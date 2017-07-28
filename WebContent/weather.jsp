<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Weather</title>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script src="js/ex-track-js/ex-track.js"></script>

</head>
<body>

	<div>
		<h2>Check Weather</h2>
		<p>Enter your Location:</p>
		<input type="text" id="location" name="location"
			placeholder="Where are you?" required="required"> <input
			type="button" id="checkButton" value="Check Weather">
	</div>
	</br>
	<div id="div1"></div>
</body>

<!-- <script>
$(document).ready(function() {
	$("#checkButton").click(function() {
		$.ajax({
			type : "GET",
			url : "Ankur_Portfolio/rest/v1/cities/"
					+ $("#location").val(),
			success : function(result) {
				$("#div1").empty().append(result);
			}
		});
	});
});
</script> -->
</html>