package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.PaymentHistory;
import com.example.demo.repository.PaymentHistoryRepo;

@Service
public class PaymentHistoryService {
	
	@Autowired
	PaymentHistoryRepo br;
	
	public PaymentHistory saveInfo(PaymentHistory b)
	{
		return br.save(b);
	}
	
	public List<PaymentHistory> showAll()
	{
		return br.findAll();
	}
	
	public PaymentHistory change(PaymentHistory b)
	{
		return br.saveAndFlush(b);
	}
	
	public void delete(int id)
	{
		br.deleteById(id);
	}
}
