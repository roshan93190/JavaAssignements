package day11.question3;
  import java.util.Scanner;
public class IPL {

	  
	
	  public void homeTeamStadium(Stadium stadium)
	  {
   

		switch (stadium) {
		  case EDEN_GARDENS_STADIUM:
		    System.out.println("“This is the home ground of KKR”");
		    break;
		  case 	  WANKHEDE_STADIUM:
		    System.out.println("“This is the home ground of Mumbai Indians” ");
		    break;
		  case  CHIDAMBARAM_STADIUM:
		    System.out.println("“This is the home ground of Chennai Super kings”");
		    break;
		  case M_CHINNASWAMY_STADIUM:
		    System.out.println("Banglore");
		    break;
		  default:
			    System.out.println("Sorry no details not found");
			break;    
		}
		  
		  
	  }
	  
	  public static void main(String[] args) {
		
		  Scanner s1=new Scanner(System.in);
		  
		  System.out.println("Enter the stadium name");
		 String  stadiumName=s1.nextLine(); 
		  Stadium stadium = Stadium.valueOf(stadiumName);
		  System.out.println("Entersdfdfsdf");
		  String s=s1.nextLine();
		  
		  
		 
		  IPL ipl=new IPL();
		 
		  
		  
		  ipl.homeTeamStadium(stadium);
		  
		  
	}
	

	 
	
	
	
}
//
//int day = 4;

//switch (day) {
//  case 1:
//    System.out.println("Monday");
//    break;
//  case 2:
//    System.out.println("Tuesday");
//    break;
//  case 3:
//    System.out.println("Wednesday");
//    break;
//  case 4:
//    System.out.println("Thursday");
//    break;
//  case 5:
//    System.out.println("Friday");
//    break;
//  case 6:
//    System.out.println("Saturday");
//    break;
//  case 7:
//    System.out.println("Sunday");
//    break;
//}
//// Outputs "Thursday" (day 4)