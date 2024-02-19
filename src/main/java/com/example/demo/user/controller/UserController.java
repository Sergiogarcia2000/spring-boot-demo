package com.example.demo.user.controller;

import com.example.demo.common.controller.BaseController;
import com.example.demo.user.controller.dto.UserDto;
import com.example.demo.user.controller.mapper.UserMapper;
import com.example.demo.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController implements BaseController {

    private final UserService userService;

    private final UserMapper userMapper;

    @GetMapping
    public List<UserDto> getAllUsers() {
        return userMapper.toDtoList(userService.findAll());
    }

    @GetMapping("/{id}")
    public UserDto getUserById(@PathVariable Long id) {
        return userMapper.toDto(userService.findById(id));
    }

    @PostMapping
    public UserDto createUser(@RequestBody UserDto userDTO) {
        return userMapper.toDto(userService.create(userMapper.toEntity(userDTO)));
    }

    @PutMapping
    public UserDto updateUser(@RequestBody UserDto userDTO) {
        return userMapper.toDto(userService.update(userMapper.toEntity(userDTO)));
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteById(id);
    }
}
