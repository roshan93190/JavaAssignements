package masai.com.question2;

		public class Student {

			int stuId;
			String studName;
			double examFee;
			public  void displayDetails() {		
				
			}
			public double payFee() {
				
				return examFee;
			}
			public Student(String name,int stuId,double examFee) {
				this.stuId=stuId;
				this.studName=name;
				this.examFee=examFee;
				
			}
		
		}
