package day10.question1;
import java.util.Scanner;
public class Demo {
	public Hotel provideFood(int amount) {
		if(amount>1000) {
			return new TajHotel();
		}
		else if(amount>200 && amount<1000){
			return new RoadSideHotel();
		}
		else {
 System.out.println("enter a valid amount");
		return null;
		}
	}
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		Demo demo =new Demo();
	     System.out.println("Enter a valid amount");
	     int amount=input.nextInt();
	     
//	    Hotel hotel=(Hotel) new Demo();
	     System.out.println("you have assigned the"+demo.provideFood(amount));
	}
}

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