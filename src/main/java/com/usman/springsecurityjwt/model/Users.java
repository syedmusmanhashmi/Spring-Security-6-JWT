package com.usman.springsecurityjwt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class Users {
    @Id
    private int id;
    private String username;
    private String password;
}
