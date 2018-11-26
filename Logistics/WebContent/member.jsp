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
	
	
	//function to reset train slider
	function resetTrainSlider(){
		
		//set the train slider value to
		//the sliders maximum value divided by 2
		document.getElementById('rating').value = (document
				.getElementById('rating').max / 2);
		
		//call function to update slider value on screen
		evalSlider();
	}
	
	
	//function to reset tank slider
	function resetTankSlider(){
		
		//set the tank slider value to
		//the sliders maximum value divided by 2
		document.getElementById('rating1').value = (document
				.getElementById('rating1').max / 2);

		//call function to update slider value on screen
		evalSlider1();
	}
	
	
	//function to disable tank slider
	function disableTankSlider(){
		
		//disable tank slider
		//i.e. get disabled attribute and switch to true
		document.getElementById('rating1').disabled = true;

		//enable train slider
		//i.e. get disabled attribute and switch to false
		document.getElementById('rating').disabled = false;
	}
	
	
	//function to disable train slider
	function disableTrainSlider(){
		
		//disable train slider
		document.getElementById('rating').disabled = true;

		//enable tank slider
		document.getElementById('rating1').disabled = false;
	}
	

	//function to run on train radio button selection
	//i.e. when trains are selected
	function trainRadioSelect() {

		//if the tank slider is NOT disabled
		//i.e if the disabled attribute is false
		if (document.getElementById('rating1').disabled == false) {

			//call function to disable tank
			disableTankSlider();
			
			//call function to enable confirm button
			enableConfirmBtn();
			
		}
	}
	
	
	//function to run on tank radio button selection
	//i.e. when tanks are selected
	function tankRadioSelect() {

		//if the train slider is NOT disabled
		if (document.getElementById('rating').disabled == false) {

			//disable train slider
			disableTrainSlider();
			
			//call function to enable confirm button
			enableConfirmBtn();
		}
	}
	
	
	//function to enable confirm button
	//i.e. when a radio button is selected
	function enableConfirmBtn(){
		
		//if the confirm button is disabled
		//i.e. if the disabled attribute is true
		if(document.getElementById('confirm').disabled == true){
			
			//switch to NOT disabled
			document.getElementById('confirm').disabled = false;
		}
	}
	
	
	//function to reset train + tank sliders
	//i.e. run when the reset button is selected
	function resetBtn() {

		//if both sliders are NOT disabled
		//i.e. when the page first loads
		//then reset both sliders
		if(document.getElementById('rating').disabled == false 
				&& document.getElementById('rating1').disabled == false){
			
			//call function to reset sliders
			resetTrainSlider();
			resetTankSlider();
		}
		
		//else if the train slider is NOT disabled
		//i.e. the user selects trains
		else if (document.getElementById('rating').disabled == false) {

			//call function to reset train slider
			resetTrainSlider();
		}

		//else the choice is tanks
		else {

			//call function to reset tank slider
			resetTankSlider();
		}
	}
	
	
	//function to confirm vehicle selection
	//i.e. when the confirm button is selected
	function confirmBtn(){
		
		//TODO - add sliders for minion choice
		
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
	<input onclick="trainRadioSelect()" type="radio" name="trainsAndTanks">
	Tanks
	<input onclick="tankRadioSelect()" type="radio" name="trainsAndTanks">
	
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
	<button onclick="resetBtn()">Reset</button>
	
	<!-- add confirm button -->
	<!-- run confirm function when selected -->
	<!-- button is disabled until a vehicle choice is made -->
	<button onclick="confirmBtn()" id = "confirm" disabled>Confirm</button>

</body>
</html>