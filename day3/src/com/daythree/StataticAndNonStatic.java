package com.daythree;

public class StataticAndNonStatic {
//this variable cannot be executed since it is dynamic variable
	String name ="Roshan";
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
//		while the below variable can be easily executable;
		String name="Shivam";
		System.out.println(name);
		
	}

}

//Inside a class, there will be two types of elements are there :
//1. static elements (instance variables and methods)
//2. non-static elements(instance variables and methods)
//All the static elements will be loaded into RAM first, and all the non-static elements
//will be there inside the hard disk in the form of bytecode in the dot class file. now
//JVM searches for the main
//method and control start the execution of a java program from the first line of the
//main method.
//The Complete signature of the main method is :
//public static void main(String[] args)
//Note: since static elements are loaded into the RAM, they will be available for the
//CPU for the execution, but non-static members will not be loaded into the RAM
//initially. so they will not be available to the CPU for the execution.
//We can not access the non-static elements from the static area directly.
//By using some procedure if we can transfer the content of the hard disk to RAM
//(loading the non-static elements into the RAM) so that x will be loaded in the RAM
//and it will be available to the CPU for execution.
//The procedure of loading the contents of the hard disk to the RAM dynamically at
//runtime
//is done by creating an object of a class, this is the need for creating an object.
