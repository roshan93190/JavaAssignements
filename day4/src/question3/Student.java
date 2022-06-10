package question3;

public class Student {
		private int roll;
		private String name;
		private String collegeName;
		private String address;
		public Student(){
			
		}
 
		public int getRoll() {
			return roll;
		}
		public Student(String name,int roll,String Address){
			this.name=name;
			this.roll=roll;
			this.address=Address;
			this.collegeName="NIT";
		}
		
		public Student(String name,int roll,String Address,String collegeName){
			this.name=name;
			this.roll=roll;
			this.address=Address;
			this.collegeName=collegeName;
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
		public String getCollegeName() {
			return collegeName;
		}
		public void setCollegeName(String collegeName) {
			this.collegeName = collegeName;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public static Student getStudent(boolean isFromNIT) {
		 
			if(isFromNIT) {
				Student s1=new Student("roshan",25,"sdfsdfd");
				
				 return s1;
			}
			else {
			Student s2=new Student("shivam",12525,"sfdsdfdsf","iit delhi");
				return s2;
			}

		}
		public static void main(String[] args) {
			Student student=new Student();
			Student s1=student.getStudent(false);
//			System.out.println(s1);
		System.out.println(s1.getName()+" "+s1.getAddress()+" "+s1.getRoll()+" "+s1.getCollegeName());
		}

}
