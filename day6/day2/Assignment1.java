package Sprint2.masai.assignments.day2;

		public class Assignment1 {
		
			public static void main(String[] args) {
		
				Manager manager =new  Manager();
 		
				manager.Name="Rakesh";
				manager.Age=28;
				manager.phoneNumber="7838636862";
				manager.Address="zyx";
				manager.Salary=1500000;
				manager.printSalary();
					

				
				Employee employee=new Employee();
 
				employee.Name="Roshan";
				employee.Age=21;
				employee.phoneNumber="939040449";
				employee.Address="xyz";
				employee.Salary=1500000;
				employee.printSalary();
				
				System.out.println(employee.Salary);
				
				
				
				
				
			}
				
}
		class member{
			 String	Name ;
				 int Age; 
				 String phoneNumber;
			  String	Address;
				 double Salary;
			void printSalary()
			{	
			System.out.println("Salary of employee,"+ Salary);	
			}
			
			}

//			
			class Employee extends member {
				String Specialisation;
				String Department;
			}
//			
			class Manager extends member {
				String Specialisation;
				String Department;
					}