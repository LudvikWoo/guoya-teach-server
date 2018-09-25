package com.example.wuling.bean.studentEnroll.addEnroll;

public class AddEnrollResp {
    private String respCode;
    private String respDesc;
    private Integer enrollId;

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespDesc() {
        return respDesc;
    }

    public void setRespDesc(String respDesc) {
        this.respDesc = respDesc;
    }

    public Integer getEnrollId() {
        return enrollId;
    }

    public void setEnrollId(Integer enrollId) {
        this.enrollId = enrollId;
    }

    @Override
    public String toString() {
        return "AddEnrollResp{" +
                "respCode='" + respCode + '\'' +
                ", respDesc='" + respDesc + '\'' +
                ", enrollId=" + enrollId +
                '}';
    }
}
