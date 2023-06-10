package com.springbootapp.taskmanagerapi.taskRepositories;

import org.springframework.data.repository.CrudRepository;

import com.springbootapp.taskmanagerapi.taskEntities.User;

public interface UserRepository  extends CrudRepository<User, Long>{
	

}
