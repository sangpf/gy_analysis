package cn.xdc.bean.vo;

import cn.xdc.bean.Order;

public class OrderVo extends Order {
//    答案id  问卷名称 调查员 提交时间 调查id

    private String invName;   // 调查名称
    private String userName;  // 调查员姓名

    public String getInvName() {
        return invName;
    }

    public void setInvName(String invName) {
        this.invName = invName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

