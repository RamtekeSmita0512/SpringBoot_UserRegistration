package com.bridgelabz.demo.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.demo.Utility.Response;
import com.bridgelabz.demo.model.User;
import com.bridgelabz.demo.model.Userdto;
import com.bridgelabz.demo.repository.UserRepository;



@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	
	private ModelMapper modelMapper = new ModelMapper();
	public Object addUsers;
	
	public Response getAllUsers(){
		List<User> users = new ArrayList<>();
		users= userRepository.findAll();
		Response object =new Response("AllUser", 200,users );
		
				return object;
	}
	
	public Response addUser(Userdto userdto) {
		User user = modelMapper.map(userdto, User.class);
		userRepository.save(user);
		Response object =new Response("User Added Successfully", 200,user );
		return object;
		
	}
	
	public Optional<User> getUser() {
		return userRepository.findById(null);
	}

	public Object getUsers() {
		// TODO Auto-generated method stub
		return userRepository.getClass();
	}

	public void getUsers(int id) {
		// TODO Auto-generated method stub
		
	}

	public void addUsers() {
		// TODO Auto-generated method stub
		
	}

	public void editUsers(int id, User user) {
		// TODO Auto-generated method stub
		
	}

	public String deleteUser() {
		// TODO Auto-generated method stub
		return userRepository.toString();
	}

	public String editUsers() {
		// TODO Auto-generated method stub
		return userRepository.toString();
	}

	public String editUsers(User user, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addUsers(Userdto userdto) {
		// TODO Auto-generated method stub
		
	}

	public String deleteByEmailId(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	public User getByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	public String editUsers(Userdto userdto, int id) {
		// TODO Auto-generated method stub
		return null;
	}

}



	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	





