package com.nexapay.model;

import com.nexapay.helper.BankBranch;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name="bank_table")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BankEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false)
    private String name;

    @Column(nullable = false)
    private String password;

    @ElementCollection
    @CollectionTable(name = "bank_branch_table", joinColumns = @JoinColumn(name = "bank_id"))
    private List<BankBranch> branches;

    @OneToMany(mappedBy = "bank", cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<AccountEntity> accounts;

    @OneToMany(mappedBy = "bank", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CashFlowEntity> cashFlowEntityList;
}

/*
INSERT INTO bank_table (name, password) VALUES ('Hdfc Bank', '123');
INSERT INTO bank_branch_table (bank_id, branch_name, ifsc_code) VALUES
(1, 'gajsinghpur', 'hdfc001'),
(1, 'raisinghnagar', 'hdfc002');

INSERT INTO bank_table (name, password) VALUES ('Pnb Bank', '123');
INSERT INTO bank_branch_table (bank_id, branch_name, ifsc_code) VALUES
(2, 'amritsar', 'pnb001'),
(2, 'karnal', 'pnb002');


DELETE FROM bank_branch_table WHERE bank_id = 2;
DELETE FROM bank_table WHERE id = 2;

INSERT INTO bank_branch_table (bank_id, branch_name, ifsc_code)
VALUES
(3, 'gajsinghpur', 'pnb001'),
(3, 'raisinghnagar', 'pnb002');
 */
