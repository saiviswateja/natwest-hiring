package com.natwest.sender.amqp;

import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class CustomMessage {
    private String messageId;
    private Object message;
    private Date messageDate;
}
