package com.sam.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Sale {
    private Integer saleId;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date saleCreatetime;

    private Integer saleCustId;

    private Integer saleUserId;

    private BigDecimal saleSum;

    private Integer saleState;

    private String saleNote;

    /**
     * 一对多联表查询销售单详情
     */
    private List<SaleDetail> saleDetailList;

    /**
     * 一对一关联获取customer部分字段
     */
    private String custName;

    private String custPhone;

    /**
     * 一对一关联获取user部分字段
     * @return
     */
    private String userName;

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<SaleDetail> getSaleDetailList() {
        return saleDetailList;
    }

    public void setSaleDetailList(List<SaleDetail> saleDetailList) {
        this.saleDetailList = saleDetailList;
    }

    public Integer getSaleId() {
        return saleId;
    }

    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    public Date getSaleCreatetime() {
        return saleCreatetime;
    }

    public void setSaleCreatetime(Date saleCreatetime) {
        this.saleCreatetime = saleCreatetime;
    }

    public Integer getSaleCustId() {
        return saleCustId;
    }

    public void setSaleCustId(Integer saleCustId) {
        this.saleCustId = saleCustId;
    }

    public Integer getSaleUserId() {
        return saleUserId;
    }

    public void setSaleUserId(Integer saleUserId) {
        this.saleUserId = saleUserId;
    }

    public BigDecimal getSaleSum() {
        return saleSum;
    }

    public void setSaleSum(BigDecimal saleSum) {
        this.saleSum = saleSum;
    }

    public Integer getSaleState() {
        return saleState;
    }

    public void setSaleState(Integer saleState) {
        this.saleState = saleState;
    }

    public String getSaleNote() {
        return saleNote;
    }

    public void setSaleNote(String saleNote) {
        this.saleNote = saleNote == null ? null : saleNote.trim();
    }
}