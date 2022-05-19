package com.daythree;

public class Student {

	 int roll;
	 String name;
	 int  marks;
	 
	 void displayStudentDetails(int roll,String name,int marks) {
		 System.out.println("roll is:"+roll);
		 System.out.println("name is:"+name);
		 System.out.println("marks is:"+marks);
	 }
	 
	public static void main(String[] args) {
		 
		Student s1 =new Student();
		 s1.roll=21;
		 s1.name="roshan";
		 s1.marks=99;
 
    s1.displayStudentDetails(s1.roll,s1.name,s1.marks);
    s1 = null;
		Student s2 =new Student();
		s2.roll=22;
		s2.name="shivam";
		s2.marks=100;

		s2.displayStudentDetails(s2.roll,s2.name,s2.marks);
		s2=null;
	}

}
