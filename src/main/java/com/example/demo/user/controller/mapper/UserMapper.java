package com.example.demo.user.controller.mapper;

import com.example.demo.common.mapper.DtoEntityMapper;
import com.example.demo.user.controller.dto.UserDto;
import com.example.demo.user.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper extends DtoEntityMapper<UserDto, User> {

}
