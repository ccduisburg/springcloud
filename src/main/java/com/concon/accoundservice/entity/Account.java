package com.concon.accoundservice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Account {
    private String id;
    private String username;
    private String email;
    private String password;
}
