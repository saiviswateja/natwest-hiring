package com.natwest.sender.controller;

import com.natwest.sender.dto.Transaction;
import com.natwest.sender.service.TransactionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/transaction")
@Slf4j
public class TransactionController {

    @Autowired
    public TransactionService transactionService;

    @PostMapping
    public ResponseEntity<String> receiveTransactionDetails(@RequestBody Transaction transaction) {
        log.info("Received message from user: " + transaction.toString());
        transactionService.sendTransactionMessage(transaction);
        return ResponseEntity.ok("Message successfuly received");
    }
}
