package com.stacksimplify.restservices.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.stacksimplify.restservices.entities.User;
import com.stacksimplify.restservices.exceptions.UserExistException;
import com.stacksimplify.restservices.exceptions.UserNotFoundException;
import com.stacksimplify.restservices.repositories.UserRepository;

//Service
@Service
public class UserService {
	
	//Autowire the UserRepository
	
	@Autowired
	private UserRepository userRepository;
	
	
	//getAllUsers Method
	public List<User> getAllusers(){
		
		return userRepository.findAll();
	}
	
	//CreateUser Method
	
	public User createUser(User user)throws UserExistException {
		//if user exist using username
		User existstingUser = userRepository.findByUsername(user.getUsername());
		
		//if not exist throw UserExistException
		if( existstingUser != null) {
			throw new UserExistException("User already exists in repositor");
		}
		
		
		return userRepository.save(user);
	}
	
	//getUserById
	public Optional<User> getUserById(Long id)throws UserNotFoundException{
		Optional<User> user = userRepository.findById(id);
		
		if(!user.isPresent()) {
			throw new UserNotFoundException("User Not Found in user Repository");
		}
		
		return user;
	}
	
	//updateUserById
	
	public User updateUserById(Long id, User user)throws UserNotFoundException {
		
		Optional<User> optionalUser = userRepository.findById(id);
		
		if( !optionalUser.isPresent() ) {
			throw new UserNotFoundException("User Not found in user Repository, provide the correct user ID");
		}
		
		user.setId(id);
		return userRepository.save(user);
	}
	
	//deleteUserById
	public void deleteUserById(Long id) {
		Optional<User> optionalUser = userRepository.findById(id);
		if( !optionalUser.isPresent() ) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"User Not found in user Repository, provide the correct user ID");
		}
		
		userRepository.deleteById(id);
	}
	
	//getUserByUsername
	public User getUserByUsername(String username) {
		return userRepository.findByUsername(username);
	}

}
