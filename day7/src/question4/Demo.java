	package question4;
	import java.util.Scanner;
		public class Demo {

			public static Bank getBank(String bank) {
				if(bank.equals("axis")||bank.equals("Axis")) {
					
				return new AxisBank();
				}
				else if(bank.equals("Icici")||bank.equals("icici"))
				return new IciciBank();
				else {
					return null;
				}
			}
			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
			    System.out.println("Enter your bank name");
			    String bankname=sc.nextLine();
			    System.out.println("Enter your branchName");
			    String branchName=sc.nextLine();
			    System.out.println("Enter your ifscCode");
			    String ifscCode=sc.nextLine();

			    Demo demo=new Demo();
			    Bank userBank=demo.getBank(bankname);
			    if(userBank instanceof AxisBank) {			    
			    	AxisBank axisBank=(AxisBank)userBank;
			    	axisBank.displayDetails();
			    	axisBank.setBranchName(branchName);
			    	axisBank.setIfscCode(ifscCode);
			         
			    }
			    else {
			    	IciciBank iciciBank=(IciciBank)userBank;
			    	iciciBank.displayDetails();
			    	iciciBank.setBranchName(branchName);
			    	iciciBank.setIfscCode(ifscCode);
			    	
			    }
			}
			
		}
