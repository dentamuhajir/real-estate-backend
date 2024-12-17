package com.project.realestate.dto.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class GenericResponse<T> {
    private String status;
    private Number code;
    private String message;
    private T data;
}
