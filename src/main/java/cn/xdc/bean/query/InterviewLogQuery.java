package cn.xdc.bean.query;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 查询专用对象
 * @author sang
 *
 */
public class InterviewLogQuery extends BaseQuery{

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
	private boolean nickNameLike;
	public boolean isNickNameLike() {
		return nickNameLike;
	}
	public void setNickNameLike(boolean nickNameLike) {
		this.nickNameLike = nickNameLike;
	}
	private boolean avatarUrlLike;
	public boolean isAvatarUrlLike() {
		return avatarUrlLike;
	}
	public void setAvatarUrlLike(boolean avatarUrlLike) {
		this.avatarUrlLike = avatarUrlLike;
	}
	private boolean genderLike;
	public boolean isGenderLike() {
		return genderLike;
	}
	public void setGenderLike(boolean genderLike) {
		this.genderLike = genderLike;
	}
	private boolean openIdLike;
	public boolean isOpenIdLike() {
		return openIdLike;
	}
	public void setOpenIdLike(boolean openIdLike) {
		this.openIdLike = openIdLike;
	}
	private boolean iTimeLike;
	public boolean isITimeLike() {
		return iTimeLike;
	}
	public void setITimeLike(boolean iTimeLike) {
		this.iTimeLike = iTimeLike;
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
