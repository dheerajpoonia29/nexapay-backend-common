package com.nexapay.model;

import com.nexapay.dto.request.TransactionRequest;
import com.nexapay.helper.TransactionStatus;
import com.nexapay.helper.TransactionType;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Entity
@Table(name = "transaction_table")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransactionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private Long transactionId;

    @Column(nullable = false)
    private String accountNo;

    @Column(nullable = false)
    private long amount;

    @Column(nullable = false)
    TransactionType transactionType;

    @Column(nullable = false)
    TransactionStatus transactionStatus;

    @Column(nullable = false)
    private Timestamp date;

    @Column(nullable = false)
    private Timestamp lastUpdateDate;

    @ManyToOne
    @JoinColumn(name = "bank_id", nullable = false)
    private BankEntity bank;

    public static TransactionEntity toEntity(TransactionRequest request) {
        return TransactionEntity.builder()
                .accountNo(request.getAccountNo())
                .amount(request.getAmount())
                .transactionType(request.getTransactionType())
                .build();
    }

    public static TransactionEntity toEntity(TransactionRequest request, BankEntity bank) {
        return TransactionEntity.builder()
                .accountNo(request.getAccountNo())
                .amount(request.getAmount())
                .transactionType(request.getTransactionType())
                .bank(bank)
                .build();
    }
}
