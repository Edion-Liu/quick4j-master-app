package com.eliteams.quick4j.web.model;

import java.util.ArrayList;
import java.util.List;

public class NewSoftwareExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewSoftwareExample() {
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

        public Criteria andRangeupdateminidIsNull() {
            addCriterion("rangeupdateminid is null");
            return (Criteria) this;
        }

        public Criteria andRangeupdateminidIsNotNull() {
            addCriterion("rangeupdateminid is not null");
            return (Criteria) this;
        }

        public Criteria andRangeupdateminidEqualTo(Integer value) {
            addCriterion("rangeupdateminid =", value, "rangeupdateminid");
            return (Criteria) this;
        }

        public Criteria andRangeupdateminidNotEqualTo(Integer value) {
            addCriterion("rangeupdateminid <>", value, "rangeupdateminid");
            return (Criteria) this;
        }

        public Criteria andRangeupdateminidGreaterThan(Integer value) {
            addCriterion("rangeupdateminid >", value, "rangeupdateminid");
            return (Criteria) this;
        }

        public Criteria andRangeupdateminidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rangeupdateminid >=", value, "rangeupdateminid");
            return (Criteria) this;
        }

        public Criteria andRangeupdateminidLessThan(Integer value) {
            addCriterion("rangeupdateminid <", value, "rangeupdateminid");
            return (Criteria) this;
        }

        public Criteria andRangeupdateminidLessThanOrEqualTo(Integer value) {
            addCriterion("rangeupdateminid <=", value, "rangeupdateminid");
            return (Criteria) this;
        }

        public Criteria andRangeupdateminidIn(List<Integer> values) {
            addCriterion("rangeupdateminid in", values, "rangeupdateminid");
            return (Criteria) this;
        }

        public Criteria andRangeupdateminidNotIn(List<Integer> values) {
            addCriterion("rangeupdateminid not in", values, "rangeupdateminid");
            return (Criteria) this;
        }

        public Criteria andRangeupdateminidBetween(Integer value1, Integer value2) {
            addCriterion("rangeupdateminid between", value1, value2, "rangeupdateminid");
            return (Criteria) this;
        }

        public Criteria andRangeupdateminidNotBetween(Integer value1, Integer value2) {
            addCriterion("rangeupdateminid not between", value1, value2, "rangeupdateminid");
            return (Criteria) this;
        }

        public Criteria andRangeupdatemaxidIsNull() {
            addCriterion("rangeupdatemaxid is null");
            return (Criteria) this;
        }

        public Criteria andRangeupdatemaxidIsNotNull() {
            addCriterion("rangeupdatemaxid is not null");
            return (Criteria) this;
        }

        public Criteria andRangeupdatemaxidEqualTo(Integer value) {
            addCriterion("rangeupdatemaxid =", value, "rangeupdatemaxid");
            return (Criteria) this;
        }

        public Criteria andRangeupdatemaxidNotEqualTo(Integer value) {
            addCriterion("rangeupdatemaxid <>", value, "rangeupdatemaxid");
            return (Criteria) this;
        }

        public Criteria andRangeupdatemaxidGreaterThan(Integer value) {
            addCriterion("rangeupdatemaxid >", value, "rangeupdatemaxid");
            return (Criteria) this;
        }

        public Criteria andRangeupdatemaxidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rangeupdatemaxid >=", value, "rangeupdatemaxid");
            return (Criteria) this;
        }

        public Criteria andRangeupdatemaxidLessThan(Integer value) {
            addCriterion("rangeupdatemaxid <", value, "rangeupdatemaxid");
            return (Criteria) this;
        }

        public Criteria andRangeupdatemaxidLessThanOrEqualTo(Integer value) {
            addCriterion("rangeupdatemaxid <=", value, "rangeupdatemaxid");
            return (Criteria) this;
        }

        public Criteria andRangeupdatemaxidIn(List<Integer> values) {
            addCriterion("rangeupdatemaxid in", values, "rangeupdatemaxid");
            return (Criteria) this;
        }

        public Criteria andRangeupdatemaxidNotIn(List<Integer> values) {
            addCriterion("rangeupdatemaxid not in", values, "rangeupdatemaxid");
            return (Criteria) this;
        }

        public Criteria andRangeupdatemaxidBetween(Integer value1, Integer value2) {
            addCriterion("rangeupdatemaxid between", value1, value2, "rangeupdatemaxid");
            return (Criteria) this;
        }

        public Criteria andRangeupdatemaxidNotBetween(Integer value1, Integer value2) {
            addCriterion("rangeupdatemaxid not between", value1, value2, "rangeupdatemaxid");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andAppurlIsNull() {
            addCriterion("appurl is null");
            return (Criteria) this;
        }

        public Criteria andAppurlIsNotNull() {
            addCriterion("appurl is not null");
            return (Criteria) this;
        }

        public Criteria andAppurlEqualTo(String value) {
            addCriterion("appurl =", value, "appurl");
            return (Criteria) this;
        }

        public Criteria andAppurlNotEqualTo(String value) {
            addCriterion("appurl <>", value, "appurl");
            return (Criteria) this;
        }

        public Criteria andAppurlGreaterThan(String value) {
            addCriterion("appurl >", value, "appurl");
            return (Criteria) this;
        }

        public Criteria andAppurlGreaterThanOrEqualTo(String value) {
            addCriterion("appurl >=", value, "appurl");
            return (Criteria) this;
        }

        public Criteria andAppurlLessThan(String value) {
            addCriterion("appurl <", value, "appurl");
            return (Criteria) this;
        }

        public Criteria andAppurlLessThanOrEqualTo(String value) {
            addCriterion("appurl <=", value, "appurl");
            return (Criteria) this;
        }

        public Criteria andAppurlLike(String value) {
            addCriterion("appurl like", value, "appurl");
            return (Criteria) this;
        }

        public Criteria andAppurlNotLike(String value) {
            addCriterion("appurl not like", value, "appurl");
            return (Criteria) this;
        }

        public Criteria andAppurlIn(List<String> values) {
            addCriterion("appurl in", values, "appurl");
            return (Criteria) this;
        }

        public Criteria andAppurlNotIn(List<String> values) {
            addCriterion("appurl not in", values, "appurl");
            return (Criteria) this;
        }

        public Criteria andAppurlBetween(String value1, String value2) {
            addCriterion("appurl between", value1, value2, "appurl");
            return (Criteria) this;
        }

        public Criteria andAppurlNotBetween(String value1, String value2) {
            addCriterion("appurl not between", value1, value2, "appurl");
            return (Criteria) this;
        }

        public Criteria andPublishdateIsNull() {
            addCriterion("publishdate is null");
            return (Criteria) this;
        }

        public Criteria andPublishdateIsNotNull() {
            addCriterion("publishdate is not null");
            return (Criteria) this;
        }

        public Criteria andPublishdateEqualTo(String value) {
            addCriterion("publishdate =", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateNotEqualTo(String value) {
            addCriterion("publishdate <>", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateGreaterThan(String value) {
            addCriterion("publishdate >", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateGreaterThanOrEqualTo(String value) {
            addCriterion("publishdate >=", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateLessThan(String value) {
            addCriterion("publishdate <", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateLessThanOrEqualTo(String value) {
            addCriterion("publishdate <=", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateIn(List<String> values) {
            addCriterion("publishdate in", values, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateNotIn(List<String> values) {
            addCriterion("publishdate not in", values, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateBetween(String value1, String value2) {
            addCriterion("publishdate between", value1, value2, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateNotBetween(String value1, String value2) {
            addCriterion("publishdate not between", value1, value2, "publishdate");
            return (Criteria) this;
        }

        public Criteria andNewdescribeIsNull() {
            addCriterion("newdescribe is null");
            return (Criteria) this;
        }

        public Criteria andNewdescribeIsNotNull() {
            addCriterion("newdescribe is not null");
            return (Criteria) this;
        }

        public Criteria andNewdescribeEqualTo(String value) {
            addCriterion("newdescribe =", value, "newdescribe");
            return (Criteria) this;
        }

        public Criteria andNewdescribeNotEqualTo(String value) {
            addCriterion("newdescribe <>", value, "newdescribe");
            return (Criteria) this;
        }

        public Criteria andNewdescribeGreaterThan(String value) {
            addCriterion("newdescribe >", value, "newdescribe");
            return (Criteria) this;
        }

        public Criteria andNewdescribeGreaterThanOrEqualTo(String value) {
            addCriterion("newdescribe >=", value, "newdescribe");
            return (Criteria) this;
        }

        public Criteria andNewdescribeLessThan(String value) {
            addCriterion("newdescribe <", value, "newdescribe");
            return (Criteria) this;
        }

        public Criteria andNewdescribeLessThanOrEqualTo(String value) {
            addCriterion("newdescribe <=", value, "newdescribe");
            return (Criteria) this;
        }

        public Criteria andNewdescribeLike(String value) {
            addCriterion("newdescribe like", value, "newdescribe");
            return (Criteria) this;
        }

        public Criteria andNewdescribeNotLike(String value) {
            addCriterion("newdescribe not like", value, "newdescribe");
            return (Criteria) this;
        }

        public Criteria andNewdescribeIn(List<String> values) {
            addCriterion("newdescribe in", values, "newdescribe");
            return (Criteria) this;
        }

        public Criteria andNewdescribeNotIn(List<String> values) {
            addCriterion("newdescribe not in", values, "newdescribe");
            return (Criteria) this;
        }

        public Criteria andNewdescribeBetween(String value1, String value2) {
            addCriterion("newdescribe between", value1, value2, "newdescribe");
            return (Criteria) this;
        }

        public Criteria andNewdescribeNotBetween(String value1, String value2) {
            addCriterion("newdescribe not between", value1, value2, "newdescribe");
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