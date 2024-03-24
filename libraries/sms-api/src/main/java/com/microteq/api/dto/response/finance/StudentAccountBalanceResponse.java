package com.microteq.api.dto.response.finance;

import com.microteq.api.dto.response.student.StudentResponse;
import lombok.*;
import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentAccountBalanceResponse {
    private BigDecimal accountBalance;
    private StudentResponse studentResponse;
}
