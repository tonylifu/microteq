package com.microteq.api.services.http;

import com.microteq.api.dto.response.HttpApiResponse;

/**
 * This API makes http request
 */
public interface HttpApiService {

    HttpApiResponse postApiRequest(String apiRequest, String endPoint, String token);
    HttpApiResponse getApiRequest(String endPoint, String token);
}
