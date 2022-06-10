package day5.question1;
import java.util.Scanner;
		public class Main {
		
			
			
			
			public static Employee getEmployeeDetails(int id,String name,double salary) {
				Employee employee=new Employee();
				employee.setEmployeId(id);
				employee.setEmployeeName(name);
				employee.setSalary(salary);
				employee.getEmployeeName();
				System.out.println(employee.getEmployeeName());
				return employee;
			}
			public static int getPFPercentage(int pf) {
				
				return pf;
			}
			
			
			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter your employee id"); 
   				int employeeid=sc.nextInt();
   				System.out.println("Enter your name");
   				String name=sc.nextLine();
   				System.out.println("Enter your salary");
   				double salary=sc.nextDouble();
   				System.out.println("Enter your pf percentage");
   				int pf=sc.nextInt();
	            System.out.println("You will get something");
   	               Employee emp=getEmployeeDetails(employeeid, name, salary);
			System.out.println(emp.getEmployeeName());
   	               
   	               
   	               
			}
		
			
		}




/*
Write the following method in the Employee class: public void calculateNetSalary(int
pfpercentage)  - This method should take PF percentage as argument. Deduct the PF
amount from the salary and set the netSalary.
Create a Main class which has the main method which invokes the method to get the
input and prints the details as shown in the sample.
Also write a method :
public static Employee getEmployeeDetails() -  which gets the employee details - id,
name and salary from the user and returns the employee object.
public static int getPFPercentage() -  which gets the PF percentage and returns the
same
In the main method invoke the above two methods, and then call the calculateNetSalary
method in Employee class and print the output as shown below.
Sample Input 1:
Enter Id: 101 Enter Name: Vivek Enter salary: 20000 Enter PF percentage: 7*/