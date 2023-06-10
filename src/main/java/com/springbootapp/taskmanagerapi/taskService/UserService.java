package com.springbootapp.taskmanagerapi.taskService;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.springbootapp.taskmanagerapi.taskEntities.User;

@Service
public interface UserService {
	
	User getUser(Long id) throws NotFoundException;
	User saveUser(User user);
	List<User> getListofUsers();
	User updateUser(User user);
	String removeUser(Long Id);
	}
