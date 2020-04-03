package com.sam.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ReceDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReceDetailExample() {
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

        public Criteria andDetaIdIsNull() {
            addCriterion("deta_id is null");
            return (Criteria) this;
        }

        public Criteria andDetaIdIsNotNull() {
            addCriterion("deta_id is not null");
            return (Criteria) this;
        }

        public Criteria andDetaIdEqualTo(Integer value) {
            addCriterion("deta_id =", value, "detaId");
            return (Criteria) this;
        }

        public Criteria andDetaIdNotEqualTo(Integer value) {
            addCriterion("deta_id <>", value, "detaId");
            return (Criteria) this;
        }

        public Criteria andDetaIdGreaterThan(Integer value) {
            addCriterion("deta_id >", value, "detaId");
            return (Criteria) this;
        }

        public Criteria andDetaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("deta_id >=", value, "detaId");
            return (Criteria) this;
        }

        public Criteria andDetaIdLessThan(Integer value) {
            addCriterion("deta_id <", value, "detaId");
            return (Criteria) this;
        }

        public Criteria andDetaIdLessThanOrEqualTo(Integer value) {
            addCriterion("deta_id <=", value, "detaId");
            return (Criteria) this;
        }

        public Criteria andDetaIdIn(List<Integer> values) {
            addCriterion("deta_id in", values, "detaId");
            return (Criteria) this;
        }

        public Criteria andDetaIdNotIn(List<Integer> values) {
            addCriterion("deta_id not in", values, "detaId");
            return (Criteria) this;
        }

        public Criteria andDetaIdBetween(Integer value1, Integer value2) {
            addCriterion("deta_id between", value1, value2, "detaId");
            return (Criteria) this;
        }

        public Criteria andDetaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("deta_id not between", value1, value2, "detaId");
            return (Criteria) this;
        }

        public Criteria andDetaReceIdIsNull() {
            addCriterion("deta_rece_id is null");
            return (Criteria) this;
        }

        public Criteria andDetaReceIdIsNotNull() {
            addCriterion("deta_rece_id is not null");
            return (Criteria) this;
        }

        public Criteria andDetaReceIdEqualTo(Integer value) {
            addCriterion("deta_rece_id =", value, "detaReceId");
            return (Criteria) this;
        }

        public Criteria andDetaReceIdNotEqualTo(Integer value) {
            addCriterion("deta_rece_id <>", value, "detaReceId");
            return (Criteria) this;
        }

        public Criteria andDetaReceIdGreaterThan(Integer value) {
            addCriterion("deta_rece_id >", value, "detaReceId");
            return (Criteria) this;
        }

        public Criteria andDetaReceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("deta_rece_id >=", value, "detaReceId");
            return (Criteria) this;
        }

        public Criteria andDetaReceIdLessThan(Integer value) {
            addCriterion("deta_rece_id <", value, "detaReceId");
            return (Criteria) this;
        }

        public Criteria andDetaReceIdLessThanOrEqualTo(Integer value) {
            addCriterion("deta_rece_id <=", value, "detaReceId");
            return (Criteria) this;
        }

        public Criteria andDetaReceIdIn(List<Integer> values) {
            addCriterion("deta_rece_id in", values, "detaReceId");
            return (Criteria) this;
        }

        public Criteria andDetaReceIdNotIn(List<Integer> values) {
            addCriterion("deta_rece_id not in", values, "detaReceId");
            return (Criteria) this;
        }

        public Criteria andDetaReceIdBetween(Integer value1, Integer value2) {
            addCriterion("deta_rece_id between", value1, value2, "detaReceId");
            return (Criteria) this;
        }

        public Criteria andDetaReceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("deta_rece_id not between", value1, value2, "detaReceId");
            return (Criteria) this;
        }

        public Criteria andDetaGoodsIdIsNull() {
            addCriterion("deta_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andDetaGoodsIdIsNotNull() {
            addCriterion("deta_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andDetaGoodsIdEqualTo(Integer value) {
            addCriterion("deta_goods_id =", value, "detaGoodsId");
            return (Criteria) this;
        }

        public Criteria andDetaGoodsIdNotEqualTo(Integer value) {
            addCriterion("deta_goods_id <>", value, "detaGoodsId");
            return (Criteria) this;
        }

        public Criteria andDetaGoodsIdGreaterThan(Integer value) {
            addCriterion("deta_goods_id >", value, "detaGoodsId");
            return (Criteria) this;
        }

        public Criteria andDetaGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("deta_goods_id >=", value, "detaGoodsId");
            return (Criteria) this;
        }

        public Criteria andDetaGoodsIdLessThan(Integer value) {
            addCriterion("deta_goods_id <", value, "detaGoodsId");
            return (Criteria) this;
        }

        public Criteria andDetaGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("deta_goods_id <=", value, "detaGoodsId");
            return (Criteria) this;
        }

        public Criteria andDetaGoodsIdIn(List<Integer> values) {
            addCriterion("deta_goods_id in", values, "detaGoodsId");
            return (Criteria) this;
        }

        public Criteria andDetaGoodsIdNotIn(List<Integer> values) {
            addCriterion("deta_goods_id not in", values, "detaGoodsId");
            return (Criteria) this;
        }

        public Criteria andDetaGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("deta_goods_id between", value1, value2, "detaGoodsId");
            return (Criteria) this;
        }

        public Criteria andDetaGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("deta_goods_id not between", value1, value2, "detaGoodsId");
            return (Criteria) this;
        }

        public Criteria andDetaNumIsNull() {
            addCriterion("deta_num is null");
            return (Criteria) this;
        }

        public Criteria andDetaNumIsNotNull() {
            addCriterion("deta_num is not null");
            return (Criteria) this;
        }

        public Criteria andDetaNumEqualTo(Integer value) {
            addCriterion("deta_num =", value, "detaNum");
            return (Criteria) this;
        }

        public Criteria andDetaNumNotEqualTo(Integer value) {
            addCriterion("deta_num <>", value, "detaNum");
            return (Criteria) this;
        }

        public Criteria andDetaNumGreaterThan(Integer value) {
            addCriterion("deta_num >", value, "detaNum");
            return (Criteria) this;
        }

        public Criteria andDetaNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("deta_num >=", value, "detaNum");
            return (Criteria) this;
        }

        public Criteria andDetaNumLessThan(Integer value) {
            addCriterion("deta_num <", value, "detaNum");
            return (Criteria) this;
        }

        public Criteria andDetaNumLessThanOrEqualTo(Integer value) {
            addCriterion("deta_num <=", value, "detaNum");
            return (Criteria) this;
        }

        public Criteria andDetaNumIn(List<Integer> values) {
            addCriterion("deta_num in", values, "detaNum");
            return (Criteria) this;
        }

        public Criteria andDetaNumNotIn(List<Integer> values) {
            addCriterion("deta_num not in", values, "detaNum");
            return (Criteria) this;
        }

        public Criteria andDetaNumBetween(Integer value1, Integer value2) {
            addCriterion("deta_num between", value1, value2, "detaNum");
            return (Criteria) this;
        }

        public Criteria andDetaNumNotBetween(Integer value1, Integer value2) {
            addCriterion("deta_num not between", value1, value2, "detaNum");
            return (Criteria) this;
        }

        public Criteria andDetaPriceIsNull() {
            addCriterion("deta_price is null");
            return (Criteria) this;
        }

        public Criteria andDetaPriceIsNotNull() {
            addCriterion("deta_price is not null");
            return (Criteria) this;
        }

        public Criteria andDetaPriceEqualTo(BigDecimal value) {
            addCriterion("deta_price =", value, "detaPrice");
            return (Criteria) this;
        }

        public Criteria andDetaPriceNotEqualTo(BigDecimal value) {
            addCriterion("deta_price <>", value, "detaPrice");
            return (Criteria) this;
        }

        public Criteria andDetaPriceGreaterThan(BigDecimal value) {
            addCriterion("deta_price >", value, "detaPrice");
            return (Criteria) this;
        }

        public Criteria andDetaPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("deta_price >=", value, "detaPrice");
            return (Criteria) this;
        }

        public Criteria andDetaPriceLessThan(BigDecimal value) {
            addCriterion("deta_price <", value, "detaPrice");
            return (Criteria) this;
        }

        public Criteria andDetaPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("deta_price <=", value, "detaPrice");
            return (Criteria) this;
        }

        public Criteria andDetaPriceIn(List<BigDecimal> values) {
            addCriterion("deta_price in", values, "detaPrice");
            return (Criteria) this;
        }

        public Criteria andDetaPriceNotIn(List<BigDecimal> values) {
            addCriterion("deta_price not in", values, "detaPrice");
            return (Criteria) this;
        }

        public Criteria andDetaPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deta_price between", value1, value2, "detaPrice");
            return (Criteria) this;
        }

        public Criteria andDetaPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deta_price not between", value1, value2, "detaPrice");
            return (Criteria) this;
        }

        public Criteria andDetaFreshIsNull() {
            addCriterion("deta_fresh is null");
            return (Criteria) this;
        }

        public Criteria andDetaFreshIsNotNull() {
            addCriterion("deta_fresh is not null");
            return (Criteria) this;
        }

        public Criteria andDetaFreshEqualTo(Date value) {
            addCriterionForJDBCDate("deta_fresh =", value, "detaFresh");
            return (Criteria) this;
        }

        public Criteria andDetaFreshNotEqualTo(Date value) {
            addCriterionForJDBCDate("deta_fresh <>", value, "detaFresh");
            return (Criteria) this;
        }

        public Criteria andDetaFreshGreaterThan(Date value) {
            addCriterionForJDBCDate("deta_fresh >", value, "detaFresh");
            return (Criteria) this;
        }

        public Criteria andDetaFreshGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("deta_fresh >=", value, "detaFresh");
            return (Criteria) this;
        }

        public Criteria andDetaFreshLessThan(Date value) {
            addCriterionForJDBCDate("deta_fresh <", value, "detaFresh");
            return (Criteria) this;
        }

        public Criteria andDetaFreshLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("deta_fresh <=", value, "detaFresh");
            return (Criteria) this;
        }

        public Criteria andDetaFreshIn(List<Date> values) {
            addCriterionForJDBCDate("deta_fresh in", values, "detaFresh");
            return (Criteria) this;
        }

        public Criteria andDetaFreshNotIn(List<Date> values) {
            addCriterionForJDBCDate("deta_fresh not in", values, "detaFresh");
            return (Criteria) this;
        }

        public Criteria andDetaFreshBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("deta_fresh between", value1, value2, "detaFresh");
            return (Criteria) this;
        }

        public Criteria andDetaFreshNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("deta_fresh not between", value1, value2, "detaFresh");
            return (Criteria) this;
        }

        public Criteria andDetaSellPriceIsNull() {
            addCriterion("deta_sell_price is null");
            return (Criteria) this;
        }

        public Criteria andDetaSellPriceIsNotNull() {
            addCriterion("deta_sell_price is not null");
            return (Criteria) this;
        }

        public Criteria andDetaSellPriceEqualTo(BigDecimal value) {
            addCriterion("deta_sell_price =", value, "detaSellPrice");
            return (Criteria) this;
        }

        public Criteria andDetaSellPriceNotEqualTo(BigDecimal value) {
            addCriterion("deta_sell_price <>", value, "detaSellPrice");
            return (Criteria) this;
        }

        public Criteria andDetaSellPriceGreaterThan(BigDecimal value) {
            addCriterion("deta_sell_price >", value, "detaSellPrice");
            return (Criteria) this;
        }

        public Criteria andDetaSellPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("deta_sell_price >=", value, "detaSellPrice");
            return (Criteria) this;
        }

        public Criteria andDetaSellPriceLessThan(BigDecimal value) {
            addCriterion("deta_sell_price <", value, "detaSellPrice");
            return (Criteria) this;
        }

        public Criteria andDetaSellPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("deta_sell_price <=", value, "detaSellPrice");
            return (Criteria) this;
        }

        public Criteria andDetaSellPriceIn(List<BigDecimal> values) {
            addCriterion("deta_sell_price in", values, "detaSellPrice");
            return (Criteria) this;
        }

        public Criteria andDetaSellPriceNotIn(List<BigDecimal> values) {
            addCriterion("deta_sell_price not in", values, "detaSellPrice");
            return (Criteria) this;
        }

        public Criteria andDetaSellPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deta_sell_price between", value1, value2, "detaSellPrice");
            return (Criteria) this;
        }

        public Criteria andDetaSellPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deta_sell_price not between", value1, value2, "detaSellPrice");
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