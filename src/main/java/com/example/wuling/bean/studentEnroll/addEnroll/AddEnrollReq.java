package com.example.wuling.bean.studentEnroll.addEnroll;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

public class AddEnrollReq {
    @NotEmpty(message = "客户名不能为空")
    private String customerName;

    private Integer classId;

    private String cert;

    private Integer feePayed;

    private Integer education;

    private Integer introduceCstId;

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    private Integer operatorUserId;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCert() {
        return cert;
    }

    public Integer getFeePayed() {
        return feePayed;
    }

    public void setFeePayed(Integer feePayed) {
        this.feePayed = feePayed;
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public Integer getIntroduceCstId() {
        return introduceCstId;
    }

    public void setIntroduceCstId(Integer introduceCstId) {
        this.introduceCstId = introduceCstId;
    }

    public Integer getOperatorUserId() {
        return operatorUserId;
    }

    public void setOperatorUserId(Integer operatorUserId) {
        this.operatorUserId = operatorUserId;
    }

    public void setCert(String cert) {
        this.cert = cert;
    }

    @Override
    public String toString() {
        return "AddEnrollReq{" +
                "customerName='" + customerName + '\'' +
                ", classId=" + classId +
                ", cert='" + cert + '\'' +
                ", feePayed=" + feePayed +
                ", education=" + education +
                ", introduceCstId=" + introduceCstId +
                ", operatorUserId=" + operatorUserId +
                '}';
    }
}
