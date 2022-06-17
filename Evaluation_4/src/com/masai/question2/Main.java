package com.masai.question2;
 
	import java.util.Scanner;
	import java.util.List;
	

	public class Main {
		
	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println(" 1 to  Add book you want");
			System.out.println("2 to Display book details");
			System.out.println("3 to Count the number of books");
		    System.out.println("4  to Exit");
		System.out.println("------------------------------------");
		
		int opt=sc.nextInt();
		if(opt==1) {
			System.out.println("Enter isbn number please");
			int isbn=sc.nextInt();
			System.out.println("Enter bookname");
			String bookName=sc.nextLine();
			System.out.println("Enter author name");
			sc.next();
		  String author=sc.nextLine();
		  sc.next();
		  Book book=new Book();
		  book.setIsbn(isbn);
		  book.setBookName(bookName);
		  book.setAuthor(author);
		  
		 Library lib=new Library();
		 lib.addBook(book);
		  
		}
		else if(opt==2) {
			Library lib=new Library();
			List<Book> book=lib.viewAllBooks();
			for(Book b:book) {
				System.out.println("isbn No: "+b.getIsbn());
				System.out.println("BookName: "+b.getBookName());
				System.out.println("Author: "+b.getAuthor());
				System.out.println("------------------");
			}
		
		}
		else if(opt==3) {
			System.out.println("Enter author name");
			String name =sc.nextLine();
			Library lib=new Library();
			List<Book> book=lib.viewBooksByAuthor(name);
			if(book.size()>0) {
				for(Book b: book) {
				System.out.println("isbn No: "+b.getIsbn());
				System.out.println("BookName: "+b.getBookName());
				System.out.println("Author: "+b.getAuthor());
				System.out.println("------------------");
				}
			}
		}
		else {
			System.out.println("None of the book published by the author: ");
		}
		
	
		
		}
	}
		
		
	}
