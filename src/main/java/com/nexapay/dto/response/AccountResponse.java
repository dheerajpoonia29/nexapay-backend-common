package com.nexapay.dto.response;

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
public class AccountResponse {
    private String accountNo;

    private long balance;

    private int userId;

    public AccountResponse toResponse() {
        return AccountResponse.builder()
                .accountNo(this.accountNo)
                .balance(this.balance)
                .userId(this.userId)
                .build();
    }
}
