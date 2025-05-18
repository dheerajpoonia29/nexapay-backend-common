package com.nexapay.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.nexapay.model.UserEntity;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    private Integer id;

    private String name;

    private String email;

    @JsonIgnore
    private String password;

    private AccountResponse accountData;

    public UserEntity toEntity() {
        return UserEntity.builder()
                .id(this.id)
                .name(this.name)
                .email(this.email)
//                .accountEntity(this.accountData.toEntity())
                .build();
    }
}
