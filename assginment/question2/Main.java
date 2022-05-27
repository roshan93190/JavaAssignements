package Day3.assginment.question2;

public class Main {

	public static void main(String[] args) {
	 
	 Animal [] arr=new Animal[3];
	 
	 Cat c1=new Cat();  
	 Dog d1=new Dog();  
	 Tiger t1=new Tiger();  
	 
	 arr[0]=c1;
	 arr[1]=d1;
	 arr[2]=t1;
	 for(Animal i:arr) {
		 i.eat();
		 i.walk();
		 i.makeNoise();
		 System.out.println("*************");
	 }
	
	 
//	 for(int i=0;i<arr.length;i++) {
//		 arr[i].eat();
//		 arr[i].walk();
//		 arr[i].makeNoise();
//		 System.out.println("*************");
//	 }
	}

}
