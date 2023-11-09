package com.pinsoft.budgettrackerbe.business.abstracts;

import com.pinsoft.budgettrackerbe.business.requests.LoginRequest;
import com.pinsoft.budgettrackerbe.business.requests.UserRegisterRequest;
import com.pinsoft.budgettrackerbe.entities.concretes.User;

public interface UserService {
    User login (LoginRequest loginRequest) throws Exception;
    void add (UserRegisterRequest userRegisterRequest);
    User findByEmail (UserRegisterRequest userRegisterRequest);
    User findByUsernameAndPassword (UserRegisterRequest userRegisterRequest) throws Exception;
}
