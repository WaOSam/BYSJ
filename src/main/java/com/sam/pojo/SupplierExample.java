package com.sam.pojo;

import java.util.ArrayList;
import java.util.List;

public class SupplierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierExample() {
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

        public Criteria andSuppIdIsNull() {
            addCriterion("supp_id is null");
            return (Criteria) this;
        }

        public Criteria andSuppIdIsNotNull() {
            addCriterion("supp_id is not null");
            return (Criteria) this;
        }

        public Criteria andSuppIdEqualTo(Integer value) {
            addCriterion("supp_id =", value, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdNotEqualTo(Integer value) {
            addCriterion("supp_id <>", value, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdGreaterThan(Integer value) {
            addCriterion("supp_id >", value, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("supp_id >=", value, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdLessThan(Integer value) {
            addCriterion("supp_id <", value, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdLessThanOrEqualTo(Integer value) {
            addCriterion("supp_id <=", value, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdIn(List<Integer> values) {
            addCriterion("supp_id in", values, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdNotIn(List<Integer> values) {
            addCriterion("supp_id not in", values, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdBetween(Integer value1, Integer value2) {
            addCriterion("supp_id between", value1, value2, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdNotBetween(Integer value1, Integer value2) {
            addCriterion("supp_id not between", value1, value2, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppNameIsNull() {
            addCriterion("supp_name is null");
            return (Criteria) this;
        }

        public Criteria andSuppNameIsNotNull() {
            addCriterion("supp_name is not null");
            return (Criteria) this;
        }

        public Criteria andSuppNameEqualTo(String value) {
            addCriterion("supp_name =", value, "suppName");
            return (Criteria) this;
        }

        public Criteria andSuppNameNotEqualTo(String value) {
            addCriterion("supp_name <>", value, "suppName");
            return (Criteria) this;
        }

        public Criteria andSuppNameGreaterThan(String value) {
            addCriterion("supp_name >", value, "suppName");
            return (Criteria) this;
        }

        public Criteria andSuppNameGreaterThanOrEqualTo(String value) {
            addCriterion("supp_name >=", value, "suppName");
            return (Criteria) this;
        }

        public Criteria andSuppNameLessThan(String value) {
            addCriterion("supp_name <", value, "suppName");
            return (Criteria) this;
        }

        public Criteria andSuppNameLessThanOrEqualTo(String value) {
            addCriterion("supp_name <=", value, "suppName");
            return (Criteria) this;
        }

        public Criteria andSuppNameLike(String value) {
            addCriterion("supp_name like", value, "suppName");
            return (Criteria) this;
        }

        public Criteria andSuppNameNotLike(String value) {
            addCriterion("supp_name not like", value, "suppName");
            return (Criteria) this;
        }

        public Criteria andSuppNameIn(List<String> values) {
            addCriterion("supp_name in", values, "suppName");
            return (Criteria) this;
        }

        public Criteria andSuppNameNotIn(List<String> values) {
            addCriterion("supp_name not in", values, "suppName");
            return (Criteria) this;
        }

        public Criteria andSuppNameBetween(String value1, String value2) {
            addCriterion("supp_name between", value1, value2, "suppName");
            return (Criteria) this;
        }

        public Criteria andSuppNameNotBetween(String value1, String value2) {
            addCriterion("supp_name not between", value1, value2, "suppName");
            return (Criteria) this;
        }

        public Criteria andSuppAddressIsNull() {
            addCriterion("supp_address is null");
            return (Criteria) this;
        }

        public Criteria andSuppAddressIsNotNull() {
            addCriterion("supp_address is not null");
            return (Criteria) this;
        }

        public Criteria andSuppAddressEqualTo(String value) {
            addCriterion("supp_address =", value, "suppAddress");
            return (Criteria) this;
        }

        public Criteria andSuppAddressNotEqualTo(String value) {
            addCriterion("supp_address <>", value, "suppAddress");
            return (Criteria) this;
        }

        public Criteria andSuppAddressGreaterThan(String value) {
            addCriterion("supp_address >", value, "suppAddress");
            return (Criteria) this;
        }

        public Criteria andSuppAddressGreaterThanOrEqualTo(String value) {
            addCriterion("supp_address >=", value, "suppAddress");
            return (Criteria) this;
        }

        public Criteria andSuppAddressLessThan(String value) {
            addCriterion("supp_address <", value, "suppAddress");
            return (Criteria) this;
        }

        public Criteria andSuppAddressLessThanOrEqualTo(String value) {
            addCriterion("supp_address <=", value, "suppAddress");
            return (Criteria) this;
        }

        public Criteria andSuppAddressLike(String value) {
            addCriterion("supp_address like", value, "suppAddress");
            return (Criteria) this;
        }

        public Criteria andSuppAddressNotLike(String value) {
            addCriterion("supp_address not like", value, "suppAddress");
            return (Criteria) this;
        }

        public Criteria andSuppAddressIn(List<String> values) {
            addCriterion("supp_address in", values, "suppAddress");
            return (Criteria) this;
        }

        public Criteria andSuppAddressNotIn(List<String> values) {
            addCriterion("supp_address not in", values, "suppAddress");
            return (Criteria) this;
        }

        public Criteria andSuppAddressBetween(String value1, String value2) {
            addCriterion("supp_address between", value1, value2, "suppAddress");
            return (Criteria) this;
        }

        public Criteria andSuppAddressNotBetween(String value1, String value2) {
            addCriterion("supp_address not between", value1, value2, "suppAddress");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneIsNull() {
            addCriterion("supp_phone is null");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneIsNotNull() {
            addCriterion("supp_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneEqualTo(String value) {
            addCriterion("supp_phone =", value, "suppPhone");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneNotEqualTo(String value) {
            addCriterion("supp_phone <>", value, "suppPhone");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneGreaterThan(String value) {
            addCriterion("supp_phone >", value, "suppPhone");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("supp_phone >=", value, "suppPhone");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneLessThan(String value) {
            addCriterion("supp_phone <", value, "suppPhone");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneLessThanOrEqualTo(String value) {
            addCriterion("supp_phone <=", value, "suppPhone");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneLike(String value) {
            addCriterion("supp_phone like", value, "suppPhone");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneNotLike(String value) {
            addCriterion("supp_phone not like", value, "suppPhone");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneIn(List<String> values) {
            addCriterion("supp_phone in", values, "suppPhone");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneNotIn(List<String> values) {
            addCriterion("supp_phone not in", values, "suppPhone");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneBetween(String value1, String value2) {
            addCriterion("supp_phone between", value1, value2, "suppPhone");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneNotBetween(String value1, String value2) {
            addCriterion("supp_phone not between", value1, value2, "suppPhone");
            return (Criteria) this;
        }

        public Criteria andSuppEmailIsNull() {
            addCriterion("supp_email is null");
            return (Criteria) this;
        }

        public Criteria andSuppEmailIsNotNull() {
            addCriterion("supp_email is not null");
            return (Criteria) this;
        }

        public Criteria andSuppEmailEqualTo(String value) {
            addCriterion("supp_email =", value, "suppEmail");
            return (Criteria) this;
        }

        public Criteria andSuppEmailNotEqualTo(String value) {
            addCriterion("supp_email <>", value, "suppEmail");
            return (Criteria) this;
        }

        public Criteria andSuppEmailGreaterThan(String value) {
            addCriterion("supp_email >", value, "suppEmail");
            return (Criteria) this;
        }

        public Criteria andSuppEmailGreaterThanOrEqualTo(String value) {
            addCriterion("supp_email >=", value, "suppEmail");
            return (Criteria) this;
        }

        public Criteria andSuppEmailLessThan(String value) {
            addCriterion("supp_email <", value, "suppEmail");
            return (Criteria) this;
        }

        public Criteria andSuppEmailLessThanOrEqualTo(String value) {
            addCriterion("supp_email <=", value, "suppEmail");
            return (Criteria) this;
        }

        public Criteria andSuppEmailLike(String value) {
            addCriterion("supp_email like", value, "suppEmail");
            return (Criteria) this;
        }

        public Criteria andSuppEmailNotLike(String value) {
            addCriterion("supp_email not like", value, "suppEmail");
            return (Criteria) this;
        }

        public Criteria andSuppEmailIn(List<String> values) {
            addCriterion("supp_email in", values, "suppEmail");
            return (Criteria) this;
        }

        public Criteria andSuppEmailNotIn(List<String> values) {
            addCriterion("supp_email not in", values, "suppEmail");
            return (Criteria) this;
        }

        public Criteria andSuppEmailBetween(String value1, String value2) {
            addCriterion("supp_email between", value1, value2, "suppEmail");
            return (Criteria) this;
        }

        public Criteria andSuppEmailNotBetween(String value1, String value2) {
            addCriterion("supp_email not between", value1, value2, "suppEmail");
            return (Criteria) this;
        }

        public Criteria andSuppBankIsNull() {
            addCriterion("supp_bank is null");
            return (Criteria) this;
        }

        public Criteria andSuppBankIsNotNull() {
            addCriterion("supp_bank is not null");
            return (Criteria) this;
        }

        public Criteria andSuppBankEqualTo(String value) {
            addCriterion("supp_bank =", value, "suppBank");
            return (Criteria) this;
        }

        public Criteria andSuppBankNotEqualTo(String value) {
            addCriterion("supp_bank <>", value, "suppBank");
            return (Criteria) this;
        }

        public Criteria andSuppBankGreaterThan(String value) {
            addCriterion("supp_bank >", value, "suppBank");
            return (Criteria) this;
        }

        public Criteria andSuppBankGreaterThanOrEqualTo(String value) {
            addCriterion("supp_bank >=", value, "suppBank");
            return (Criteria) this;
        }

        public Criteria andSuppBankLessThan(String value) {
            addCriterion("supp_bank <", value, "suppBank");
            return (Criteria) this;
        }

        public Criteria andSuppBankLessThanOrEqualTo(String value) {
            addCriterion("supp_bank <=", value, "suppBank");
            return (Criteria) this;
        }

        public Criteria andSuppBankLike(String value) {
            addCriterion("supp_bank like", value, "suppBank");
            return (Criteria) this;
        }

        public Criteria andSuppBankNotLike(String value) {
            addCriterion("supp_bank not like", value, "suppBank");
            return (Criteria) this;
        }

        public Criteria andSuppBankIn(List<String> values) {
            addCriterion("supp_bank in", values, "suppBank");
            return (Criteria) this;
        }

        public Criteria andSuppBankNotIn(List<String> values) {
            addCriterion("supp_bank not in", values, "suppBank");
            return (Criteria) this;
        }

        public Criteria andSuppBankBetween(String value1, String value2) {
            addCriterion("supp_bank between", value1, value2, "suppBank");
            return (Criteria) this;
        }

        public Criteria andSuppBankNotBetween(String value1, String value2) {
            addCriterion("supp_bank not between", value1, value2, "suppBank");
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