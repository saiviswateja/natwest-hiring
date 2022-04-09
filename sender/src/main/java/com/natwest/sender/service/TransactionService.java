package com.natwest.sender.service;

import com.natwest.sender.dto.Transaction;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TransactionService {
    public void sendTransactionMessage(Transaction transaction) {
        log.info("Received transaction details from controller " + transaction.toString());
    }
}
