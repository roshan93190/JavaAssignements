package evaluation1;

public class Student {
	private int rollNumber;
	private int marks;
	private String studentName;
	
	public int getRollNumber() {
		return rollNumber;
	}
	
	
	public void setRollNumber(int rollNumber) {
		this.rollNumber=rollNumber;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName=studentName;
	}
	public void setMarks(int marks) {
		this.marks=marks;
	}
	public int getMarks() {
		return marks;
	}
	

	public Student() {
		
	}
public Student(int roll,String name,int marks) {	
	this.setRollNumber(roll);
	this.setMarks(marks);
	this.setStudentName(name);
	// TODO Auto-generated method stub
System.out.println("Student Roll the Number"+this.getRollNumber());
System.out.println("Student name"+this.getStudentName());
System.out.println("Student marks"+this.getMarks());
}
	public static void main(String[] args) {

	}

}
