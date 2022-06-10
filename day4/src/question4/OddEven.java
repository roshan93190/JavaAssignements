package question4;

public class OddEven {

	public void oddEven(double num) {
		if(num%2==1) {
			System.out.println("your number is odd: "+num);
			 
		}
		else if(num%2==0) {
		while(num%10==0) {
		 num=num/10;
		 System.out.println((num+1)*10);
		 
		}
		
	
		
		}
		else {
			System.out.println("Error");
		}
	}
	public static void main(String[] args) {
		OddEven oddEven=new OddEven();
	oddEven.oddEven(44);
	}
	
}
