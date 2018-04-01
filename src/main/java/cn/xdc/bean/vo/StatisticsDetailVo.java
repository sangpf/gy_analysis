package cn.xdc.bean.vo;

import cn.xdc.bean.Answer;

public class StatisticsDetailVo {

    private Integer collectionNum;  //    采集份数
    private String collectionSchedule;   //    采集完成度
    private Long distanceDays;  //    剩余时间（天）
    private String groupLeaderName;  // 组长姓名
    private String inv_userName;  // 指派给调查员姓名
    private Integer inv_userGender; // 调查员性别

    // 问题 id
    private Integer
            qId1,qId2,qId3,qId4,qId5,qId6,qId7,qId8,qId9,qId10,
            qId11,qId12,qId13,qId14,qId15,qId16,qId17,qId18,qId19,qId20,
            qId21,qId22,qId23,qId24,qId25,qId26,qId27,qId28,qId29,qId30,
            qId31,qId32,qId33,qId34,qId35,qId36,qId37,qId38,qId39,qId40,
            qId41,qId42,qId43,qId44,qId45,qId46,qId47,qId48,qId49,qId50,
            qId51,qId52,qId53,qId54,qId55,qId56,qId57,qId58,qId59,qId60;

    // 问题类型
    private String
            qTypeName1,qTypeName2,qTypeName3,qTypeName4,qTypeName5,qTypeName6,qTypeName7,qTypeName8,qTypeName9,qTypeName10,
            qTypeName11,qTypeName12,qTypeName13,qTypeName14,qTypeName15,qTypeName16,qTypeName17,qTypeName18,qTypeName19,qTypeName20,
            qTypeName21,qTypeName22,qTypeName23,qTypeName24,qTypeName25,qTypeName26,qTypeName27,qTypeName28,qTypeName29,qTypeName30,
            qTypeName31,qTypeName32,qTypeName33,qTypeName34,qTypeName35,qTypeName36,qTypeName37,qTypeName38,qTypeName39,qTypeName40,
            qTypeName41,qTypeName42,qTypeName43,qTypeName44,qTypeName45,qTypeName46,qTypeName47,qTypeName48,qTypeName49,qTypeName50,
            qTypeName51,qTypeName52,qTypeName53,qTypeName54,qTypeName55,qTypeName56,qTypeName57,qTypeName58,qTypeName59,qTypeName60;

    // 问题标题
    private String
            qTitle1,qTitle2,qTitle3,qTitle4,qTitle5,qTitle6,qTitle7,qTitle8,qTitle9,qTitle10,
            qTitle11,qTitle12,qTitle13,qTitle14,qTitle15,qTitle16,qTitle17,qTitle18,qTitle19,qTitle20,
            qTitle21,qTitle22,qTitle23,qTitle24,qTitle25,qTitle26,qTitle27,qTitle28,qTitle29,qTitle30,
            qTitle31,qTitle32,qTitle33,qTitle34,qTitle35,qTitle36,qTitle37,qTitle38,qTitle39,qTitle40,
            qTitle41,qTitle42,qTitle43,qTitle44,qTitle45,qTitle46,qTitle47,qTitle48,qTitle49,qTitle50,
            qTitle51,qTitle52,qTitle53,qTitle54,qTitle55,qTitle56,qTitle57,qTitle58,qTitle59,qTitle60;

    // 选择题 选项
    private String
            choices1,choices2,choices3,choices4,choices5,choices6,choices7,choices8,choices9,choices10,
            choices11,choices12,choices13,choices14,choices15,choices16,choices17,choices18,choices19,choices20,
            choices21,choices22,choices23,choices24,choices25,choices26,choices27,choices28,choices29,choices30,
            choices31,choices32,choices33,choices34,choices35,choices36,choices37,choices38,choices39,choices40,
            choices41,choices42,choices43,choices44,choices45,choices46,choices47,choices48,choices49,choices50,
            choices51,choices52,choices53,choices54,choices55,choices56,choices57,choices58,choices59,choices60;

    // 路径
    private String
            resUrl1,resUrl2,resUrl3,resUrl4,resUrl5,resUrl6,resUrl7,resUrl8,resUrl9,resUrl10,
            resUrl11,resUrl12,resUrl13,resUrl14,resUrl15,resUrl16,resUrl17,resUrl18,resUrl19,resUrl20,
            resUrl21,resUrl22,resUrl23,resUrl24,resUrl25,resUrl26,resUrl27,resUrl28,resUrl29,resUrl30,
            resUrl31,resUrl32,resUrl33,resUrl34,resUrl35,resUrl36,resUrl37,resUrl38,resUrl39,resUrl40,
            resUrl41,resUrl42,resUrl43,resUrl44,resUrl45,resUrl46,resUrl47,resUrl48,resUrl49,resUrl50,
            resUrl51,resUrl52,resUrl53,resUrl54,resUrl55,resUrl56,resUrl57,resUrl58,resUrl59,resUrl60;

    // 填空题答案
    private String
            ansDescription1,ansDescription2,ansDescription3,ansDescription4,ansDescription5,ansDescription6,ansDescription7,ansDescription8,ansDescription9,ansDescription10,
            ansDescription11,ansDescription12,ansDescription13,ansDescription14,ansDescription15,ansDescription16,ansDescription17,ansDescription18,ansDescription19,ansDescription20,
            ansDescription21,ansDescription22,ansDescription23,ansDescription24,ansDescription25,ansDescription26,ansDescription27,ansDescription28,ansDescription29,ansDescription30,
            ansDescription31,ansDescription32,ansDescription33,ansDescription34,ansDescription35,ansDescription36,ansDescription37,ansDescription38,ansDescription39,ansDescription40,
            ansDescription41,ansDescription42,ansDescription43,ansDescription44,ansDescription45,ansDescription46,ansDescription47,ansDescription48,ansDescription49,ansDescription50,
            ansDescription51,ansDescription52,ansDescription53,ansDescription54,ansDescription55,ansDescription56,ansDescription57,ansDescription58,ansDescription59,ansDescription60;

    public String getqTypeName1() {
        return qTypeName1;
    }

    public void setqTypeName1(String qTypeName1) {
        this.qTypeName1 = qTypeName1;
    }

    public String getqTypeName2() {
        return qTypeName2;
    }

    public void setqTypeName2(String qTypeName2) {
        this.qTypeName2 = qTypeName2;
    }

    public String getqTypeName3() {
        return qTypeName3;
    }

    public void setqTypeName3(String qTypeName3) {
        this.qTypeName3 = qTypeName3;
    }

    public String getqTypeName4() {
        return qTypeName4;
    }

    public void setqTypeName4(String qTypeName4) {
        this.qTypeName4 = qTypeName4;
    }

    public String getqTypeName5() {
        return qTypeName5;
    }

    public void setqTypeName5(String qTypeName5) {
        this.qTypeName5 = qTypeName5;
    }

    public String getqTypeName6() {
        return qTypeName6;
    }

    public void setqTypeName6(String qTypeName6) {
        this.qTypeName6 = qTypeName6;
    }

    public String getqTypeName7() {
        return qTypeName7;
    }

    public void setqTypeName7(String qTypeName7) {
        this.qTypeName7 = qTypeName7;
    }

    public String getqTypeName8() {
        return qTypeName8;
    }

    public void setqTypeName8(String qTypeName8) {
        this.qTypeName8 = qTypeName8;
    }

    public String getqTypeName9() {
        return qTypeName9;
    }

    public void setqTypeName9(String qTypeName9) {
        this.qTypeName9 = qTypeName9;
    }

    public String getqTypeName10() {
        return qTypeName10;
    }

    public void setqTypeName10(String qTypeName10) {
        this.qTypeName10 = qTypeName10;
    }

    public String getqTypeName11() {
        return qTypeName11;
    }

    public void setqTypeName11(String qTypeName11) {
        this.qTypeName11 = qTypeName11;
    }

    public String getqTypeName12() {
        return qTypeName12;
    }

    public void setqTypeName12(String qTypeName12) {
        this.qTypeName12 = qTypeName12;
    }

    public String getqTypeName13() {
        return qTypeName13;
    }

    public void setqTypeName13(String qTypeName13) {
        this.qTypeName13 = qTypeName13;
    }

    public String getqTypeName14() {
        return qTypeName14;
    }

    public void setqTypeName14(String qTypeName14) {
        this.qTypeName14 = qTypeName14;
    }

    public String getqTypeName15() {
        return qTypeName15;
    }

    public void setqTypeName15(String qTypeName15) {
        this.qTypeName15 = qTypeName15;
    }

    public String getqTypeName16() {
        return qTypeName16;
    }

    public void setqTypeName16(String qTypeName16) {
        this.qTypeName16 = qTypeName16;
    }

    public String getqTypeName17() {
        return qTypeName17;
    }

    public void setqTypeName17(String qTypeName17) {
        this.qTypeName17 = qTypeName17;
    }

    public String getqTypeName18() {
        return qTypeName18;
    }

    public void setqTypeName18(String qTypeName18) {
        this.qTypeName18 = qTypeName18;
    }

    public String getqTypeName19() {
        return qTypeName19;
    }

    public void setqTypeName19(String qTypeName19) {
        this.qTypeName19 = qTypeName19;
    }

    public String getqTypeName20() {
        return qTypeName20;
    }

    public void setqTypeName20(String qTypeName20) {
        this.qTypeName20 = qTypeName20;
    }

    public String getqTypeName21() {
        return qTypeName21;
    }

    public void setqTypeName21(String qTypeName21) {
        this.qTypeName21 = qTypeName21;
    }

    public String getqTypeName22() {
        return qTypeName22;
    }

    public void setqTypeName22(String qTypeName22) {
        this.qTypeName22 = qTypeName22;
    }

    public String getqTypeName23() {
        return qTypeName23;
    }

    public void setqTypeName23(String qTypeName23) {
        this.qTypeName23 = qTypeName23;
    }

    public String getqTypeName24() {
        return qTypeName24;
    }

    public void setqTypeName24(String qTypeName24) {
        this.qTypeName24 = qTypeName24;
    }

    public String getqTypeName25() {
        return qTypeName25;
    }

    public void setqTypeName25(String qTypeName25) {
        this.qTypeName25 = qTypeName25;
    }

    public String getqTypeName26() {
        return qTypeName26;
    }

    public void setqTypeName26(String qTypeName26) {
        this.qTypeName26 = qTypeName26;
    }

    public String getqTypeName27() {
        return qTypeName27;
    }

    public void setqTypeName27(String qTypeName27) {
        this.qTypeName27 = qTypeName27;
    }

    public String getqTypeName28() {
        return qTypeName28;
    }

    public void setqTypeName28(String qTypeName28) {
        this.qTypeName28 = qTypeName28;
    }

    public String getqTypeName29() {
        return qTypeName29;
    }

    public void setqTypeName29(String qTypeName29) {
        this.qTypeName29 = qTypeName29;
    }

    public String getqTypeName30() {
        return qTypeName30;
    }

    public void setqTypeName30(String qTypeName30) {
        this.qTypeName30 = qTypeName30;
    }

    public String getqTypeName31() {
        return qTypeName31;
    }

    public void setqTypeName31(String qTypeName31) {
        this.qTypeName31 = qTypeName31;
    }

    public String getqTypeName32() {
        return qTypeName32;
    }

    public void setqTypeName32(String qTypeName32) {
        this.qTypeName32 = qTypeName32;
    }

    public String getqTypeName33() {
        return qTypeName33;
    }

    public void setqTypeName33(String qTypeName33) {
        this.qTypeName33 = qTypeName33;
    }

    public String getqTypeName34() {
        return qTypeName34;
    }

    public void setqTypeName34(String qTypeName34) {
        this.qTypeName34 = qTypeName34;
    }

    public String getqTypeName35() {
        return qTypeName35;
    }

    public void setqTypeName35(String qTypeName35) {
        this.qTypeName35 = qTypeName35;
    }

    public String getqTypeName36() {
        return qTypeName36;
    }

    public void setqTypeName36(String qTypeName36) {
        this.qTypeName36 = qTypeName36;
    }

    public String getqTypeName37() {
        return qTypeName37;
    }

    public void setqTypeName37(String qTypeName37) {
        this.qTypeName37 = qTypeName37;
    }

    public String getqTypeName38() {
        return qTypeName38;
    }

    public void setqTypeName38(String qTypeName38) {
        this.qTypeName38 = qTypeName38;
    }

    public String getqTypeName39() {
        return qTypeName39;
    }

    public void setqTypeName39(String qTypeName39) {
        this.qTypeName39 = qTypeName39;
    }

    public String getqTypeName40() {
        return qTypeName40;
    }

    public void setqTypeName40(String qTypeName40) {
        this.qTypeName40 = qTypeName40;
    }

    public String getqTypeName41() {
        return qTypeName41;
    }

    public void setqTypeName41(String qTypeName41) {
        this.qTypeName41 = qTypeName41;
    }

    public String getqTypeName42() {
        return qTypeName42;
    }

    public void setqTypeName42(String qTypeName42) {
        this.qTypeName42 = qTypeName42;
    }

    public String getqTypeName43() {
        return qTypeName43;
    }

    public void setqTypeName43(String qTypeName43) {
        this.qTypeName43 = qTypeName43;
    }

    public String getqTypeName44() {
        return qTypeName44;
    }

    public void setqTypeName44(String qTypeName44) {
        this.qTypeName44 = qTypeName44;
    }

    public String getqTypeName45() {
        return qTypeName45;
    }

    public void setqTypeName45(String qTypeName45) {
        this.qTypeName45 = qTypeName45;
    }

    public String getqTypeName46() {
        return qTypeName46;
    }

    public void setqTypeName46(String qTypeName46) {
        this.qTypeName46 = qTypeName46;
    }

    public String getqTypeName47() {
        return qTypeName47;
    }

    public void setqTypeName47(String qTypeName47) {
        this.qTypeName47 = qTypeName47;
    }

    public String getqTypeName48() {
        return qTypeName48;
    }

    public void setqTypeName48(String qTypeName48) {
        this.qTypeName48 = qTypeName48;
    }

    public String getqTypeName49() {
        return qTypeName49;
    }

    public void setqTypeName49(String qTypeName49) {
        this.qTypeName49 = qTypeName49;
    }

    public String getqTypeName50() {
        return qTypeName50;
    }

    public void setqTypeName50(String qTypeName50) {
        this.qTypeName50 = qTypeName50;
    }

    public String getqTypeName51() {
        return qTypeName51;
    }

    public void setqTypeName51(String qTypeName51) {
        this.qTypeName51 = qTypeName51;
    }

    public String getqTypeName52() {
        return qTypeName52;
    }

    public void setqTypeName52(String qTypeName52) {
        this.qTypeName52 = qTypeName52;
    }

    public String getqTypeName53() {
        return qTypeName53;
    }

    public void setqTypeName53(String qTypeName53) {
        this.qTypeName53 = qTypeName53;
    }

    public String getqTypeName54() {
        return qTypeName54;
    }

    public void setqTypeName54(String qTypeName54) {
        this.qTypeName54 = qTypeName54;
    }

    public String getqTypeName55() {
        return qTypeName55;
    }

    public void setqTypeName55(String qTypeName55) {
        this.qTypeName55 = qTypeName55;
    }

    public String getqTypeName56() {
        return qTypeName56;
    }

    public void setqTypeName56(String qTypeName56) {
        this.qTypeName56 = qTypeName56;
    }

    public String getqTypeName57() {
        return qTypeName57;
    }

    public void setqTypeName57(String qTypeName57) {
        this.qTypeName57 = qTypeName57;
    }

    public String getqTypeName58() {
        return qTypeName58;
    }

    public void setqTypeName58(String qTypeName58) {
        this.qTypeName58 = qTypeName58;
    }

    public String getqTypeName59() {
        return qTypeName59;
    }

    public void setqTypeName59(String qTypeName59) {
        this.qTypeName59 = qTypeName59;
    }

    public String getqTypeName60() {
        return qTypeName60;
    }

    public void setqTypeName60(String qTypeName60) {
        this.qTypeName60 = qTypeName60;
    }

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

    public Long getDistanceDays() {
        return distanceDays;
    }

    public void setDistanceDays(Long distanceDays) {
        this.distanceDays = distanceDays;
    }

    public String getGroupLeaderName() {
        return groupLeaderName;
    }

    public void setGroupLeaderName(String groupLeaderName) {
        this.groupLeaderName = groupLeaderName;
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

    public Integer getqId1() {
        return qId1;
    }

    public void setqId1(Integer qId1) {
        this.qId1 = qId1;
    }

    public Integer getqId2() {
        return qId2;
    }

    public void setqId2(Integer qId2) {
        this.qId2 = qId2;
    }

    public Integer getqId3() {
        return qId3;
    }

    public void setqId3(Integer qId3) {
        this.qId3 = qId3;
    }

    public Integer getqId4() {
        return qId4;
    }

    public void setqId4(Integer qId4) {
        this.qId4 = qId4;
    }

    public Integer getqId5() {
        return qId5;
    }

    public void setqId5(Integer qId5) {
        this.qId5 = qId5;
    }

    public Integer getqId6() {
        return qId6;
    }

    public void setqId6(Integer qId6) {
        this.qId6 = qId6;
    }

    public Integer getqId7() {
        return qId7;
    }

    public void setqId7(Integer qId7) {
        this.qId7 = qId7;
    }

    public Integer getqId8() {
        return qId8;
    }

    public void setqId8(Integer qId8) {
        this.qId8 = qId8;
    }

    public Integer getqId9() {
        return qId9;
    }

    public void setqId9(Integer qId9) {
        this.qId9 = qId9;
    }

    public Integer getqId10() {
        return qId10;
    }

    public void setqId10(Integer qId10) {
        this.qId10 = qId10;
    }

    public Integer getqId11() {
        return qId11;
    }

    public void setqId11(Integer qId11) {
        this.qId11 = qId11;
    }

    public Integer getqId12() {
        return qId12;
    }

    public void setqId12(Integer qId12) {
        this.qId12 = qId12;
    }

    public Integer getqId13() {
        return qId13;
    }

    public void setqId13(Integer qId13) {
        this.qId13 = qId13;
    }

    public Integer getqId14() {
        return qId14;
    }

    public void setqId14(Integer qId14) {
        this.qId14 = qId14;
    }

    public Integer getqId15() {
        return qId15;
    }

    public void setqId15(Integer qId15) {
        this.qId15 = qId15;
    }

    public Integer getqId16() {
        return qId16;
    }

    public void setqId16(Integer qId16) {
        this.qId16 = qId16;
    }

    public Integer getqId17() {
        return qId17;
    }

    public void setqId17(Integer qId17) {
        this.qId17 = qId17;
    }

    public Integer getqId18() {
        return qId18;
    }

    public void setqId18(Integer qId18) {
        this.qId18 = qId18;
    }

    public Integer getqId19() {
        return qId19;
    }

    public void setqId19(Integer qId19) {
        this.qId19 = qId19;
    }

    public Integer getqId20() {
        return qId20;
    }

    public void setqId20(Integer qId20) {
        this.qId20 = qId20;
    }

    public Integer getqId21() {
        return qId21;
    }

    public void setqId21(Integer qId21) {
        this.qId21 = qId21;
    }

    public Integer getqId22() {
        return qId22;
    }

    public void setqId22(Integer qId22) {
        this.qId22 = qId22;
    }

    public Integer getqId23() {
        return qId23;
    }

    public void setqId23(Integer qId23) {
        this.qId23 = qId23;
    }

    public Integer getqId24() {
        return qId24;
    }

    public void setqId24(Integer qId24) {
        this.qId24 = qId24;
    }

    public Integer getqId25() {
        return qId25;
    }

    public void setqId25(Integer qId25) {
        this.qId25 = qId25;
    }

    public Integer getqId26() {
        return qId26;
    }

    public void setqId26(Integer qId26) {
        this.qId26 = qId26;
    }

    public Integer getqId27() {
        return qId27;
    }

    public void setqId27(Integer qId27) {
        this.qId27 = qId27;
    }

    public Integer getqId28() {
        return qId28;
    }

    public void setqId28(Integer qId28) {
        this.qId28 = qId28;
    }

    public Integer getqId29() {
        return qId29;
    }

    public void setqId29(Integer qId29) {
        this.qId29 = qId29;
    }

    public Integer getqId30() {
        return qId30;
    }

    public void setqId30(Integer qId30) {
        this.qId30 = qId30;
    }

    public Integer getqId31() {
        return qId31;
    }

    public void setqId31(Integer qId31) {
        this.qId31 = qId31;
    }

    public Integer getqId32() {
        return qId32;
    }

    public void setqId32(Integer qId32) {
        this.qId32 = qId32;
    }

    public Integer getqId33() {
        return qId33;
    }

    public void setqId33(Integer qId33) {
        this.qId33 = qId33;
    }

    public Integer getqId34() {
        return qId34;
    }

    public void setqId34(Integer qId34) {
        this.qId34 = qId34;
    }

    public Integer getqId35() {
        return qId35;
    }

    public void setqId35(Integer qId35) {
        this.qId35 = qId35;
    }

    public Integer getqId36() {
        return qId36;
    }

    public void setqId36(Integer qId36) {
        this.qId36 = qId36;
    }

    public Integer getqId37() {
        return qId37;
    }

    public void setqId37(Integer qId37) {
        this.qId37 = qId37;
    }

    public Integer getqId38() {
        return qId38;
    }

    public void setqId38(Integer qId38) {
        this.qId38 = qId38;
    }

    public Integer getqId39() {
        return qId39;
    }

    public void setqId39(Integer qId39) {
        this.qId39 = qId39;
    }

    public Integer getqId40() {
        return qId40;
    }

    public void setqId40(Integer qId40) {
        this.qId40 = qId40;
    }

    public Integer getqId41() {
        return qId41;
    }

    public void setqId41(Integer qId41) {
        this.qId41 = qId41;
    }

    public Integer getqId42() {
        return qId42;
    }

    public void setqId42(Integer qId42) {
        this.qId42 = qId42;
    }

    public Integer getqId43() {
        return qId43;
    }

    public void setqId43(Integer qId43) {
        this.qId43 = qId43;
    }

    public Integer getqId44() {
        return qId44;
    }

    public void setqId44(Integer qId44) {
        this.qId44 = qId44;
    }

    public Integer getqId45() {
        return qId45;
    }

    public void setqId45(Integer qId45) {
        this.qId45 = qId45;
    }

    public Integer getqId46() {
        return qId46;
    }

    public void setqId46(Integer qId46) {
        this.qId46 = qId46;
    }

    public Integer getqId47() {
        return qId47;
    }

    public void setqId47(Integer qId47) {
        this.qId47 = qId47;
    }

    public Integer getqId48() {
        return qId48;
    }

    public void setqId48(Integer qId48) {
        this.qId48 = qId48;
    }

    public Integer getqId49() {
        return qId49;
    }

    public void setqId49(Integer qId49) {
        this.qId49 = qId49;
    }

    public Integer getqId50() {
        return qId50;
    }

    public void setqId50(Integer qId50) {
        this.qId50 = qId50;
    }

    public Integer getqId51() {
        return qId51;
    }

    public void setqId51(Integer qId51) {
        this.qId51 = qId51;
    }

    public Integer getqId52() {
        return qId52;
    }

    public void setqId52(Integer qId52) {
        this.qId52 = qId52;
    }

    public Integer getqId53() {
        return qId53;
    }

    public void setqId53(Integer qId53) {
        this.qId53 = qId53;
    }

    public Integer getqId54() {
        return qId54;
    }

    public void setqId54(Integer qId54) {
        this.qId54 = qId54;
    }

    public Integer getqId55() {
        return qId55;
    }

    public void setqId55(Integer qId55) {
        this.qId55 = qId55;
    }

    public Integer getqId56() {
        return qId56;
    }

    public void setqId56(Integer qId56) {
        this.qId56 = qId56;
    }

    public Integer getqId57() {
        return qId57;
    }

    public void setqId57(Integer qId57) {
        this.qId57 = qId57;
    }

    public Integer getqId58() {
        return qId58;
    }

    public void setqId58(Integer qId58) {
        this.qId58 = qId58;
    }

    public Integer getqId59() {
        return qId59;
    }

    public void setqId59(Integer qId59) {
        this.qId59 = qId59;
    }

    public Integer getqId60() {
        return qId60;
    }

    public void setqId60(Integer qId60) {
        this.qId60 = qId60;
    }

    public String getqTitle1() {
        return qTitle1;
    }

    public void setqTitle1(String qTitle1) {
        this.qTitle1 = qTitle1;
    }

    public String getqTitle2() {
        return qTitle2;
    }

    public void setqTitle2(String qTitle2) {
        this.qTitle2 = qTitle2;
    }

    public String getqTitle3() {
        return qTitle3;
    }

    public void setqTitle3(String qTitle3) {
        this.qTitle3 = qTitle3;
    }

    public String getqTitle4() {
        return qTitle4;
    }

    public void setqTitle4(String qTitle4) {
        this.qTitle4 = qTitle4;
    }

    public String getqTitle5() {
        return qTitle5;
    }

    public void setqTitle5(String qTitle5) {
        this.qTitle5 = qTitle5;
    }

    public String getqTitle6() {
        return qTitle6;
    }

    public void setqTitle6(String qTitle6) {
        this.qTitle6 = qTitle6;
    }

    public String getqTitle7() {
        return qTitle7;
    }

    public void setqTitle7(String qTitle7) {
        this.qTitle7 = qTitle7;
    }

    public String getqTitle8() {
        return qTitle8;
    }

    public void setqTitle8(String qTitle8) {
        this.qTitle8 = qTitle8;
    }

    public String getqTitle9() {
        return qTitle9;
    }

    public void setqTitle9(String qTitle9) {
        this.qTitle9 = qTitle9;
    }

    public String getqTitle10() {
        return qTitle10;
    }

    public void setqTitle10(String qTitle10) {
        this.qTitle10 = qTitle10;
    }

    public String getqTitle11() {
        return qTitle11;
    }

    public void setqTitle11(String qTitle11) {
        this.qTitle11 = qTitle11;
    }

    public String getqTitle12() {
        return qTitle12;
    }

    public void setqTitle12(String qTitle12) {
        this.qTitle12 = qTitle12;
    }

    public String getqTitle13() {
        return qTitle13;
    }

    public void setqTitle13(String qTitle13) {
        this.qTitle13 = qTitle13;
    }

    public String getqTitle14() {
        return qTitle14;
    }

    public void setqTitle14(String qTitle14) {
        this.qTitle14 = qTitle14;
    }

    public String getqTitle15() {
        return qTitle15;
    }

    public void setqTitle15(String qTitle15) {
        this.qTitle15 = qTitle15;
    }

    public String getqTitle16() {
        return qTitle16;
    }

    public void setqTitle16(String qTitle16) {
        this.qTitle16 = qTitle16;
    }

    public String getqTitle17() {
        return qTitle17;
    }

    public void setqTitle17(String qTitle17) {
        this.qTitle17 = qTitle17;
    }

    public String getqTitle18() {
        return qTitle18;
    }

    public void setqTitle18(String qTitle18) {
        this.qTitle18 = qTitle18;
    }

    public String getqTitle19() {
        return qTitle19;
    }

    public void setqTitle19(String qTitle19) {
        this.qTitle19 = qTitle19;
    }

    public String getqTitle20() {
        return qTitle20;
    }

    public void setqTitle20(String qTitle20) {
        this.qTitle20 = qTitle20;
    }

    public String getqTitle21() {
        return qTitle21;
    }

    public void setqTitle21(String qTitle21) {
        this.qTitle21 = qTitle21;
    }

    public String getqTitle22() {
        return qTitle22;
    }

    public void setqTitle22(String qTitle22) {
        this.qTitle22 = qTitle22;
    }

    public String getqTitle23() {
        return qTitle23;
    }

    public void setqTitle23(String qTitle23) {
        this.qTitle23 = qTitle23;
    }

    public String getqTitle24() {
        return qTitle24;
    }

    public void setqTitle24(String qTitle24) {
        this.qTitle24 = qTitle24;
    }

    public String getqTitle25() {
        return qTitle25;
    }

    public void setqTitle25(String qTitle25) {
        this.qTitle25 = qTitle25;
    }

    public String getqTitle26() {
        return qTitle26;
    }

    public void setqTitle26(String qTitle26) {
        this.qTitle26 = qTitle26;
    }

    public String getqTitle27() {
        return qTitle27;
    }

    public void setqTitle27(String qTitle27) {
        this.qTitle27 = qTitle27;
    }

    public String getqTitle28() {
        return qTitle28;
    }

    public void setqTitle28(String qTitle28) {
        this.qTitle28 = qTitle28;
    }

    public String getqTitle29() {
        return qTitle29;
    }

    public void setqTitle29(String qTitle29) {
        this.qTitle29 = qTitle29;
    }

    public String getqTitle30() {
        return qTitle30;
    }

    public void setqTitle30(String qTitle30) {
        this.qTitle30 = qTitle30;
    }

    public String getqTitle31() {
        return qTitle31;
    }

    public void setqTitle31(String qTitle31) {
        this.qTitle31 = qTitle31;
    }

    public String getqTitle32() {
        return qTitle32;
    }

    public void setqTitle32(String qTitle32) {
        this.qTitle32 = qTitle32;
    }

    public String getqTitle33() {
        return qTitle33;
    }

    public void setqTitle33(String qTitle33) {
        this.qTitle33 = qTitle33;
    }

    public String getqTitle34() {
        return qTitle34;
    }

    public void setqTitle34(String qTitle34) {
        this.qTitle34 = qTitle34;
    }

    public String getqTitle35() {
        return qTitle35;
    }

    public void setqTitle35(String qTitle35) {
        this.qTitle35 = qTitle35;
    }

    public String getqTitle36() {
        return qTitle36;
    }

    public void setqTitle36(String qTitle36) {
        this.qTitle36 = qTitle36;
    }

    public String getqTitle37() {
        return qTitle37;
    }

    public void setqTitle37(String qTitle37) {
        this.qTitle37 = qTitle37;
    }

    public String getqTitle38() {
        return qTitle38;
    }

    public void setqTitle38(String qTitle38) {
        this.qTitle38 = qTitle38;
    }

    public String getqTitle39() {
        return qTitle39;
    }

    public void setqTitle39(String qTitle39) {
        this.qTitle39 = qTitle39;
    }

    public String getqTitle40() {
        return qTitle40;
    }

    public void setqTitle40(String qTitle40) {
        this.qTitle40 = qTitle40;
    }

    public String getqTitle41() {
        return qTitle41;
    }

    public void setqTitle41(String qTitle41) {
        this.qTitle41 = qTitle41;
    }

    public String getqTitle42() {
        return qTitle42;
    }

    public void setqTitle42(String qTitle42) {
        this.qTitle42 = qTitle42;
    }

    public String getqTitle43() {
        return qTitle43;
    }

    public void setqTitle43(String qTitle43) {
        this.qTitle43 = qTitle43;
    }

    public String getqTitle44() {
        return qTitle44;
    }

    public void setqTitle44(String qTitle44) {
        this.qTitle44 = qTitle44;
    }

    public String getqTitle45() {
        return qTitle45;
    }

    public void setqTitle45(String qTitle45) {
        this.qTitle45 = qTitle45;
    }

    public String getqTitle46() {
        return qTitle46;
    }

    public void setqTitle46(String qTitle46) {
        this.qTitle46 = qTitle46;
    }

    public String getqTitle47() {
        return qTitle47;
    }

    public void setqTitle47(String qTitle47) {
        this.qTitle47 = qTitle47;
    }

    public String getqTitle48() {
        return qTitle48;
    }

    public void setqTitle48(String qTitle48) {
        this.qTitle48 = qTitle48;
    }

    public String getqTitle49() {
        return qTitle49;
    }

    public void setqTitle49(String qTitle49) {
        this.qTitle49 = qTitle49;
    }

    public String getqTitle50() {
        return qTitle50;
    }

    public void setqTitle50(String qTitle50) {
        this.qTitle50 = qTitle50;
    }

    public String getqTitle51() {
        return qTitle51;
    }

    public void setqTitle51(String qTitle51) {
        this.qTitle51 = qTitle51;
    }

    public String getqTitle52() {
        return qTitle52;
    }

    public void setqTitle52(String qTitle52) {
        this.qTitle52 = qTitle52;
    }

    public String getqTitle53() {
        return qTitle53;
    }

    public void setqTitle53(String qTitle53) {
        this.qTitle53 = qTitle53;
    }

    public String getqTitle54() {
        return qTitle54;
    }

    public void setqTitle54(String qTitle54) {
        this.qTitle54 = qTitle54;
    }

    public String getqTitle55() {
        return qTitle55;
    }

    public void setqTitle55(String qTitle55) {
        this.qTitle55 = qTitle55;
    }

    public String getqTitle56() {
        return qTitle56;
    }

    public void setqTitle56(String qTitle56) {
        this.qTitle56 = qTitle56;
    }

    public String getqTitle57() {
        return qTitle57;
    }

    public void setqTitle57(String qTitle57) {
        this.qTitle57 = qTitle57;
    }

    public String getqTitle58() {
        return qTitle58;
    }

    public void setqTitle58(String qTitle58) {
        this.qTitle58 = qTitle58;
    }

    public String getqTitle59() {
        return qTitle59;
    }

    public void setqTitle59(String qTitle59) {
        this.qTitle59 = qTitle59;
    }

    public String getqTitle60() {
        return qTitle60;
    }

    public void setqTitle60(String qTitle60) {
        this.qTitle60 = qTitle60;
    }

    public String getChoices1() {
        return choices1;
    }

    public void setChoices1(String choices1) {
        this.choices1 = choices1;
    }

    public String getChoices2() {
        return choices2;
    }

    public void setChoices2(String choices2) {
        this.choices2 = choices2;
    }

    public String getChoices3() {
        return choices3;
    }

    public void setChoices3(String choices3) {
        this.choices3 = choices3;
    }

    public String getChoices4() {
        return choices4;
    }

    public void setChoices4(String choices4) {
        this.choices4 = choices4;
    }

    public String getChoices5() {
        return choices5;
    }

    public void setChoices5(String choices5) {
        this.choices5 = choices5;
    }

    public String getChoices6() {
        return choices6;
    }

    public void setChoices6(String choices6) {
        this.choices6 = choices6;
    }

    public String getChoices7() {
        return choices7;
    }

    public void setChoices7(String choices7) {
        this.choices7 = choices7;
    }

    public String getChoices8() {
        return choices8;
    }

    public void setChoices8(String choices8) {
        this.choices8 = choices8;
    }

    public String getChoices9() {
        return choices9;
    }

    public void setChoices9(String choices9) {
        this.choices9 = choices9;
    }

    public String getChoices10() {
        return choices10;
    }

    public void setChoices10(String choices10) {
        this.choices10 = choices10;
    }

    public String getChoices11() {
        return choices11;
    }

    public void setChoices11(String choices11) {
        this.choices11 = choices11;
    }

    public String getChoices12() {
        return choices12;
    }

    public void setChoices12(String choices12) {
        this.choices12 = choices12;
    }

    public String getChoices13() {
        return choices13;
    }

    public void setChoices13(String choices13) {
        this.choices13 = choices13;
    }

    public String getChoices14() {
        return choices14;
    }

    public void setChoices14(String choices14) {
        this.choices14 = choices14;
    }

    public String getChoices15() {
        return choices15;
    }

    public void setChoices15(String choices15) {
        this.choices15 = choices15;
    }

    public String getChoices16() {
        return choices16;
    }

    public void setChoices16(String choices16) {
        this.choices16 = choices16;
    }

    public String getChoices17() {
        return choices17;
    }

    public void setChoices17(String choices17) {
        this.choices17 = choices17;
    }

    public String getChoices18() {
        return choices18;
    }

    public void setChoices18(String choices18) {
        this.choices18 = choices18;
    }

    public String getChoices19() {
        return choices19;
    }

    public void setChoices19(String choices19) {
        this.choices19 = choices19;
    }

    public String getChoices20() {
        return choices20;
    }

    public void setChoices20(String choices20) {
        this.choices20 = choices20;
    }

    public String getChoices21() {
        return choices21;
    }

    public void setChoices21(String choices21) {
        this.choices21 = choices21;
    }

    public String getChoices22() {
        return choices22;
    }

    public void setChoices22(String choices22) {
        this.choices22 = choices22;
    }

    public String getChoices23() {
        return choices23;
    }

    public void setChoices23(String choices23) {
        this.choices23 = choices23;
    }

    public String getChoices24() {
        return choices24;
    }

    public void setChoices24(String choices24) {
        this.choices24 = choices24;
    }

    public String getChoices25() {
        return choices25;
    }

    public void setChoices25(String choices25) {
        this.choices25 = choices25;
    }

    public String getChoices26() {
        return choices26;
    }

    public void setChoices26(String choices26) {
        this.choices26 = choices26;
    }

    public String getChoices27() {
        return choices27;
    }

    public void setChoices27(String choices27) {
        this.choices27 = choices27;
    }

    public String getChoices28() {
        return choices28;
    }

    public void setChoices28(String choices28) {
        this.choices28 = choices28;
    }

    public String getChoices29() {
        return choices29;
    }

    public void setChoices29(String choices29) {
        this.choices29 = choices29;
    }

    public String getChoices30() {
        return choices30;
    }

    public void setChoices30(String choices30) {
        this.choices30 = choices30;
    }

    public String getChoices31() {
        return choices31;
    }

    public void setChoices31(String choices31) {
        this.choices31 = choices31;
    }

    public String getChoices32() {
        return choices32;
    }

    public void setChoices32(String choices32) {
        this.choices32 = choices32;
    }

    public String getChoices33() {
        return choices33;
    }

    public void setChoices33(String choices33) {
        this.choices33 = choices33;
    }

    public String getChoices34() {
        return choices34;
    }

    public void setChoices34(String choices34) {
        this.choices34 = choices34;
    }

    public String getChoices35() {
        return choices35;
    }

    public void setChoices35(String choices35) {
        this.choices35 = choices35;
    }

    public String getChoices36() {
        return choices36;
    }

    public void setChoices36(String choices36) {
        this.choices36 = choices36;
    }

    public String getChoices37() {
        return choices37;
    }

    public void setChoices37(String choices37) {
        this.choices37 = choices37;
    }

    public String getChoices38() {
        return choices38;
    }

    public void setChoices38(String choices38) {
        this.choices38 = choices38;
    }

    public String getChoices39() {
        return choices39;
    }

    public void setChoices39(String choices39) {
        this.choices39 = choices39;
    }

    public String getChoices40() {
        return choices40;
    }

    public void setChoices40(String choices40) {
        this.choices40 = choices40;
    }

    public String getChoices41() {
        return choices41;
    }

    public void setChoices41(String choices41) {
        this.choices41 = choices41;
    }

    public String getChoices42() {
        return choices42;
    }

    public void setChoices42(String choices42) {
        this.choices42 = choices42;
    }

    public String getChoices43() {
        return choices43;
    }

    public void setChoices43(String choices43) {
        this.choices43 = choices43;
    }

    public String getChoices44() {
        return choices44;
    }

    public void setChoices44(String choices44) {
        this.choices44 = choices44;
    }

    public String getChoices45() {
        return choices45;
    }

    public void setChoices45(String choices45) {
        this.choices45 = choices45;
    }

    public String getChoices46() {
        return choices46;
    }

    public void setChoices46(String choices46) {
        this.choices46 = choices46;
    }

    public String getChoices47() {
        return choices47;
    }

    public void setChoices47(String choices47) {
        this.choices47 = choices47;
    }

    public String getChoices48() {
        return choices48;
    }

    public void setChoices48(String choices48) {
        this.choices48 = choices48;
    }

    public String getChoices49() {
        return choices49;
    }

    public void setChoices49(String choices49) {
        this.choices49 = choices49;
    }

    public String getChoices50() {
        return choices50;
    }

    public void setChoices50(String choices50) {
        this.choices50 = choices50;
    }

    public String getChoices51() {
        return choices51;
    }

    public void setChoices51(String choices51) {
        this.choices51 = choices51;
    }

    public String getChoices52() {
        return choices52;
    }

    public void setChoices52(String choices52) {
        this.choices52 = choices52;
    }

    public String getChoices53() {
        return choices53;
    }

    public void setChoices53(String choices53) {
        this.choices53 = choices53;
    }

    public String getChoices54() {
        return choices54;
    }

    public void setChoices54(String choices54) {
        this.choices54 = choices54;
    }

    public String getChoices55() {
        return choices55;
    }

    public void setChoices55(String choices55) {
        this.choices55 = choices55;
    }

    public String getChoices56() {
        return choices56;
    }

    public void setChoices56(String choices56) {
        this.choices56 = choices56;
    }

    public String getChoices57() {
        return choices57;
    }

    public void setChoices57(String choices57) {
        this.choices57 = choices57;
    }

    public String getChoices58() {
        return choices58;
    }

    public void setChoices58(String choices58) {
        this.choices58 = choices58;
    }

    public String getChoices59() {
        return choices59;
    }

    public void setChoices59(String choices59) {
        this.choices59 = choices59;
    }

    public String getChoices60() {
        return choices60;
    }

    public void setChoices60(String choices60) {
        this.choices60 = choices60;
    }

    public String getResUrl1() {
        return resUrl1;
    }

    public void setResUrl1(String resUrl1) {
        this.resUrl1 = resUrl1;
    }

    public String getResUrl2() {
        return resUrl2;
    }

    public void setResUrl2(String resUrl2) {
        this.resUrl2 = resUrl2;
    }

    public String getResUrl3() {
        return resUrl3;
    }

    public void setResUrl3(String resUrl3) {
        this.resUrl3 = resUrl3;
    }

    public String getResUrl4() {
        return resUrl4;
    }

    public void setResUrl4(String resUrl4) {
        this.resUrl4 = resUrl4;
    }

    public String getResUrl5() {
        return resUrl5;
    }

    public void setResUrl5(String resUrl5) {
        this.resUrl5 = resUrl5;
    }

    public String getResUrl6() {
        return resUrl6;
    }

    public void setResUrl6(String resUrl6) {
        this.resUrl6 = resUrl6;
    }

    public String getResUrl7() {
        return resUrl7;
    }

    public void setResUrl7(String resUrl7) {
        this.resUrl7 = resUrl7;
    }

    public String getResUrl8() {
        return resUrl8;
    }

    public void setResUrl8(String resUrl8) {
        this.resUrl8 = resUrl8;
    }

    public String getResUrl9() {
        return resUrl9;
    }

    public void setResUrl9(String resUrl9) {
        this.resUrl9 = resUrl9;
    }

    public String getResUrl10() {
        return resUrl10;
    }

    public void setResUrl10(String resUrl10) {
        this.resUrl10 = resUrl10;
    }

    public String getResUrl11() {
        return resUrl11;
    }

    public void setResUrl11(String resUrl11) {
        this.resUrl11 = resUrl11;
    }

    public String getResUrl12() {
        return resUrl12;
    }

    public void setResUrl12(String resUrl12) {
        this.resUrl12 = resUrl12;
    }

    public String getResUrl13() {
        return resUrl13;
    }

    public void setResUrl13(String resUrl13) {
        this.resUrl13 = resUrl13;
    }

    public String getResUrl14() {
        return resUrl14;
    }

    public void setResUrl14(String resUrl14) {
        this.resUrl14 = resUrl14;
    }

    public String getResUrl15() {
        return resUrl15;
    }

    public void setResUrl15(String resUrl15) {
        this.resUrl15 = resUrl15;
    }

    public String getResUrl16() {
        return resUrl16;
    }

    public void setResUrl16(String resUrl16) {
        this.resUrl16 = resUrl16;
    }

    public String getResUrl17() {
        return resUrl17;
    }

    public void setResUrl17(String resUrl17) {
        this.resUrl17 = resUrl17;
    }

    public String getResUrl18() {
        return resUrl18;
    }

    public void setResUrl18(String resUrl18) {
        this.resUrl18 = resUrl18;
    }

    public String getResUrl19() {
        return resUrl19;
    }

    public void setResUrl19(String resUrl19) {
        this.resUrl19 = resUrl19;
    }

    public String getResUrl20() {
        return resUrl20;
    }

    public void setResUrl20(String resUrl20) {
        this.resUrl20 = resUrl20;
    }

    public String getResUrl21() {
        return resUrl21;
    }

    public void setResUrl21(String resUrl21) {
        this.resUrl21 = resUrl21;
    }

    public String getResUrl22() {
        return resUrl22;
    }

    public void setResUrl22(String resUrl22) {
        this.resUrl22 = resUrl22;
    }

    public String getResUrl23() {
        return resUrl23;
    }

    public void setResUrl23(String resUrl23) {
        this.resUrl23 = resUrl23;
    }

    public String getResUrl24() {
        return resUrl24;
    }

    public void setResUrl24(String resUrl24) {
        this.resUrl24 = resUrl24;
    }

    public String getResUrl25() {
        return resUrl25;
    }

    public void setResUrl25(String resUrl25) {
        this.resUrl25 = resUrl25;
    }

    public String getResUrl26() {
        return resUrl26;
    }

    public void setResUrl26(String resUrl26) {
        this.resUrl26 = resUrl26;
    }

    public String getResUrl27() {
        return resUrl27;
    }

    public void setResUrl27(String resUrl27) {
        this.resUrl27 = resUrl27;
    }

    public String getResUrl28() {
        return resUrl28;
    }

    public void setResUrl28(String resUrl28) {
        this.resUrl28 = resUrl28;
    }

    public String getResUrl29() {
        return resUrl29;
    }

    public void setResUrl29(String resUrl29) {
        this.resUrl29 = resUrl29;
    }

    public String getResUrl30() {
        return resUrl30;
    }

    public void setResUrl30(String resUrl30) {
        this.resUrl30 = resUrl30;
    }

    public String getResUrl31() {
        return resUrl31;
    }

    public void setResUrl31(String resUrl31) {
        this.resUrl31 = resUrl31;
    }

    public String getResUrl32() {
        return resUrl32;
    }

    public void setResUrl32(String resUrl32) {
        this.resUrl32 = resUrl32;
    }

    public String getResUrl33() {
        return resUrl33;
    }

    public void setResUrl33(String resUrl33) {
        this.resUrl33 = resUrl33;
    }

    public String getResUrl34() {
        return resUrl34;
    }

    public void setResUrl34(String resUrl34) {
        this.resUrl34 = resUrl34;
    }

    public String getResUrl35() {
        return resUrl35;
    }

    public void setResUrl35(String resUrl35) {
        this.resUrl35 = resUrl35;
    }

    public String getResUrl36() {
        return resUrl36;
    }

    public void setResUrl36(String resUrl36) {
        this.resUrl36 = resUrl36;
    }

    public String getResUrl37() {
        return resUrl37;
    }

    public void setResUrl37(String resUrl37) {
        this.resUrl37 = resUrl37;
    }

    public String getResUrl38() {
        return resUrl38;
    }

    public void setResUrl38(String resUrl38) {
        this.resUrl38 = resUrl38;
    }

    public String getResUrl39() {
        return resUrl39;
    }

    public void setResUrl39(String resUrl39) {
        this.resUrl39 = resUrl39;
    }

    public String getResUrl40() {
        return resUrl40;
    }

    public void setResUrl40(String resUrl40) {
        this.resUrl40 = resUrl40;
    }

    public String getResUrl41() {
        return resUrl41;
    }

    public void setResUrl41(String resUrl41) {
        this.resUrl41 = resUrl41;
    }

    public String getResUrl42() {
        return resUrl42;
    }

    public void setResUrl42(String resUrl42) {
        this.resUrl42 = resUrl42;
    }

    public String getResUrl43() {
        return resUrl43;
    }

    public void setResUrl43(String resUrl43) {
        this.resUrl43 = resUrl43;
    }

    public String getResUrl44() {
        return resUrl44;
    }

    public void setResUrl44(String resUrl44) {
        this.resUrl44 = resUrl44;
    }

    public String getResUrl45() {
        return resUrl45;
    }

    public void setResUrl45(String resUrl45) {
        this.resUrl45 = resUrl45;
    }

    public String getResUrl46() {
        return resUrl46;
    }

    public void setResUrl46(String resUrl46) {
        this.resUrl46 = resUrl46;
    }

    public String getResUrl47() {
        return resUrl47;
    }

    public void setResUrl47(String resUrl47) {
        this.resUrl47 = resUrl47;
    }

    public String getResUrl48() {
        return resUrl48;
    }

    public void setResUrl48(String resUrl48) {
        this.resUrl48 = resUrl48;
    }

    public String getResUrl49() {
        return resUrl49;
    }

    public void setResUrl49(String resUrl49) {
        this.resUrl49 = resUrl49;
    }

    public String getResUrl50() {
        return resUrl50;
    }

    public void setResUrl50(String resUrl50) {
        this.resUrl50 = resUrl50;
    }

    public String getResUrl51() {
        return resUrl51;
    }

    public void setResUrl51(String resUrl51) {
        this.resUrl51 = resUrl51;
    }

    public String getResUrl52() {
        return resUrl52;
    }

    public void setResUrl52(String resUrl52) {
        this.resUrl52 = resUrl52;
    }

    public String getResUrl53() {
        return resUrl53;
    }

    public void setResUrl53(String resUrl53) {
        this.resUrl53 = resUrl53;
    }

    public String getResUrl54() {
        return resUrl54;
    }

    public void setResUrl54(String resUrl54) {
        this.resUrl54 = resUrl54;
    }

    public String getResUrl55() {
        return resUrl55;
    }

    public void setResUrl55(String resUrl55) {
        this.resUrl55 = resUrl55;
    }

    public String getResUrl56() {
        return resUrl56;
    }

    public void setResUrl56(String resUrl56) {
        this.resUrl56 = resUrl56;
    }

    public String getResUrl57() {
        return resUrl57;
    }

    public void setResUrl57(String resUrl57) {
        this.resUrl57 = resUrl57;
    }

    public String getResUrl58() {
        return resUrl58;
    }

    public void setResUrl58(String resUrl58) {
        this.resUrl58 = resUrl58;
    }

    public String getResUrl59() {
        return resUrl59;
    }

    public void setResUrl59(String resUrl59) {
        this.resUrl59 = resUrl59;
    }

    public String getResUrl60() {
        return resUrl60;
    }

    public void setResUrl60(String resUrl60) {
        this.resUrl60 = resUrl60;
    }

    public String getAnsDescription1() {
        return ansDescription1;
    }

    public void setAnsDescription1(String ansDescription1) {
        this.ansDescription1 = ansDescription1;
    }

    public String getAnsDescription2() {
        return ansDescription2;
    }

    public void setAnsDescription2(String ansDescription2) {
        this.ansDescription2 = ansDescription2;
    }

    public String getAnsDescription3() {
        return ansDescription3;
    }

    public void setAnsDescription3(String ansDescription3) {
        this.ansDescription3 = ansDescription3;
    }

    public String getAnsDescription4() {
        return ansDescription4;
    }

    public void setAnsDescription4(String ansDescription4) {
        this.ansDescription4 = ansDescription4;
    }

    public String getAnsDescription5() {
        return ansDescription5;
    }

    public void setAnsDescription5(String ansDescription5) {
        this.ansDescription5 = ansDescription5;
    }

    public String getAnsDescription6() {
        return ansDescription6;
    }

    public void setAnsDescription6(String ansDescription6) {
        this.ansDescription6 = ansDescription6;
    }

    public String getAnsDescription7() {
        return ansDescription7;
    }

    public void setAnsDescription7(String ansDescription7) {
        this.ansDescription7 = ansDescription7;
    }

    public String getAnsDescription8() {
        return ansDescription8;
    }

    public void setAnsDescription8(String ansDescription8) {
        this.ansDescription8 = ansDescription8;
    }

    public String getAnsDescription9() {
        return ansDescription9;
    }

    public void setAnsDescription9(String ansDescription9) {
        this.ansDescription9 = ansDescription9;
    }

    public String getAnsDescription10() {
        return ansDescription10;
    }

    public void setAnsDescription10(String ansDescription10) {
        this.ansDescription10 = ansDescription10;
    }

    public String getAnsDescription11() {
        return ansDescription11;
    }

    public void setAnsDescription11(String ansDescription11) {
        this.ansDescription11 = ansDescription11;
    }

    public String getAnsDescription12() {
        return ansDescription12;
    }

    public void setAnsDescription12(String ansDescription12) {
        this.ansDescription12 = ansDescription12;
    }

    public String getAnsDescription13() {
        return ansDescription13;
    }

    public void setAnsDescription13(String ansDescription13) {
        this.ansDescription13 = ansDescription13;
    }

    public String getAnsDescription14() {
        return ansDescription14;
    }

    public void setAnsDescription14(String ansDescription14) {
        this.ansDescription14 = ansDescription14;
    }

    public String getAnsDescription15() {
        return ansDescription15;
    }

    public void setAnsDescription15(String ansDescription15) {
        this.ansDescription15 = ansDescription15;
    }

    public String getAnsDescription16() {
        return ansDescription16;
    }

    public void setAnsDescription16(String ansDescription16) {
        this.ansDescription16 = ansDescription16;
    }

    public String getAnsDescription17() {
        return ansDescription17;
    }

    public void setAnsDescription17(String ansDescription17) {
        this.ansDescription17 = ansDescription17;
    }

    public String getAnsDescription18() {
        return ansDescription18;
    }

    public void setAnsDescription18(String ansDescription18) {
        this.ansDescription18 = ansDescription18;
    }

    public String getAnsDescription19() {
        return ansDescription19;
    }

    public void setAnsDescription19(String ansDescription19) {
        this.ansDescription19 = ansDescription19;
    }

    public String getAnsDescription20() {
        return ansDescription20;
    }

    public void setAnsDescription20(String ansDescription20) {
        this.ansDescription20 = ansDescription20;
    }

    public String getAnsDescription21() {
        return ansDescription21;
    }

    public void setAnsDescription21(String ansDescription21) {
        this.ansDescription21 = ansDescription21;
    }

    public String getAnsDescription22() {
        return ansDescription22;
    }

    public void setAnsDescription22(String ansDescription22) {
        this.ansDescription22 = ansDescription22;
    }

    public String getAnsDescription23() {
        return ansDescription23;
    }

    public void setAnsDescription23(String ansDescription23) {
        this.ansDescription23 = ansDescription23;
    }

    public String getAnsDescription24() {
        return ansDescription24;
    }

    public void setAnsDescription24(String ansDescription24) {
        this.ansDescription24 = ansDescription24;
    }

    public String getAnsDescription25() {
        return ansDescription25;
    }

    public void setAnsDescription25(String ansDescription25) {
        this.ansDescription25 = ansDescription25;
    }

    public String getAnsDescription26() {
        return ansDescription26;
    }

    public void setAnsDescription26(String ansDescription26) {
        this.ansDescription26 = ansDescription26;
    }

    public String getAnsDescription27() {
        return ansDescription27;
    }

    public void setAnsDescription27(String ansDescription27) {
        this.ansDescription27 = ansDescription27;
    }

    public String getAnsDescription28() {
        return ansDescription28;
    }

    public void setAnsDescription28(String ansDescription28) {
        this.ansDescription28 = ansDescription28;
    }

    public String getAnsDescription29() {
        return ansDescription29;
    }

    public void setAnsDescription29(String ansDescription29) {
        this.ansDescription29 = ansDescription29;
    }

    public String getAnsDescription30() {
        return ansDescription30;
    }

    public void setAnsDescription30(String ansDescription30) {
        this.ansDescription30 = ansDescription30;
    }

    public String getAnsDescription31() {
        return ansDescription31;
    }

    public void setAnsDescription31(String ansDescription31) {
        this.ansDescription31 = ansDescription31;
    }

    public String getAnsDescription32() {
        return ansDescription32;
    }

    public void setAnsDescription32(String ansDescription32) {
        this.ansDescription32 = ansDescription32;
    }

    public String getAnsDescription33() {
        return ansDescription33;
    }

    public void setAnsDescription33(String ansDescription33) {
        this.ansDescription33 = ansDescription33;
    }

    public String getAnsDescription34() {
        return ansDescription34;
    }

    public void setAnsDescription34(String ansDescription34) {
        this.ansDescription34 = ansDescription34;
    }

    public String getAnsDescription35() {
        return ansDescription35;
    }

    public void setAnsDescription35(String ansDescription35) {
        this.ansDescription35 = ansDescription35;
    }

    public String getAnsDescription36() {
        return ansDescription36;
    }

    public void setAnsDescription36(String ansDescription36) {
        this.ansDescription36 = ansDescription36;
    }

    public String getAnsDescription37() {
        return ansDescription37;
    }

    public void setAnsDescription37(String ansDescription37) {
        this.ansDescription37 = ansDescription37;
    }

    public String getAnsDescription38() {
        return ansDescription38;
    }

    public void setAnsDescription38(String ansDescription38) {
        this.ansDescription38 = ansDescription38;
    }

    public String getAnsDescription39() {
        return ansDescription39;
    }

    public void setAnsDescription39(String ansDescription39) {
        this.ansDescription39 = ansDescription39;
    }

    public String getAnsDescription40() {
        return ansDescription40;
    }

    public void setAnsDescription40(String ansDescription40) {
        this.ansDescription40 = ansDescription40;
    }

    public String getAnsDescription41() {
        return ansDescription41;
    }

    public void setAnsDescription41(String ansDescription41) {
        this.ansDescription41 = ansDescription41;
    }

    public String getAnsDescription42() {
        return ansDescription42;
    }

    public void setAnsDescription42(String ansDescription42) {
        this.ansDescription42 = ansDescription42;
    }

    public String getAnsDescription43() {
        return ansDescription43;
    }

    public void setAnsDescription43(String ansDescription43) {
        this.ansDescription43 = ansDescription43;
    }

    public String getAnsDescription44() {
        return ansDescription44;
    }

    public void setAnsDescription44(String ansDescription44) {
        this.ansDescription44 = ansDescription44;
    }

    public String getAnsDescription45() {
        return ansDescription45;
    }

    public void setAnsDescription45(String ansDescription45) {
        this.ansDescription45 = ansDescription45;
    }

    public String getAnsDescription46() {
        return ansDescription46;
    }

    public void setAnsDescription46(String ansDescription46) {
        this.ansDescription46 = ansDescription46;
    }

    public String getAnsDescription47() {
        return ansDescription47;
    }

    public void setAnsDescription47(String ansDescription47) {
        this.ansDescription47 = ansDescription47;
    }

    public String getAnsDescription48() {
        return ansDescription48;
    }

    public void setAnsDescription48(String ansDescription48) {
        this.ansDescription48 = ansDescription48;
    }

    public String getAnsDescription49() {
        return ansDescription49;
    }

    public void setAnsDescription49(String ansDescription49) {
        this.ansDescription49 = ansDescription49;
    }

    public String getAnsDescription50() {
        return ansDescription50;
    }

    public void setAnsDescription50(String ansDescription50) {
        this.ansDescription50 = ansDescription50;
    }

    public String getAnsDescription51() {
        return ansDescription51;
    }

    public void setAnsDescription51(String ansDescription51) {
        this.ansDescription51 = ansDescription51;
    }

    public String getAnsDescription52() {
        return ansDescription52;
    }

    public void setAnsDescription52(String ansDescription52) {
        this.ansDescription52 = ansDescription52;
    }

    public String getAnsDescription53() {
        return ansDescription53;
    }

    public void setAnsDescription53(String ansDescription53) {
        this.ansDescription53 = ansDescription53;
    }

    public String getAnsDescription54() {
        return ansDescription54;
    }

    public void setAnsDescription54(String ansDescription54) {
        this.ansDescription54 = ansDescription54;
    }

    public String getAnsDescription55() {
        return ansDescription55;
    }

    public void setAnsDescription55(String ansDescription55) {
        this.ansDescription55 = ansDescription55;
    }

    public String getAnsDescription56() {
        return ansDescription56;
    }

    public void setAnsDescription56(String ansDescription56) {
        this.ansDescription56 = ansDescription56;
    }

    public String getAnsDescription57() {
        return ansDescription57;
    }

    public void setAnsDescription57(String ansDescription57) {
        this.ansDescription57 = ansDescription57;
    }

    public String getAnsDescription58() {
        return ansDescription58;
    }

    public void setAnsDescription58(String ansDescription58) {
        this.ansDescription58 = ansDescription58;
    }

    public String getAnsDescription59() {
        return ansDescription59;
    }

    public void setAnsDescription59(String ansDescription59) {
        this.ansDescription59 = ansDescription59;
    }

    public String getAnsDescription60() {
        return ansDescription60;
    }

    public void setAnsDescription60(String ansDescription60) {
        this.ansDescription60 = ansDescription60;
    }
}
