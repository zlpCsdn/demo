package com.example.demo.controller;

import com.example.demo.entity.Payment;
import com.example.demo.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/payment")
public class PaymentHandler {
    @Autowired
    private PaymentRepository paymentRepository;
    @GetMapping("/findAll")
    public List<Payment> findAll(){
        return paymentRepository.findAll();
    }
}

