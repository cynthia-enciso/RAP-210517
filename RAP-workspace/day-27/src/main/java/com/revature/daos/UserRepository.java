package com.revature.daos;

import com.revature.models.User;

public interface UserRepository {
	public User getUser(String username);
}
