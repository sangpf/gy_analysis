package cn.xdc.bean;

import java.io.Serializable;

public class Option implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer optionId; // 自增流水id
	private Integer qId; // 问题 id
	private Integer viewOrder;  // 显示顺序
	private String desc;  //选项描述
	private String picUrl; //图片地址
	private String comment;

	public Integer getOptionId() {
		return optionId;
	}
	public void setOptionId(Integer optionId) {
		this.optionId = optionId;
	}

	public Integer getQId() {
		return qId;
	}
	public void setQId(Integer qId) {
		this.qId = qId;
	}

	public Integer getViewOrder() {
		return viewOrder;
	}
	public void setViewOrder(Integer viewOrder) {
		this.viewOrder = viewOrder;
	}

	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

}