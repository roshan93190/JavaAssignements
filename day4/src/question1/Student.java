package question1;

public class Student {

	public Student() {
		
	};
		private int roll;
		private String name;
	    private int age;
	    private int marks;
		public int getRoll() {
			return roll;
		}
		public void setRoll(int roll) {
			this.roll = roll;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getMarks() {
			return marks;
		}
		public void setMarks(int marks) {
			this.marks = marks;
		}
		
		public Student(int age,int marks,String name,int roll) {
			this.name=name;
			this.roll=roll;
			if(age>18&&age<60) {
				setAge(age);
			}
			if(marks>0&&marks<500) {
				setMarks(marks);
			}
		}
		
	
}
