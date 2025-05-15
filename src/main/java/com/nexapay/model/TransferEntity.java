package com.nexapay.model;

import com.nexapay.dto.request.TransferRequest;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Entity
@Table(name = "transfer_table")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransferEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private Long transferId;

    @Column(nullable = false)
    private String fromAccountNo;

    @Column(nullable = false)
    private String toAccountNo;

    @Column(nullable = false)
    private long amount;

    @Column(nullable = false)
    private Timestamp date;

    @Column
    private Boolean status;

    @Column
    private String statusInfo;

    public static TransferEntity toEntity(TransferRequest request) {
        return TransferEntity.builder()
                .fromAccountNo(request.getFromAccountNo())
                .toAccountNo(request.getToAccountNo())
                .amount(request.getAmount())
                .build();
    }
}
