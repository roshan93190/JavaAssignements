package evaluation2;

public class Ola {
	
//	Ola ola=new Ola();

	public Car bookCar(int numberOfPassenger, int numberOfKMs)
	{
		if(numberOfPassenger<=3) {
			HatchBack obj=new HatchBack();
			obj.setNumberOfPassengers(numberOfPassenger);
			obj.setNumberOfKms(numberOfKMs);
			return obj;
		}
		else {
			Sedan obj=new Sedan();
			obj.setNumberOfPassengers(numberOfPassenger);
			obj.setNumberOfKms(numberOfKMs);
			return obj;
		}
		
	}
	public int calculateBill(Car car) {

		if(car.getNumberOfPassengers()<=3) {
//			HatchBack obj=new HatchBack();
		 HatchBack obj=(HatchBack)car;
		 int TotalFare=obj.farePerKm*obj.getNumberOfKms();
		 return TotalFare;
		}
		else {
		 Sedan obj=(Sedan)car;
			 int TotalFare=obj.farePerKm*obj.getNumberOfKms();
			 return TotalFare;
			
		}
	}
 
}

