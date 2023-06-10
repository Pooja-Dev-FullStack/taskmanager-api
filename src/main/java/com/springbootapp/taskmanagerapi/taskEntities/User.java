package com.springbootapp.taskmanagerapi.taskEntities;

import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long user_id;
	
	@Column(name="uname",nullable=false)
	private String username;
	
	@Column(name="upassword",nullable=false)
	private String password;
	
	@Column(name="fname", nullable=false)
	private String full_name;
	
	@Column(name="role", nullable=false)
	private String role;
	
	@Column(name="birth", nullable=true)
	private LocalDateTime  dob;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(long user_id, String username, String password, String full_name, String role, LocalDateTime dob) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.full_name = full_name;
		this.role = role;
		this.dob = dob;
	}
	
	public long getUser_id() {
		return user_id;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getFull_name() {
		return full_name;
	}
	public String getRole() {
		return role;
	}
	public LocalDateTime getDob() {
		return dob;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public void setDob(LocalDateTime dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Users [user_id=" + user_id + ", username=" + username + ", password=" + password + ", full_name="
				+ full_name + ", role=" + role + ", dob=" + dob + "]";
	}

}
