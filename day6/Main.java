package Sprint2.masai.assignments;


public class Main {
	 
	 public int[] findAndReturnPrimeNumbers(int[] arr){
		  int num;
		//write the logic to iterate through the supplied inputArray and
		  int count=0;
			 
		  for(int i=1;i<=arr.length;i++) {
			if(arr[i]%i==0) {
				count++;
			}
		  }
		  System.out.println(count); 
		  return arr;
		}
	public static void main(String[] args) {
		Main m1=new Main();
		int[] a= {1,2,3,4,5,6,7,8,9,10};
		int[] arr=m1.findAndReturnPrimeNumbers(a);
		System.out.println(arr);
	}

}

//
//public int[] findAndReturnPrimeNumbers(int[] inputArray){
//	//write the logic to iterate through the supplied inputArray and
//	//determine each element whether it is prime or not
//	//create a second array of int
//	//if any number is prime inside the inputArray then add that number inside the second
//	//array
//	//and return the second array
//	//if no prime number is found then return the empty array.
//	int m=0;
//	int[] arr= {};
//	
//	for (int x=0;x<inputArray.length;x++) {
//		int y=0;
//		for (int z=2;z<=inputArray[x];z++) {
//			if (inputArray[x]%z==0) {
//				y++;
//			}
//			
//		}
//		if(y==1) {
//			m++;
//			arr=Arrays.copyOf(arr, 0+1);
//			arr[m-1]=inputArray[x];
//			
//		}
//	}
//	
//	
//	return arr;
//	
//	
//	}
//	public static void main(String[] args){
//	//Create the object of Main class
//	//on the object of Main class call the findAndReturnPrimeNumbers method
//	//by supplying the following array as the parameter
//		
//		Prime object=new Prime();
//		
//	int[] inputArray = {10,12,5,50,11,14,15};
//	
//	int[] ans=object.findAndReturnPrimeNumbers(inputArray);
//	if(ans.length>0) {
//		for (int x=0;x<ans.length;x++) {
//			System.out.println(ans[x]);
//		}
//	}
//	else {
//		System.out.println("Prime Number not fount in the supplied Array");
//	}
//	//print each element from the returned array of findAndReturnPrimeNumbers method
//	//if findAndReturnPrimeNumbers method returns an empty array then print the following
//	// "Prime number not found in the supplied Array"
//	}
