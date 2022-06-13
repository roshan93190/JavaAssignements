package com.masai.question2;

import java.util.ArrayList;
import java.util.List;


public class Library {

	public List<Book> bookList=new ArrayList<>();
	public void addBook(Book book) {
		bookList.add(book);
		System.out.println("Book added successfully");
	}
	public boolean isEmpty() {
		if(bookList.size()==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public List<Book> viewAllBooks(){
		List<Book> book=bookList;
	    return book;
	}
	public List<Book> viewBooksByAuthor(String author){
		List<Book> authorTest=new ArrayList<>();
		for(Book b:bookList) {
			if(b.getAuthor()==author) {
				authorTest.add(b);
			}
		}
		return bookList;
	}
	
	
	public int countTheBooks(String bookName) {
		List<Book> bookNameTest=new ArrayList<>();
		for(Book b:bookList) {
			if(b.getBookName()==bookName) {
				bookNameTest.add(b);
			}
		}
		int count =bookNameTest.size();
		return count;
	}
	
}
