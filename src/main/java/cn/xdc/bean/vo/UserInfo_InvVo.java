package cn.xdc.bean.vo;

public class UserInfo_InvVo {
    private Integer userId;
    private String userName;
    private Integer collectionNum;  // 收集分数
    private String proportion;   // 占比
    private Integer isGroupLeader = 0;  // 是否是组长
    private String phoneNum;

    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getCollectionNum() {
        return collectionNum;
    }

    public void setCollectionNum(Integer collectionNum) {
        this.collectionNum = collectionNum;
    }

    public String getProportion() {
        return proportion;
    }

    public void setProportion(String proportion) {
        this.proportion = proportion;
    }

    public Integer getIsGroupLeader() {
        return isGroupLeader;
    }

    public void setIsGroupLeader(Integer isGroupLeader) {
        this.isGroupLeader = isGroupLeader;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
