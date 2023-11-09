package com.pinsoft.budgettrackerbe.repositories;

import com.pinsoft.budgettrackerbe.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail (String email);
    User findByUsernameAndPassword (String username, String password);
}
