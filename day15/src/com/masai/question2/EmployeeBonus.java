package com.masai.question2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EmployeeBonus {

	public double giveBonus() throws InvalidAgeException{
		
		int age=0;
		try{Scanner sc=new Scanner(System.in);
		System.out.println("Enter your joiningDate");
		String dob=sc.nextLine();
		LocalDate d1 = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		
		LocalDate c1 = LocalDate.now();
		Period p = Period.between(d1,c1);
	 
		if(p.getYears()==1) {
//		   System.out.println("");
			return 8000.0;
		}
		else if(p.getYears()==0) {
			return 5000.0;
		}
		else if(p.getYears()>=2) {
			return 10000.0;
		}
		 
			
		 
		 
		else {
			
			System.out.println("date cant be in the future");
			return 0.0;
			 
		}
	
		}
	
		catch(Exception e) {
			
		InvalidAgeException i=new InvalidAgeException("“Please pass the date in the correct format”");
		
	 throw i;
			
			 }
		 
	}
		
		
	 
		
	 
	
	
 

 


	public static void main(String[] args) {
	
	}
		
 
	
}
