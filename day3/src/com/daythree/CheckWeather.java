package com.daythree;

public class CheckWeather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 boolean isSnowing=false;
 boolean isRaining=true;	
 double temperature =60.0;
 
 if(isSnowing==true||isRaining==true||temperature>=50) {
	 System.out.println("Let’s stay home.");
 }
 else {
	 System.out.println("Lets's go out!");
 }
	}

}

/*
 * CHECK WEATHER
Assume you have access to two boolean variables, isSnowing, and isRaining, and one double variable, temperature. 
isSnowing is true when it's snowing and false otherwise, isRaining is true when it's raining and false otherwise,
 and temperature gives the outdoor temperature in degrees Fahrenheit. Write code that prints: “Let's stay home." 
 if it's raining, snowing, or below 50 degrees Fahrenheit (10 degrees Celsius), and prints: Let's go out!" otherwise.

Starting code:

public class CheckWeather {
	
	public static void main(String[] args) {

	//Assume these can have any value:
	boolean isSnowing = false;
	boolean isRaining = true;
	double temperature = 60.0;
	//print "Let’s stay home." if its raining, snowing or
	//below 50 degrees and print "Let’s go out!" otherwise.

}
}
 
 */