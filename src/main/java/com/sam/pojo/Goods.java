package com.sam.pojo;

/**
 * @author Sam
 */
public class Goods {
    private Integer goodsId;

    private String goodsName;

    private String goodsUnit;

    private String goodsPlace;

    private String goodsNote;

    private Integer goodsWarn;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsUnit() {
        return goodsUnit;
    }

    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit == null ? null : goodsUnit.trim();
    }

    public String getGoodsPlace() {
        return goodsPlace;
    }

    public void setGoodsPlace(String goodsPlace) {
        this.goodsPlace = goodsPlace == null ? null : goodsPlace.trim();
    }

    public String getGoodsNote() {
        return goodsNote;
    }

    public void setGoodsNote(String goodsNote) {
        this.goodsNote = goodsNote == null ? null : goodsNote.trim();
    }

    public Integer getGoodsWarn() {
        return goodsWarn;
    }

    public void setGoodsWarn(Integer goodsWarn) {
        this.goodsWarn = goodsWarn;
    }
}