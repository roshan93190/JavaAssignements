package day5;
 import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Please enter the number of students");
		int num=sc.nextInt();
		
		Student[] students=new Student[num];
//		System.out.println("");
		int sum=0;
		for(int i=0;i<students.length;i++) {
			System.out.println("Enter details of the students  "+(i+1));
			
			System.out.println("Enter roll");
			int roll=sc.nextInt();
			
			System.out.println("Please enter the name of student");
			String name=sc.next();
		
			System.out.println("enter marks");
			int marks=sc.nextInt();
		
			sum+=marks;
			students[i]=new Student(roll,name,marks);
		}
		System.out.println("Students details are:");
		System.out.println("***********************");
		System.out.println("average marks is:"+sum/num);
		for(Student student:students) {
			System.out.println("Roll is:"+student.getRoll());
			System.out.println("Name is:"+student.getName());
			System.out.println("Marks is:"+student.getMarks());
			System.out.println("--------------");
		}
	
	}
}


//Create a Student Bean class with the following fields:
//roll: Integer
//name: String
//Assignment Day5: 5
//address: String
//marks: Integer
//Create a Demo class and perform the following operation in the main method:
//Take the number as input from the user, How many Student objects need to be
//created.
//Create an array of Students with those numbers.
//Initialize all the student objects by taking details from the user.
//print all the Student details
//print the average of all the Student marks.