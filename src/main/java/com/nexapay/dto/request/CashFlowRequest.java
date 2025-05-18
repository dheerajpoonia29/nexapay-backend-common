package com.nexapay.dto.request;

import com.nexapay.helper.CashFlowType;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CashFlowRequest {
    private long amount;
    CashFlowType cashFlowType;
    private String accountNo;
}
