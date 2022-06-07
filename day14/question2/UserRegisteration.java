package day14.quesion1.question2;
import java.util.Scanner;

public class UserRegisteration{

	public void registerUser(String userName,String userCountry ) throws InvalidCountryException{
		
		if(userCountry.equals("India")) {
			System.out.println("User registration done successfully");
		}
		else {
			 InvalidCountryException ice=new InvalidCountryException("User Outside India cannot be registered");
		throw ice;
		}
				
	
	}
	public static void main(String[] args) {
		UserRegisteration usg=new UserRegisteration();
		Scanner input =new Scanner(System.in);
	    System.out.println("Enter the name of the user");
	    String userName=input.nextLine();
	    System.out.println("enter the name of the country");
	    String countryName=input.nextLine();
	    
	   try {
		usg.registerUser(userName, countryName);
	} catch (InvalidCountryException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	}
	
}


//
///*
// * Step 3: Create a main class “UserRegistration”, add the following method,
//registerUser– The parameter are String username,String userCountry and add the following logic,
//• if userCountry is not equal to “India” throw a InvalidCountryException with the message
//“User Outside India cannot be registered”
//• if userCountry is equal to “India”, print the message “User registration done successfully”
//Note : Take the input from user using Scanner
//Invoke the method registerUser from the main method with the data specified and see how the program
//*/
// */