package com.shaohui.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.alibaba.fastjson.JSONObject;
import com.opensymphony.xwork2.ActionSupport;
import com.shaohui.service.LoginService;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private String userName;
	
	private String password;

	private JSONObject result;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public JSONObject getResult() {
		return result;
	}

	public void setResult(JSONObject result) {
		this.result = result;
	}

	/**
	 * 获取随机字串
	 * @return
	 */
	public String random() {
		String randomStr = LoginService.getRandomStr();
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		session.setAttribute("randomStr", randomStr);
		result = new JSONObject();
		result.put("randomStr", randomStr);
		return SUCCESS;
	};
	
	/**
	 * 登录
	 * @return
	 */
	public String login() {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		Boolean isPassed = LoginService.validPassword(this.getUserName(), this.getPassword(), session.getAttribute("randomStr").toString());
		result = new JSONObject();
		if (isPassed) {
			result.put("result", 1);
			session.setAttribute("online", true);
		} else {
			result.put("result", 0);
		}
		return SUCCESS;
	}
}
