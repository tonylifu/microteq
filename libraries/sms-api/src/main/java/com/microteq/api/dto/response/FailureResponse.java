package com.microteq.api.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class FailureResponse {
    private ApiResponse apiResponse;
}
