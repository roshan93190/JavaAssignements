package evaluation3;
import java.util.Scanner;

public class Details {

	
	public static void main(String[] args) {
		try {
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the size of the array");
			int l=sc.nextInt();	
		System.out.println("Enter elements in the  array");	
		int[] arr=new int[l];
		for(int i=0;i<l;i++) {
			int ele=sc.nextInt();
			arr[i]=ele;
		}
		System.out.println("Enter the index of the array element you want to access");
		String a=sc.next();
		int ele_A=Integer.parseInt(a);
		System.out.println("element at the index "+arr[ele_A]);
		System.out.println("The array element successfully accessed");
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(NumberFormatException err) {
			System.out.println("NumberFormatException err");
		}
	}
}
