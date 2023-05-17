package com.mustafafindik.service;

import com.mustafafindik.repository.UserRepository;
import org.springframework.stereotype.Service;
import com.mustafafindik.entity.User;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public User saveUser(User user) {
        User saveUser = new User();
        saveUser.setName(user.getName());
        saveUser.setSpecialist(user.getSpecialist());
        return userRepository.save(saveUser);
    }
}
