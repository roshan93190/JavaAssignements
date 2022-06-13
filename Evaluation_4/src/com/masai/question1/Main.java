package com.masai.question1;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.Period;
	public class Main {
	
		public  int registeration() throws InvalidDateFormat{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter your age in dd-MM-yyyy format");
			
			String dob=sc.nextLine();
			try {
				LocalDate d1 = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
				
				LocalDate c1 = LocalDate.now();
				Period p = Period.between(d1,c1);
			 
 			return p.getYears();

			}
			catch(Exception e) {
				InvalidDateFormat idf=new InvalidDateFormat("InvalidDateFormat");
			throw idf;
			} 
	}
		public static void main(String[] args) {
			Main m=new Main();
			
			try {
			int age=m.registeration();
			if(age>18) {
				System.out.println("you are eligible to cast the vote");
			}
			else {
				System.out.println("date should not be in the future");
			}
		
				
			}
			catch(InvalidDateFormat idf) {
				System.out.println(idf.getMessage());
			}

			
		
		}
}