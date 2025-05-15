package com.nexapay.dto.request;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountRequest {
    private UserRequest userRequest;

    private BankRequest bankRequest;

    private String accountNo;

    private long balance;
}
