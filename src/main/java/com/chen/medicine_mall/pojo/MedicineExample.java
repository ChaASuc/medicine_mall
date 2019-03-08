package com.chen.medicine_mall.pojo;

import java.util.ArrayList;
import java.util.List;

public class MedicineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MedicineExample() {
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

        public Criteria andMnoIsNull() {
            addCriterion("mno is null");
            return (Criteria) this;
        }

        public Criteria andMnoIsNotNull() {
            addCriterion("mno is not null");
            return (Criteria) this;
        }

        public Criteria andMnoEqualTo(String value) {
            addCriterion("mno =", value, "mno");
            return (Criteria) this;
        }

        public Criteria andMnoNotEqualTo(String value) {
            addCriterion("mno <>", value, "mno");
            return (Criteria) this;
        }

        public Criteria andMnoGreaterThan(String value) {
            addCriterion("mno >", value, "mno");
            return (Criteria) this;
        }

        public Criteria andMnoGreaterThanOrEqualTo(String value) {
            addCriterion("mno >=", value, "mno");
            return (Criteria) this;
        }

        public Criteria andMnoLessThan(String value) {
            addCriterion("mno <", value, "mno");
            return (Criteria) this;
        }

        public Criteria andMnoLessThanOrEqualTo(String value) {
            addCriterion("mno <=", value, "mno");
            return (Criteria) this;
        }

        public Criteria andMnoLike(String value) {
            addCriterion("mno like", value, "mno");
            return (Criteria) this;
        }

        public Criteria andMnoNotLike(String value) {
            addCriterion("mno not like", value, "mno");
            return (Criteria) this;
        }

        public Criteria andMnoIn(List<String> values) {
            addCriterion("mno in", values, "mno");
            return (Criteria) this;
        }

        public Criteria andMnoNotIn(List<String> values) {
            addCriterion("mno not in", values, "mno");
            return (Criteria) this;
        }

        public Criteria andMnoBetween(String value1, String value2) {
            addCriterion("mno between", value1, value2, "mno");
            return (Criteria) this;
        }

        public Criteria andMnoNotBetween(String value1, String value2) {
            addCriterion("mno not between", value1, value2, "mno");
            return (Criteria) this;
        }

        public Criteria andMnameIsNull() {
            addCriterion("mname is null");
            return (Criteria) this;
        }

        public Criteria andMnameIsNotNull() {
            addCriterion("mname is not null");
            return (Criteria) this;
        }

        public Criteria andMnameEqualTo(String value) {
            addCriterion("mname =", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotEqualTo(String value) {
            addCriterion("mname <>", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThan(String value) {
            addCriterion("mname >", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThanOrEqualTo(String value) {
            addCriterion("mname >=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThan(String value) {
            addCriterion("mname <", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThanOrEqualTo(String value) {
            addCriterion("mname <=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLike(String value) {
            addCriterion("mname like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotLike(String value) {
            addCriterion("mname not like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameIn(List<String> values) {
            addCriterion("mname in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotIn(List<String> values) {
            addCriterion("mname not in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameBetween(String value1, String value2) {
            addCriterion("mname between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotBetween(String value1, String value2) {
            addCriterion("mname not between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andMmodeIsNull() {
            addCriterion("mmode is null");
            return (Criteria) this;
        }

        public Criteria andMmodeIsNotNull() {
            addCriterion("mmode is not null");
            return (Criteria) this;
        }

        public Criteria andMmodeEqualTo(String value) {
            addCriterion("mmode =", value, "mmode");
            return (Criteria) this;
        }

        public Criteria andMmodeNotEqualTo(String value) {
            addCriterion("mmode <>", value, "mmode");
            return (Criteria) this;
        }

        public Criteria andMmodeGreaterThan(String value) {
            addCriterion("mmode >", value, "mmode");
            return (Criteria) this;
        }

        public Criteria andMmodeGreaterThanOrEqualTo(String value) {
            addCriterion("mmode >=", value, "mmode");
            return (Criteria) this;
        }

        public Criteria andMmodeLessThan(String value) {
            addCriterion("mmode <", value, "mmode");
            return (Criteria) this;
        }

        public Criteria andMmodeLessThanOrEqualTo(String value) {
            addCriterion("mmode <=", value, "mmode");
            return (Criteria) this;
        }

        public Criteria andMmodeLike(String value) {
            addCriterion("mmode like", value, "mmode");
            return (Criteria) this;
        }

        public Criteria andMmodeNotLike(String value) {
            addCriterion("mmode not like", value, "mmode");
            return (Criteria) this;
        }

        public Criteria andMmodeIn(List<String> values) {
            addCriterion("mmode in", values, "mmode");
            return (Criteria) this;
        }

        public Criteria andMmodeNotIn(List<String> values) {
            addCriterion("mmode not in", values, "mmode");
            return (Criteria) this;
        }

        public Criteria andMmodeBetween(String value1, String value2) {
            addCriterion("mmode between", value1, value2, "mmode");
            return (Criteria) this;
        }

        public Criteria andMmodeNotBetween(String value1, String value2) {
            addCriterion("mmode not between", value1, value2, "mmode");
            return (Criteria) this;
        }

        public Criteria andMefficacyIsNull() {
            addCriterion("mefficacy is null");
            return (Criteria) this;
        }

        public Criteria andMefficacyIsNotNull() {
            addCriterion("mefficacy is not null");
            return (Criteria) this;
        }

        public Criteria andMefficacyEqualTo(String value) {
            addCriterion("mefficacy =", value, "mefficacy");
            return (Criteria) this;
        }

        public Criteria andMefficacyNotEqualTo(String value) {
            addCriterion("mefficacy <>", value, "mefficacy");
            return (Criteria) this;
        }

        public Criteria andMefficacyGreaterThan(String value) {
            addCriterion("mefficacy >", value, "mefficacy");
            return (Criteria) this;
        }

        public Criteria andMefficacyGreaterThanOrEqualTo(String value) {
            addCriterion("mefficacy >=", value, "mefficacy");
            return (Criteria) this;
        }

        public Criteria andMefficacyLessThan(String value) {
            addCriterion("mefficacy <", value, "mefficacy");
            return (Criteria) this;
        }

        public Criteria andMefficacyLessThanOrEqualTo(String value) {
            addCriterion("mefficacy <=", value, "mefficacy");
            return (Criteria) this;
        }

        public Criteria andMefficacyLike(String value) {
            addCriterion("mefficacy like", value, "mefficacy");
            return (Criteria) this;
        }

        public Criteria andMefficacyNotLike(String value) {
            addCriterion("mefficacy not like", value, "mefficacy");
            return (Criteria) this;
        }

        public Criteria andMefficacyIn(List<String> values) {
            addCriterion("mefficacy in", values, "mefficacy");
            return (Criteria) this;
        }

        public Criteria andMefficacyNotIn(List<String> values) {
            addCriterion("mefficacy not in", values, "mefficacy");
            return (Criteria) this;
        }

        public Criteria andMefficacyBetween(String value1, String value2) {
            addCriterion("mefficacy between", value1, value2, "mefficacy");
            return (Criteria) this;
        }

        public Criteria andMefficacyNotBetween(String value1, String value2) {
            addCriterion("mefficacy not between", value1, value2, "mefficacy");
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