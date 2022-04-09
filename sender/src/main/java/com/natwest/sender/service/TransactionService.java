package com.natwest.sender.service;

import com.natwest.sender.amqp.CustomMessage;
import com.natwest.sender.amqp.MessagePublisher;
import com.natwest.sender.dto.Transaction;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TransactionService {

    @Autowired
    public MessagePublisher messagePublisher;

    public void sendTransactionMessage(Transaction transaction) {
        log.info("Received transaction details from controller " + transaction.toString());
        messagePublisher.publishMessage(CustomMessage.builder().message(transaction).build());
    }
}
