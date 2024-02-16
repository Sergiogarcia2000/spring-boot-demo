package com.example.demo.common.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseException extends RuntimeException {

    String message = "BASE_EXCEPTION";
    String errorCode = "BASE_EXCEPTION";

}
