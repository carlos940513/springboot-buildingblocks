package com.stacksimplify.restservices.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stacksimplify.restservices.entities.Order;
import com.stacksimplify.restservices.entities.User;
import com.stacksimplify.restservices.exceptions.UserNotFoundException;
import com.stacksimplify.restservices.repositories.OrderRepository;
import com.stacksimplify.restservices.repositories.UserRepository;

@RestController
@RequestMapping(value="/hateoas/users")
@Validated
public class OrderHateoasController {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderReposiotry;
	
	//get All Orders for users
		@GetMapping("/{userid}/orders")
		public CollectionModel<Order> getAllOrders(@PathVariable Long userid) throws UserNotFoundException{
			Optional<User> userOptional = userRepository.findById(userid);
			if( !userOptional.isPresent() ) {
				throw new UserNotFoundException("User not found");
			}
			List<Order> allorders = userOptional.get().getOrders();
			
			CollectionModel<Order> finalModel = CollectionModel.of(allorders);
			
			return finalModel;
		}
}
