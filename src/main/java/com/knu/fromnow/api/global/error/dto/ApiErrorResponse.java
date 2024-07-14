package com.knu.fromnow.api.global.error.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
public class ApiErrorResponse {
    private boolean status;
    private int code;
    private String message;

    @Builder
    public ApiErrorResponse(boolean status, int code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }
}
