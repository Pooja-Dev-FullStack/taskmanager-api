package com.springbootapp.taskmanagerapi.taskController;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootapp.taskmanagerapi.taskEntities.User;
import com.springbootapp.taskmanagerapi.taskService.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	private UserService userService;
	
	public UserController(UserService userService) {
		super();
		this.userService=userService;
	}
	
	@GetMapping("/{id}")
	public  ResponseEntity<User> getUser(@PathVariable("id")  Long id) throws NotFoundException {
	    	return new ResponseEntity<User>(userService.getUser(id), HttpStatus.FOUND);
		
	}
	
	@PostMapping("/register")
	public ResponseEntity<User> saveUser( ){
	    ResponseEntity<User> responseEntity = respon
	    return null;
	    
	}

}
