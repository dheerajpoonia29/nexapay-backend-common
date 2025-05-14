package com.nexapay.dto.response;

import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionResponse {
    private Long transactionId;

    private String accountNo;

    private long amount;

    private Timestamp date;

    private Boolean status;
}
