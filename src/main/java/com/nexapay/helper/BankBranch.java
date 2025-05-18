package com.nexapay.helper;

import jakarta.persistence.*;
import lombok.*;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BankBranch {
    @Column(unique = true)
    private String branchName;

    @Column(unique = true)
    private String ifscCode;
}
