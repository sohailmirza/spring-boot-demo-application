package com.interviewbit.assignment.models;

import com.interviewbit.assignment.utils.Constants.*;
import lombok.Data;

import java.util.UUID;

@Data
public class User {

    private UUID uuid;

    private String userName;

    private Gender gender;

    public User(String userName, Gender gender) {
        this.uuid = UUID.randomUUID();
        this.userName = userName;
        this.gender = gender;
    }

}
