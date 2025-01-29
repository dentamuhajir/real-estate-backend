package com.project.realestate.service;

import com.project.realestate.dto.response.GenericResponse;
import com.project.realestate.dto.user.RegisterReq;

public interface UserService {
    public void register(RegisterReq request);
}
