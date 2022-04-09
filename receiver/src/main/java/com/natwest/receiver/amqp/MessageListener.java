package com.natwest.receiver.amqp;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.natwest.receiver.TransactionService;
import com.natwest.receiver.dto.Transaction;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @Autowired
    public TransactionService transactionService;

    @RabbitListener(queues = MQconfig.QUEUE)
    public void transactionListener(MessageRequest messageRequest) {
        final ObjectMapper mapper = new ObjectMapper(); // jackson's objectmapper
        final Transaction transaction = mapper.convertValue(messageRequest.getMessage(), Transaction.class);
        transactionService.saveTransaction(transaction);
    }
}
