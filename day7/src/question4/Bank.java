	package question4;
	
		public class Bank {
		
			  String branchName;
			  String ifscCode;
			
			public String getBranchName() {
				return branchName;
			}

			public void setBranchName(String branchName) {
				this.branchName = branchName;
			}

			public String getIfscCode() {
				return ifscCode;
			}

			public void setIfscCode(String ifscCode) {
				this.ifscCode = ifscCode;
			}

			
			public void displayDetails() {
				System.out.println("Your branch name is :"+getBranchName());
				System.out.println("Your ifsc code is :"+getIfscCode());
				
				
			}
			
			
		}
