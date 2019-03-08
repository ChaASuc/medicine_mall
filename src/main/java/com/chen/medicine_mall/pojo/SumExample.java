package com.chen.medicine_mall.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SumExample() {
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

        public Criteria andCnoIsNull() {
            addCriterion("cno is null");
            return (Criteria) this;
        }

        public Criteria andCnoIsNotNull() {
            addCriterion("cno is not null");
            return (Criteria) this;
        }

        public Criteria andCnoEqualTo(String value) {
            addCriterion("cno =", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotEqualTo(String value) {
            addCriterion("cno <>", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoGreaterThan(String value) {
            addCriterion("cno >", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoGreaterThanOrEqualTo(String value) {
            addCriterion("cno >=", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoLessThan(String value) {
            addCriterion("cno <", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoLessThanOrEqualTo(String value) {
            addCriterion("cno <=", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoLike(String value) {
            addCriterion("cno like", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotLike(String value) {
            addCriterion("cno not like", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoIn(List<String> values) {
            addCriterion("cno in", values, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotIn(List<String> values) {
            addCriterion("cno not in", values, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoBetween(String value1, String value2) {
            addCriterion("cno between", value1, value2, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotBetween(String value1, String value2) {
            addCriterion("cno not between", value1, value2, "cno");
            return (Criteria) this;
        }

        public Criteria andCnameIsNull() {
            addCriterion("cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cname not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCsexIsNull() {
            addCriterion("csex is null");
            return (Criteria) this;
        }

        public Criteria andCsexIsNotNull() {
            addCriterion("csex is not null");
            return (Criteria) this;
        }

        public Criteria andCsexEqualTo(String value) {
            addCriterion("csex =", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexNotEqualTo(String value) {
            addCriterion("csex <>", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexGreaterThan(String value) {
            addCriterion("csex >", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexGreaterThanOrEqualTo(String value) {
            addCriterion("csex >=", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexLessThan(String value) {
            addCriterion("csex <", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexLessThanOrEqualTo(String value) {
            addCriterion("csex <=", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexLike(String value) {
            addCriterion("csex like", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexNotLike(String value) {
            addCriterion("csex not like", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexIn(List<String> values) {
            addCriterion("csex in", values, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexNotIn(List<String> values) {
            addCriterion("csex not in", values, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexBetween(String value1, String value2) {
            addCriterion("csex between", value1, value2, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexNotBetween(String value1, String value2) {
            addCriterion("csex not between", value1, value2, "csex");
            return (Criteria) this;
        }

        public Criteria andCageIsNull() {
            addCriterion("cage is null");
            return (Criteria) this;
        }

        public Criteria andCageIsNotNull() {
            addCriterion("cage is not null");
            return (Criteria) this;
        }

        public Criteria andCageEqualTo(Integer value) {
            addCriterion("cage =", value, "cage");
            return (Criteria) this;
        }

        public Criteria andCageNotEqualTo(Integer value) {
            addCriterion("cage <>", value, "cage");
            return (Criteria) this;
        }

        public Criteria andCageGreaterThan(Integer value) {
            addCriterion("cage >", value, "cage");
            return (Criteria) this;
        }

        public Criteria andCageGreaterThanOrEqualTo(Integer value) {
            addCriterion("cage >=", value, "cage");
            return (Criteria) this;
        }

        public Criteria andCageLessThan(Integer value) {
            addCriterion("cage <", value, "cage");
            return (Criteria) this;
        }

        public Criteria andCageLessThanOrEqualTo(Integer value) {
            addCriterion("cage <=", value, "cage");
            return (Criteria) this;
        }

        public Criteria andCageIn(List<Integer> values) {
            addCriterion("cage in", values, "cage");
            return (Criteria) this;
        }

        public Criteria andCageNotIn(List<Integer> values) {
            addCriterion("cage not in", values, "cage");
            return (Criteria) this;
        }

        public Criteria andCageBetween(Integer value1, Integer value2) {
            addCriterion("cage between", value1, value2, "cage");
            return (Criteria) this;
        }

        public Criteria andCageNotBetween(Integer value1, Integer value2) {
            addCriterion("cage not between", value1, value2, "cage");
            return (Criteria) this;
        }

        public Criteria andCaddressIsNull() {
            addCriterion("caddress is null");
            return (Criteria) this;
        }

        public Criteria andCaddressIsNotNull() {
            addCriterion("caddress is not null");
            return (Criteria) this;
        }

        public Criteria andCaddressEqualTo(String value) {
            addCriterion("caddress =", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotEqualTo(String value) {
            addCriterion("caddress <>", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressGreaterThan(String value) {
            addCriterion("caddress >", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressGreaterThanOrEqualTo(String value) {
            addCriterion("caddress >=", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressLessThan(String value) {
            addCriterion("caddress <", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressLessThanOrEqualTo(String value) {
            addCriterion("caddress <=", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressLike(String value) {
            addCriterion("caddress like", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotLike(String value) {
            addCriterion("caddress not like", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressIn(List<String> values) {
            addCriterion("caddress in", values, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotIn(List<String> values) {
            addCriterion("caddress not in", values, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressBetween(String value1, String value2) {
            addCriterion("caddress between", value1, value2, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotBetween(String value1, String value2) {
            addCriterion("caddress not between", value1, value2, "caddress");
            return (Criteria) this;
        }

        public Criteria andCphoneIsNull() {
            addCriterion("cphone is null");
            return (Criteria) this;
        }

        public Criteria andCphoneIsNotNull() {
            addCriterion("cphone is not null");
            return (Criteria) this;
        }

        public Criteria andCphoneEqualTo(String value) {
            addCriterion("cphone =", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneNotEqualTo(String value) {
            addCriterion("cphone <>", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneGreaterThan(String value) {
            addCriterion("cphone >", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneGreaterThanOrEqualTo(String value) {
            addCriterion("cphone >=", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneLessThan(String value) {
            addCriterion("cphone <", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneLessThanOrEqualTo(String value) {
            addCriterion("cphone <=", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneLike(String value) {
            addCriterion("cphone like", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneNotLike(String value) {
            addCriterion("cphone not like", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneIn(List<String> values) {
            addCriterion("cphone in", values, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneNotIn(List<String> values) {
            addCriterion("cphone not in", values, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneBetween(String value1, String value2) {
            addCriterion("cphone between", value1, value2, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneNotBetween(String value1, String value2) {
            addCriterion("cphone not between", value1, value2, "cphone");
            return (Criteria) this;
        }

        public Criteria andCsymptomIsNull() {
            addCriterion("csymptom is null");
            return (Criteria) this;
        }

        public Criteria andCsymptomIsNotNull() {
            addCriterion("csymptom is not null");
            return (Criteria) this;
        }

        public Criteria andCsymptomEqualTo(String value) {
            addCriterion("csymptom =", value, "csymptom");
            return (Criteria) this;
        }

        public Criteria andCsymptomNotEqualTo(String value) {
            addCriterion("csymptom <>", value, "csymptom");
            return (Criteria) this;
        }

        public Criteria andCsymptomGreaterThan(String value) {
            addCriterion("csymptom >", value, "csymptom");
            return (Criteria) this;
        }

        public Criteria andCsymptomGreaterThanOrEqualTo(String value) {
            addCriterion("csymptom >=", value, "csymptom");
            return (Criteria) this;
        }

        public Criteria andCsymptomLessThan(String value) {
            addCriterion("csymptom <", value, "csymptom");
            return (Criteria) this;
        }

        public Criteria andCsymptomLessThanOrEqualTo(String value) {
            addCriterion("csymptom <=", value, "csymptom");
            return (Criteria) this;
        }

        public Criteria andCsymptomLike(String value) {
            addCriterion("csymptom like", value, "csymptom");
            return (Criteria) this;
        }

        public Criteria andCsymptomNotLike(String value) {
            addCriterion("csymptom not like", value, "csymptom");
            return (Criteria) this;
        }

        public Criteria andCsymptomIn(List<String> values) {
            addCriterion("csymptom in", values, "csymptom");
            return (Criteria) this;
        }

        public Criteria andCsymptomNotIn(List<String> values) {
            addCriterion("csymptom not in", values, "csymptom");
            return (Criteria) this;
        }

        public Criteria andCsymptomBetween(String value1, String value2) {
            addCriterion("csymptom between", value1, value2, "csymptom");
            return (Criteria) this;
        }

        public Criteria andCsymptomNotBetween(String value1, String value2) {
            addCriterion("csymptom not between", value1, value2, "csymptom");
            return (Criteria) this;
        }

        public Criteria andCdateIsNull() {
            addCriterion("cdate is null");
            return (Criteria) this;
        }

        public Criteria andCdateIsNotNull() {
            addCriterion("cdate is not null");
            return (Criteria) this;
        }

        public Criteria andCdateEqualTo(Date value) {
            addCriterion("cdate =", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateNotEqualTo(Date value) {
            addCriterion("cdate <>", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateGreaterThan(Date value) {
            addCriterion("cdate >", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateGreaterThanOrEqualTo(Date value) {
            addCriterion("cdate >=", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateLessThan(Date value) {
            addCriterion("cdate <", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateLessThanOrEqualTo(Date value) {
            addCriterion("cdate <=", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateIn(List<Date> values) {
            addCriterion("cdate in", values, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateNotIn(List<Date> values) {
            addCriterion("cdate not in", values, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateBetween(Date value1, Date value2) {
            addCriterion("cdate between", value1, value2, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateNotBetween(Date value1, Date value2) {
            addCriterion("cdate not between", value1, value2, "cdate");
            return (Criteria) this;
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

        public Criteria andAphoneIsNull() {
            addCriterion("aphone is null");
            return (Criteria) this;
        }

        public Criteria andAphoneIsNotNull() {
            addCriterion("aphone is not null");
            return (Criteria) this;
        }

        public Criteria andAphoneEqualTo(String value) {
            addCriterion("aphone =", value, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneNotEqualTo(String value) {
            addCriterion("aphone <>", value, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneGreaterThan(String value) {
            addCriterion("aphone >", value, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneGreaterThanOrEqualTo(String value) {
            addCriterion("aphone >=", value, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneLessThan(String value) {
            addCriterion("aphone <", value, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneLessThanOrEqualTo(String value) {
            addCriterion("aphone <=", value, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneLike(String value) {
            addCriterion("aphone like", value, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneNotLike(String value) {
            addCriterion("aphone not like", value, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneIn(List<String> values) {
            addCriterion("aphone in", values, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneNotIn(List<String> values) {
            addCriterion("aphone not in", values, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneBetween(String value1, String value2) {
            addCriterion("aphone between", value1, value2, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneNotBetween(String value1, String value2) {
            addCriterion("aphone not between", value1, value2, "aphone");
            return (Criteria) this;
        }

        public Criteria andAremarkIsNull() {
            addCriterion("aremark is null");
            return (Criteria) this;
        }

        public Criteria andAremarkIsNotNull() {
            addCriterion("aremark is not null");
            return (Criteria) this;
        }

        public Criteria andAremarkEqualTo(String value) {
            addCriterion("aremark =", value, "aremark");
            return (Criteria) this;
        }

        public Criteria andAremarkNotEqualTo(String value) {
            addCriterion("aremark <>", value, "aremark");
            return (Criteria) this;
        }

        public Criteria andAremarkGreaterThan(String value) {
            addCriterion("aremark >", value, "aremark");
            return (Criteria) this;
        }

        public Criteria andAremarkGreaterThanOrEqualTo(String value) {
            addCriterion("aremark >=", value, "aremark");
            return (Criteria) this;
        }

        public Criteria andAremarkLessThan(String value) {
            addCriterion("aremark <", value, "aremark");
            return (Criteria) this;
        }

        public Criteria andAremarkLessThanOrEqualTo(String value) {
            addCriterion("aremark <=", value, "aremark");
            return (Criteria) this;
        }

        public Criteria andAremarkLike(String value) {
            addCriterion("aremark like", value, "aremark");
            return (Criteria) this;
        }

        public Criteria andAremarkNotLike(String value) {
            addCriterion("aremark not like", value, "aremark");
            return (Criteria) this;
        }

        public Criteria andAremarkIn(List<String> values) {
            addCriterion("aremark in", values, "aremark");
            return (Criteria) this;
        }

        public Criteria andAremarkNotIn(List<String> values) {
            addCriterion("aremark not in", values, "aremark");
            return (Criteria) this;
        }

        public Criteria andAremarkBetween(String value1, String value2) {
            addCriterion("aremark between", value1, value2, "aremark");
            return (Criteria) this;
        }

        public Criteria andAremarkNotBetween(String value1, String value2) {
            addCriterion("aremark not between", value1, value2, "aremark");
            return (Criteria) this;
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