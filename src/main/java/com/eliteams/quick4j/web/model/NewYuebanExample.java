package com.eliteams.quick4j.web.model;

import java.util.ArrayList;
import java.util.List;

public class NewYuebanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewYuebanExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andYuebantypeIsNull() {
            addCriterion("yuebantype is null");
            return (Criteria) this;
        }

        public Criteria andYuebantypeIsNotNull() {
            addCriterion("yuebantype is not null");
            return (Criteria) this;
        }

        public Criteria andYuebantypeEqualTo(Integer value) {
            addCriterion("yuebantype =", value, "yuebantype");
            return (Criteria) this;
        }

        public Criteria andYuebantypeNotEqualTo(Integer value) {
            addCriterion("yuebantype <>", value, "yuebantype");
            return (Criteria) this;
        }

        public Criteria andYuebantypeGreaterThan(Integer value) {
            addCriterion("yuebantype >", value, "yuebantype");
            return (Criteria) this;
        }

        public Criteria andYuebantypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("yuebantype >=", value, "yuebantype");
            return (Criteria) this;
        }

        public Criteria andYuebantypeLessThan(Integer value) {
            addCriterion("yuebantype <", value, "yuebantype");
            return (Criteria) this;
        }

        public Criteria andYuebantypeLessThanOrEqualTo(Integer value) {
            addCriterion("yuebantype <=", value, "yuebantype");
            return (Criteria) this;
        }

        public Criteria andYuebantypeIn(List<Integer> values) {
            addCriterion("yuebantype in", values, "yuebantype");
            return (Criteria) this;
        }

        public Criteria andYuebantypeNotIn(List<Integer> values) {
            addCriterion("yuebantype not in", values, "yuebantype");
            return (Criteria) this;
        }

        public Criteria andYuebantypeBetween(Integer value1, Integer value2) {
            addCriterion("yuebantype between", value1, value2, "yuebantype");
            return (Criteria) this;
        }

        public Criteria andYuebantypeNotBetween(Integer value1, Integer value2) {
            addCriterion("yuebantype not between", value1, value2, "yuebantype");
            return (Criteria) this;
        }

        public Criteria andYuebanplanIsNull() {
            addCriterion("yuebanplan is null");
            return (Criteria) this;
        }

        public Criteria andYuebanplanIsNotNull() {
            addCriterion("yuebanplan is not null");
            return (Criteria) this;
        }

        public Criteria andYuebanplanEqualTo(Integer value) {
            addCriterion("yuebanplan =", value, "yuebanplan");
            return (Criteria) this;
        }

        public Criteria andYuebanplanNotEqualTo(Integer value) {
            addCriterion("yuebanplan <>", value, "yuebanplan");
            return (Criteria) this;
        }

        public Criteria andYuebanplanGreaterThan(Integer value) {
            addCriterion("yuebanplan >", value, "yuebanplan");
            return (Criteria) this;
        }

        public Criteria andYuebanplanGreaterThanOrEqualTo(Integer value) {
            addCriterion("yuebanplan >=", value, "yuebanplan");
            return (Criteria) this;
        }

        public Criteria andYuebanplanLessThan(Integer value) {
            addCriterion("yuebanplan <", value, "yuebanplan");
            return (Criteria) this;
        }

        public Criteria andYuebanplanLessThanOrEqualTo(Integer value) {
            addCriterion("yuebanplan <=", value, "yuebanplan");
            return (Criteria) this;
        }

        public Criteria andYuebanplanIn(List<Integer> values) {
            addCriterion("yuebanplan in", values, "yuebanplan");
            return (Criteria) this;
        }

        public Criteria andYuebanplanNotIn(List<Integer> values) {
            addCriterion("yuebanplan not in", values, "yuebanplan");
            return (Criteria) this;
        }

        public Criteria andYuebanplanBetween(Integer value1, Integer value2) {
            addCriterion("yuebanplan between", value1, value2, "yuebanplan");
            return (Criteria) this;
        }

        public Criteria andYuebanplanNotBetween(Integer value1, Integer value2) {
            addCriterion("yuebanplan not between", value1, value2, "yuebanplan");
            return (Criteria) this;
        }

        public Criteria andYuebandateIsNull() {
            addCriterion("yuebandate is null");
            return (Criteria) this;
        }

        public Criteria andYuebandateIsNotNull() {
            addCriterion("yuebandate is not null");
            return (Criteria) this;
        }

        public Criteria andYuebandateEqualTo(String value) {
            addCriterion("yuebandate =", value, "yuebandate");
            return (Criteria) this;
        }

        public Criteria andYuebandateNotEqualTo(String value) {
            addCriterion("yuebandate <>", value, "yuebandate");
            return (Criteria) this;
        }

        public Criteria andYuebandateGreaterThan(String value) {
            addCriterion("yuebandate >", value, "yuebandate");
            return (Criteria) this;
        }

        public Criteria andYuebandateGreaterThanOrEqualTo(String value) {
            addCriterion("yuebandate >=", value, "yuebandate");
            return (Criteria) this;
        }

        public Criteria andYuebandateLessThan(String value) {
            addCriterion("yuebandate <", value, "yuebandate");
            return (Criteria) this;
        }

        public Criteria andYuebandateLessThanOrEqualTo(String value) {
            addCriterion("yuebandate <=", value, "yuebandate");
            return (Criteria) this;
        }

        public Criteria andYuebandateIn(List<String> values) {
            addCriterion("yuebandate in", values, "yuebandate");
            return (Criteria) this;
        }

        public Criteria andYuebandateNotIn(List<String> values) {
            addCriterion("yuebandate not in", values, "yuebandate");
            return (Criteria) this;
        }

        public Criteria andYuebandateBetween(String value1, String value2) {
            addCriterion("yuebandate between", value1, value2, "yuebandate");
            return (Criteria) this;
        }

        public Criteria andYuebandateNotBetween(String value1, String value2) {
            addCriterion("yuebandate not between", value1, value2, "yuebandate");
            return (Criteria) this;
        }

        public Criteria andYuebanadressIsNull() {
            addCriterion("yuebanadress is null");
            return (Criteria) this;
        }

        public Criteria andYuebanadressIsNotNull() {
            addCriterion("yuebanadress is not null");
            return (Criteria) this;
        }

        public Criteria andYuebanadressEqualTo(String value) {
            addCriterion("yuebanadress =", value, "yuebanadress");
            return (Criteria) this;
        }

        public Criteria andYuebanadressNotEqualTo(String value) {
            addCriterion("yuebanadress <>", value, "yuebanadress");
            return (Criteria) this;
        }

        public Criteria andYuebanadressGreaterThan(String value) {
            addCriterion("yuebanadress >", value, "yuebanadress");
            return (Criteria) this;
        }

        public Criteria andYuebanadressGreaterThanOrEqualTo(String value) {
            addCriterion("yuebanadress >=", value, "yuebanadress");
            return (Criteria) this;
        }

        public Criteria andYuebanadressLessThan(String value) {
            addCriterion("yuebanadress <", value, "yuebanadress");
            return (Criteria) this;
        }

        public Criteria andYuebanadressLessThanOrEqualTo(String value) {
            addCriterion("yuebanadress <=", value, "yuebanadress");
            return (Criteria) this;
        }

        public Criteria andYuebanadressLike(String value) {
            addCriterion("yuebanadress like", value, "yuebanadress");
            return (Criteria) this;
        }

        public Criteria andYuebanadressNotLike(String value) {
            addCriterion("yuebanadress not like", value, "yuebanadress");
            return (Criteria) this;
        }

        public Criteria andYuebanadressIn(List<String> values) {
            addCriterion("yuebanadress in", values, "yuebanadress");
            return (Criteria) this;
        }

        public Criteria andYuebanadressNotIn(List<String> values) {
            addCriterion("yuebanadress not in", values, "yuebanadress");
            return (Criteria) this;
        }

        public Criteria andYuebanadressBetween(String value1, String value2) {
            addCriterion("yuebanadress between", value1, value2, "yuebanadress");
            return (Criteria) this;
        }

        public Criteria andYuebanadressNotBetween(String value1, String value2) {
            addCriterion("yuebanadress not between", value1, value2, "yuebanadress");
            return (Criteria) this;
        }

        public Criteria andYuebantargetIsNull() {
            addCriterion("yuebantarget is null");
            return (Criteria) this;
        }

        public Criteria andYuebantargetIsNotNull() {
            addCriterion("yuebantarget is not null");
            return (Criteria) this;
        }

        public Criteria andYuebantargetEqualTo(String value) {
            addCriterion("yuebantarget =", value, "yuebantarget");
            return (Criteria) this;
        }

        public Criteria andYuebantargetNotEqualTo(String value) {
            addCriterion("yuebantarget <>", value, "yuebantarget");
            return (Criteria) this;
        }

        public Criteria andYuebantargetGreaterThan(String value) {
            addCriterion("yuebantarget >", value, "yuebantarget");
            return (Criteria) this;
        }

        public Criteria andYuebantargetGreaterThanOrEqualTo(String value) {
            addCriterion("yuebantarget >=", value, "yuebantarget");
            return (Criteria) this;
        }

        public Criteria andYuebantargetLessThan(String value) {
            addCriterion("yuebantarget <", value, "yuebantarget");
            return (Criteria) this;
        }

        public Criteria andYuebantargetLessThanOrEqualTo(String value) {
            addCriterion("yuebantarget <=", value, "yuebantarget");
            return (Criteria) this;
        }

        public Criteria andYuebantargetLike(String value) {
            addCriterion("yuebantarget like", value, "yuebantarget");
            return (Criteria) this;
        }

        public Criteria andYuebantargetNotLike(String value) {
            addCriterion("yuebantarget not like", value, "yuebantarget");
            return (Criteria) this;
        }

        public Criteria andYuebantargetIn(List<String> values) {
            addCriterion("yuebantarget in", values, "yuebantarget");
            return (Criteria) this;
        }

        public Criteria andYuebantargetNotIn(List<String> values) {
            addCriterion("yuebantarget not in", values, "yuebantarget");
            return (Criteria) this;
        }

        public Criteria andYuebantargetBetween(String value1, String value2) {
            addCriterion("yuebantarget between", value1, value2, "yuebantarget");
            return (Criteria) this;
        }

        public Criteria andYuebantargetNotBetween(String value1, String value2) {
            addCriterion("yuebantarget not between", value1, value2, "yuebantarget");
            return (Criteria) this;
        }

        public Criteria andYuebancarstatusIsNull() {
            addCriterion("yuebancarstatus is null");
            return (Criteria) this;
        }

        public Criteria andYuebancarstatusIsNotNull() {
            addCriterion("yuebancarstatus is not null");
            return (Criteria) this;
        }

        public Criteria andYuebancarstatusEqualTo(Integer value) {
            addCriterion("yuebancarstatus =", value, "yuebancarstatus");
            return (Criteria) this;
        }

        public Criteria andYuebancarstatusNotEqualTo(Integer value) {
            addCriterion("yuebancarstatus <>", value, "yuebancarstatus");
            return (Criteria) this;
        }

        public Criteria andYuebancarstatusGreaterThan(Integer value) {
            addCriterion("yuebancarstatus >", value, "yuebancarstatus");
            return (Criteria) this;
        }

        public Criteria andYuebancarstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("yuebancarstatus >=", value, "yuebancarstatus");
            return (Criteria) this;
        }

        public Criteria andYuebancarstatusLessThan(Integer value) {
            addCriterion("yuebancarstatus <", value, "yuebancarstatus");
            return (Criteria) this;
        }

        public Criteria andYuebancarstatusLessThanOrEqualTo(Integer value) {
            addCriterion("yuebancarstatus <=", value, "yuebancarstatus");
            return (Criteria) this;
        }

        public Criteria andYuebancarstatusIn(List<Integer> values) {
            addCriterion("yuebancarstatus in", values, "yuebancarstatus");
            return (Criteria) this;
        }

        public Criteria andYuebancarstatusNotIn(List<Integer> values) {
            addCriterion("yuebancarstatus not in", values, "yuebancarstatus");
            return (Criteria) this;
        }

        public Criteria andYuebancarstatusBetween(Integer value1, Integer value2) {
            addCriterion("yuebancarstatus between", value1, value2, "yuebancarstatus");
            return (Criteria) this;
        }

        public Criteria andYuebancarstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("yuebancarstatus not between", value1, value2, "yuebancarstatus");
            return (Criteria) this;
        }

        public Criteria andYuebandemandIsNull() {
            addCriterion("yuebandemand is null");
            return (Criteria) this;
        }

        public Criteria andYuebandemandIsNotNull() {
            addCriterion("yuebandemand is not null");
            return (Criteria) this;
        }

        public Criteria andYuebandemandEqualTo(Integer value) {
            addCriterion("yuebandemand =", value, "yuebandemand");
            return (Criteria) this;
        }

        public Criteria andYuebandemandNotEqualTo(Integer value) {
            addCriterion("yuebandemand <>", value, "yuebandemand");
            return (Criteria) this;
        }

        public Criteria andYuebandemandGreaterThan(Integer value) {
            addCriterion("yuebandemand >", value, "yuebandemand");
            return (Criteria) this;
        }

        public Criteria andYuebandemandGreaterThanOrEqualTo(Integer value) {
            addCriterion("yuebandemand >=", value, "yuebandemand");
            return (Criteria) this;
        }

        public Criteria andYuebandemandLessThan(Integer value) {
            addCriterion("yuebandemand <", value, "yuebandemand");
            return (Criteria) this;
        }

        public Criteria andYuebandemandLessThanOrEqualTo(Integer value) {
            addCriterion("yuebandemand <=", value, "yuebandemand");
            return (Criteria) this;
        }

        public Criteria andYuebandemandIn(List<Integer> values) {
            addCriterion("yuebandemand in", values, "yuebandemand");
            return (Criteria) this;
        }

        public Criteria andYuebandemandNotIn(List<Integer> values) {
            addCriterion("yuebandemand not in", values, "yuebandemand");
            return (Criteria) this;
        }

        public Criteria andYuebandemandBetween(Integer value1, Integer value2) {
            addCriterion("yuebandemand between", value1, value2, "yuebandemand");
            return (Criteria) this;
        }

        public Criteria andYuebandemandNotBetween(Integer value1, Integer value2) {
            addCriterion("yuebandemand not between", value1, value2, "yuebandemand");
            return (Criteria) this;
        }

        public Criteria andYuebanpersonsIsNull() {
            addCriterion("yuebanpersons is null");
            return (Criteria) this;
        }

        public Criteria andYuebanpersonsIsNotNull() {
            addCriterion("yuebanpersons is not null");
            return (Criteria) this;
        }

        public Criteria andYuebanpersonsEqualTo(Integer value) {
            addCriterion("yuebanpersons =", value, "yuebanpersons");
            return (Criteria) this;
        }

        public Criteria andYuebanpersonsNotEqualTo(Integer value) {
            addCriterion("yuebanpersons <>", value, "yuebanpersons");
            return (Criteria) this;
        }

        public Criteria andYuebanpersonsGreaterThan(Integer value) {
            addCriterion("yuebanpersons >", value, "yuebanpersons");
            return (Criteria) this;
        }

        public Criteria andYuebanpersonsGreaterThanOrEqualTo(Integer value) {
            addCriterion("yuebanpersons >=", value, "yuebanpersons");
            return (Criteria) this;
        }

        public Criteria andYuebanpersonsLessThan(Integer value) {
            addCriterion("yuebanpersons <", value, "yuebanpersons");
            return (Criteria) this;
        }

        public Criteria andYuebanpersonsLessThanOrEqualTo(Integer value) {
            addCriterion("yuebanpersons <=", value, "yuebanpersons");
            return (Criteria) this;
        }

        public Criteria andYuebanpersonsIn(List<Integer> values) {
            addCriterion("yuebanpersons in", values, "yuebanpersons");
            return (Criteria) this;
        }

        public Criteria andYuebanpersonsNotIn(List<Integer> values) {
            addCriterion("yuebanpersons not in", values, "yuebanpersons");
            return (Criteria) this;
        }

        public Criteria andYuebanpersonsBetween(Integer value1, Integer value2) {
            addCriterion("yuebanpersons between", value1, value2, "yuebanpersons");
            return (Criteria) this;
        }

        public Criteria andYuebanpersonsNotBetween(Integer value1, Integer value2) {
            addCriterion("yuebanpersons not between", value1, value2, "yuebanpersons");
            return (Criteria) this;
        }

        public Criteria andYuebanmoneyIsNull() {
            addCriterion("yuebanmoney is null");
            return (Criteria) this;
        }

        public Criteria andYuebanmoneyIsNotNull() {
            addCriterion("yuebanmoney is not null");
            return (Criteria) this;
        }

        public Criteria andYuebanmoneyEqualTo(Integer value) {
            addCriterion("yuebanmoney =", value, "yuebanmoney");
            return (Criteria) this;
        }

        public Criteria andYuebanmoneyNotEqualTo(Integer value) {
            addCriterion("yuebanmoney <>", value, "yuebanmoney");
            return (Criteria) this;
        }

        public Criteria andYuebanmoneyGreaterThan(Integer value) {
            addCriterion("yuebanmoney >", value, "yuebanmoney");
            return (Criteria) this;
        }

        public Criteria andYuebanmoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("yuebanmoney >=", value, "yuebanmoney");
            return (Criteria) this;
        }

        public Criteria andYuebanmoneyLessThan(Integer value) {
            addCriterion("yuebanmoney <", value, "yuebanmoney");
            return (Criteria) this;
        }

        public Criteria andYuebanmoneyLessThanOrEqualTo(Integer value) {
            addCriterion("yuebanmoney <=", value, "yuebanmoney");
            return (Criteria) this;
        }

        public Criteria andYuebanmoneyIn(List<Integer> values) {
            addCriterion("yuebanmoney in", values, "yuebanmoney");
            return (Criteria) this;
        }

        public Criteria andYuebanmoneyNotIn(List<Integer> values) {
            addCriterion("yuebanmoney not in", values, "yuebanmoney");
            return (Criteria) this;
        }

        public Criteria andYuebanmoneyBetween(Integer value1, Integer value2) {
            addCriterion("yuebanmoney between", value1, value2, "yuebanmoney");
            return (Criteria) this;
        }

        public Criteria andYuebanmoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("yuebanmoney not between", value1, value2, "yuebanmoney");
            return (Criteria) this;
        }

        public Criteria andYuebandescriptionIsNull() {
            addCriterion("yuebandescription is null");
            return (Criteria) this;
        }

        public Criteria andYuebandescriptionIsNotNull() {
            addCriterion("yuebandescription is not null");
            return (Criteria) this;
        }

        public Criteria andYuebandescriptionEqualTo(String value) {
            addCriterion("yuebandescription =", value, "yuebandescription");
            return (Criteria) this;
        }

        public Criteria andYuebandescriptionNotEqualTo(String value) {
            addCriterion("yuebandescription <>", value, "yuebandescription");
            return (Criteria) this;
        }

        public Criteria andYuebandescriptionGreaterThan(String value) {
            addCriterion("yuebandescription >", value, "yuebandescription");
            return (Criteria) this;
        }

        public Criteria andYuebandescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("yuebandescription >=", value, "yuebandescription");
            return (Criteria) this;
        }

        public Criteria andYuebandescriptionLessThan(String value) {
            addCriterion("yuebandescription <", value, "yuebandescription");
            return (Criteria) this;
        }

        public Criteria andYuebandescriptionLessThanOrEqualTo(String value) {
            addCriterion("yuebandescription <=", value, "yuebandescription");
            return (Criteria) this;
        }

        public Criteria andYuebandescriptionLike(String value) {
            addCriterion("yuebandescription like", value, "yuebandescription");
            return (Criteria) this;
        }

        public Criteria andYuebandescriptionNotLike(String value) {
            addCriterion("yuebandescription not like", value, "yuebandescription");
            return (Criteria) this;
        }

        public Criteria andYuebandescriptionIn(List<String> values) {
            addCriterion("yuebandescription in", values, "yuebandescription");
            return (Criteria) this;
        }

        public Criteria andYuebandescriptionNotIn(List<String> values) {
            addCriterion("yuebandescription not in", values, "yuebandescription");
            return (Criteria) this;
        }

        public Criteria andYuebandescriptionBetween(String value1, String value2) {
            addCriterion("yuebandescription between", value1, value2, "yuebandescription");
            return (Criteria) this;
        }

        public Criteria andYuebandescriptionNotBetween(String value1, String value2) {
            addCriterion("yuebandescription not between", value1, value2, "yuebandescription");
            return (Criteria) this;
        }

        public Criteria andYuebanimageIsNull() {
            addCriterion("yuebanimage is null");
            return (Criteria) this;
        }

        public Criteria andYuebanimageIsNotNull() {
            addCriterion("yuebanimage is not null");
            return (Criteria) this;
        }

        public Criteria andYuebanimageEqualTo(String value) {
            addCriterion("yuebanimage =", value, "yuebanimage");
            return (Criteria) this;
        }

        public Criteria andYuebanimageNotEqualTo(String value) {
            addCriterion("yuebanimage <>", value, "yuebanimage");
            return (Criteria) this;
        }

        public Criteria andYuebanimageGreaterThan(String value) {
            addCriterion("yuebanimage >", value, "yuebanimage");
            return (Criteria) this;
        }

        public Criteria andYuebanimageGreaterThanOrEqualTo(String value) {
            addCriterion("yuebanimage >=", value, "yuebanimage");
            return (Criteria) this;
        }

        public Criteria andYuebanimageLessThan(String value) {
            addCriterion("yuebanimage <", value, "yuebanimage");
            return (Criteria) this;
        }

        public Criteria andYuebanimageLessThanOrEqualTo(String value) {
            addCriterion("yuebanimage <=", value, "yuebanimage");
            return (Criteria) this;
        }

        public Criteria andYuebanimageLike(String value) {
            addCriterion("yuebanimage like", value, "yuebanimage");
            return (Criteria) this;
        }

        public Criteria andYuebanimageNotLike(String value) {
            addCriterion("yuebanimage not like", value, "yuebanimage");
            return (Criteria) this;
        }

        public Criteria andYuebanimageIn(List<String> values) {
            addCriterion("yuebanimage in", values, "yuebanimage");
            return (Criteria) this;
        }

        public Criteria andYuebanimageNotIn(List<String> values) {
            addCriterion("yuebanimage not in", values, "yuebanimage");
            return (Criteria) this;
        }

        public Criteria andYuebanimageBetween(String value1, String value2) {
            addCriterion("yuebanimage between", value1, value2, "yuebanimage");
            return (Criteria) this;
        }

        public Criteria andYuebanimageNotBetween(String value1, String value2) {
            addCriterion("yuebanimage not between", value1, value2, "yuebanimage");
            return (Criteria) this;
        }

        public Criteria andYuebancallIsNull() {
            addCriterion("yuebancall is null");
            return (Criteria) this;
        }

        public Criteria andYuebancallIsNotNull() {
            addCriterion("yuebancall is not null");
            return (Criteria) this;
        }

        public Criteria andYuebancallEqualTo(String value) {
            addCriterion("yuebancall =", value, "yuebancall");
            return (Criteria) this;
        }

        public Criteria andYuebancallNotEqualTo(String value) {
            addCriterion("yuebancall <>", value, "yuebancall");
            return (Criteria) this;
        }

        public Criteria andYuebancallGreaterThan(String value) {
            addCriterion("yuebancall >", value, "yuebancall");
            return (Criteria) this;
        }

        public Criteria andYuebancallGreaterThanOrEqualTo(String value) {
            addCriterion("yuebancall >=", value, "yuebancall");
            return (Criteria) this;
        }

        public Criteria andYuebancallLessThan(String value) {
            addCriterion("yuebancall <", value, "yuebancall");
            return (Criteria) this;
        }

        public Criteria andYuebancallLessThanOrEqualTo(String value) {
            addCriterion("yuebancall <=", value, "yuebancall");
            return (Criteria) this;
        }

        public Criteria andYuebancallLike(String value) {
            addCriterion("yuebancall like", value, "yuebancall");
            return (Criteria) this;
        }

        public Criteria andYuebancallNotLike(String value) {
            addCriterion("yuebancall not like", value, "yuebancall");
            return (Criteria) this;
        }

        public Criteria andYuebancallIn(List<String> values) {
            addCriterion("yuebancall in", values, "yuebancall");
            return (Criteria) this;
        }

        public Criteria andYuebancallNotIn(List<String> values) {
            addCriterion("yuebancall not in", values, "yuebancall");
            return (Criteria) this;
        }

        public Criteria andYuebancallBetween(String value1, String value2) {
            addCriterion("yuebancall between", value1, value2, "yuebancall");
            return (Criteria) this;
        }

        public Criteria andYuebancallNotBetween(String value1, String value2) {
            addCriterion("yuebancall not between", value1, value2, "yuebancall");
            return (Criteria) this;
        }

        public Criteria andYuebanwecatIsNull() {
            addCriterion("yuebanwecat is null");
            return (Criteria) this;
        }

        public Criteria andYuebanwecatIsNotNull() {
            addCriterion("yuebanwecat is not null");
            return (Criteria) this;
        }

        public Criteria andYuebanwecatEqualTo(String value) {
            addCriterion("yuebanwecat =", value, "yuebanwecat");
            return (Criteria) this;
        }

        public Criteria andYuebanwecatNotEqualTo(String value) {
            addCriterion("yuebanwecat <>", value, "yuebanwecat");
            return (Criteria) this;
        }

        public Criteria andYuebanwecatGreaterThan(String value) {
            addCriterion("yuebanwecat >", value, "yuebanwecat");
            return (Criteria) this;
        }

        public Criteria andYuebanwecatGreaterThanOrEqualTo(String value) {
            addCriterion("yuebanwecat >=", value, "yuebanwecat");
            return (Criteria) this;
        }

        public Criteria andYuebanwecatLessThan(String value) {
            addCriterion("yuebanwecat <", value, "yuebanwecat");
            return (Criteria) this;
        }

        public Criteria andYuebanwecatLessThanOrEqualTo(String value) {
            addCriterion("yuebanwecat <=", value, "yuebanwecat");
            return (Criteria) this;
        }

        public Criteria andYuebanwecatLike(String value) {
            addCriterion("yuebanwecat like", value, "yuebanwecat");
            return (Criteria) this;
        }

        public Criteria andYuebanwecatNotLike(String value) {
            addCriterion("yuebanwecat not like", value, "yuebanwecat");
            return (Criteria) this;
        }

        public Criteria andYuebanwecatIn(List<String> values) {
            addCriterion("yuebanwecat in", values, "yuebanwecat");
            return (Criteria) this;
        }

        public Criteria andYuebanwecatNotIn(List<String> values) {
            addCriterion("yuebanwecat not in", values, "yuebanwecat");
            return (Criteria) this;
        }

        public Criteria andYuebanwecatBetween(String value1, String value2) {
            addCriterion("yuebanwecat between", value1, value2, "yuebanwecat");
            return (Criteria) this;
        }

        public Criteria andYuebanwecatNotBetween(String value1, String value2) {
            addCriterion("yuebanwecat not between", value1, value2, "yuebanwecat");
            return (Criteria) this;
        }

        public Criteria andYuebanqqIsNull() {
            addCriterion("yuebanQQ is null");
            return (Criteria) this;
        }

        public Criteria andYuebanqqIsNotNull() {
            addCriterion("yuebanQQ is not null");
            return (Criteria) this;
        }

        public Criteria andYuebanqqEqualTo(String value) {
            addCriterion("yuebanQQ =", value, "yuebanqq");
            return (Criteria) this;
        }

        public Criteria andYuebanqqNotEqualTo(String value) {
            addCriterion("yuebanQQ <>", value, "yuebanqq");
            return (Criteria) this;
        }

        public Criteria andYuebanqqGreaterThan(String value) {
            addCriterion("yuebanQQ >", value, "yuebanqq");
            return (Criteria) this;
        }

        public Criteria andYuebanqqGreaterThanOrEqualTo(String value) {
            addCriterion("yuebanQQ >=", value, "yuebanqq");
            return (Criteria) this;
        }

        public Criteria andYuebanqqLessThan(String value) {
            addCriterion("yuebanQQ <", value, "yuebanqq");
            return (Criteria) this;
        }

        public Criteria andYuebanqqLessThanOrEqualTo(String value) {
            addCriterion("yuebanQQ <=", value, "yuebanqq");
            return (Criteria) this;
        }

        public Criteria andYuebanqqLike(String value) {
            addCriterion("yuebanQQ like", value, "yuebanqq");
            return (Criteria) this;
        }

        public Criteria andYuebanqqNotLike(String value) {
            addCriterion("yuebanQQ not like", value, "yuebanqq");
            return (Criteria) this;
        }

        public Criteria andYuebanqqIn(List<String> values) {
            addCriterion("yuebanQQ in", values, "yuebanqq");
            return (Criteria) this;
        }

        public Criteria andYuebanqqNotIn(List<String> values) {
            addCriterion("yuebanQQ not in", values, "yuebanqq");
            return (Criteria) this;
        }

        public Criteria andYuebanqqBetween(String value1, String value2) {
            addCriterion("yuebanQQ between", value1, value2, "yuebanqq");
            return (Criteria) this;
        }

        public Criteria andYuebanqqNotBetween(String value1, String value2) {
            addCriterion("yuebanQQ not between", value1, value2, "yuebanqq");
            return (Criteria) this;
        }

        public Criteria andYuebancurrentadressIsNull() {
            addCriterion("yuebancurrentadress is null");
            return (Criteria) this;
        }

        public Criteria andYuebancurrentadressIsNotNull() {
            addCriterion("yuebancurrentadress is not null");
            return (Criteria) this;
        }

        public Criteria andYuebancurrentadressEqualTo(String value) {
            addCriterion("yuebancurrentadress =", value, "yuebancurrentadress");
            return (Criteria) this;
        }

        public Criteria andYuebancurrentadressNotEqualTo(String value) {
            addCriterion("yuebancurrentadress <>", value, "yuebancurrentadress");
            return (Criteria) this;
        }

        public Criteria andYuebancurrentadressGreaterThan(String value) {
            addCriterion("yuebancurrentadress >", value, "yuebancurrentadress");
            return (Criteria) this;
        }

        public Criteria andYuebancurrentadressGreaterThanOrEqualTo(String value) {
            addCriterion("yuebancurrentadress >=", value, "yuebancurrentadress");
            return (Criteria) this;
        }

        public Criteria andYuebancurrentadressLessThan(String value) {
            addCriterion("yuebancurrentadress <", value, "yuebancurrentadress");
            return (Criteria) this;
        }

        public Criteria andYuebancurrentadressLessThanOrEqualTo(String value) {
            addCriterion("yuebancurrentadress <=", value, "yuebancurrentadress");
            return (Criteria) this;
        }

        public Criteria andYuebancurrentadressLike(String value) {
            addCriterion("yuebancurrentadress like", value, "yuebancurrentadress");
            return (Criteria) this;
        }

        public Criteria andYuebancurrentadressNotLike(String value) {
            addCriterion("yuebancurrentadress not like", value, "yuebancurrentadress");
            return (Criteria) this;
        }

        public Criteria andYuebancurrentadressIn(List<String> values) {
            addCriterion("yuebancurrentadress in", values, "yuebancurrentadress");
            return (Criteria) this;
        }

        public Criteria andYuebancurrentadressNotIn(List<String> values) {
            addCriterion("yuebancurrentadress not in", values, "yuebancurrentadress");
            return (Criteria) this;
        }

        public Criteria andYuebancurrentadressBetween(String value1, String value2) {
            addCriterion("yuebancurrentadress between", value1, value2, "yuebancurrentadress");
            return (Criteria) this;
        }

        public Criteria andYuebancurrentadressNotBetween(String value1, String value2) {
            addCriterion("yuebancurrentadress not between", value1, value2, "yuebancurrentadress");
            return (Criteria) this;
        }

        public Criteria andYuebanprotocolstatusIsNull() {
            addCriterion("yuebanprotocolstatus is null");
            return (Criteria) this;
        }

        public Criteria andYuebanprotocolstatusIsNotNull() {
            addCriterion("yuebanprotocolstatus is not null");
            return (Criteria) this;
        }

        public Criteria andYuebanprotocolstatusEqualTo(Integer value) {
            addCriterion("yuebanprotocolstatus =", value, "yuebanprotocolstatus");
            return (Criteria) this;
        }

        public Criteria andYuebanprotocolstatusNotEqualTo(Integer value) {
            addCriterion("yuebanprotocolstatus <>", value, "yuebanprotocolstatus");
            return (Criteria) this;
        }

        public Criteria andYuebanprotocolstatusGreaterThan(Integer value) {
            addCriterion("yuebanprotocolstatus >", value, "yuebanprotocolstatus");
            return (Criteria) this;
        }

        public Criteria andYuebanprotocolstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("yuebanprotocolstatus >=", value, "yuebanprotocolstatus");
            return (Criteria) this;
        }

        public Criteria andYuebanprotocolstatusLessThan(Integer value) {
            addCriterion("yuebanprotocolstatus <", value, "yuebanprotocolstatus");
            return (Criteria) this;
        }

        public Criteria andYuebanprotocolstatusLessThanOrEqualTo(Integer value) {
            addCriterion("yuebanprotocolstatus <=", value, "yuebanprotocolstatus");
            return (Criteria) this;
        }

        public Criteria andYuebanprotocolstatusIn(List<Integer> values) {
            addCriterion("yuebanprotocolstatus in", values, "yuebanprotocolstatus");
            return (Criteria) this;
        }

        public Criteria andYuebanprotocolstatusNotIn(List<Integer> values) {
            addCriterion("yuebanprotocolstatus not in", values, "yuebanprotocolstatus");
            return (Criteria) this;
        }

        public Criteria andYuebanprotocolstatusBetween(Integer value1, Integer value2) {
            addCriterion("yuebanprotocolstatus between", value1, value2, "yuebanprotocolstatus");
            return (Criteria) this;
        }

        public Criteria andYuebanprotocolstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("yuebanprotocolstatus not between", value1, value2, "yuebanprotocolstatus");
            return (Criteria) this;
        }

        public Criteria andYuebanuserIdIsNull() {
            addCriterion("yuebanuser_id is null");
            return (Criteria) this;
        }

        public Criteria andYuebanuserIdIsNotNull() {
            addCriterion("yuebanuser_id is not null");
            return (Criteria) this;
        }

        public Criteria andYuebanuserIdEqualTo(Integer value) {
            addCriterion("yuebanuser_id =", value, "yuebanuserId");
            return (Criteria) this;
        }

        public Criteria andYuebanuserIdNotEqualTo(Integer value) {
            addCriterion("yuebanuser_id <>", value, "yuebanuserId");
            return (Criteria) this;
        }

        public Criteria andYuebanuserIdGreaterThan(Integer value) {
            addCriterion("yuebanuser_id >", value, "yuebanuserId");
            return (Criteria) this;
        }

        public Criteria andYuebanuserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("yuebanuser_id >=", value, "yuebanuserId");
            return (Criteria) this;
        }

        public Criteria andYuebanuserIdLessThan(Integer value) {
            addCriterion("yuebanuser_id <", value, "yuebanuserId");
            return (Criteria) this;
        }

        public Criteria andYuebanuserIdLessThanOrEqualTo(Integer value) {
            addCriterion("yuebanuser_id <=", value, "yuebanuserId");
            return (Criteria) this;
        }

        public Criteria andYuebanuserIdIn(List<Integer> values) {
            addCriterion("yuebanuser_id in", values, "yuebanuserId");
            return (Criteria) this;
        }

        public Criteria andYuebanuserIdNotIn(List<Integer> values) {
            addCriterion("yuebanuser_id not in", values, "yuebanuserId");
            return (Criteria) this;
        }

        public Criteria andYuebanuserIdBetween(Integer value1, Integer value2) {
            addCriterion("yuebanuser_id between", value1, value2, "yuebanuserId");
            return (Criteria) this;
        }

        public Criteria andYuebanuserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("yuebanuser_id not between", value1, value2, "yuebanuserId");
            return (Criteria) this;
        }

        public Criteria andYuebanscoreIsNull() {
            addCriterion("yuebanscore is null");
            return (Criteria) this;
        }

        public Criteria andYuebanscoreIsNotNull() {
            addCriterion("yuebanscore is not null");
            return (Criteria) this;
        }

        public Criteria andYuebanscoreEqualTo(Integer value) {
            addCriterion("yuebanscore =", value, "yuebanscore");
            return (Criteria) this;
        }

        public Criteria andYuebanscoreNotEqualTo(Integer value) {
            addCriterion("yuebanscore <>", value, "yuebanscore");
            return (Criteria) this;
        }

        public Criteria andYuebanscoreGreaterThan(Integer value) {
            addCriterion("yuebanscore >", value, "yuebanscore");
            return (Criteria) this;
        }

        public Criteria andYuebanscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("yuebanscore >=", value, "yuebanscore");
            return (Criteria) this;
        }

        public Criteria andYuebanscoreLessThan(Integer value) {
            addCriterion("yuebanscore <", value, "yuebanscore");
            return (Criteria) this;
        }

        public Criteria andYuebanscoreLessThanOrEqualTo(Integer value) {
            addCriterion("yuebanscore <=", value, "yuebanscore");
            return (Criteria) this;
        }

        public Criteria andYuebanscoreIn(List<Integer> values) {
            addCriterion("yuebanscore in", values, "yuebanscore");
            return (Criteria) this;
        }

        public Criteria andYuebanscoreNotIn(List<Integer> values) {
            addCriterion("yuebanscore not in", values, "yuebanscore");
            return (Criteria) this;
        }

        public Criteria andYuebanscoreBetween(Integer value1, Integer value2) {
            addCriterion("yuebanscore between", value1, value2, "yuebanscore");
            return (Criteria) this;
        }

        public Criteria andYuebanscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("yuebanscore not between", value1, value2, "yuebanscore");
            return (Criteria) this;
        }

        public Criteria andUinqueIsNull() {
            addCriterion("uinque is null");
            return (Criteria) this;
        }

        public Criteria andUinqueIsNotNull() {
            addCriterion("uinque is not null");
            return (Criteria) this;
        }

        public Criteria andUinqueEqualTo(String value) {
            addCriterion("uinque =", value, "uinque");
            return (Criteria) this;
        }

        public Criteria andUinqueNotEqualTo(String value) {
            addCriterion("uinque <>", value, "uinque");
            return (Criteria) this;
        }

        public Criteria andUinqueGreaterThan(String value) {
            addCriterion("uinque >", value, "uinque");
            return (Criteria) this;
        }

        public Criteria andUinqueGreaterThanOrEqualTo(String value) {
            addCriterion("uinque >=", value, "uinque");
            return (Criteria) this;
        }

        public Criteria andUinqueLessThan(String value) {
            addCriterion("uinque <", value, "uinque");
            return (Criteria) this;
        }

        public Criteria andUinqueLessThanOrEqualTo(String value) {
            addCriterion("uinque <=", value, "uinque");
            return (Criteria) this;
        }

        public Criteria andUinqueLike(String value) {
            addCriterion("uinque like", value, "uinque");
            return (Criteria) this;
        }

        public Criteria andUinqueNotLike(String value) {
            addCriterion("uinque not like", value, "uinque");
            return (Criteria) this;
        }

        public Criteria andUinqueIn(List<String> values) {
            addCriterion("uinque in", values, "uinque");
            return (Criteria) this;
        }

        public Criteria andUinqueNotIn(List<String> values) {
            addCriterion("uinque not in", values, "uinque");
            return (Criteria) this;
        }

        public Criteria andUinqueBetween(String value1, String value2) {
            addCriterion("uinque between", value1, value2, "uinque");
            return (Criteria) this;
        }

        public Criteria andUinqueNotBetween(String value1, String value2) {
            addCriterion("uinque not between", value1, value2, "uinque");
            return (Criteria) this;
        }

        public Criteria andYuebanpublishtimeIsNull() {
            addCriterion("yuebanpublishtime is null");
            return (Criteria) this;
        }

        public Criteria andYuebanpublishtimeIsNotNull() {
            addCriterion("yuebanpublishtime is not null");
            return (Criteria) this;
        }

        public Criteria andYuebanpublishtimeEqualTo(String value) {
            addCriterion("yuebanpublishtime =", value, "yuebanpublishtime");
            return (Criteria) this;
        }

        public Criteria andYuebanpublishtimeNotEqualTo(String value) {
            addCriterion("yuebanpublishtime <>", value, "yuebanpublishtime");
            return (Criteria) this;
        }

        public Criteria andYuebanpublishtimeGreaterThan(String value) {
            addCriterion("yuebanpublishtime >", value, "yuebanpublishtime");
            return (Criteria) this;
        }

        public Criteria andYuebanpublishtimeGreaterThanOrEqualTo(String value) {
            addCriterion("yuebanpublishtime >=", value, "yuebanpublishtime");
            return (Criteria) this;
        }

        public Criteria andYuebanpublishtimeLessThan(String value) {
            addCriterion("yuebanpublishtime <", value, "yuebanpublishtime");
            return (Criteria) this;
        }

        public Criteria andYuebanpublishtimeLessThanOrEqualTo(String value) {
            addCriterion("yuebanpublishtime <=", value, "yuebanpublishtime");
            return (Criteria) this;
        }

        public Criteria andYuebanpublishtimeIn(List<String> values) {
            addCriterion("yuebanpublishtime in", values, "yuebanpublishtime");
            return (Criteria) this;
        }

        public Criteria andYuebanpublishtimeNotIn(List<String> values) {
            addCriterion("yuebanpublishtime not in", values, "yuebanpublishtime");
            return (Criteria) this;
        }

        public Criteria andYuebanpublishtimeBetween(String value1, String value2) {
            addCriterion("yuebanpublishtime between", value1, value2, "yuebanpublishtime");
            return (Criteria) this;
        }

        public Criteria andYuebanpublishtimeNotBetween(String value1, String value2) {
            addCriterion("yuebanpublishtime not between", value1, value2, "yuebanpublishtime");
            return (Criteria) this;
        }

        public Criteria andYuebanprovinceIsNull() {
            addCriterion("yuebanprovince is null");
            return (Criteria) this;
        }

        public Criteria andYuebanprovinceIsNotNull() {
            addCriterion("yuebanprovince is not null");
            return (Criteria) this;
        }

        public Criteria andYuebanprovinceEqualTo(Integer value) {
            addCriterion("yuebanprovince =", value, "yuebanprovince");
            return (Criteria) this;
        }

        public Criteria andYuebanprovinceNotEqualTo(Integer value) {
            addCriterion("yuebanprovince <>", value, "yuebanprovince");
            return (Criteria) this;
        }

        public Criteria andYuebanprovinceGreaterThan(Integer value) {
            addCriterion("yuebanprovince >", value, "yuebanprovince");
            return (Criteria) this;
        }

        public Criteria andYuebanprovinceGreaterThanOrEqualTo(Integer value) {
            addCriterion("yuebanprovince >=", value, "yuebanprovince");
            return (Criteria) this;
        }

        public Criteria andYuebanprovinceLessThan(Integer value) {
            addCriterion("yuebanprovince <", value, "yuebanprovince");
            return (Criteria) this;
        }

        public Criteria andYuebanprovinceLessThanOrEqualTo(Integer value) {
            addCriterion("yuebanprovince <=", value, "yuebanprovince");
            return (Criteria) this;
        }

        public Criteria andYuebanprovinceIn(List<Integer> values) {
            addCriterion("yuebanprovince in", values, "yuebanprovince");
            return (Criteria) this;
        }

        public Criteria andYuebanprovinceNotIn(List<Integer> values) {
            addCriterion("yuebanprovince not in", values, "yuebanprovince");
            return (Criteria) this;
        }

        public Criteria andYuebanprovinceBetween(Integer value1, Integer value2) {
            addCriterion("yuebanprovince between", value1, value2, "yuebanprovince");
            return (Criteria) this;
        }

        public Criteria andYuebanprovinceNotBetween(Integer value1, Integer value2) {
            addCriterion("yuebanprovince not between", value1, value2, "yuebanprovince");
            return (Criteria) this;
        }

        public Criteria andYuebancityIsNull() {
            addCriterion("yuebancity is null");
            return (Criteria) this;
        }

        public Criteria andYuebancityIsNotNull() {
            addCriterion("yuebancity is not null");
            return (Criteria) this;
        }

        public Criteria andYuebancityEqualTo(String value) {
            addCriterion("yuebancity =", value, "yuebancity");
            return (Criteria) this;
        }

        public Criteria andYuebancityNotEqualTo(String value) {
            addCriterion("yuebancity <>", value, "yuebancity");
            return (Criteria) this;
        }

        public Criteria andYuebancityGreaterThan(String value) {
            addCriterion("yuebancity >", value, "yuebancity");
            return (Criteria) this;
        }

        public Criteria andYuebancityGreaterThanOrEqualTo(String value) {
            addCriterion("yuebancity >=", value, "yuebancity");
            return (Criteria) this;
        }

        public Criteria andYuebancityLessThan(String value) {
            addCriterion("yuebancity <", value, "yuebancity");
            return (Criteria) this;
        }

        public Criteria andYuebancityLessThanOrEqualTo(String value) {
            addCriterion("yuebancity <=", value, "yuebancity");
            return (Criteria) this;
        }

        public Criteria andYuebancityLike(String value) {
            addCriterion("yuebancity like", value, "yuebancity");
            return (Criteria) this;
        }

        public Criteria andYuebancityNotLike(String value) {
            addCriterion("yuebancity not like", value, "yuebancity");
            return (Criteria) this;
        }

        public Criteria andYuebancityIn(List<String> values) {
            addCriterion("yuebancity in", values, "yuebancity");
            return (Criteria) this;
        }

        public Criteria andYuebancityNotIn(List<String> values) {
            addCriterion("yuebancity not in", values, "yuebancity");
            return (Criteria) this;
        }

        public Criteria andYuebancityBetween(String value1, String value2) {
            addCriterion("yuebancity between", value1, value2, "yuebancity");
            return (Criteria) this;
        }

        public Criteria andYuebancityNotBetween(String value1, String value2) {
            addCriterion("yuebancity not between", value1, value2, "yuebancity");
            return (Criteria) this;
        }

        public Criteria andYuebaniconIsNull() {
            addCriterion("yuebanicon is null");
            return (Criteria) this;
        }

        public Criteria andYuebaniconIsNotNull() {
            addCriterion("yuebanicon is not null");
            return (Criteria) this;
        }

        public Criteria andYuebaniconEqualTo(String value) {
            addCriterion("yuebanicon =", value, "yuebanicon");
            return (Criteria) this;
        }

        public Criteria andYuebaniconNotEqualTo(String value) {
            addCriterion("yuebanicon <>", value, "yuebanicon");
            return (Criteria) this;
        }

        public Criteria andYuebaniconGreaterThan(String value) {
            addCriterion("yuebanicon >", value, "yuebanicon");
            return (Criteria) this;
        }

        public Criteria andYuebaniconGreaterThanOrEqualTo(String value) {
            addCriterion("yuebanicon >=", value, "yuebanicon");
            return (Criteria) this;
        }

        public Criteria andYuebaniconLessThan(String value) {
            addCriterion("yuebanicon <", value, "yuebanicon");
            return (Criteria) this;
        }

        public Criteria andYuebaniconLessThanOrEqualTo(String value) {
            addCriterion("yuebanicon <=", value, "yuebanicon");
            return (Criteria) this;
        }

        public Criteria andYuebaniconLike(String value) {
            addCriterion("yuebanicon like", value, "yuebanicon");
            return (Criteria) this;
        }

        public Criteria andYuebaniconNotLike(String value) {
            addCriterion("yuebanicon not like", value, "yuebanicon");
            return (Criteria) this;
        }

        public Criteria andYuebaniconIn(List<String> values) {
            addCriterion("yuebanicon in", values, "yuebanicon");
            return (Criteria) this;
        }

        public Criteria andYuebaniconNotIn(List<String> values) {
            addCriterion("yuebanicon not in", values, "yuebanicon");
            return (Criteria) this;
        }

        public Criteria andYuebaniconBetween(String value1, String value2) {
            addCriterion("yuebanicon between", value1, value2, "yuebanicon");
            return (Criteria) this;
        }

        public Criteria andYuebaniconNotBetween(String value1, String value2) {
            addCriterion("yuebanicon not between", value1, value2, "yuebanicon");
            return (Criteria) this;
        }

        public Criteria andYuebannameIsNull() {
            addCriterion("yuebanname is null");
            return (Criteria) this;
        }

        public Criteria andYuebannameIsNotNull() {
            addCriterion("yuebanname is not null");
            return (Criteria) this;
        }

        public Criteria andYuebannameEqualTo(String value) {
            addCriterion("yuebanname =", value, "yuebanname");
            return (Criteria) this;
        }

        public Criteria andYuebannameNotEqualTo(String value) {
            addCriterion("yuebanname <>", value, "yuebanname");
            return (Criteria) this;
        }

        public Criteria andYuebannameGreaterThan(String value) {
            addCriterion("yuebanname >", value, "yuebanname");
            return (Criteria) this;
        }

        public Criteria andYuebannameGreaterThanOrEqualTo(String value) {
            addCriterion("yuebanname >=", value, "yuebanname");
            return (Criteria) this;
        }

        public Criteria andYuebannameLessThan(String value) {
            addCriterion("yuebanname <", value, "yuebanname");
            return (Criteria) this;
        }

        public Criteria andYuebannameLessThanOrEqualTo(String value) {
            addCriterion("yuebanname <=", value, "yuebanname");
            return (Criteria) this;
        }

        public Criteria andYuebannameLike(String value) {
            addCriterion("yuebanname like", value, "yuebanname");
            return (Criteria) this;
        }

        public Criteria andYuebannameNotLike(String value) {
            addCriterion("yuebanname not like", value, "yuebanname");
            return (Criteria) this;
        }

        public Criteria andYuebannameIn(List<String> values) {
            addCriterion("yuebanname in", values, "yuebanname");
            return (Criteria) this;
        }

        public Criteria andYuebannameNotIn(List<String> values) {
            addCriterion("yuebanname not in", values, "yuebanname");
            return (Criteria) this;
        }

        public Criteria andYuebannameBetween(String value1, String value2) {
            addCriterion("yuebanname between", value1, value2, "yuebanname");
            return (Criteria) this;
        }

        public Criteria andYuebannameNotBetween(String value1, String value2) {
            addCriterion("yuebanname not between", value1, value2, "yuebanname");
            return (Criteria) this;
        }

        public Criteria andYuebanlongitudeIsNull() {
            addCriterion("yuebanlongitude is null");
            return (Criteria) this;
        }

        public Criteria andYuebanlongitudeIsNotNull() {
            addCriterion("yuebanlongitude is not null");
            return (Criteria) this;
        }

        public Criteria andYuebanlongitudeEqualTo(String value) {
            addCriterion("yuebanlongitude =", value, "yuebanlongitude");
            return (Criteria) this;
        }

        public Criteria andYuebanlongitudeNotEqualTo(String value) {
            addCriterion("yuebanlongitude <>", value, "yuebanlongitude");
            return (Criteria) this;
        }

        public Criteria andYuebanlongitudeGreaterThan(String value) {
            addCriterion("yuebanlongitude >", value, "yuebanlongitude");
            return (Criteria) this;
        }

        public Criteria andYuebanlongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("yuebanlongitude >=", value, "yuebanlongitude");
            return (Criteria) this;
        }

        public Criteria andYuebanlongitudeLessThan(String value) {
            addCriterion("yuebanlongitude <", value, "yuebanlongitude");
            return (Criteria) this;
        }

        public Criteria andYuebanlongitudeLessThanOrEqualTo(String value) {
            addCriterion("yuebanlongitude <=", value, "yuebanlongitude");
            return (Criteria) this;
        }

        public Criteria andYuebanlongitudeLike(String value) {
            addCriterion("yuebanlongitude like", value, "yuebanlongitude");
            return (Criteria) this;
        }

        public Criteria andYuebanlongitudeNotLike(String value) {
            addCriterion("yuebanlongitude not like", value, "yuebanlongitude");
            return (Criteria) this;
        }

        public Criteria andYuebanlongitudeIn(List<String> values) {
            addCriterion("yuebanlongitude in", values, "yuebanlongitude");
            return (Criteria) this;
        }

        public Criteria andYuebanlongitudeNotIn(List<String> values) {
            addCriterion("yuebanlongitude not in", values, "yuebanlongitude");
            return (Criteria) this;
        }

        public Criteria andYuebanlongitudeBetween(String value1, String value2) {
            addCriterion("yuebanlongitude between", value1, value2, "yuebanlongitude");
            return (Criteria) this;
        }

        public Criteria andYuebanlongitudeNotBetween(String value1, String value2) {
            addCriterion("yuebanlongitude not between", value1, value2, "yuebanlongitude");
            return (Criteria) this;
        }

        public Criteria andYuebanlatitudeIsNull() {
            addCriterion("yuebanlatitude is null");
            return (Criteria) this;
        }

        public Criteria andYuebanlatitudeIsNotNull() {
            addCriterion("yuebanlatitude is not null");
            return (Criteria) this;
        }

        public Criteria andYuebanlatitudeEqualTo(String value) {
            addCriterion("yuebanlatitude =", value, "yuebanlatitude");
            return (Criteria) this;
        }

        public Criteria andYuebanlatitudeNotEqualTo(String value) {
            addCriterion("yuebanlatitude <>", value, "yuebanlatitude");
            return (Criteria) this;
        }

        public Criteria andYuebanlatitudeGreaterThan(String value) {
            addCriterion("yuebanlatitude >", value, "yuebanlatitude");
            return (Criteria) this;
        }

        public Criteria andYuebanlatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("yuebanlatitude >=", value, "yuebanlatitude");
            return (Criteria) this;
        }

        public Criteria andYuebanlatitudeLessThan(String value) {
            addCriterion("yuebanlatitude <", value, "yuebanlatitude");
            return (Criteria) this;
        }

        public Criteria andYuebanlatitudeLessThanOrEqualTo(String value) {
            addCriterion("yuebanlatitude <=", value, "yuebanlatitude");
            return (Criteria) this;
        }

        public Criteria andYuebanlatitudeLike(String value) {
            addCriterion("yuebanlatitude like", value, "yuebanlatitude");
            return (Criteria) this;
        }

        public Criteria andYuebanlatitudeNotLike(String value) {
            addCriterion("yuebanlatitude not like", value, "yuebanlatitude");
            return (Criteria) this;
        }

        public Criteria andYuebanlatitudeIn(List<String> values) {
            addCriterion("yuebanlatitude in", values, "yuebanlatitude");
            return (Criteria) this;
        }

        public Criteria andYuebanlatitudeNotIn(List<String> values) {
            addCriterion("yuebanlatitude not in", values, "yuebanlatitude");
            return (Criteria) this;
        }

        public Criteria andYuebanlatitudeBetween(String value1, String value2) {
            addCriterion("yuebanlatitude between", value1, value2, "yuebanlatitude");
            return (Criteria) this;
        }

        public Criteria andYuebanlatitudeNotBetween(String value1, String value2) {
            addCriterion("yuebanlatitude not between", value1, value2, "yuebanlatitude");
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