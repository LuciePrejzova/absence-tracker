package com.FLsolutions.absenceTracker.services;

import org.springframework.stereotype.Service;

import com.FLsolutions.absenceTracker.models.User;
import com.FLsolutions.absenceTracker.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
	
	@Override
	public User createNewUser(User user) {
		return userRepository.save(new User(user.getFirstName(),user.getLastName(), user.getTelNumber(),user.getEmail()));
	}

}
