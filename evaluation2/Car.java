package evaluation2;

public class Car {
 private int numberOfPassengers;
 private int numberOfKms;
public int getNumberOfPassengers() {
	return numberOfPassengers;
}
public void setNumberOfPassengers(int numberOfPassengers) {
	this.numberOfPassengers = numberOfPassengers;
}
public int getNumberOfKms() {
	return numberOfKms;
}
public void setNumberOfKms(int numberOfKms) {
	this.numberOfKms = numberOfKms;
}
}

class Sedan extends Car{
	final int farePerKm =20;
}

class HatchBack extends Car{
	final int farePerKm =15;
}
