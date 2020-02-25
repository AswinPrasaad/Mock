package com.mak.service;

import java.util.List;

import com.mak.model.Book;

public interface BookServiceIntf {
	
	public void addBook(Book b);
	public List<Book> listBooks();
	
	public List<Book> searchBook(String searchItem);

}
