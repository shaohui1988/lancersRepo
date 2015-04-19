package com.shaohui.service;

import java.util.UUID;

import org.apache.commons.codec.digest.DigestUtils;

import com.shaohui.DAO.UserDAO;
import com.shaohui.modal.User;

/**
 * 
 * @author lancer
 *
 */
public class LoginService {
	
	/**
	 * 获取随机字符串
	 */
	public static String getRandomStr() {
		return UUID.randomUUID().toString();
	}
	
	/**
	 * 校验密码
	 */
	public static Boolean validPassword(String userName, String enteredPassword, String randomStr) {
		User user = UserDAO.getInstance().getUserPassword(userName);
		if (user == null) {
			return false;
		}
		String encodedPassword = user.getPassword();
		String finalPassword = DigestUtils.sha1Hex(encodedPassword + randomStr);
		return (finalPassword.equals(enteredPassword));
	}
}
