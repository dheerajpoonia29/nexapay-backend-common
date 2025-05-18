package com.nexapay.dto.response;

import com.nexapay.model.AccountEntity;
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
    private Integer id;

    private String accountNo;

    private long balance;

    private String ifscCode;

    private BankResponse bankData;

    private UserResponse userData;

    public AccountEntity toEntity() {
        return AccountEntity.builder()
                .id(this.id)
                .accountNo(this.accountNo)
                .balance(this.balance)
                .ifscCode(this.ifscCode)
                .bank(this.bankData.toEntity())
                .user(this.userData.toEntity()).build();
    }
}
