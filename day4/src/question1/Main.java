package question1;

public class Main {

	public static void main(String[] args) {
		Student student=new Student();
	    Student student1=new Student(25,99,"Roshan",121);
	    System.out.println(student1.getAge()+" "+student1.getMarks()+" "+student1.getName()+" "+student1.getRoll());
	
	student.setAge(45);
	  System.out.println(student.getAge());	
	}
	
}
