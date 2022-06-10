package Sprint2.masai.assignments.day2;
import java.util.Scanner;
public class Demo {

	String bank;
	public static Bank getBank(String bank){
 
		return bank;
	}


	public static void main(String[] args) {
	 
		Scanner input=new Scanner(System.in);
		
		
	}

}



//
//Create a Demo class and define the following method:
//public static Bank getBank(String bank);
//implement the above method such as if we supply “axis” then it should return
//Axis bank object and if supply “icici” then it should return ICICI bank object
//and if we supply any invalid value then it should return null.
//Note: returned bank object should have all the details.Call the above method
//from the main method of Demo class by taking input from the user and
//print the Bank details by calling displayDetails() method. If the returned bank
//object is Axis bank then call the getCreditCard() method.