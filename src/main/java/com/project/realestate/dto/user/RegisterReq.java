package com.project.realestate.dto.user;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegisterReq {
    private String fullName;
    private String email;
    private String address;
    private String password;
    private String confirmPassword;
}
