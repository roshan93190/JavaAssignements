package evaluation3.question3;
import java.util.Scanner;

public class Demo {

	
	public void showDetails(Month m) {
	 
	 
		switch (m) {
		  case JANUARY:
		    System.out.println("““This is the 1st Month of the Year January”");
		    break;
		  case 	  FEBRUARY:
		    System.out.println("“This is the 1st Month of the Year february”");
		    break;
		  case  MARCH:
		    System.out.println("“This is the 1st Month of the Year march”");
		    break;
		  case APRIL:
		    System.out.println("“This is the 1st Month of the Year april”");
		    break;
		  case MAY:
			    System.out.println("“This is the 1st Month of the Year may”");
			    break;
		  case JUNE:
			    System.out.println("“This is the 1st Month of the Year June”");
			    break;
		  case JULY:
			    System.out.println("“This is the 1st Month of the Year july”");
			    break;
		  case AUGUST:
			    System.out.println("“This is the 1st Month of the Year august”");
			    break;
		  case SEPTEMBER:
			    System.out.println("“This is the 1st Month of the Year september”");
			    break;
		  case OCTOBER:
			    System.out.println("“This is the 1st Month of the Year ocotber”");
			    break;
		  case NOVEMBER:
			    System.out.println("“This is the 1st Month of the Year November”");
			    break;
		  case DECEMBER:
			    System.out.println("This is the 12th Month of the year December");
			    break;
	  
		}
	}
	
	public static void main(String[] args) {
		try {
			Demo demo=new Demo();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the month");
			String monthName=sc.nextLine();
			Month month=Month.valueOf(monthName);
			 
					demo.showDetails(month);
					
		 
		}

		 catch(IllegalArgumentException i) {
			 System.out.println("Enter a valid month");
		 }
	   catch(Exception e) {
		   System.out.println("Enter a valid month");
	   }
	 
	 
	
}
}
