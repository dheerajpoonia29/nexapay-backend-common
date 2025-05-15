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
    private String branchName;
    private String ifscCode;
}
