package cn.xdc.bean.vo;

import cn.xdc.bean.Investigation;

public class InvestigationVo extends Investigation {

    private Integer collectionNum;  //    采集份数
    private String collectionSchedule;   //    采集完成度
    private Long distanceDays;  //    剩余时间（天）
    private String groupLeaderName;  // 组长姓名
    private String inv_userName;  // 指派给调查员姓名
    private Integer inv_userGender; // 调查员性别

    public Integer getCollectionNum() {
        return collectionNum;
    }
    public void setCollectionNum(Integer collectionNum) {
        this.collectionNum = collectionNum;
    }
    public String getCollectionSchedule() {
        return collectionSchedule;
    }
    public void setCollectionSchedule(String collectionSchedule) {
        this.collectionSchedule = collectionSchedule;
    }
    public String getGroupLeaderName() {
        return groupLeaderName;
    }
    public void setGroupLeaderName(String groupLeaderName) {
        this.groupLeaderName = groupLeaderName;
    }
    public Long getDistanceDays() {
        return distanceDays;
    }
    public void setDistanceDays(Long distanceDays) {
        this.distanceDays = distanceDays;
    }
    public String getInv_userName() {
        return inv_userName;
    }
    public void setInv_userName(String inv_userName) {
        this.inv_userName = inv_userName;
    }
    public Integer getInv_userGender() {
        return inv_userGender;
    }
    public void setInv_userGender(Integer inv_userGender) {
        this.inv_userGender = inv_userGender;
    }
}
