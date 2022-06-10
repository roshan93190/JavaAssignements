		package Sprint2.masai.assignments.day2;
		
			public class Student {
				String studName;
				int stuId;
				double examFee;
				
				
				void displayDetails() {
					
				}
			void  payFee(int fee) { 
				System.out.println("fees you need to pay is"+ fee);
			}
			
			
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				DayScholar d1=new DayScholar();
				Hosteller h1=new Hosteller();
				d1.studName="Roshan";
				d1.stuId=1234;
				d1.examFee=5000;
				d1.payFee(160000);
		System.out.println(d1.studName);
//		hosteller object;
		
		h1.studName="Azad";
		h1.stuId=4321;
		h1.examFee=15000;
		h1.payFee(5000);
		
		
		
			}
		
		 
		
		
		}
		class Hosteller extends Student{
				double hostelFee;
				double hostelFee() {
					System.out.println("The hostelFee you need to pay is"+ hostelFee);
				return hostelFee;
				}
		}
		class DayScholar extends Student{
				double transportFee;
				double transportFee(){
					System.out.println("the transportFee is"+ transportFee);
				return transportFee;
				}
				
		}
		
		//Class Student:
		//Instance Variables:
		//studId : integer,
		//studName :String,
		//examFee:double
		//Methods:
		//displayDetails(): void,
		//payFee() :double
		//Provide suitable constructors
		//Class DayScholar :
		//Instance Variables :
		//transportFee: doubleMethods:
		//
		//Class Hosteller :
		//Instance Variables:
		//hostelFee: double
		//Provide suitable constructors
		//Create a “Main Class”. In this create two objects for each DayScholar and
		//Hosteler classes. Invoke payFee() method with suitable amount and obtain the
		//remaining amount to be paid.