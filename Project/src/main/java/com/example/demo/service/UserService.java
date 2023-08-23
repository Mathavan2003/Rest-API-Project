package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepo;

@Service
public class UserService {

	
	@Autowired
	UserRepo br;
	
	public User saveInfo(User b)
	{
		return br.save(b);
	}
	
	public List<User> showAll()
	{
		return br.findAll();
	}
	
	public User change(User b)
	{
		return br.saveAndFlush(b);
	}
	
	public void delete(int id)
	{
		br.deleteById(id);
	}


}
