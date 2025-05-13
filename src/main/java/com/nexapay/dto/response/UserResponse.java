package com.nexapay.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    private String name;

    private String email;

    @JsonIgnore
    private String password;

    private AccountResponse accountData;

    public UserResponse toResponse() {
        return UserResponse.builder()
                .name(this.name)
                .email(this.email)
                .build();
    }
}
