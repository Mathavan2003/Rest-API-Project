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

import com.example.demo.model.Bill;
import com.example.demo.service.BillService;

@RestController
public class BillController {
	
	@Autowired
	BillService fs;
	
@PostMapping("addBill")
	
	public Bill add(@RequestBody  Bill se)
	{
		return fs.saveInfo(se);
	}

	@GetMapping("showBill")
	public List<Bill> show()
	{
		return fs.showAll();
	}

	@PutMapping("updateBill")
	public Bill modify(@RequestBody Bill se)
	{
		return fs.change(se);
	}

	@DeleteMapping("deleteBillid/{id}")
	public String delId(@PathVariable int id)
	{
		fs.delete(id);
		return "Deleted Id: "+id;
	}
	
}
