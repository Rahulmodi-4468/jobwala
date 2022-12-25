package com.project.jobjcs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.jobjcs.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    public static User findByName(String userName) {
        User user = new User();
        return user;
    }

    public List<User> findOne(User user);
}
