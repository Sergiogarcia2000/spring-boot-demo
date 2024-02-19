package com.example.demo.user.service;

import com.example.demo.common.exceptions.NotFoundException;
import com.example.demo.common.service.BaseCrudService;
import com.example.demo.user.controller.mapper.UserMapper;
import com.example.demo.user.model.User;
import com.example.demo.user.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService extends BaseCrudService<User, Long, UserRepository> {

    private final UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        super(userRepository);
        this.userMapper = userMapper;
    }

}
