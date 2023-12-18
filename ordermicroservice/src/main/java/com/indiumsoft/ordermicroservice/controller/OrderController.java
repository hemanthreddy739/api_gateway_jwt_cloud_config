package com.indiumsoft.ordermicroservice.controller;

import com.indiumsoft.ordermicroservice.common.TransactionRequest;
import com.indiumsoft.ordermicroservice.common.TransactionResponse;
import com.indiumsoft.ordermicroservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;


    @PostMapping("/orderItem")
    public TransactionResponse bookOrder(@RequestBody TransactionRequest transactionRequest){

        return orderService.saveOrder(transactionRequest);

    }

    @Value("${messages.greeting}")
    private String orderServiceMessage;

    @GetMapping("/orderServiceMessage")
    public String getOrderServiceMessage() {
        return  orderServiceMessage;
    }





}
