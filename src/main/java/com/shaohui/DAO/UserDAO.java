package com.shaohui.DAO;

import org.apache.commons.codec.digest.DigestUtils;

import com.shaohui.modal.User;

public class UserDAO {
	
	private static UserDAO userDAO;
	
	private UserDAO() {
		
	}
	
	public static final UserDAO getInstance() {
		if (userDAO == null) {
			userDAO = new UserDAO();
		}
		return userDAO;
	}
	
	public User getUserPassword(String userName) {
		if (!userName.equals("shaohui")) {
			return null;
		}
		User user = new User();
		user.setName("shaohui");
		String plainPassword = "123456";
		String encodedPassword = DigestUtils.sha1Hex(plainPassword);
		user.setPassword(encodedPassword);
		return user;
	}
}
