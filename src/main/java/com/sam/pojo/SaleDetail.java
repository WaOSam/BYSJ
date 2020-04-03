package com.sam.pojo;

import java.math.BigDecimal;

/**
 * @author Sam
 */
public class SaleDetail {
    private Integer detaId;

    private Integer detaSaleId;

    private Integer detaGoodsId;

    private Integer detaNum;

    private BigDecimal detaPrice;

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

    public Integer getDetaSaleId() {
        return detaSaleId;
    }

    public void setDetaSaleId(Integer detaSaleId) {
        this.detaSaleId = detaSaleId;
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
}