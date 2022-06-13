package com.masai.question3;

import java.util.Scanner;

import com.masai.question1.InvalidDateFormat;
public  class ExceptionsCheckedAndUnchecked {

	
	     public static void IwillTellYouExceptions() throws  IdentifyExceptions {
	    	 
	    	 System.out.println("Enter a number");
	    	 Scanner sc=new Scanner(System.in);
	    	 int num=sc.nextInt();
	    	 try {
	    		 num=num/0;
	    	 }
	    		catch(Exception e) {
	    			IdentifyExceptions idf=new IdentifyExceptions("InvalidDateFormat");
				throw idf;
				}
	     }
	
	
            public static void main(String[] args) {
				
            try {
				IwillTellYouExceptions();
			} catch (IdentifyExceptions e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            	
			} 
 	        
	
	
	
}

//
///*now the basic diff between checked and unchecked exceptions are  */
//
//
///*A checked exception is caught at compile time whereas a runtime or unchecked exception is,
// *  as it states, at runtime. A checked exception must be handled either 
// * by re-throwing or with a try catch block, whereas an unchecked isn't required to be handled*/
// */
 

/*diff between  throw and throws 
 * 
 * throw==>
 * Java throw keyword is used throw an exception explicitly in the code, inside the function or the block of code.
 * Using throws keyword, we can declare both checked and unchecked exceptions.
 * The throw keyword is followed by an instance of Exception to be thrown.
 * throw is used within the method.
 * We are allowed to throw only one exception at a time i.e. we cannot throw multiple exceptions.
 * */
 
 
 /*throws==>
  * Java throws keyword is used in the method signature to declare an exception which might be thrown by the function while the execution of the code.
  * However, the throws keyword can be used to propagate checked exceptions only.
  * The throws keyword is followed by class names of Exceptions to be thrown.
  * throws is used with the method signature.
  * We can declare multiple exceptions using throws keyword that can be thrown by the method. For example, main() throws IOException, SQLException.
  * */
 
 
 
 
 