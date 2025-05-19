package com.nexapay.model;

import com.nexapay.dto.response.CashFlowResponse;
import com.nexapay.helper.CashFlowStatus;
import com.nexapay.helper.CashFlowType;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Entity
@Table(name = "cash_flow_table")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CashFlowEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private Long transactionId;

    @Column(nullable = false)
    private long amount;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    CashFlowType cashFlowType;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    CashFlowStatus cashFlowStatus;

    @Column(nullable = false)
    String cashFlowStatusMsg;

    @Column(nullable = false)
    private Timestamp lastUpdateDate;

    @Column(nullable = false)
    private Timestamp requestedDate;

    @Column(nullable = false)
    private String userEmail;

    @Column(nullable = false)
    private String accountNo;

    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    private AccountEntity account;

    @ManyToOne
    @JoinColumn(name = "bank_id", nullable = false)
    private BankEntity bank;

    @PrePersist
    protected void onCreate() {
        Timestamp now = new Timestamp(System.currentTimeMillis());
        this.requestedDate = now;
        this.lastUpdateDate = now;
    }

    @PreUpdate
    protected void onUpdate() {
        this.lastUpdateDate = new Timestamp(System.currentTimeMillis());
    }

    public CashFlowResponse toResponse() {
        return CashFlowResponse.builder()
                .transactionId(this.transactionId)
                .amount(this.amount)
                .cashFlowType(this.cashFlowType)
                .cashFlowStatus(this.cashFlowStatus)
                .cashFlowStatusMsg(this.getCashFlowStatusMsg())
                .lastUpdateDate(this.lastUpdateDate)
                .requestedDate(this.requestedDate)
                .userEmail(this.userEmail)
                .accountNo(this.accountNo)
                // todo write
                .account(null)
                .bank(null).build();
    }
}
