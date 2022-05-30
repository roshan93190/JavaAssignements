package evaluation2;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	System.out.println("Enter number of passengers");
	int passengers=input.nextInt();
	System.out.println("Enter numberOfkms ");
	int kms=input.nextInt();
	Ola ola=new Ola();
	if(passengers<=3) {
		Car car= ola.bookCar(passengers, kms);
		HatchBack h1=(HatchBack)car;
		int res=ola.calculateBill(car);
		
		System.out.println("The total fare amount is "+ ola.calculateBill(car));
	}
	else {
		Car car= ola.bookCar(passengers, kms);
		Sedan h1=(Sedan)car;
		 
	System.out.println("the total fare is   "+ ola.calculateBill(car));
	}

}
}
