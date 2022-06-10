package Sprint2.masai.assignments;

public class ClassNotes {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		
		Person [] persons= new Person[24];
		persons[0]=new Person();
		persons[1]=null;
	
		
		Person p1=new Person(age:45, name:"rosan");
	}

}
class Person{
	int age;
	String name;
	public Person(){};
	public Person(int age,String name) {
		this.age=age;
		this.name=name;
	}
	
}
