package com.masai.question3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) {
		Address add=new Address("Delhi","delhi","110053");
		Employee employee=new Employee("9953166","Roshan",add,"JOJO@gmail.com","password");
		 try {
			 
			 FileOutputStream file=new FileOutputStream("d://emp.txt");	
			 System.out.println("kuchh hua");
				ObjectOutputStream oos=new ObjectOutputStream(file);
				oos.writeObject(employee);
				FileInputStream fis=new FileInputStream("d://emp.txt");	
				
				ObjectInputStream ois=new ObjectInputStream(fis);
				Employee e=(Employee)ois.readObject();
				System.out.println("Emp id: "+e.getEmpId());
				System.out.println("Emp id: "+e.getEmpName());
				
//				System.out.println("Emp id: "+e.getAddress().getState());
				
				System.out.println("Emp id: "+e.getEmail());
				
				System.out.println("Emp id: "+e.getPassword());
				 
		 }
		 catch(Exception e) {
			 System.out.println("something hacked");
		 }
			
	 
		 
	}
		
	
	 
		
	}
