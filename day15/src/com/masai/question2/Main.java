package com.masai.question2;

public class Main {
   public static void main(String[] args) {
	
	   EmployeeBonus e=new EmployeeBonus();
	   
	   try {
		   double bonus=e.giveBonus();		
		   System.out.println("Your bonus is :"+bonus);
	   }
	   catch(InvalidAgeException i) {
		   System.out.println(i.getMessage());
	   }

}
}
