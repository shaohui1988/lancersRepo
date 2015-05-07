package com.shaohui.modal;

import java.util.Date;

import com.shaohui.commonenum.ChineseZodiacEnum;
import com.shaohui.commonenum.ConstellationEnum;
import com.shaohui.commonenum.GenderEnum;

/**
 * 用户
 * @author lancer
 *
 */
public class UserVO {
	
	/**
	 * 用户名
	 */
	private String name;
	
	/**
	 * 密码
	 */
	private String password;
	
	/**
	 * 邮箱
	 */
	private String email;
	
	/**
	 * 手机号
	 */
	private String mobile;
	
	/**
	 * 生日
	 */
	private Date birthDate;
	
	/**
	 * 性别
	 */
	private GenderEnum gender;
	
	/**
	 * 住址
	 */
	private String address;
	
	/**
	 * 籍贯
	 */
	private String nativePlace;
	
	/**
	 * 国家
	 */
	private String country;
	
	/**
	 * 省，州，自治区
	 */
	private String province;
	
	/**
	 * 市
	 */
	private String city;
	
	/**
	 * 县
	 */
	private String prefecture;
	
	/**
	 * 乡镇
	 */
	private String town;

	/**
	 * 街道
	 */
	private String street;
	
	/**
	 * 生肖
	 */
	private ChineseZodiacEnum chineseZodiac;
	
	/**
	 * 星座
	 */
	private ConstellationEnum constellation;
	
	/**
	 * 血型
	 */
	private String bloodType;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
