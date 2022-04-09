package com.natwest.sender.dto;

import lombok.*;

@Data
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Transaction {
    private String accountNumber;

    private String type;

    private int amount;

    private String currency;

    private String accountFrom;
}
