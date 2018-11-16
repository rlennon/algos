<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
	function evalSLider()
	{
		var sliderValue = document.getElementById('rating').value;
		document.getElementById('sliderVal').innerHTML = sliderValue;
	}
</script>
</head>
<body>
welcome 
<hr>
<form action="#" method="post">
	Select Number of Trains (0-5):
	<input type="range" id="rating" min="0" max="5" onchange="evalSLider()"/>
	<output id="sliderVal"></output>
</form>

</body>
</html>