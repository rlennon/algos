<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
	function evalSlider()
	{
		var sliderValue = document.getElementById('rating').value;
		document.getElementById('sliderVal').innerHTML = sliderValue;
	}
	
	function evalSlider1()
	{
		var sliderValue1 = document.getElementById('rating1').value;
		document.getElementById('sliderVal1').innerHTML = sliderValue1;
	}
	
</script>
</head>
<body>
welcome 
<hr>
<form action="#" method="post">
	Select Number of Trains (0-5):
	<input type="range" id="rating" min="0" max="5" onchange="evalSlider()"/>
	<output id="sliderVal"></output>
	<br>
	Select Number of Tanks (0-5):
	<input type="range" id="rating1" min="0" max="5" onchange="evalSlider1()"/>
	<output id="sliderVal1"></output>
</form>

</body>
</html>