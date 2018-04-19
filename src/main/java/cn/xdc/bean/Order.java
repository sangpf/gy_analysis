package cn.xdc.bean;

import cn.xdc.utils.DateUtil;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer orderId;
	private Integer invId;
	private Date sTime;
	private Integer userId;
	private Date answerBTime;
	private Date answerETime;
	private Integer orderStatus;
	private String comment;

	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getInvId() {
		return invId;
	}
	public void setInvId(Integer invId) {
		this.invId = invId;
	}

	public String getSTime() {
		return DateUtil.getStringByDateFormat(sTime);
	}
	public void setSTime(Date sTime) {
		this.sTime = sTime;
	}

	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Date getAnswerBTime() {
		return answerBTime;
	}
	public void setAnswerBTime(Date answerBTime) {
		this.answerBTime = answerBTime;
	}

	public Date getAnswerETime() {
		return answerETime;
	}
	public void setAnswerETime(Date answerETime) {
		this.answerETime = answerETime;
	}

	public Integer getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

}