package com.interviewbit.assignment.services;

import com.interviewbit.assignment.dto.UserResponseDto;
import com.interviewbit.assignment.models.User;
import com.interviewbit.assignment.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        return userRepository.createUser(user);
    }

    @Override
    public User findById(UUID uuid) {
        Optional<User> user = userRepository.findById(uuid);
        if(user.isEmpty()) {
            return null;
        }
        return user.get();
    }
}
