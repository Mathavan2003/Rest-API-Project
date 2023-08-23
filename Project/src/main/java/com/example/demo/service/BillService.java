package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Bill;
import com.example.demo.repository.BillRepo;

@Service
public class BillService {
	
	@Autowired
	BillRepo br;
	
	public Bill saveInfo(Bill b)
	{
		return br.save(b);
	}
	
	public List<Bill> showAll()
	{
		return br.findAll();
	}
	
	public Bill change(Bill b)
	{
		return br.saveAndFlush(b);
	}
	
	public void delete(int id)
	{
		br.deleteById(id);
	}
}
