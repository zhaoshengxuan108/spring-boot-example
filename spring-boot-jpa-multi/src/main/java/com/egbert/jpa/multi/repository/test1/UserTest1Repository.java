package com.egbert.jpa.multi.repository.test1;

import com.egbert.jpa.multi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTest1Repository extends JpaRepository <User, Long> {
    User findById(long id);
    User findByUserName(String userName);
    User findByUserNameOrEmail(String username, String email);
}