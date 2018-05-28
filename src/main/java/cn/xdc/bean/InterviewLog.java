package cn.xdc.bean;

import java.io.Serializable;
import java.util.Date;

public class InterviewLog implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nickName;
	private String avatarUrl;
	private Integer gender;
	private String openId;
	private Date iTime;
	private String comment;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getAvatarUrl() {
		return avatarUrl;
	}
	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Date getITime() {
		return iTime;
	}
	public void setITime(Date iTime) {
		this.iTime = iTime;
	}

	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

}