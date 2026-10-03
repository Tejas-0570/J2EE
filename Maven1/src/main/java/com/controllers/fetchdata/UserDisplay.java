package com.controllers.fetchdata;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.controllers.models.Users;

public class UserDisplay implements RowMapper<Users>{

	@Override
	public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
		Users u = new Users();
		u.setId(rs.getInt(1));
		u.setFullname(rs.getString(2));
		u.setEmail(rs.getString(3));
		u.setPassword(rs.getString(4));
		u.setConfirmPassword(rs.getString(5));
		return u;
	}



}
