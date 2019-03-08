package com.chen.medicine_mall.pojo;

import java.util.ArrayList;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExample() {
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

        public Criteria andAnoIsNull() {
            addCriterion("ano is null");
            return (Criteria) this;
        }

        public Criteria andAnoIsNotNull() {
            addCriterion("ano is not null");
            return (Criteria) this;
        }

        public Criteria andAnoEqualTo(String value) {
            addCriterion("ano =", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoNotEqualTo(String value) {
            addCriterion("ano <>", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoGreaterThan(String value) {
            addCriterion("ano >", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoGreaterThanOrEqualTo(String value) {
            addCriterion("ano >=", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoLessThan(String value) {
            addCriterion("ano <", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoLessThanOrEqualTo(String value) {
            addCriterion("ano <=", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoLike(String value) {
            addCriterion("ano like", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoNotLike(String value) {
            addCriterion("ano not like", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoIn(List<String> values) {
            addCriterion("ano in", values, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoNotIn(List<String> values) {
            addCriterion("ano not in", values, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoBetween(String value1, String value2) {
            addCriterion("ano between", value1, value2, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoNotBetween(String value1, String value2) {
            addCriterion("ano not between", value1, value2, "ano");
            return (Criteria) this;
        }

        public Criteria andAnameIsNull() {
            addCriterion("aname is null");
            return (Criteria) this;
        }

        public Criteria andAnameIsNotNull() {
            addCriterion("aname is not null");
            return (Criteria) this;
        }

        public Criteria andAnameEqualTo(String value) {
            addCriterion("aname =", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotEqualTo(String value) {
            addCriterion("aname <>", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameGreaterThan(String value) {
            addCriterion("aname >", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameGreaterThanOrEqualTo(String value) {
            addCriterion("aname >=", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLessThan(String value) {
            addCriterion("aname <", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLessThanOrEqualTo(String value) {
            addCriterion("aname <=", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLike(String value) {
            addCriterion("aname like", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotLike(String value) {
            addCriterion("aname not like", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameIn(List<String> values) {
            addCriterion("aname in", values, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotIn(List<String> values) {
            addCriterion("aname not in", values, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameBetween(String value1, String value2) {
            addCriterion("aname between", value1, value2, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotBetween(String value1, String value2) {
            addCriterion("aname not between", value1, value2, "aname");
            return (Criteria) this;
        }

        public Criteria andAsexIsNull() {
            addCriterion("asex is null");
            return (Criteria) this;
        }

        public Criteria andAsexIsNotNull() {
            addCriterion("asex is not null");
            return (Criteria) this;
        }

        public Criteria andAsexEqualTo(String value) {
            addCriterion("asex =", value, "asex");
            return (Criteria) this;
        }

        public Criteria andAsexNotEqualTo(String value) {
            addCriterion("asex <>", value, "asex");
            return (Criteria) this;
        }

        public Criteria andAsexGreaterThan(String value) {
            addCriterion("asex >", value, "asex");
            return (Criteria) this;
        }

        public Criteria andAsexGreaterThanOrEqualTo(String value) {
            addCriterion("asex >=", value, "asex");
            return (Criteria) this;
        }

        public Criteria andAsexLessThan(String value) {
            addCriterion("asex <", value, "asex");
            return (Criteria) this;
        }

        public Criteria andAsexLessThanOrEqualTo(String value) {
            addCriterion("asex <=", value, "asex");
            return (Criteria) this;
        }

        public Criteria andAsexLike(String value) {
            addCriterion("asex like", value, "asex");
            return (Criteria) this;
        }

        public Criteria andAsexNotLike(String value) {
            addCriterion("asex not like", value, "asex");
            return (Criteria) this;
        }

        public Criteria andAsexIn(List<String> values) {
            addCriterion("asex in", values, "asex");
            return (Criteria) this;
        }

        public Criteria andAsexNotIn(List<String> values) {
            addCriterion("asex not in", values, "asex");
            return (Criteria) this;
        }

        public Criteria andAsexBetween(String value1, String value2) {
            addCriterion("asex between", value1, value2, "asex");
            return (Criteria) this;
        }

        public Criteria andAsexNotBetween(String value1, String value2) {
            addCriterion("asex not between", value1, value2, "asex");
            return (Criteria) this;
        }

        public Criteria andAageIsNull() {
            addCriterion("aage is null");
            return (Criteria) this;
        }

        public Criteria andAageIsNotNull() {
            addCriterion("aage is not null");
            return (Criteria) this;
        }

        public Criteria andAageEqualTo(Integer value) {
            addCriterion("aage =", value, "aage");
            return (Criteria) this;
        }

        public Criteria andAageNotEqualTo(Integer value) {
            addCriterion("aage <>", value, "aage");
            return (Criteria) this;
        }

        public Criteria andAageGreaterThan(Integer value) {
            addCriterion("aage >", value, "aage");
            return (Criteria) this;
        }

        public Criteria andAageGreaterThanOrEqualTo(Integer value) {
            addCriterion("aage >=", value, "aage");
            return (Criteria) this;
        }

        public Criteria andAageLessThan(Integer value) {
            addCriterion("aage <", value, "aage");
            return (Criteria) this;
        }

        public Criteria andAageLessThanOrEqualTo(Integer value) {
            addCriterion("aage <=", value, "aage");
            return (Criteria) this;
        }

        public Criteria andAageIn(List<Integer> values) {
            addCriterion("aage in", values, "aage");
            return (Criteria) this;
        }

        public Criteria andAageNotIn(List<Integer> values) {
            addCriterion("aage not in", values, "aage");
            return (Criteria) this;
        }

        public Criteria andAageBetween(Integer value1, Integer value2) {
            addCriterion("aage between", value1, value2, "aage");
            return (Criteria) this;
        }

        public Criteria andAageNotBetween(Integer value1, Integer value2) {
            addCriterion("aage not between", value1, value2, "aage");
            return (Criteria) this;
        }

        public Criteria andAcaddressIsNull() {
            addCriterion("acaddress is null");
            return (Criteria) this;
        }

        public Criteria andAcaddressIsNotNull() {
            addCriterion("acaddress is not null");
            return (Criteria) this;
        }

        public Criteria andAcaddressEqualTo(String value) {
            addCriterion("acaddress =", value, "acaddress");
            return (Criteria) this;
        }

        public Criteria andAcaddressNotEqualTo(String value) {
            addCriterion("acaddress <>", value, "acaddress");
            return (Criteria) this;
        }

        public Criteria andAcaddressGreaterThan(String value) {
            addCriterion("acaddress >", value, "acaddress");
            return (Criteria) this;
        }

        public Criteria andAcaddressGreaterThanOrEqualTo(String value) {
            addCriterion("acaddress >=", value, "acaddress");
            return (Criteria) this;
        }

        public Criteria andAcaddressLessThan(String value) {
            addCriterion("acaddress <", value, "acaddress");
            return (Criteria) this;
        }

        public Criteria andAcaddressLessThanOrEqualTo(String value) {
            addCriterion("acaddress <=", value, "acaddress");
            return (Criteria) this;
        }

        public Criteria andAcaddressLike(String value) {
            addCriterion("acaddress like", value, "acaddress");
            return (Criteria) this;
        }

        public Criteria andAcaddressNotLike(String value) {
            addCriterion("acaddress not like", value, "acaddress");
            return (Criteria) this;
        }

        public Criteria andAcaddressIn(List<String> values) {
            addCriterion("acaddress in", values, "acaddress");
            return (Criteria) this;
        }

        public Criteria andAcaddressNotIn(List<String> values) {
            addCriterion("acaddress not in", values, "acaddress");
            return (Criteria) this;
        }

        public Criteria andAcaddressBetween(String value1, String value2) {
            addCriterion("acaddress between", value1, value2, "acaddress");
            return (Criteria) this;
        }

        public Criteria andAcaddressNotBetween(String value1, String value2) {
            addCriterion("acaddress not between", value1, value2, "acaddress");
            return (Criteria) this;
        }

        public Criteria andAcphoneIsNull() {
            addCriterion("acphone is null");
            return (Criteria) this;
        }

        public Criteria andAcphoneIsNotNull() {
            addCriterion("acphone is not null");
            return (Criteria) this;
        }

        public Criteria andAcphoneEqualTo(String value) {
            addCriterion("acphone =", value, "acphone");
            return (Criteria) this;
        }

        public Criteria andAcphoneNotEqualTo(String value) {
            addCriterion("acphone <>", value, "acphone");
            return (Criteria) this;
        }

        public Criteria andAcphoneGreaterThan(String value) {
            addCriterion("acphone >", value, "acphone");
            return (Criteria) this;
        }

        public Criteria andAcphoneGreaterThanOrEqualTo(String value) {
            addCriterion("acphone >=", value, "acphone");
            return (Criteria) this;
        }

        public Criteria andAcphoneLessThan(String value) {
            addCriterion("acphone <", value, "acphone");
            return (Criteria) this;
        }

        public Criteria andAcphoneLessThanOrEqualTo(String value) {
            addCriterion("acphone <=", value, "acphone");
            return (Criteria) this;
        }

        public Criteria andAcphoneLike(String value) {
            addCriterion("acphone like", value, "acphone");
            return (Criteria) this;
        }

        public Criteria andAcphoneNotLike(String value) {
            addCriterion("acphone not like", value, "acphone");
            return (Criteria) this;
        }

        public Criteria andAcphoneIn(List<String> values) {
            addCriterion("acphone in", values, "acphone");
            return (Criteria) this;
        }

        public Criteria andAcphoneNotIn(List<String> values) {
            addCriterion("acphone not in", values, "acphone");
            return (Criteria) this;
        }

        public Criteria andAcphoneBetween(String value1, String value2) {
            addCriterion("acphone between", value1, value2, "acphone");
            return (Criteria) this;
        }

        public Criteria andAcphoneNotBetween(String value1, String value2) {
            addCriterion("acphone not between", value1, value2, "acphone");
            return (Criteria) this;
        }

        public Criteria andApasswordIsNull() {
            addCriterion("apassword is null");
            return (Criteria) this;
        }

        public Criteria andApasswordIsNotNull() {
            addCriterion("apassword is not null");
            return (Criteria) this;
        }

        public Criteria andApasswordEqualTo(String value) {
            addCriterion("apassword =", value, "apassword");
            return (Criteria) this;
        }

        public Criteria andApasswordNotEqualTo(String value) {
            addCriterion("apassword <>", value, "apassword");
            return (Criteria) this;
        }

        public Criteria andApasswordGreaterThan(String value) {
            addCriterion("apassword >", value, "apassword");
            return (Criteria) this;
        }

        public Criteria andApasswordGreaterThanOrEqualTo(String value) {
            addCriterion("apassword >=", value, "apassword");
            return (Criteria) this;
        }

        public Criteria andApasswordLessThan(String value) {
            addCriterion("apassword <", value, "apassword");
            return (Criteria) this;
        }

        public Criteria andApasswordLessThanOrEqualTo(String value) {
            addCriterion("apassword <=", value, "apassword");
            return (Criteria) this;
        }

        public Criteria andApasswordLike(String value) {
            addCriterion("apassword like", value, "apassword");
            return (Criteria) this;
        }

        public Criteria andApasswordNotLike(String value) {
            addCriterion("apassword not like", value, "apassword");
            return (Criteria) this;
        }

        public Criteria andApasswordIn(List<String> values) {
            addCriterion("apassword in", values, "apassword");
            return (Criteria) this;
        }

        public Criteria andApasswordNotIn(List<String> values) {
            addCriterion("apassword not in", values, "apassword");
            return (Criteria) this;
        }

        public Criteria andApasswordBetween(String value1, String value2) {
            addCriterion("apassword between", value1, value2, "apassword");
            return (Criteria) this;
        }

        public Criteria andApasswordNotBetween(String value1, String value2) {
            addCriterion("apassword not between", value1, value2, "apassword");
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