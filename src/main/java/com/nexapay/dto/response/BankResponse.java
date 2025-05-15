package com.nexapay.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.nexapay.helper.BankBranch;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BankResponse {
    private Integer id;

    private String name;

    @JsonIgnore
    private String password;

    private List<BankBranch> branches;
}
