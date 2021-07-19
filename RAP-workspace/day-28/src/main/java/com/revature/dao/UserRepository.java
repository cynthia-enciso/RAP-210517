package com.revature.dao;

import com.revature.models.User;

public interface UserRepository {

	public User getUser(String username);
}
