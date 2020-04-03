package com.sam.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Sam
 */
public class Store {
    private Integer storeId;

    private Integer receId;

    private Integer goodsId;

    private Integer receNum;

    private BigDecimal recePrice;

    @JSONField(format = "yyyy-MM-dd")
    private Date fresh;

    private Integer remain;

    private BigDecimal sell;

    private String note;

    /**
     * 关联查询goods部分字段
     */
    private Integer goodsWarn;

    private String goodsName;

    private String goodsUnit;

    /**
     * 关联部分receipt部分字段
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date stockTime;

    public Integer getGoodsWarn() {
        return goodsWarn;
    }

    public void setGoodsWarn(Integer goodsWarn) {
        this.goodsWarn = goodsWarn;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsUnit() {
        return goodsUnit;
    }

    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit;
    }

    public Date getStockTime() {
        return stockTime;
    }

    public void setStockTime(Date stockTime) {
        this.stockTime = stockTime;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getReceId() {
        return receId;
    }

    public void setReceId(Integer receId) {
        this.receId = receId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getReceNum() {
        return receNum;
    }

    public void setReceNum(Integer receNum) {
        this.receNum = receNum;
    }

    public BigDecimal getRecePrice() {
        return recePrice;
    }

    public void setRecePrice(BigDecimal recePrice) {
        this.recePrice = recePrice;
    }

    public Date getFresh() {
        return fresh;
    }

    public void setFresh(Date fresh) {
        this.fresh = fresh;
    }

    public Integer getRemain() {
        return remain;
    }

    public void setRemain(Integer remain) {
        this.remain = remain;
    }

    public BigDecimal getSell() {
        return sell;
    }

    public void setSell(BigDecimal sell) {
        this.sell = sell;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Store() {
    }

    public Store(ReceDetail receDetail, Receipt receipt) {
        this.receNum = receDetail.getDetaNum();
        //起始剩余量等于进货数量
        this.remain = receDetail.getDetaNum();
        this.recePrice = receDetail.getDetaPrice();
        this.fresh = receDetail.getDetaFresh();
        this.sell = receDetail.getDetaSellPrice();
        this.goodsId = receDetail.getDetaGoodsId();
        this.receId = receipt.getReceId();
    }
}