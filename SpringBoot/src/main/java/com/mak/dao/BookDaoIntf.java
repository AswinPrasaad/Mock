package com.mak.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.mak.model.Book;

public interface BookDaoIntf extends CrudRepository<Book, Long>{
	@Query(
			  value = "SELECT * FROM book b WHERE b.name like ?1 or b.description like ?1 or b.author like ?1", 
			  nativeQuery = true)
			List<Book> findBySearchItem(String searchItem);
}
