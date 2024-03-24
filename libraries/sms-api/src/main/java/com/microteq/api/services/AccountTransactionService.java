package com.microteq.api.services;
import com.microteq.api.dto.response.ApiResponse;

import java.math.BigDecimal;

public interface AccountTransactionService {
    ApiResponse postTransaction(String destinationAccount, BigDecimal amount);
    ApiResponse fundTransfer(String sourceAccount, String destinationAccount, BigDecimal amount);
}
