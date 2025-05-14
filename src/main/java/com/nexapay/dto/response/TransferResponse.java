package com.nexapay.dto.response;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;

import java.sql.Timestamp;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransferResponse {
    private Long transferId;

    private String fromAccountNo;

    private String toAccountNo;

    private long amount;

    private Timestamp date;

    private Boolean status;

    private String statusInfo;
}
