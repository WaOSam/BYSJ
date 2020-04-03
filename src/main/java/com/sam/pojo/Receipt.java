package com.sam.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author Sam
 */
public class Receipt {

    private Integer receId;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date receCreatetime;

    private Integer receSuppId;

    private Integer receUserId;

    private BigDecimal receSum;

    private Integer receState;

    private String receNote;

    /**
     * 获取user_name以及user_phone
     */
    private String userName;

    private String userPhone;

    /**
     * 获取supp_name以及supp_phone
     */
    private String suppName;

    private String suppPhone;

    /**
     * 一对多联表查询,进货单详情列表
     */
    private List<ReceDetail> receDetailList;

    public String getSuppName() {
        return suppName;
    }

    public void setSuppName(String suppName) {
        this.suppName = suppName;
    }

    public String getSuppPhone() {
        return suppPhone;
    }

    public void setSuppPhone(String suppPhone) {
        this.suppPhone = suppPhone;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<ReceDetail> getReceDetailList() {
        return receDetailList;
    }

    public void setReceDetailList(List<ReceDetail> receDetailList) {
        this.receDetailList = receDetailList;
    }

    public Integer getReceId() {
        return receId;
    }

    public void setReceId(Integer receId) {
        this.receId = receId;
    }

    public Date getReceCreatetime() {
        return receCreatetime;
    }

    public void setReceCreatetime(Date receCreatetime) {
        this.receCreatetime = receCreatetime;
    }

    public Integer getReceSuppId() {
        return receSuppId;
    }

    public void setReceSuppId(Integer receSuppId) {
        this.receSuppId = receSuppId;
    }

    public Integer getReceUserId() {
        return receUserId;
    }

    public void setReceUserId(Integer receUserId) {
        this.receUserId = receUserId;
    }

    public BigDecimal getReceSum() {
        return receSum;
    }

    public void setReceSum(BigDecimal receSum) {
        this.receSum = receSum;
    }

    public Integer getReceState() {
        return receState;
    }

    public void setReceState(Integer receState) {
        this.receState = receState;
    }

    public String getReceNote() {
        return receNote;
    }

    public void setReceNote(String receNote) {
        this.receNote = receNote == null ? null : receNote.trim();
    }
}