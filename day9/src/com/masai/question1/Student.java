package com.masai.question1;

		public class Student {
			public Student() {
				
			}
			
			
			private int roll;
			private String name;
			private int marks;
			private char grade;
			public int getRoll() {
				return roll;
			}
			public void setRoll(int roll) {
				this.roll = roll;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getMarks() {
				return marks;
			}
			public void setMarks(int marks) {
				this.marks = marks;
			}
			public char getGrade() {
				return grade;
			}
			public void setGrade(char grade) {
				this.grade = grade;
			}
			
			public Student(String name,int roll,int marks) {
				this.name=name;
				this.roll=roll;
				this.marks=marks;
//				this.grade=grade;
				
			}
			private char calculateGrade(){
//			this.marks=marks;
			if(marks>=500) {
				return 'A';
			}
			else if(marks<500&&marks>=400) {
				return 'B';
			}
			else if(marks<400) {
				return 'C';
			}
			else {
				return (Character) null;
			}
				
			}
 
	 
			@Override
			public String toString() {
				return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", grade=" + grade
						+ ", getRoll()=" + getRoll() + ", getName()=" + getName() + ", getMarks()=" + getMarks()
						+ ", getGrade()=" + getGrade() + ", calculateGrade()=" + calculateGrade() + ", getClass()="
						+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
			}
			public void displayDetails() {
				
				Student s= new Student("roshan",125,99);
				System.out.println(s);
			
			
				
			}
			
			public static void main(String[] args) {
			
				Student s= new Student();
				s.displayDetails();
			}
			
		
		}
