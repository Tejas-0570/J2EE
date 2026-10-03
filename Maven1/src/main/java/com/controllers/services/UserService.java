package com.controllers.services;

import java.util.List;

import com.controllers.models.Users;

public interface UserService {
	
	public void register(Users u);
	
	public List<Users> display();
	
	public Users Edit(int id);
	
	public void Delete(int id);
	
	public void Update(Users u);
	
	public Users Login(Users u);
}
