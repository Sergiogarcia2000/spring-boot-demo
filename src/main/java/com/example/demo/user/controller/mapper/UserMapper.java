package com.example.demo.user.controller.mapper;

import com.example.demo.common.mapper.DtoEntityMapper;
import com.example.demo.user.controller.dto.UserDto;
import com.example.demo.user.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper extends DtoEntityMapper<UserDto, User> {

}
