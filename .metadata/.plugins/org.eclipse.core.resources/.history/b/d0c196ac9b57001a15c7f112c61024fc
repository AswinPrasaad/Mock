package com.springboot.curd.FirstDemo.DemoDaoLayer;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.springboot.curd.FirstDemo.Model.User;

public interface DemoDaoIntf extends CrudRepository<User, Integer> {

	

	List<User> deleteByUserId(int id);

	

	List<User> findAllByUserName(String name);

	

	



}
