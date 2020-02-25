package com.mak.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mak.dao.BookDaoIntf;
import com.mak.model.Book;

@Service
public class BookServiceImpl implements BookServiceIntf {

	@Autowired
	BookDaoIntf bookDao;
	
	public void addBook(Book b) {
		
	}

	public List<Book> listBooks() {
		List<Book> bookList=(List<Book>) bookDao.findAll();
		
		return bookList;
	}

	public List<Book> searchBook(String searchItem) {
	List<Book> bookList=(List<Book>) bookDao.findBySearchItem(searchItem);
		return bookList;
	}

}
