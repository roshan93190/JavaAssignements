package day11.question2;

public interface X {
	
	abstract public void abstractMethodX();
	default void defaultMethodX() { 
		System.out.println("i am using default method");
	}
	public static void staticMethodX() {
		System.out.println("i am a static method");
	}
	
	 
 
//	● one abstract method
//	● one default method
//	● one static method
//
//	Define an interface Y with:
 
//	● one abstract method
//	● one default method
//	● one static method
	
}
