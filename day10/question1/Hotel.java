package day10.question1;

public interface Hotel {

	public void chickenBiryani();
	public void masalaDosa();
}


//
//Create an interface Hotel with the following 2 methods:
//void chickenBiryani();
//void masalaDosa();
//Create following 2 concrete implemented classes of the above
//Hotel interface
//
//1. TajHotel
//2. RoadSideHotel
//
//Inside the TajHotel class define one another specific method :
//public void welcomeDrink(){
//System.out.println("Welcome Drink from the TajHotel");
//}
//Create a Demo class and inside the Demo class define a method
//as follows:
//
//public Hotel provideFood(int amount)
//
//Implement the above method as follows:
////write the logic if the supplied amount is more than 1000
////then return the object of TajHotel class
////if the supplied amount is greater than 200 and less than 1000
////then return the object of RoadSideHotel class
//From the main method of the Demo class, call the provideFood
//method by taking input from the user using Scanner class.
//
//If the user supplies the valid amount then call all the methods of the
//respected classes otherwise print the message: Please Enter a
//valid amount;