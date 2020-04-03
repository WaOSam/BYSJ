package com.sam.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;
import java.util.Date;

public class ReceDetail {
    private Integer detaId;

    private Integer detaReceId;

    private Integer detaGoodsId;

    private Integer detaNum;

    private BigDecimal detaPrice;

    @JSONField(format = "yyyy-MM-dd")
    private Date detaFresh;

    private BigDecimal detaSellPrice;

    /**
     * 获取部分goods字段
     */
    private String goodsName;

    private String goodsUnit;

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

    public Integer getDetaId() {
        return detaId;
    }

    public void setDetaId(Integer detaId) {
        this.detaId = detaId;
    }

    public Integer getDetaReceId() {
        return detaReceId;
    }

    public void setDetaReceId(Integer detaReceId) {
        this.detaReceId = detaReceId;
    }

    public Integer getDetaGoodsId() {
        return detaGoodsId;
    }

    public void setDetaGoodsId(Integer detaGoodsId) {
        this.detaGoodsId = detaGoodsId;
    }

    public Integer getDetaNum() {
        return detaNum;
    }

    public void setDetaNum(Integer detaNum) {
        this.detaNum = detaNum;
    }

    public BigDecimal getDetaPrice() {
        return detaPrice;
    }

    public void setDetaPrice(BigDecimal detaPrice) {
        this.detaPrice = detaPrice;
    }

    public Date getDetaFresh() {
        return detaFresh;
    }

    public void setDetaFresh(Date detaFresh) {
        this.detaFresh = detaFresh;
    }

    public BigDecimal getDetaSellPrice() {
        return detaSellPrice;
    }

    public void setDetaSellPrice(BigDecimal detaSellPrice) {
        this.detaSellPrice = detaSellPrice;
    }
}