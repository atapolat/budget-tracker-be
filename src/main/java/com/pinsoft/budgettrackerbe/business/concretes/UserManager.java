package com.pinsoft.budgettrackerbe.business.concretes;

import com.pinsoft.budgettrackerbe.business.abstracts.UserService;
import com.pinsoft.budgettrackerbe.business.requests.LoginRequest;
import com.pinsoft.budgettrackerbe.business.requests.UserRegisterRequest;
import com.pinsoft.budgettrackerbe.entities.concretes.User;
import com.pinsoft.budgettrackerbe.mappers.ModelMapperService;
import com.pinsoft.budgettrackerbe.repositories.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class UserManager implements UserService {

    private UserRepository userRepository;
    private ModelMapperService modelMapperService;

    @Override
    public User login(LoginRequest loginRequest) throws Exception {
        User user = userRepository.findByUsernameAndPassword(loginRequest.getUsername(),
                loginRequest.getPassword());
        if (user == null) {
            throw new Exception("Invalid username or password!");
        }
        return user;
    }

    @Override
    public void add(UserRegisterRequest userRegisterRequest) {
        User user = this.modelMapperService.forRequest().map(userRegisterRequest, User.class);
        this.userRepository.save(user);
    }

    @Override
    public User findByEmail(UserRegisterRequest userRegisterRequest) {
        User user = userRepository.findByEmail(userRegisterRequest.getEmail());
        return user;
    }

    @Override
    public User findByUsernameAndPassword(UserRegisterRequest userRegisterRequest) throws Exception {
        User user = userRepository.findByUsernameAndPassword(userRegisterRequest.getUsername(),
                userRegisterRequest.getPassword());
        if (user == null) {
            throw new Exception("Invalid usarname or pasword!");
        }
        return user;
    }
}
