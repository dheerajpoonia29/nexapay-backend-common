package com.nexapay.dto.request;

import com.nexapay.helper.TransactionType;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionRequest {
    private String accountNo;

    private long amount;

    private TransactionType transactionType;
}
