package com.project.realestate.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

public class GeneralException extends RuntimeException{
    private Integer code;
    private HttpStatus httpStatus;
    public GeneralException(Integer code,String message) {
        super(message);
        this.code = code;
        httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
    }

    public Integer getCode() {
        return code;
    }

    public HttpStatusCode getHttpStatus() {
        return httpStatus;
    }
}
