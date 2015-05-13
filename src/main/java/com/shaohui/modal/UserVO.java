package com.shaohui.modal;

import java.util.Date;
import java.util.List;

import com.shaohui.commonenum.ChineseZodiacEnum;
import com.shaohui.commonenum.ConstellationEnum;
import com.shaohui.commonenum.GenderEnum;

/**
 * 用户
 * 
 * @author lancer
 *
 */
public class UserVO {

    /**
     * 用户id
     */
    private Long id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 昵称
     */
    private String nickname;

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
     * 年龄
     */
    private Integer age;

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

    /**
     * 头像
     */
    private String avatar;

    /**
     * 签名
     */
    private String signature;

    /**
     * 兴趣爱好
     */
    private List<String> hobbies;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPrefecture() {
        return prefecture;
    }

    public void setPrefecture(String prefecture) {
        this.prefecture = prefecture;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public ChineseZodiacEnum getChineseZodiac() {
        return chineseZodiac;
    }

    public void setChineseZodiac(ChineseZodiacEnum chineseZodiac) {
        this.chineseZodiac = chineseZodiac;
    }

    public ConstellationEnum getConstellation() {
        return constellation;
    }

    public void setConstellation(ConstellationEnum constellation) {
        this.constellation = constellation;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

}
