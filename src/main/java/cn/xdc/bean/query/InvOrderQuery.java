package cn.xdc.bean.query;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 查询专用对象
 * @author sang
 *
 */
public class InvOrderQuery {

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

	public Date getSTime() {
		return sTime;
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


	/***********查询字段指定*************************************/
	private String fields;
	public String getFields() {
		return fields;
	}
	public void setFields(String fields) {
		this.fields = fields;
	}

	/***********查询字段Like*************************************/
	private boolean orderIdLike;
	public boolean isOrderIdLike() {
		return orderIdLike;
	}
	public void setOrderIdLike(boolean orderIdLike) {
		this.orderIdLike = orderIdLike;
	}
	private boolean invIdLike;
	public boolean isInvIdLike() {
		return invIdLike;
	}
	public void setInvIdLike(boolean invIdLike) {
		this.invIdLike = invIdLike;
	}
	private boolean sTimeLike;
	public boolean isSTimeLike() {
		return sTimeLike;
	}
	public void setSTimeLike(boolean sTimeLike) {
		this.sTimeLike = sTimeLike;
	}
	private boolean userIdLike;
	public boolean isUserIdLike() {
		return userIdLike;
	}
	public void setUserIdLike(boolean userIdLike) {
		this.userIdLike = userIdLike;
	}
	private boolean answerBTimeLike;
	public boolean isAnswerBTimeLike() {
		return answerBTimeLike;
	}
	public void setAnswerBTimeLike(boolean answerBTimeLike) {
		this.answerBTimeLike = answerBTimeLike;
	}
	private boolean answerETimeLike;
	public boolean isAnswerETimeLike() {
		return answerETimeLike;
	}
	public void setAnswerETimeLike(boolean answerETimeLike) {
		this.answerETimeLike = answerETimeLike;
	}
	private boolean orderStatusLike;
	public boolean isOrderStatusLike() {
		return orderStatusLike;
	}
	public void setOrderStatusLike(boolean orderStatusLike) {
		this.orderStatusLike = orderStatusLike;
	}
	private boolean commentLike;
	public boolean isCommentLike() {
		return commentLike;
	}
	public void setCommentLike(boolean commentLike) {
		this.commentLike = commentLike;
	}
	
	/***********order by *************************************/
	public class FieldOrder{
		private String field;  //id , name  imgUrl
		private String order;  // desc asc
		
		public FieldOrder(String field, String order) {
			super();
			this.field = field;
			this.order = order;
		}
		public String getField() {
			return field;
		}
		public void setField(String field) {
			this.field = field;
		}
		public String getOrder() {
			return order;
		}
		public void setOrder(String order) {
			this.order = order;
		}
		
	}
	//orderby 集合
	private List<FieldOrder> fieldOrders = new ArrayList<FieldOrder>();
	
	//按照Id排序
	public void orderbyId(boolean isAsc){
		fieldOrders.add(new FieldOrder("id",isAsc == true ? "asc" : "desc"));
	}

}
