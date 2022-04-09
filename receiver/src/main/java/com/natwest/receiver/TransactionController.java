package com.natwest.receiver;

import com.natwest.receiver.dto.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/receive")
public class TransactionController {
    @Autowired
    public TransactionService transactionService;

    @PostMapping
    public void saveTransaction(@RequestBody Transaction transaction) {
        transactionService.saveTransaction(transaction);
    }
}
