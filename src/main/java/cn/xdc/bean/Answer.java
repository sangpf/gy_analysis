package cn.xdc.bean;

import java.io.Serializable;

public class Answer implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer userId;
	private Integer qId;
	private Integer oderId;
	private Integer matrixId;
	private Integer invId;
	private Integer qType;
	private String choices;
	private String resUrl;
	private String ansDescription;
	private String comment;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getQId() {
		return qId;
	}
	public void setQId(Integer qId) {
		this.qId = qId;
	}

	public Integer getOderId() {
		return oderId;
	}
	public void setOderId(Integer oderId) {
		this.oderId = oderId;
	}

	public Integer getMatrixId() {
		return matrixId;
	}
	public void setMatrixId(Integer matrixId) {
		this.matrixId = matrixId;
	}

	public Integer getInvId() {
		return invId;
	}
	public void setInvId(Integer invId) {
		this.invId = invId;
	}

	public Integer getQType() {
		return qType;
	}
	public void setQType(Integer qType) {
		this.qType = qType;
	}

	public String getChoices() {
		return choices;
	}
	public void setChoices(String choices) {
		this.choices = choices;
	}

	public String getResUrl() {
		return resUrl;
	}
	public void setResUrl(String resUrl) {
		this.resUrl = resUrl;
	}

	public String getAnsDescription() {
		return ansDescription;
	}
	public void setAnsDescription(String ansDescription) {
		this.ansDescription = ansDescription;
	}

	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

}