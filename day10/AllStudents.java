package day10;
import java.util.Scanner;
public class AllStudents {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=input.next();
		input.nextLine();
		System.out.println("Enter Your adress");
		String address=input.next();

		ScienceStudents sciencestudent=new ScienceStudents(name, address);
		
		
		

		System.out.println("enter marks of chemistry maths physics one by one");
		
		int chem=input.nextInt();
		int maths=input.nextInt();
		int physics=input.nextInt();
		sciencestudent.setChemistryMarks(chem);
		sciencestudent.setMathsMarks(maths);
		sciencestudent.setPhysicsMarks(physics);
		
		System.out.println("Your name and address is "+sciencestudent.getName()+"   "+sciencestudent.getAddress());
		 sciencestudent.getPercentage();
			
			System.out.println("Enter history student details means:civics marks and then enter hit and enter history but first enter name and addresses");
			String name1=input.next();
//			historyStudent.
			input.nextLine();
		 
			String address1=input.next();
			HistoryStudent historyStudent=new HistoryStudent(name1, address1);

		int civics=input.nextInt();
		int history=input.nextInt();
		historyStudent.setCivicsMarks(civics);
		historyStudent.setHistoryMarks(history);
		System.out.println("Your name and address is "+historyStudent.getName()+"   "+historyStudent.getAddress());
		    historyStudent.getPercentage();
		
	}

}
