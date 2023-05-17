package com.mustafafindik.service;


import org.springframework.stereotype.Component;
import com.mustafafindik.entity.User;
public interface UserService {
    User saveUser(User user);

}
