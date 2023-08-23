package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.PaymentHistory;

public interface PaymentHistoryRepo extends JpaRepository<PaymentHistory, Integer>{

}
