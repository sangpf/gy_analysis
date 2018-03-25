package cn.xdc.bean.query;

import java.util.ArrayList;
import java.util.List;

/**
 * 查询专用对象
 * @author sang
 *
 */
public class AnswerQuery {

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


	/***********查询字段指定*************************************/
	private String fields;
	public String getFields() {
		return fields;
	}
	public void setFields(String fields) {
		this.fields = fields;
	}

	/***********查询字段Like*************************************/
	private boolean idLike;
	public boolean isIdLike() {
		return idLike;
	}
	public void setIdLike(boolean idLike) {
		this.idLike = idLike;
	}
	private boolean userIdLike;
	public boolean isUserIdLike() {
		return userIdLike;
	}
	public void setUserIdLike(boolean userIdLike) {
		this.userIdLike = userIdLike;
	}
	private boolean qIdLike;
	public boolean isQIdLike() {
		return qIdLike;
	}
	public void setQIdLike(boolean qIdLike) {
		this.qIdLike = qIdLike;
	}
	private boolean oderIdLike;
	public boolean isOderIdLike() {
		return oderIdLike;
	}
	public void setOderIdLike(boolean oderIdLike) {
		this.oderIdLike = oderIdLike;
	}
	private boolean matrixIdLike;
	public boolean isMatrixIdLike() {
		return matrixIdLike;
	}
	public void setMatrixIdLike(boolean matrixIdLike) {
		this.matrixIdLike = matrixIdLike;
	}
	private boolean invIdLike;
	public boolean isInvIdLike() {
		return invIdLike;
	}
	public void setInvIdLike(boolean invIdLike) {
		this.invIdLike = invIdLike;
	}
	private boolean qTypeLike;
	public boolean isQTypeLike() {
		return qTypeLike;
	}
	public void setQTypeLike(boolean qTypeLike) {
		this.qTypeLike = qTypeLike;
	}
	private boolean choicesLike;
	public boolean isChoicesLike() {
		return choicesLike;
	}
	public void setChoicesLike(boolean choicesLike) {
		this.choicesLike = choicesLike;
	}
	private boolean resUrlLike;
	public boolean isResUrlLike() {
		return resUrlLike;
	}
	public void setResUrlLike(boolean resUrlLike) {
		this.resUrlLike = resUrlLike;
	}
	private boolean ansDescriptionLike;
	public boolean isAnsDescriptionLike() {
		return ansDescriptionLike;
	}
	public void setAnsDescriptionLike(boolean ansDescriptionLike) {
		this.ansDescriptionLike = ansDescriptionLike;
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
