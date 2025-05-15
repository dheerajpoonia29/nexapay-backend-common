package com.nexapay.dto.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BankRequest {
    private Integer id;

    private String name;

    private String password;
}
