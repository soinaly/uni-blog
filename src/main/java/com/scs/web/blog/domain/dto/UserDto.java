package com.scs.web.blog.domain.dto;

import lombok.Data;

import java.io.Serializable;


@Data
public class UserDto implements Serializable {
    private String mobile;
    private String password;
    private String code;

}