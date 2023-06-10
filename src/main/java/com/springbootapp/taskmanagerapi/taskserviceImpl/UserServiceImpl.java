package com.springbootapp.taskmanagerapi.taskserviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.stereotype.Service;

import com.springbootapp.taskmanagerapi.taskEntities.User;
import com.springbootapp.taskmanagerapi.taskRepositories.UserRepository;
import com.springbootapp.taskmanagerapi.taskService.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	private UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository= userRepository;
	}

	@Override
	public User getUser(Long id) throws NotFoundException {
	    Optional<User> user = userRepository.findById(id);
	    if(user.isEmpty()) {
		throw new NotFoundException();
	    }
	    else {
		return user.get();
	    }
	}

	@Override
	public User saveUser(User user) {
		User user2 = userRepository.save(user) ;
		return user2;
	}

	@Override
	public List<User> getListofUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String removeUser(Long Id) {
		// TODO Auto-generated method stub
		return null;
	}

}
