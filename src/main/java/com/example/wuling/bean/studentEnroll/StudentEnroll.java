package com.example.wuling.bean.studentEnroll;


import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

public class StudentEnroll {
    public interface Query{}
    @Valid
    @NotNull(groups = {Query.class})
    private Page page;

    private Integer enrollId;
    @NotEmpty(message = "客户名不能为空")
    private String customerName;

    private Integer studentId;

    private Integer customerId;

    private Integer classId;

    private Date enrollDate;

    private String cert;

    private Integer feePayed;

    private Integer feeUnpayed;

    private Integer education;

    private Integer insurance;

    private Integer computor;

    private Integer board;

    private Integer buyEdu;

    private Integer introduceCstId;

    private Integer introduceFee;

    private Integer chargeCstId;

    private Date createTime;

    private Date updateTime;

    private Integer status;

    private Integer operatorUserId;

    public Integer getEnrollId() {
        return enrollId;
    }

    public void setEnrollId(Integer enrollId) {
        this.enrollId = enrollId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }

    public String getCert() {
        return cert;
    }

    public void setCert(String cert) {
        this.cert = cert == null ? null : cert.trim();
    }

    public Integer getFeePayed() {
        return feePayed;
    }

    public void setFeePayed(Integer feePayed) {
        this.feePayed = feePayed;
    }

    public Integer getFeeUnpayed() {
        return feeUnpayed;
    }

    public void setFeeUnpayed(Integer feeUnpayed) {
        this.feeUnpayed = feeUnpayed;
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public Integer getInsurance() {
        return insurance;
    }

    public void setInsurance(Integer insurance) {
        this.insurance = insurance;
    }

    public Integer getComputor() {
        return computor;
    }

    public void setComputor(Integer computor) {
        this.computor = computor;
    }

    public Integer getBoard() {
        return board;
    }

    public void setBoard(Integer board) {
        this.board = board;
    }

    public Integer getBuyEdu() {
        return buyEdu;
    }

    public void setBuyEdu(Integer buyEdu) {
        this.buyEdu = buyEdu;
    }

    public Integer getIntroduceCstId() {
        return introduceCstId;
    }

    public void setIntroduceCstId(Integer introduceCstId) {
        this.introduceCstId = introduceCstId;
    }

    public Integer getIntroduceFee() {
        return introduceFee;
    }

    public void setIntroduceFee(Integer introduceFee) {
        this.introduceFee = introduceFee;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public Integer getChargeCstId() {
        return chargeCstId;
    }

    public void setChargeCstId(Integer chargeCstId) {
        this.chargeCstId = chargeCstId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getOperatorUserId() {
        return operatorUserId;
    }

    public void setOperatorUserId(Integer operatorUserId) {
        this.operatorUserId = operatorUserId;
    }


    @Override
    public String toString() {
        return "StudentEnroll{" +
                "enrollId=" + enrollId +
                ", customerName='" + customerName + '\'' +
                ", studentId=" + studentId +
                ", customerId=" + customerId +
                ", classId=" + classId +
                ", enrollDate=" + enrollDate +
                ", cert='" + cert + '\'' +
                ", feePayed=" + feePayed +
                ", feeUnpayed=" + feeUnpayed +
                ", education=" + education +
                ", insurance=" + insurance +
                ", computor=" + computor +
                ", board=" + board +
                ", buyEdu=" + buyEdu +
                ", introduceCstId=" + introduceCstId +
                ", introduceFee=" + introduceFee +
                ", chargeCstId=" + chargeCstId +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", status=" + status +
                ", operatorUserId=" + operatorUserId +
                '}';
    }
}

