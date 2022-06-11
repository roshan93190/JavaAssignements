package day11.question1;
import java.util.Scanner;


public class Mobile {
	String[] s = {"note4","note5","note6","note7"};
	
//	not
 
	public void searchOutdatedModels(String CompanyName,String... modelName) {
 
		boolean flag=false;
		String bag="";
	    String bag1="";
	    bag1+=CompanyName;
	    int a;
		for(String i:modelName){
		 
			 for(int j=0;j<s.length;j++) {
			 if(s[j].equals(i)) {
				 bag+=s[j];
				 flag=true;
			 }
		 
		 
		}
		}
		if(flag) {
			System.out.println("Company name: "+bag1);
			System.out.println("Models present are "+bag);
		}
		else {
			System.out.println("nothing found");
		}
		
	}
	public static void main(String[] args) {
		
		Mobile  mobile =new Mobile();

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter company name");
		String companyName=sc.nextLine();
		System.out.println("Enter model Number or name");
		String modelName=sc.nextLine();
		mobile.searchOutdatedModels(companyName,modelName);
	}
 
	}
	
/*Q2)Create a Java class name Mobile with a single method “searchOutdatedModel()” that can accept the
name of a Mobile company and any number of its model names.
Note: Use suitable argument for searchOutdatedModel method.
Note: The user can supply any number of model names, even the user can supply only
the company name without its model also.

Mobile class has following instance variable-
String[] outdatedModels = {"note4","note5","note6","note7"};

If user supplied mobile model matches with any of the above outdated models, then
print that model name postfix with OUTDATED word example(note4_OUTDATED).
 */


	
	
 
