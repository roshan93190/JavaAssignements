package Sprint2.masai.assignments.day2;

			public class Bank {
					
				
				
				public static void main(String[] args) {
					
					

	}
				class banks{
					String BranchName;
					String ifscCode;
					void displayDetails(String BranchName,String ifscCode,double rateOfinterest) {
						System.out.println("your branch name is"+  BranchName);
						System.out.println("your ifscCode is"+  ifscCode);
					}
	
				}
				
				class AxisBank extends banks{
					double rateOfInterest;
					@Override
					
					void displayDetails(String BranchName,String ifscCode,double rateOfInterest) {
						System.out.println("your branch name is"+  BranchName);
						System.out.println("your ifscCode is"+  ifscCode);
						System.out.println("your rate of interest is:"+ rateOfInterest);
					}
					void getCreditcard(){
						System.out.println("Get the Credit card from the Axis bank");
					}
				}
				class IciciBank extends banks{
					double rateOfInterest;
					@Override
					
					void displayDetails(String BranchName,String ifscCode,double rateOfInterest) {
						System.out.println("your branch name is"+  BranchName);
						System.out.println("your ifscCode is"+  ifscCode);
						System.out.println("your rate of interest is:"+ rateOfInterest);
					}
								}
		 
								

}
//			Create 2 child classes of the above Bank class: AxisBank, ICICIBank
//			with the following fields
//			rateOfInterest: double
//
//			In both the classes override the displayDetails() method to display their
//			details(branchName, ifscCode, rateOfInterest )
//			Inside the Axis Bank define another method :
//			getCreditCard(): void
//			This method will simply print “Get the Credit Card from the Axis bank”
//
//			Create a Demo class and define the following method:
//			public static Bank getBank(String bank);
//			implement the above method such as if we supply “axis” then it should return
//			Axis bank object and if supply “icici” then it should return ICICI bank object
//			and if we supply any invalid value then it should return null.
//			Note: returned bank object should have all the details.Call the above method
//			from the main method of Demo class by taking input from the user and
//			print the Bank details by calling displayDetails() method. If the returned bank
//			object is Axis bank then call the getCreditCard() method.