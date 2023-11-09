package com.pinsoft.budgettrackerbe.webApiControllers;

import com.pinsoft.budgettrackerbe.business.abstracts.UserService;
import com.pinsoft.budgettrackerbe.business.requests.LoginRequest;
import com.pinsoft.budgettrackerbe.business.requests.UserRegisterRequest;
import com.pinsoft.budgettrackerbe.entities.concretes.User;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody UserRegisterRequest userRegisterRequest) {
        this.userService.add(userRegisterRequest);
    }

    @PostMapping("/login")
    public User login (LoginRequest loginRequest) throws Exception {
        return userService.login(loginRequest);
    }

    @PostMapping("/{email}")
    public User findByEmail (UserRegisterRequest userRegisterRequest) {
        return userService.findByEmail(userRegisterRequest);
    }

    @PostMapping("/usernameAndPassword")
    public User findByUsernameAndPassword (UserRegisterRequest userRegisterRequest) throws Exception {
        return userService.findByUsernameAndPassword(userRegisterRequest);
    }
}
