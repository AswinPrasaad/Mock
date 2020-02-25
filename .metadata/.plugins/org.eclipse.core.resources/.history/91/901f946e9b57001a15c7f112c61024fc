package com.springboot.curd.FirstDemo.ServiceLayer;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.curd.FirstDemo.DemoDaoLayer.DemoDaoIntf;
import com.springboot.curd.FirstDemo.Model.User;

@Service
public class DemoServiceImpl implements DemoServiceIntf {

	
	
	@Autowired
	DemoDaoIntf dao;
	
	@Override
	public void save(User user) {
	dao.save(user);
		
	}

	@Override
	public List<User> findAll(User user) {
		
		return (List<User>) dao.findAll();
		
	}

	@Override
	@Transactional
	public List<User> delete(int id) {
		
		return dao.deleteByUserId(id);
	}

	



	@Override
	@Transactional
	public User findByUserId(int id) {
		
		return dao.findOne(id);
	}

	@Override
	public List<User> findByUserName(String name) {
		
		return dao.findAllByUserName(name);
	}


}
