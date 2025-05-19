package com.nexapay.dto.response;

import com.nexapay.helper.CashFlowStatus;
import com.nexapay.helper.CashFlowType;
import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CashFlowResponse {
    private Long transactionId;
    private long amount;
    CashFlowType cashFlowType;
    CashFlowStatus cashFlowStatus;
    String cashFlowStatusMsg;
    private Timestamp lastUpdateDate;
    private Timestamp requestedDate;
    private String userEmail;
    private String accountNo;
    private AccountResponse account;
    private BankResponse bank;
}
