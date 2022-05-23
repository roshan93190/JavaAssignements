package evaluation1;

import java.util.Scanner;



public class Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner info =new Scanner(System.in);
		
		System.out.println("Enter the Roll number :");
		int rollNumber=info.nextInt();
		System.out.println("Enter the name");
		String StudentName=info.nextLine();
		info.nextLine();
		System.out.println("Enter marks");
	int StudentMarks=info.nextInt();
	
	Student obj=new Student(rollNumber,StudentName,StudentMarks);
	
	}

}
