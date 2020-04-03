package com.sam.pojo;

import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIsNull() {
            addCriterion("goods_unit is null");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIsNotNull() {
            addCriterion("goods_unit is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitEqualTo(String value) {
            addCriterion("goods_unit =", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotEqualTo(String value) {
            addCriterion("goods_unit <>", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitGreaterThan(String value) {
            addCriterion("goods_unit >", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitGreaterThanOrEqualTo(String value) {
            addCriterion("goods_unit >=", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitLessThan(String value) {
            addCriterion("goods_unit <", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitLessThanOrEqualTo(String value) {
            addCriterion("goods_unit <=", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitLike(String value) {
            addCriterion("goods_unit like", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotLike(String value) {
            addCriterion("goods_unit not like", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIn(List<String> values) {
            addCriterion("goods_unit in", values, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotIn(List<String> values) {
            addCriterion("goods_unit not in", values, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitBetween(String value1, String value2) {
            addCriterion("goods_unit between", value1, value2, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotBetween(String value1, String value2) {
            addCriterion("goods_unit not between", value1, value2, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsPlaceIsNull() {
            addCriterion("goods_place is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPlaceIsNotNull() {
            addCriterion("goods_place is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPlaceEqualTo(String value) {
            addCriterion("goods_place =", value, "goodsPlace");
            return (Criteria) this;
        }

        public Criteria andGoodsPlaceNotEqualTo(String value) {
            addCriterion("goods_place <>", value, "goodsPlace");
            return (Criteria) this;
        }

        public Criteria andGoodsPlaceGreaterThan(String value) {
            addCriterion("goods_place >", value, "goodsPlace");
            return (Criteria) this;
        }

        public Criteria andGoodsPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("goods_place >=", value, "goodsPlace");
            return (Criteria) this;
        }

        public Criteria andGoodsPlaceLessThan(String value) {
            addCriterion("goods_place <", value, "goodsPlace");
            return (Criteria) this;
        }

        public Criteria andGoodsPlaceLessThanOrEqualTo(String value) {
            addCriterion("goods_place <=", value, "goodsPlace");
            return (Criteria) this;
        }

        public Criteria andGoodsPlaceLike(String value) {
            addCriterion("goods_place like", value, "goodsPlace");
            return (Criteria) this;
        }

        public Criteria andGoodsPlaceNotLike(String value) {
            addCriterion("goods_place not like", value, "goodsPlace");
            return (Criteria) this;
        }

        public Criteria andGoodsPlaceIn(List<String> values) {
            addCriterion("goods_place in", values, "goodsPlace");
            return (Criteria) this;
        }

        public Criteria andGoodsPlaceNotIn(List<String> values) {
            addCriterion("goods_place not in", values, "goodsPlace");
            return (Criteria) this;
        }

        public Criteria andGoodsPlaceBetween(String value1, String value2) {
            addCriterion("goods_place between", value1, value2, "goodsPlace");
            return (Criteria) this;
        }

        public Criteria andGoodsPlaceNotBetween(String value1, String value2) {
            addCriterion("goods_place not between", value1, value2, "goodsPlace");
            return (Criteria) this;
        }

        public Criteria andGoodsNoteIsNull() {
            addCriterion("goods_note is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNoteIsNotNull() {
            addCriterion("goods_note is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNoteEqualTo(String value) {
            addCriterion("goods_note =", value, "goodsNote");
            return (Criteria) this;
        }

        public Criteria andGoodsNoteNotEqualTo(String value) {
            addCriterion("goods_note <>", value, "goodsNote");
            return (Criteria) this;
        }

        public Criteria andGoodsNoteGreaterThan(String value) {
            addCriterion("goods_note >", value, "goodsNote");
            return (Criteria) this;
        }

        public Criteria andGoodsNoteGreaterThanOrEqualTo(String value) {
            addCriterion("goods_note >=", value, "goodsNote");
            return (Criteria) this;
        }

        public Criteria andGoodsNoteLessThan(String value) {
            addCriterion("goods_note <", value, "goodsNote");
            return (Criteria) this;
        }

        public Criteria andGoodsNoteLessThanOrEqualTo(String value) {
            addCriterion("goods_note <=", value, "goodsNote");
            return (Criteria) this;
        }

        public Criteria andGoodsNoteLike(String value) {
            addCriterion("goods_note like", value, "goodsNote");
            return (Criteria) this;
        }

        public Criteria andGoodsNoteNotLike(String value) {
            addCriterion("goods_note not like", value, "goodsNote");
            return (Criteria) this;
        }

        public Criteria andGoodsNoteIn(List<String> values) {
            addCriterion("goods_note in", values, "goodsNote");
            return (Criteria) this;
        }

        public Criteria andGoodsNoteNotIn(List<String> values) {
            addCriterion("goods_note not in", values, "goodsNote");
            return (Criteria) this;
        }

        public Criteria andGoodsNoteBetween(String value1, String value2) {
            addCriterion("goods_note between", value1, value2, "goodsNote");
            return (Criteria) this;
        }

        public Criteria andGoodsNoteNotBetween(String value1, String value2) {
            addCriterion("goods_note not between", value1, value2, "goodsNote");
            return (Criteria) this;
        }

        public Criteria andGoodsWarnIsNull() {
            addCriterion("goods_warn is null");
            return (Criteria) this;
        }

        public Criteria andGoodsWarnIsNotNull() {
            addCriterion("goods_warn is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsWarnEqualTo(Integer value) {
            addCriterion("goods_warn =", value, "goodsWarn");
            return (Criteria) this;
        }

        public Criteria andGoodsWarnNotEqualTo(Integer value) {
            addCriterion("goods_warn <>", value, "goodsWarn");
            return (Criteria) this;
        }

        public Criteria andGoodsWarnGreaterThan(Integer value) {
            addCriterion("goods_warn >", value, "goodsWarn");
            return (Criteria) this;
        }

        public Criteria andGoodsWarnGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_warn >=", value, "goodsWarn");
            return (Criteria) this;
        }

        public Criteria andGoodsWarnLessThan(Integer value) {
            addCriterion("goods_warn <", value, "goodsWarn");
            return (Criteria) this;
        }

        public Criteria andGoodsWarnLessThanOrEqualTo(Integer value) {
            addCriterion("goods_warn <=", value, "goodsWarn");
            return (Criteria) this;
        }

        public Criteria andGoodsWarnIn(List<Integer> values) {
            addCriterion("goods_warn in", values, "goodsWarn");
            return (Criteria) this;
        }

        public Criteria andGoodsWarnNotIn(List<Integer> values) {
            addCriterion("goods_warn not in", values, "goodsWarn");
            return (Criteria) this;
        }

        public Criteria andGoodsWarnBetween(Integer value1, Integer value2) {
            addCriterion("goods_warn between", value1, value2, "goodsWarn");
            return (Criteria) this;
        }

        public Criteria andGoodsWarnNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_warn not between", value1, value2, "goodsWarn");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}