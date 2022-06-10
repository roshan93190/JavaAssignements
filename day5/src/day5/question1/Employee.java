package day5.question1;

public class Employee {
			
	
		private int employeId;
		private String employeeName;
		private double salary;
		private double  netSalary;
	
		public int getEmployeId() {
			return employeId;
		}

		public void setEmployeId(int employeId) {
			this.employeId = employeId;
		}

		public String getEmployeeName() {
			return employeeName;
		}

		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public double getNetSalary() {
			return netSalary;
		}

	 

		public void calculateNetSalary(int pfpercentage) {
			  this.netSalary=this.salary*pfpercentage/100;
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