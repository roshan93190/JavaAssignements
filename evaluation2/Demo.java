package evaluation2;

import java.util.Scanner;
 
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	    StudentBean s1=new StudentBean();
      Scanner input=new Scanner(System.in);
      System.out.println("Enter number of Students");
      int number=input.nextInt();
      StudentBean[] arr= new StudentBean[number];
      int sum=0;
      for(int i=0;i<arr.length;i++) {
          System.out.println("Enter roll number");
          int roll=input.nextInt();
         
          System.out.println("Enter name");
          
          String name=input.next();
          System.out.println("Enter marks");
          int marks=input.nextInt();
          
      	sum+=marks;
		arr[i]=new StudentBean(roll,name,marks);
      }

		System.out.println("Students details are:");
		System.out.println("***********************");
		System.out.println("average marks is:"+sum/number);
		for(StudentBean student:arr) {
			System.out.println("Roll is:"+student.getRoll());
			System.out.println("Name is:"+student.getName());
			System.out.println("Marks is:"+student.getMarks());
			System.out.println("--------------");
		}
	
      
      
	}

}






