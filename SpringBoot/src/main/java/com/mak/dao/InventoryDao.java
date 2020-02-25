/**
 * 
 */
package com.mak.dao;

import org.springframework.data.repository.CrudRepository;

import com.mak.model.Book;

/**
 * @author daruvuris
 *
 */
public interface InventoryDao extends CrudRepository<Book, Integer> {

}


