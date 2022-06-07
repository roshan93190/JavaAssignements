package day14.quesion1.question2;

public class InvalidCountryException extends Exception {

	public InvalidCountryException(String message){
		super(message);
	}

 
	
}
/*
Q2) A student portal allows users to register their profile. During registration the system needs
to validate the user should be located in India. If not, the system should throw an exception.
Step 1: Create a user defined exception class named “InvalidCountryException”.
Step 2: Overload the respective constructors.
Step 3: Create a main class “UserRegistration”, add the following method,
registerUser– The parameter are String username,String userCountry and add the following logic,
• if userCountry is not equal to “India” throw a InvalidCountryException with the message
“User Outside India cannot be registered”
• if userCountry is equal to “India”, print the message “User registration done successfully”
Note : Take the input from user using Scanner
Invoke the method registerUser from the main method with the data specified and see how the program
behaves,
Sample Input 1:
Enter Your Name:
Sam
Enter Your Country:
India

Sample Output 2:
User registration done successfully*/