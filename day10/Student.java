package day10;

import java.util.Scanner;
abstract public class Student {
	String name;
	String address;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	abstract public void getPercentage();
	
	  public Student(String name,String address) {
		this.name=name;
		this.address=address;
	}

}


 class ScienceStudents extends Student {

	 public ScienceStudents(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
		this.name=name;
		this.address=address;
	}



	int physicsMarks;
	 int chemistryMarks;
	 int mathsMarks;
	 public int getPhysicsMarks() {
		return physicsMarks;
	}

	public void setPhysicsMarks(int physicsMarks) {
		this.physicsMarks = physicsMarks;
	}

	public int getChemistryMarks() {
		return chemistryMarks;
	}

	public void setChemistryMarks(int chemistryMarks) {
		this.chemistryMarks = chemistryMarks;
	}

	public int getMathsMarks() {
		return mathsMarks;
	}

	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}

	
	 
	@Override
	public void getPercentage() {
		 
		this.physicsMarks=physicsMarks;
		this.chemistryMarks=chemistryMarks;
		this.mathsMarks=mathsMarks;
		 
		int percentage=(physicsMarks+chemistryMarks+mathsMarks)/3;
		if(percentage<0||percentage>100) {
			System.out.println("you are entering wrong marks it is not valid marks"+percentage+"%");
		}
		else {

			System.out.println("hey sciency sexy your percentage is: "+percentage+"%");	
		}
		}
	
	 
	
	
}
// 
 class HistoryStudent extends Student{

	 public HistoryStudent(String name, String address) {
		super(name, address);
		this.name=name;
		this.address=address;
		 
	}
	int historyMarks;
	 int civicsMarks;
	public int getHistoryMarks() {
		return historyMarks;
	}
	public void setHistoryMarks(int historyMarks) {
		this.historyMarks = historyMarks;
	}
	public int getCivicsMarks() {
		return civicsMarks;
	}
	public void setCivicsMarks(int civicsMarks) {
		this.civicsMarks = civicsMarks;
	}
	@Override
	public void getPercentage() {
		// TODO Auto-generated method stub
//		if(marks<0) {
//			System.out.println();
//		}
		this.historyMarks=historyMarks;
		this.civicsMarks=civicsMarks;
		int percentage=(civicsMarks+historyMarks)/2;
		if(percentage<0||percentage>100) {
			System.out.println("you are entering wrong marks it is not valid marks  "+percentage+"%");
		}
		else {

			System.out.println("hey  sexy your percentage is: "+percentage+"%");	
		}
	}
	 
 }
// 

 