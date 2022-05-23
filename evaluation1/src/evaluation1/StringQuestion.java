package evaluation1;

public class StringQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		Why String is immutable in java and what is the difference between String and String Builder? And Write some
//				of the methods of String class at least 5 with example.

//1.part		
//	ans:there are some following reasons;
//		The string is immutable because of the some security reasons:-
//	==>synchronization and concurrency caching and class loading.
//	==>and main reason is to "destroy the immutability and to not allow others to extend it"	
		
		
//2.part
	
//		the diff between string and stringbuilder is:-
		
//		1.string:(1) it is immutable.
//				(2) uses more memory as compared to stringBuilder,because strings creates 
//					intermediate garbage instances after each operation.
//				(3) it is safe since it provides synchronization.
		
		//2.stringBuilder:(1) it is mutable;		
		
//						(2)uses less space or memory compare to string
//				       (3)it is does not use syncronization.
		
		
		
	//3.part
//		1 length():- returns the length of the string;
		String s="roshan";
		int l=s.length();
		System.out.println(l);
//2 isEmpty():check weather string is empty or not;
		System.out.println(s.isEmpty());
//3 split(); splits a string into an array of different substrings;

//4  substring():returns new substings
      System.out.println( s.substring(l));

      //5 lastindexOf():returns the last index of the string;
 
      
     
      
      
      
      
	}


}