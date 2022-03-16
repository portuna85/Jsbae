package com.example.jsbae.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter @Setter
public class User {

    private Long userIdx;
    private String name;
    private Integer age;
    private String password;
    private String phoneNumber;

}