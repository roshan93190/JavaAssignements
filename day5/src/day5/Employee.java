package day5;

public class Employee {
	private int employeeId;
	private  String employeeName;
	private double salary;
	private double netSalary;
	 
	
 
  public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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
	
	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
	
	   
     public void calculateNetSalary(int pfPercentage){
		this.netSalary=salary-pfPercentage;
		System.out.println("NetSalary is"+  netSalary);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	 Employee s1=new Employee();
	 s1.salary=5000;
	 System.out.println(s1.netSalary);
	  s1.calculateNetSalary(500);
	}  
}
