package com.sam.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReceiptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReceiptExample() {
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

        public Criteria andReceCreatetimeIsNull() {
            addCriterion("rece_createtime is null");
            return (Criteria) this;
        }

        public Criteria andReceCreatetimeIsNotNull() {
            addCriterion("rece_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andReceCreatetimeEqualTo(Date value) {
            addCriterion("rece_createtime =", value, "receCreatetime");
            return (Criteria) this;
        }

        public Criteria andReceCreatetimeNotEqualTo(Date value) {
            addCriterion("rece_createtime <>", value, "receCreatetime");
            return (Criteria) this;
        }

        public Criteria andReceCreatetimeGreaterThan(Date value) {
            addCriterion("rece_createtime >", value, "receCreatetime");
            return (Criteria) this;
        }

        public Criteria andReceCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("rece_createtime >=", value, "receCreatetime");
            return (Criteria) this;
        }

        public Criteria andReceCreatetimeLessThan(Date value) {
            addCriterion("rece_createtime <", value, "receCreatetime");
            return (Criteria) this;
        }

        public Criteria andReceCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("rece_createtime <=", value, "receCreatetime");
            return (Criteria) this;
        }

        public Criteria andReceCreatetimeIn(List<Date> values) {
            addCriterion("rece_createtime in", values, "receCreatetime");
            return (Criteria) this;
        }

        public Criteria andReceCreatetimeNotIn(List<Date> values) {
            addCriterion("rece_createtime not in", values, "receCreatetime");
            return (Criteria) this;
        }

        public Criteria andReceCreatetimeBetween(Date value1, Date value2) {
            addCriterion("rece_createtime between", value1, value2, "receCreatetime");
            return (Criteria) this;
        }

        public Criteria andReceCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("rece_createtime not between", value1, value2, "receCreatetime");
            return (Criteria) this;
        }

        public Criteria andReceSuppIdIsNull() {
            addCriterion("rece_supp_id is null");
            return (Criteria) this;
        }

        public Criteria andReceSuppIdIsNotNull() {
            addCriterion("rece_supp_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceSuppIdEqualTo(Integer value) {
            addCriterion("rece_supp_id =", value, "receSuppId");
            return (Criteria) this;
        }

        public Criteria andReceSuppIdNotEqualTo(Integer value) {
            addCriterion("rece_supp_id <>", value, "receSuppId");
            return (Criteria) this;
        }

        public Criteria andReceSuppIdGreaterThan(Integer value) {
            addCriterion("rece_supp_id >", value, "receSuppId");
            return (Criteria) this;
        }

        public Criteria andReceSuppIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rece_supp_id >=", value, "receSuppId");
            return (Criteria) this;
        }

        public Criteria andReceSuppIdLessThan(Integer value) {
            addCriterion("rece_supp_id <", value, "receSuppId");
            return (Criteria) this;
        }

        public Criteria andReceSuppIdLessThanOrEqualTo(Integer value) {
            addCriterion("rece_supp_id <=", value, "receSuppId");
            return (Criteria) this;
        }

        public Criteria andReceSuppIdIn(List<Integer> values) {
            addCriterion("rece_supp_id in", values, "receSuppId");
            return (Criteria) this;
        }

        public Criteria andReceSuppIdNotIn(List<Integer> values) {
            addCriterion("rece_supp_id not in", values, "receSuppId");
            return (Criteria) this;
        }

        public Criteria andReceSuppIdBetween(Integer value1, Integer value2) {
            addCriterion("rece_supp_id between", value1, value2, "receSuppId");
            return (Criteria) this;
        }

        public Criteria andReceSuppIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rece_supp_id not between", value1, value2, "receSuppId");
            return (Criteria) this;
        }

        public Criteria andReceUserIdIsNull() {
            addCriterion("rece_user_id is null");
            return (Criteria) this;
        }

        public Criteria andReceUserIdIsNotNull() {
            addCriterion("rece_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceUserIdEqualTo(Integer value) {
            addCriterion("rece_user_id =", value, "receUserId");
            return (Criteria) this;
        }

        public Criteria andReceUserIdNotEqualTo(Integer value) {
            addCriterion("rece_user_id <>", value, "receUserId");
            return (Criteria) this;
        }

        public Criteria andReceUserIdGreaterThan(Integer value) {
            addCriterion("rece_user_id >", value, "receUserId");
            return (Criteria) this;
        }

        public Criteria andReceUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rece_user_id >=", value, "receUserId");
            return (Criteria) this;
        }

        public Criteria andReceUserIdLessThan(Integer value) {
            addCriterion("rece_user_id <", value, "receUserId");
            return (Criteria) this;
        }

        public Criteria andReceUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("rece_user_id <=", value, "receUserId");
            return (Criteria) this;
        }

        public Criteria andReceUserIdIn(List<Integer> values) {
            addCriterion("rece_user_id in", values, "receUserId");
            return (Criteria) this;
        }

        public Criteria andReceUserIdNotIn(List<Integer> values) {
            addCriterion("rece_user_id not in", values, "receUserId");
            return (Criteria) this;
        }

        public Criteria andReceUserIdBetween(Integer value1, Integer value2) {
            addCriterion("rece_user_id between", value1, value2, "receUserId");
            return (Criteria) this;
        }

        public Criteria andReceUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rece_user_id not between", value1, value2, "receUserId");
            return (Criteria) this;
        }

        public Criteria andReceSumIsNull() {
            addCriterion("rece_sum is null");
            return (Criteria) this;
        }

        public Criteria andReceSumIsNotNull() {
            addCriterion("rece_sum is not null");
            return (Criteria) this;
        }

        public Criteria andReceSumEqualTo(BigDecimal value) {
            addCriterion("rece_sum =", value, "receSum");
            return (Criteria) this;
        }

        public Criteria andReceSumNotEqualTo(BigDecimal value) {
            addCriterion("rece_sum <>", value, "receSum");
            return (Criteria) this;
        }

        public Criteria andReceSumGreaterThan(BigDecimal value) {
            addCriterion("rece_sum >", value, "receSum");
            return (Criteria) this;
        }

        public Criteria andReceSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rece_sum >=", value, "receSum");
            return (Criteria) this;
        }

        public Criteria andReceSumLessThan(BigDecimal value) {
            addCriterion("rece_sum <", value, "receSum");
            return (Criteria) this;
        }

        public Criteria andReceSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rece_sum <=", value, "receSum");
            return (Criteria) this;
        }

        public Criteria andReceSumIn(List<BigDecimal> values) {
            addCriterion("rece_sum in", values, "receSum");
            return (Criteria) this;
        }

        public Criteria andReceSumNotIn(List<BigDecimal> values) {
            addCriterion("rece_sum not in", values, "receSum");
            return (Criteria) this;
        }

        public Criteria andReceSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rece_sum between", value1, value2, "receSum");
            return (Criteria) this;
        }

        public Criteria andReceSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rece_sum not between", value1, value2, "receSum");
            return (Criteria) this;
        }

        public Criteria andReceStateIsNull() {
            addCriterion("rece_state is null");
            return (Criteria) this;
        }

        public Criteria andReceStateIsNotNull() {
            addCriterion("rece_state is not null");
            return (Criteria) this;
        }

        public Criteria andReceStateEqualTo(Integer value) {
            addCriterion("rece_state =", value, "receState");
            return (Criteria) this;
        }

        public Criteria andReceStateNotEqualTo(Integer value) {
            addCriterion("rece_state <>", value, "receState");
            return (Criteria) this;
        }

        public Criteria andReceStateGreaterThan(Integer value) {
            addCriterion("rece_state >", value, "receState");
            return (Criteria) this;
        }

        public Criteria andReceStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("rece_state >=", value, "receState");
            return (Criteria) this;
        }

        public Criteria andReceStateLessThan(Integer value) {
            addCriterion("rece_state <", value, "receState");
            return (Criteria) this;
        }

        public Criteria andReceStateLessThanOrEqualTo(Integer value) {
            addCriterion("rece_state <=", value, "receState");
            return (Criteria) this;
        }

        public Criteria andReceStateIn(List<Integer> values) {
            addCriterion("rece_state in", values, "receState");
            return (Criteria) this;
        }

        public Criteria andReceStateNotIn(List<Integer> values) {
            addCriterion("rece_state not in", values, "receState");
            return (Criteria) this;
        }

        public Criteria andReceStateBetween(Integer value1, Integer value2) {
            addCriterion("rece_state between", value1, value2, "receState");
            return (Criteria) this;
        }

        public Criteria andReceStateNotBetween(Integer value1, Integer value2) {
            addCriterion("rece_state not between", value1, value2, "receState");
            return (Criteria) this;
        }

        public Criteria andReceNoteIsNull() {
            addCriterion("rece_note is null");
            return (Criteria) this;
        }

        public Criteria andReceNoteIsNotNull() {
            addCriterion("rece_note is not null");
            return (Criteria) this;
        }

        public Criteria andReceNoteEqualTo(String value) {
            addCriterion("rece_note =", value, "receNote");
            return (Criteria) this;
        }

        public Criteria andReceNoteNotEqualTo(String value) {
            addCriterion("rece_note <>", value, "receNote");
            return (Criteria) this;
        }

        public Criteria andReceNoteGreaterThan(String value) {
            addCriterion("rece_note >", value, "receNote");
            return (Criteria) this;
        }

        public Criteria andReceNoteGreaterThanOrEqualTo(String value) {
            addCriterion("rece_note >=", value, "receNote");
            return (Criteria) this;
        }

        public Criteria andReceNoteLessThan(String value) {
            addCriterion("rece_note <", value, "receNote");
            return (Criteria) this;
        }

        public Criteria andReceNoteLessThanOrEqualTo(String value) {
            addCriterion("rece_note <=", value, "receNote");
            return (Criteria) this;
        }

        public Criteria andReceNoteLike(String value) {
            addCriterion("rece_note like", value, "receNote");
            return (Criteria) this;
        }

        public Criteria andReceNoteNotLike(String value) {
            addCriterion("rece_note not like", value, "receNote");
            return (Criteria) this;
        }

        public Criteria andReceNoteIn(List<String> values) {
            addCriterion("rece_note in", values, "receNote");
            return (Criteria) this;
        }

        public Criteria andReceNoteNotIn(List<String> values) {
            addCriterion("rece_note not in", values, "receNote");
            return (Criteria) this;
        }

        public Criteria andReceNoteBetween(String value1, String value2) {
            addCriterion("rece_note between", value1, value2, "receNote");
            return (Criteria) this;
        }

        public Criteria andReceNoteNotBetween(String value1, String value2) {
            addCriterion("rece_note not between", value1, value2, "receNote");
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