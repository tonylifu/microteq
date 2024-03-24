package com.microteq.api.services.http;

import com.microteq.api.dto.response.HttpApiResponse;

/**
 * This API makes http request
 */
public interface HttpOAuthService {
    /**
     * @param request
     * @return
     */
    HttpApiResponse postRequest(String request, String endPoint);
}
