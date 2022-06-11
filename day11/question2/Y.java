package day11.question2;

public interface Y {
	abstract public void abstractMethodY();
	
	default void defaultMethodY() { 
		System.out.println("default X");
	}
	public static void staticMethodY() {
		System.out.println("Static Y");
	}
 
}





