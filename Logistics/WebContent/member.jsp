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
	
	//function to reset sliders
	//i.e. when the reset button is selected
	function reset() {

		//if both sliders are NOT disabled
		//i.e. when the page first loads
		//reset both sliders
		if(document.getElementById('rating').disabled == false 
				&& document.getElementById('rating1').disabled == false){
			
			//set the train slider value to
			//the sliders maximum value divided by 2
			document.getElementById('rating').value = (document
					.getElementById('rating').max / 2);
			
			//call function to update slider value on screen
			evalSlider();
			
			//set the tank slider value to
			//the sliders maximum value divided by 2
			document.getElementById('rating1').value = (document
					.getElementById('rating1').max / 2);

			//call function to update slider value on screen
			evalSlider1();
			
		}
		
		//else if the train slider is NOT disabled
		//i.e. the user selects trains
		else if (document.getElementById('rating').disabled == false) {

			//set the train slider value to
			//the sliders maximum value divided by 2
			document.getElementById('rating').value = (document
					.getElementById('rating').max / 2);

			//call function to update slider value on screen
			evalSlider();
		}

		//else the choice is tanks
		else {

			//set the tank slider value to
			//the sliders maximum value divided by 2
			document.getElementById('rating1').value = (document
					.getElementById('rating1').max / 2);

			//call function to update slider value on screen
			evalSlider1();
		}
	}
	

	//function to disable tank selection
	//i.e. when trains are selected
	function trainSelect() {

		//if the tank slider is NOT disabled
		if (document.getElementById('rating1').disabled == false) {

			//disable tank slider
			document.getElementById('rating1').disabled = true;

			//enable train slider
			document.getElementById('rating').disabled = false;
		}
	}

	//function to disable train selection
	//i.e. when tanks are selected
	function tankSelect() {

		//if the train slider is NOT disabled
		if (document.getElementById('rating').disabled == false) {

			//disable train slider
			document.getElementById('rating').disabled = true;

			//enable tank slider
			document.getElementById('rating1').disabled = false;
		}
	}
	
</script>
</head>
<body>
welcome 
<hr>

	<!-- display the choice of vehicle -->
	Select Vehicle:
	<!-- Radio buttons for the choice -->
	<!-- Add buttons to a group with 'name' attribute -->
	<!-- i.e. only one radio button can be selected at a time -->
	Trains
	<input onclick="trainSelect()" type="radio" name="trainsAndTanks">
	Tanks
	<input onclick="tankSelect()" type="radio" name="trainsAndTanks">
	
<form action="#" method="post">
	Select Number of Trains (0-5):
	<input type="range" id="rating" min="0" max="5" onchange="evalSlider()"/>
	<output id="sliderVal"></output>
	<br>
	Select Number of Tanks (0-5):
	<input type="range" id="rating1" min="0" max="5" onchange="evalSlider1()"/>
	<output id="sliderVal1"></output>
</form>

	<!-- add reset button -->
	<!-- run reset function when clicked -->
	<button onclick="reset()">Reset</button>
	
	<!-- add confirm button -->
	<!-- TODO -- add confirm button functionality -->
	<button>Confirm</button>

</body>
</html>