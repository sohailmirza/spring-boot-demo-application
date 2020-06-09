package com.interviewbit.assignment.repository;

import com.interviewbit.assignment.models.User;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository {

    User createUser(User user);

    Optional<User> findById(UUID uuid);

}
