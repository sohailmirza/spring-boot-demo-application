package com.interviewbit.assignment.services;

import com.interviewbit.assignment.models.User;

import java.util.UUID;

public interface UserService {

    User createUser(User user);
    User findById(UUID uuid);

}
