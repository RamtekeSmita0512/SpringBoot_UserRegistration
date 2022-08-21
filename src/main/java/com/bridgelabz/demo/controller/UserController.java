package com.bridgelabz.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.demo.Utility.Response;
import com.bridgelabz.demo.model.User;
import com.bridgelabz.demo.model.Userdto;
import com.bridgelabz.demo.service.UserService;

@RestController
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/add")
	public ResponseEntity<Response> addUser(@RequestBody Userdto userDto) {
		Response response = userService.addUser(userDto);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@GetMapping("/userName")
	public ResponseEntity<User> searchUserByUserName(@RequestParam String userName) {
		User response = userService.getByUserName(userName);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@PutMapping("/edit")
	public ResponseEntity<String> editUsers(@RequestBody Userdto userdto, @PathVariable int id) {
		String response = userService.editUsers(userdto, id);
		 return new ResponseEntity<>(response , HttpStatus.OK);
	}
		 @DeleteMapping("/delete")
			public ResponseEntity<String> deleteUser(@RequestParam int id) {
				String response = userService.deleteUser();
				return new ResponseEntity<>(response, HttpStatus.OK);
			}

}
