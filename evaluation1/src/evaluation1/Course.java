package evaluation1;

public class Course {

	int courseId;
	String courseName;
	int courseFee;
	void displayCourseDetails() {	
		System.out.println("CourseID: "+courseId);
		System.out.println("CourseName: "+courseName);
		System.out.println("CourseFee: "+courseFee);
	}
	
static void authenticate(String username,String password ) {
	if(username=="Admin"&&password=="1234") {
		Course course =new Course();
		course.courseId =135;
		course.courseName ="mern stacks";
		course.courseFee=300000004;
		course.displayCourseDetails();
	}
	else {
	System.out.println("Invalid usernmae or password" );	
	}
}	
public static void main(String[] args) {

	authenticate("Admin", "1234");
	authenticate("roshan", "55255");
	
}
 

}
