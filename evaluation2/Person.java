package evaluation2;

public class Person {
String name;
String gender;

}
class Address extends Person{
	 String city;
	  String state;
	 String  pinCode;
}

class Instructors extends Person{
	int instructorId;
	int salary;
	
}

class Students extends Person{
	String courseEnrolled;
	int courseFee;
	
}

//Create another class Instructor which is a child of Person and has
//
//following instance variable-
//instructorId : int
//
//salary : int
//
//Create another class Student which is a child of Person and has
//
//following instance variable-
//studentId : int
//
//courseEnrolled : String
//courseFee : int
//
