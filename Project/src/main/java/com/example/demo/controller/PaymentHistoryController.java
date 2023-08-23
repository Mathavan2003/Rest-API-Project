package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.PaymentHistory;
import com.example.demo.service.PaymentHistoryService;

@RestController
public class PaymentHistoryController {
	
	@Autowired
	PaymentHistoryService fs;
	
@PostMapping("addPaymentHistory")
	
	public PaymentHistory add(@RequestBody  PaymentHistory se)
	{
		return fs.saveInfo(se);
	}

	@GetMapping("showPaymentHistory")
	public List<PaymentHistory> show()
	{
		return fs.showAll();
	}

	@PutMapping("updatePaymentHistory")
	public PaymentHistory modify(@RequestBody PaymentHistory se)
	{
		return fs.change(se);
	}

	@DeleteMapping("deletePaymentHistoryid/{id}")
	public String delId(@PathVariable int id)
	{
		fs.delete(id);
		return "Deleted Id: "+id;
	}
	
}
