package com.sam.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Integer value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Integer value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Integer value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Integer value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Integer> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Integer> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andReceIdIsNull() {
            addCriterion("rece_id is null");
            return (Criteria) this;
        }

        public Criteria andReceIdIsNotNull() {
            addCriterion("rece_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceIdEqualTo(Integer value) {
            addCriterion("rece_id =", value, "receId");
            return (Criteria) this;
        }

        public Criteria andReceIdNotEqualTo(Integer value) {
            addCriterion("rece_id <>", value, "receId");
            return (Criteria) this;
        }

        public Criteria andReceIdGreaterThan(Integer value) {
            addCriterion("rece_id >", value, "receId");
            return (Criteria) this;
        }

        public Criteria andReceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rece_id >=", value, "receId");
            return (Criteria) this;
        }

        public Criteria andReceIdLessThan(Integer value) {
            addCriterion("rece_id <", value, "receId");
            return (Criteria) this;
        }

        public Criteria andReceIdLessThanOrEqualTo(Integer value) {
            addCriterion("rece_id <=", value, "receId");
            return (Criteria) this;
        }

        public Criteria andReceIdIn(List<Integer> values) {
            addCriterion("rece_id in", values, "receId");
            return (Criteria) this;
        }

        public Criteria andReceIdNotIn(List<Integer> values) {
            addCriterion("rece_id not in", values, "receId");
            return (Criteria) this;
        }

        public Criteria andReceIdBetween(Integer value1, Integer value2) {
            addCriterion("rece_id between", value1, value2, "receId");
            return (Criteria) this;
        }

        public Criteria andReceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rece_id not between", value1, value2, "receId");
            return (Criteria) this;
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

        public Criteria andReceNumIsNull() {
            addCriterion("rece_num is null");
            return (Criteria) this;
        }

        public Criteria andReceNumIsNotNull() {
            addCriterion("rece_num is not null");
            return (Criteria) this;
        }

        public Criteria andReceNumEqualTo(Integer value) {
            addCriterion("rece_num =", value, "receNum");
            return (Criteria) this;
        }

        public Criteria andReceNumNotEqualTo(Integer value) {
            addCriterion("rece_num <>", value, "receNum");
            return (Criteria) this;
        }

        public Criteria andReceNumGreaterThan(Integer value) {
            addCriterion("rece_num >", value, "receNum");
            return (Criteria) this;
        }

        public Criteria andReceNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("rece_num >=", value, "receNum");
            return (Criteria) this;
        }

        public Criteria andReceNumLessThan(Integer value) {
            addCriterion("rece_num <", value, "receNum");
            return (Criteria) this;
        }

        public Criteria andReceNumLessThanOrEqualTo(Integer value) {
            addCriterion("rece_num <=", value, "receNum");
            return (Criteria) this;
        }

        public Criteria andReceNumIn(List<Integer> values) {
            addCriterion("rece_num in", values, "receNum");
            return (Criteria) this;
        }

        public Criteria andReceNumNotIn(List<Integer> values) {
            addCriterion("rece_num not in", values, "receNum");
            return (Criteria) this;
        }

        public Criteria andReceNumBetween(Integer value1, Integer value2) {
            addCriterion("rece_num between", value1, value2, "receNum");
            return (Criteria) this;
        }

        public Criteria andReceNumNotBetween(Integer value1, Integer value2) {
            addCriterion("rece_num not between", value1, value2, "receNum");
            return (Criteria) this;
        }

        public Criteria andRecePriceIsNull() {
            addCriterion("rece_price is null");
            return (Criteria) this;
        }

        public Criteria andRecePriceIsNotNull() {
            addCriterion("rece_price is not null");
            return (Criteria) this;
        }

        public Criteria andRecePriceEqualTo(BigDecimal value) {
            addCriterion("rece_price =", value, "recePrice");
            return (Criteria) this;
        }

        public Criteria andRecePriceNotEqualTo(BigDecimal value) {
            addCriterion("rece_price <>", value, "recePrice");
            return (Criteria) this;
        }

        public Criteria andRecePriceGreaterThan(BigDecimal value) {
            addCriterion("rece_price >", value, "recePrice");
            return (Criteria) this;
        }

        public Criteria andRecePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rece_price >=", value, "recePrice");
            return (Criteria) this;
        }

        public Criteria andRecePriceLessThan(BigDecimal value) {
            addCriterion("rece_price <", value, "recePrice");
            return (Criteria) this;
        }

        public Criteria andRecePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rece_price <=", value, "recePrice");
            return (Criteria) this;
        }

        public Criteria andRecePriceIn(List<BigDecimal> values) {
            addCriterion("rece_price in", values, "recePrice");
            return (Criteria) this;
        }

        public Criteria andRecePriceNotIn(List<BigDecimal> values) {
            addCriterion("rece_price not in", values, "recePrice");
            return (Criteria) this;
        }

        public Criteria andRecePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rece_price between", value1, value2, "recePrice");
            return (Criteria) this;
        }

        public Criteria andRecePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rece_price not between", value1, value2, "recePrice");
            return (Criteria) this;
        }

        public Criteria andFreshIsNull() {
            addCriterion("fresh is null");
            return (Criteria) this;
        }

        public Criteria andFreshIsNotNull() {
            addCriterion("fresh is not null");
            return (Criteria) this;
        }

        public Criteria andFreshEqualTo(Date value) {
            addCriterionForJDBCDate("fresh =", value, "fresh");
            return (Criteria) this;
        }

        public Criteria andFreshNotEqualTo(Date value) {
            addCriterionForJDBCDate("fresh <>", value, "fresh");
            return (Criteria) this;
        }

        public Criteria andFreshGreaterThan(Date value) {
            addCriterionForJDBCDate("fresh >", value, "fresh");
            return (Criteria) this;
        }

        public Criteria andFreshGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fresh >=", value, "fresh");
            return (Criteria) this;
        }

        public Criteria andFreshLessThan(Date value) {
            addCriterionForJDBCDate("fresh <", value, "fresh");
            return (Criteria) this;
        }

        public Criteria andFreshLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fresh <=", value, "fresh");
            return (Criteria) this;
        }

        public Criteria andFreshIn(List<Date> values) {
            addCriterionForJDBCDate("fresh in", values, "fresh");
            return (Criteria) this;
        }

        public Criteria andFreshNotIn(List<Date> values) {
            addCriterionForJDBCDate("fresh not in", values, "fresh");
            return (Criteria) this;
        }

        public Criteria andFreshBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fresh between", value1, value2, "fresh");
            return (Criteria) this;
        }

        public Criteria andFreshNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fresh not between", value1, value2, "fresh");
            return (Criteria) this;
        }

        public Criteria andRemainIsNull() {
            addCriterion("remain is null");
            return (Criteria) this;
        }

        public Criteria andRemainIsNotNull() {
            addCriterion("remain is not null");
            return (Criteria) this;
        }

        public Criteria andRemainEqualTo(Integer value) {
            addCriterion("remain =", value, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainNotEqualTo(Integer value) {
            addCriterion("remain <>", value, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainGreaterThan(Integer value) {
            addCriterion("remain >", value, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainGreaterThanOrEqualTo(Integer value) {
            addCriterion("remain >=", value, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainLessThan(Integer value) {
            addCriterion("remain <", value, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainLessThanOrEqualTo(Integer value) {
            addCriterion("remain <=", value, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainIn(List<Integer> values) {
            addCriterion("remain in", values, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainNotIn(List<Integer> values) {
            addCriterion("remain not in", values, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainBetween(Integer value1, Integer value2) {
            addCriterion("remain between", value1, value2, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainNotBetween(Integer value1, Integer value2) {
            addCriterion("remain not between", value1, value2, "remain");
            return (Criteria) this;
        }

        public Criteria andSellIsNull() {
            addCriterion("sell is null");
            return (Criteria) this;
        }

        public Criteria andSellIsNotNull() {
            addCriterion("sell is not null");
            return (Criteria) this;
        }

        public Criteria andSellEqualTo(BigDecimal value) {
            addCriterion("sell =", value, "sell");
            return (Criteria) this;
        }

        public Criteria andSellNotEqualTo(BigDecimal value) {
            addCriterion("sell <>", value, "sell");
            return (Criteria) this;
        }

        public Criteria andSellGreaterThan(BigDecimal value) {
            addCriterion("sell >", value, "sell");
            return (Criteria) this;
        }

        public Criteria andSellGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sell >=", value, "sell");
            return (Criteria) this;
        }

        public Criteria andSellLessThan(BigDecimal value) {
            addCriterion("sell <", value, "sell");
            return (Criteria) this;
        }

        public Criteria andSellLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sell <=", value, "sell");
            return (Criteria) this;
        }

        public Criteria andSellIn(List<BigDecimal> values) {
            addCriterion("sell in", values, "sell");
            return (Criteria) this;
        }

        public Criteria andSellNotIn(List<BigDecimal> values) {
            addCriterion("sell not in", values, "sell");
            return (Criteria) this;
        }

        public Criteria andSellBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sell between", value1, value2, "sell");
            return (Criteria) this;
        }

        public Criteria andSellNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sell not between", value1, value2, "sell");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
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