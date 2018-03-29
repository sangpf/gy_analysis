package cn.xdc.bean;

import java.io.Serializable;

public class Answer implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer userId;  // 用户 id
	private Integer qId; // 题号
	private Integer oderId;  // 订单 id
	private Integer matrixId;   // 矩阵行id
	private Integer invId;  // 调查 id
	private Integer qType;  //问题类型，1:单选，2:多选 3:填空 4:矩阵单选 5:录音 6:拍摄视频
	private String choices;  //单选多选答案
	private String resUrl;  //静态资源路径
	private String ansDescription;   //填空题答案描述
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