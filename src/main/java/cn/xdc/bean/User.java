package cn.xdc.bean;

import java.io.Serializable;

public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer userId;
	private String wxOpenId;
	private String wxName;
	private String account;
	private String passWord;
	private Integer role;
	private String name;
	private String img;
	private Integer age;
	private Integer gender;
	private String identityId;
	private String bankCard;
	private Integer station;
	private String telephone;
	private Integer isValid;
	private String comment;

	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getWxOpenId() {
		return wxOpenId;
	}
	public void setWxOpenId(String wxOpenId) {
		this.wxOpenId = wxOpenId;
	}

	public String getWxName() {
		return wxName;
	}
	public void setWxName(String wxName) {
		this.wxName = wxName;
	}

	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public Integer getRole() {
		return role;
	}
	public void setRole(Integer role) {
		this.role = role;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}

	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getIdentityId() {
		return identityId;
	}
	public void setIdentityId(String identityId) {
		this.identityId = identityId;
	}

	public String getBankCard() {
		return bankCard;
	}
	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
	}

	public Integer getStation() {
		return station;
	}
	public void setStation(Integer station) {
		this.station = station;
	}

	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Integer getIsValid() {
		return isValid;
	}
	public void setIsValid(Integer isValid) {
		this.isValid = isValid;
	}

	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

}