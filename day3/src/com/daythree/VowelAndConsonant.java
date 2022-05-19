package com.daythree;

public class VowelAndConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word ="A";
		word="b";
		 
		if(word=="A"||word=="a"||word=="I"|| word=="i"||word=="E"||word=="e"||word=="O"||word=="o"||word=="u"||word=="U") {
			System.out.println(word+" is vowel" );
		}
		else{
			System.out.println("error its not a vowel its a consonant");
		}
		
	}

}




/*
 * Write a java application with a non-static method that will accept a character (a-z or A-Z) and print if that character is vowel or consonant, if we supply other than (a-z or A-Z) then that method should print the error message.

Call the above method from the main method of the same class 3 times,

first time by supplying a vowel

the second time by supplying a consonant

third time by supplying an invalid character
 * 
 */
