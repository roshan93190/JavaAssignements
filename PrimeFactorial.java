package com.masai;

public class PrimeFactorial {

	public static void main(String[] args) {
	 
		int number=100;
		String str ="";
		for(int i=1;i<=number;i++) {
			if(number<2||number>99) {
				System.out.println("Invalid Number");
			}
			else {
				if(number%i==0){
					str+=i+" ";	
				
				}
				
			}
		
		}
		System.out.println(str);
	}

}
