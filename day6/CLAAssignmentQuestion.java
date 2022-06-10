package Sprint2.masai.assignments;

public final class CLAAssignmentQuestion {

				public static void main(String[] args) {
			if(args.length==1) {	
				int givenNumber=Integer.parseInt(args[0]);
				int fact=1;
			for(int i=1;i<=givenNumber;i++) {	
				fact*=i;
			}
			System.out.println(fact);
			 
				}
			else if(args.length==2) {
				int sum;
				int givenNumber1=Integer.parseInt(args[0]);
				int givenNumber2=Integer.parseInt(args[1]);
				sum=givenNumber1-givenNumber2;
				if(sum<0) {
					sum=-sum;
				}
				int fact=1;
			for(int i=1;i<=sum;i++) {	
				fact*=i;
			}
			System.out.println(fact);
			}
			else {
				System.out.println("Error");
			}
	


}
	}