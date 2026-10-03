package com.controllers.dao;

import com.controllers.fetchdata.UserDisplay;
import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import com.controllers.models.Users;
import com.controllers.services.UserService;

public class UserDao implements UserService {

	JdbcTemplate t1;

	public JdbcTemplate getT1() {
		return t1;
	}

	public void setT1(JdbcTemplate t1) {
		this.t1 = t1;
	}

	@Override
	public void register(Users u) {
		t1.update("INSERT INTO Users(username, email, password, confPass) VALUES ('" + u.getFullname() + "', '"
				+ u.getEmail() + "', '" + u.getPassword() + "', '" + u.getConfirmPassword() + "')");
	}

	@Override
	public List<Users> display() {
		List<Users> l = t1.query("SELECT * FROM Users ORDER  By id ASC", new UserDisplay());
		return l;
	}

	@Override
	public Users Edit(int id) {
		Users u = t1.queryForObject("SELECT * FROM Users WHERE id = '" + id + "'", new UserDisplay());
		return u;
	}

	@Override
	public void Delete(int id) {
		t1.update("DELETE FROM Users WHERE id = '" + id + "'");
	}

	@Override
	public void Update(Users u) {
		t1.update("UPDATE Users SET username='" + u.getFullname() + "', email='" + u.getEmail() + "', password='"
				+ u.getPassword() + "', confPass='" + u.getConfirmPassword() + "' WHERE id = '" + u.getId() + "'");

	}

	@Override
	public Users Login(Users u) {
		String email = u.getEmail();
		String password = u.getPassword();
		try {
		     Users uu = t1.queryForObject("SELECT * FROM USERS WHERE email = '"+email+"' AND password = '"+password+"'", new UserDisplay());
		     return uu;
		} catch(EmptyResultDataAccessException e) {
			return null;
		}
		
	}

}
