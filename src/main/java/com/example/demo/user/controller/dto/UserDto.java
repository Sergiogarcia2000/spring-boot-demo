package com.example.demo.user.controller.dto;

import com.example.demo.common.dto.BaseDto;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
public class UserDto extends BaseDto {
    private String name;
    private String email;
    private int age;
}