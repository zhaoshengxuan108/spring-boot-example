package com.egbert.jpa.thymeleaf.curd.repository;

import com.egbert.jpa.thymeleaf.curd.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {

    User findById(long id);

    void deleteById(Long id);
}