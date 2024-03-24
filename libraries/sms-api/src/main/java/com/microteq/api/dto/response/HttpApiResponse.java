package com.microteq.api.dto.response;

import lombok.Builder;
import org.springframework.http.HttpHeaders;

@Builder
public record HttpApiResponse(String responseBody, int statusCode, HttpHeaders headers) { }
