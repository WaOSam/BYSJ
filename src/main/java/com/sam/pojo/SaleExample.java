package com.sam.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleExample() {
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

        public Criteria andSaleIdIsNull() {
            addCriterion("sale_id is null");
            return (Criteria) this;
        }

        public Criteria andSaleIdIsNotNull() {
            addCriterion("sale_id is not null");
            return (Criteria) this;
        }

        public Criteria andSaleIdEqualTo(Integer value) {
            addCriterion("sale_id =", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdNotEqualTo(Integer value) {
            addCriterion("sale_id <>", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdGreaterThan(Integer value) {
            addCriterion("sale_id >", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_id >=", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdLessThan(Integer value) {
            addCriterion("sale_id <", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdLessThanOrEqualTo(Integer value) {
            addCriterion("sale_id <=", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdIn(List<Integer> values) {
            addCriterion("sale_id in", values, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdNotIn(List<Integer> values) {
            addCriterion("sale_id not in", values, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdBetween(Integer value1, Integer value2) {
            addCriterion("sale_id between", value1, value2, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_id not between", value1, value2, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleCreatetimeIsNull() {
            addCriterion("sale_createtime is null");
            return (Criteria) this;
        }

        public Criteria andSaleCreatetimeIsNotNull() {
            addCriterion("sale_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andSaleCreatetimeEqualTo(Date value) {
            addCriterion("sale_createtime =", value, "saleCreatetime");
            return (Criteria) this;
        }

        public Criteria andSaleCreatetimeNotEqualTo(Date value) {
            addCriterion("sale_createtime <>", value, "saleCreatetime");
            return (Criteria) this;
        }

        public Criteria andSaleCreatetimeGreaterThan(Date value) {
            addCriterion("sale_createtime >", value, "saleCreatetime");
            return (Criteria) this;
        }

        public Criteria andSaleCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sale_createtime >=", value, "saleCreatetime");
            return (Criteria) this;
        }

        public Criteria andSaleCreatetimeLessThan(Date value) {
            addCriterion("sale_createtime <", value, "saleCreatetime");
            return (Criteria) this;
        }

        public Criteria andSaleCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("sale_createtime <=", value, "saleCreatetime");
            return (Criteria) this;
        }

        public Criteria andSaleCreatetimeIn(List<Date> values) {
            addCriterion("sale_createtime in", values, "saleCreatetime");
            return (Criteria) this;
        }

        public Criteria andSaleCreatetimeNotIn(List<Date> values) {
            addCriterion("sale_createtime not in", values, "saleCreatetime");
            return (Criteria) this;
        }

        public Criteria andSaleCreatetimeBetween(Date value1, Date value2) {
            addCriterion("sale_createtime between", value1, value2, "saleCreatetime");
            return (Criteria) this;
        }

        public Criteria andSaleCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("sale_createtime not between", value1, value2, "saleCreatetime");
            return (Criteria) this;
        }

        public Criteria andSaleCustIdIsNull() {
            addCriterion("sale_cust_id is null");
            return (Criteria) this;
        }

        public Criteria andSaleCustIdIsNotNull() {
            addCriterion("sale_cust_id is not null");
            return (Criteria) this;
        }

        public Criteria andSaleCustIdEqualTo(Integer value) {
            addCriterion("sale_cust_id =", value, "saleCustId");
            return (Criteria) this;
        }

        public Criteria andSaleCustIdNotEqualTo(Integer value) {
            addCriterion("sale_cust_id <>", value, "saleCustId");
            return (Criteria) this;
        }

        public Criteria andSaleCustIdGreaterThan(Integer value) {
            addCriterion("sale_cust_id >", value, "saleCustId");
            return (Criteria) this;
        }

        public Criteria andSaleCustIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_cust_id >=", value, "saleCustId");
            return (Criteria) this;
        }

        public Criteria andSaleCustIdLessThan(Integer value) {
            addCriterion("sale_cust_id <", value, "saleCustId");
            return (Criteria) this;
        }

        public Criteria andSaleCustIdLessThanOrEqualTo(Integer value) {
            addCriterion("sale_cust_id <=", value, "saleCustId");
            return (Criteria) this;
        }

        public Criteria andSaleCustIdIn(List<Integer> values) {
            addCriterion("sale_cust_id in", values, "saleCustId");
            return (Criteria) this;
        }

        public Criteria andSaleCustIdNotIn(List<Integer> values) {
            addCriterion("sale_cust_id not in", values, "saleCustId");
            return (Criteria) this;
        }

        public Criteria andSaleCustIdBetween(Integer value1, Integer value2) {
            addCriterion("sale_cust_id between", value1, value2, "saleCustId");
            return (Criteria) this;
        }

        public Criteria andSaleCustIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_cust_id not between", value1, value2, "saleCustId");
            return (Criteria) this;
        }

        public Criteria andSaleUserIdIsNull() {
            addCriterion("sale_user_id is null");
            return (Criteria) this;
        }

        public Criteria andSaleUserIdIsNotNull() {
            addCriterion("sale_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andSaleUserIdEqualTo(Integer value) {
            addCriterion("sale_user_id =", value, "saleUserId");
            return (Criteria) this;
        }

        public Criteria andSaleUserIdNotEqualTo(Integer value) {
            addCriterion("sale_user_id <>", value, "saleUserId");
            return (Criteria) this;
        }

        public Criteria andSaleUserIdGreaterThan(Integer value) {
            addCriterion("sale_user_id >", value, "saleUserId");
            return (Criteria) this;
        }

        public Criteria andSaleUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_user_id >=", value, "saleUserId");
            return (Criteria) this;
        }

        public Criteria andSaleUserIdLessThan(Integer value) {
            addCriterion("sale_user_id <", value, "saleUserId");
            return (Criteria) this;
        }

        public Criteria andSaleUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("sale_user_id <=", value, "saleUserId");
            return (Criteria) this;
        }

        public Criteria andSaleUserIdIn(List<Integer> values) {
            addCriterion("sale_user_id in", values, "saleUserId");
            return (Criteria) this;
        }

        public Criteria andSaleUserIdNotIn(List<Integer> values) {
            addCriterion("sale_user_id not in", values, "saleUserId");
            return (Criteria) this;
        }

        public Criteria andSaleUserIdBetween(Integer value1, Integer value2) {
            addCriterion("sale_user_id between", value1, value2, "saleUserId");
            return (Criteria) this;
        }

        public Criteria andSaleUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_user_id not between", value1, value2, "saleUserId");
            return (Criteria) this;
        }

        public Criteria andSaleSumIsNull() {
            addCriterion("sale_sum is null");
            return (Criteria) this;
        }

        public Criteria andSaleSumIsNotNull() {
            addCriterion("sale_sum is not null");
            return (Criteria) this;
        }

        public Criteria andSaleSumEqualTo(BigDecimal value) {
            addCriterion("sale_sum =", value, "saleSum");
            return (Criteria) this;
        }

        public Criteria andSaleSumNotEqualTo(BigDecimal value) {
            addCriterion("sale_sum <>", value, "saleSum");
            return (Criteria) this;
        }

        public Criteria andSaleSumGreaterThan(BigDecimal value) {
            addCriterion("sale_sum >", value, "saleSum");
            return (Criteria) this;
        }

        public Criteria andSaleSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_sum >=", value, "saleSum");
            return (Criteria) this;
        }

        public Criteria andSaleSumLessThan(BigDecimal value) {
            addCriterion("sale_sum <", value, "saleSum");
            return (Criteria) this;
        }

        public Criteria andSaleSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_sum <=", value, "saleSum");
            return (Criteria) this;
        }

        public Criteria andSaleSumIn(List<BigDecimal> values) {
            addCriterion("sale_sum in", values, "saleSum");
            return (Criteria) this;
        }

        public Criteria andSaleSumNotIn(List<BigDecimal> values) {
            addCriterion("sale_sum not in", values, "saleSum");
            return (Criteria) this;
        }

        public Criteria andSaleSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_sum between", value1, value2, "saleSum");
            return (Criteria) this;
        }

        public Criteria andSaleSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_sum not between", value1, value2, "saleSum");
            return (Criteria) this;
        }

        public Criteria andSaleStateIsNull() {
            addCriterion("sale_state is null");
            return (Criteria) this;
        }

        public Criteria andSaleStateIsNotNull() {
            addCriterion("sale_state is not null");
            return (Criteria) this;
        }

        public Criteria andSaleStateEqualTo(Integer value) {
            addCriterion("sale_state =", value, "saleState");
            return (Criteria) this;
        }

        public Criteria andSaleStateNotEqualTo(Integer value) {
            addCriterion("sale_state <>", value, "saleState");
            return (Criteria) this;
        }

        public Criteria andSaleStateGreaterThan(Integer value) {
            addCriterion("sale_state >", value, "saleState");
            return (Criteria) this;
        }

        public Criteria andSaleStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_state >=", value, "saleState");
            return (Criteria) this;
        }

        public Criteria andSaleStateLessThan(Integer value) {
            addCriterion("sale_state <", value, "saleState");
            return (Criteria) this;
        }

        public Criteria andSaleStateLessThanOrEqualTo(Integer value) {
            addCriterion("sale_state <=", value, "saleState");
            return (Criteria) this;
        }

        public Criteria andSaleStateIn(List<Integer> values) {
            addCriterion("sale_state in", values, "saleState");
            return (Criteria) this;
        }

        public Criteria andSaleStateNotIn(List<Integer> values) {
            addCriterion("sale_state not in", values, "saleState");
            return (Criteria) this;
        }

        public Criteria andSaleStateBetween(Integer value1, Integer value2) {
            addCriterion("sale_state between", value1, value2, "saleState");
            return (Criteria) this;
        }

        public Criteria andSaleStateNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_state not between", value1, value2, "saleState");
            return (Criteria) this;
        }

        public Criteria andSaleNoteIsNull() {
            addCriterion("sale_note is null");
            return (Criteria) this;
        }

        public Criteria andSaleNoteIsNotNull() {
            addCriterion("sale_note is not null");
            return (Criteria) this;
        }

        public Criteria andSaleNoteEqualTo(String value) {
            addCriterion("sale_note =", value, "saleNote");
            return (Criteria) this;
        }

        public Criteria andSaleNoteNotEqualTo(String value) {
            addCriterion("sale_note <>", value, "saleNote");
            return (Criteria) this;
        }

        public Criteria andSaleNoteGreaterThan(String value) {
            addCriterion("sale_note >", value, "saleNote");
            return (Criteria) this;
        }

        public Criteria andSaleNoteGreaterThanOrEqualTo(String value) {
            addCriterion("sale_note >=", value, "saleNote");
            return (Criteria) this;
        }

        public Criteria andSaleNoteLessThan(String value) {
            addCriterion("sale_note <", value, "saleNote");
            return (Criteria) this;
        }

        public Criteria andSaleNoteLessThanOrEqualTo(String value) {
            addCriterion("sale_note <=", value, "saleNote");
            return (Criteria) this;
        }

        public Criteria andSaleNoteLike(String value) {
            addCriterion("sale_note like", value, "saleNote");
            return (Criteria) this;
        }

        public Criteria andSaleNoteNotLike(String value) {
            addCriterion("sale_note not like", value, "saleNote");
            return (Criteria) this;
        }

        public Criteria andSaleNoteIn(List<String> values) {
            addCriterion("sale_note in", values, "saleNote");
            return (Criteria) this;
        }

        public Criteria andSaleNoteNotIn(List<String> values) {
            addCriterion("sale_note not in", values, "saleNote");
            return (Criteria) this;
        }

        public Criteria andSaleNoteBetween(String value1, String value2) {
            addCriterion("sale_note between", value1, value2, "saleNote");
            return (Criteria) this;
        }

        public Criteria andSaleNoteNotBetween(String value1, String value2) {
            addCriterion("sale_note not between", value1, value2, "saleNote");
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