package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "payment_history")
public class PaymentHistory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int payment_history_id;
	private int user_id;
	private int bill_id;
	private String date;
	private double amount;
	public int getPayment_history_id() {
		return payment_history_id;
	}
	public void setPayment_history_id(int payment_history_id) {
		this.payment_history_id = payment_history_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getBill_id() {
		return bill_id;
	}
	public void setBill_id(int bill_id) {
		this.bill_id = bill_id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public PaymentHistory(int payment_history_id, int user_id, int bill_id, String date, double amount) {
		super();
		this.payment_history_id = payment_history_id;
		this.user_id = user_id;
		this.bill_id = bill_id;
		this.date = date;
		this.amount = amount;
	}
	public PaymentHistory() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}

