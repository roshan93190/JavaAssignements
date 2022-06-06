package evaluation3.question4;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Demo {
	
   public void done() {
	   
   }
	

	
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter your name");
	String username=sc.nextLine();

	System.out.println("Enter mobileNumber");
	String mobileNumber=sc.nextLine();
	System.out.println("Enter passowrd");
	String password=sc.nextLine();
	System.out.println("enter email");
	String email=sc.nextLine();
	if(username.length()>2&&username.length()<9&&Pattern.matches("[a-z]",username)) {
		System.out.println("great");
	}
	if(mobileNumber.length())

}
}
