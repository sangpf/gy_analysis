package cn.xdc.bean.vo;

import cn.xdc.bean.Investigation;

public class InvestigationVo extends Investigation {

    private Integer collectionNum;  //    采集份数
    private String collectionSchedule;   //    采集完成度
    private Long distanceDays;  //    剩余时间（天）
    private String groupLeaderName;  // 组长姓名

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
}
