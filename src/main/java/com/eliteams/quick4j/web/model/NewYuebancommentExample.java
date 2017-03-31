package com.eliteams.quick4j.web.model;

import java.util.ArrayList;
import java.util.List;

public class NewYuebancommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewYuebancommentExample() {
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

        public Criteria andYuebanidIsNull() {
            addCriterion("yuebanid is null");
            return (Criteria) this;
        }

        public Criteria andYuebanidIsNotNull() {
            addCriterion("yuebanid is not null");
            return (Criteria) this;
        }

        public Criteria andYuebanidEqualTo(Integer value) {
            addCriterion("yuebanid =", value, "yuebanid");
            return (Criteria) this;
        }

        public Criteria andYuebanidNotEqualTo(Integer value) {
            addCriterion("yuebanid <>", value, "yuebanid");
            return (Criteria) this;
        }

        public Criteria andYuebanidGreaterThan(Integer value) {
            addCriterion("yuebanid >", value, "yuebanid");
            return (Criteria) this;
        }

        public Criteria andYuebanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("yuebanid >=", value, "yuebanid");
            return (Criteria) this;
        }

        public Criteria andYuebanidLessThan(Integer value) {
            addCriterion("yuebanid <", value, "yuebanid");
            return (Criteria) this;
        }

        public Criteria andYuebanidLessThanOrEqualTo(Integer value) {
            addCriterion("yuebanid <=", value, "yuebanid");
            return (Criteria) this;
        }

        public Criteria andYuebanidIn(List<Integer> values) {
            addCriterion("yuebanid in", values, "yuebanid");
            return (Criteria) this;
        }

        public Criteria andYuebanidNotIn(List<Integer> values) {
            addCriterion("yuebanid not in", values, "yuebanid");
            return (Criteria) this;
        }

        public Criteria andYuebanidBetween(Integer value1, Integer value2) {
            addCriterion("yuebanid between", value1, value2, "yuebanid");
            return (Criteria) this;
        }

        public Criteria andYuebanidNotBetween(Integer value1, Integer value2) {
            addCriterion("yuebanid not between", value1, value2, "yuebanid");
            return (Criteria) this;
        }

        public Criteria andYuebancontentIsNull() {
            addCriterion("yuebancontent is null");
            return (Criteria) this;
        }

        public Criteria andYuebancontentIsNotNull() {
            addCriterion("yuebancontent is not null");
            return (Criteria) this;
        }

        public Criteria andYuebancontentEqualTo(String value) {
            addCriterion("yuebancontent =", value, "yuebancontent");
            return (Criteria) this;
        }

        public Criteria andYuebancontentNotEqualTo(String value) {
            addCriterion("yuebancontent <>", value, "yuebancontent");
            return (Criteria) this;
        }

        public Criteria andYuebancontentGreaterThan(String value) {
            addCriterion("yuebancontent >", value, "yuebancontent");
            return (Criteria) this;
        }

        public Criteria andYuebancontentGreaterThanOrEqualTo(String value) {
            addCriterion("yuebancontent >=", value, "yuebancontent");
            return (Criteria) this;
        }

        public Criteria andYuebancontentLessThan(String value) {
            addCriterion("yuebancontent <", value, "yuebancontent");
            return (Criteria) this;
        }

        public Criteria andYuebancontentLessThanOrEqualTo(String value) {
            addCriterion("yuebancontent <=", value, "yuebancontent");
            return (Criteria) this;
        }

        public Criteria andYuebancontentLike(String value) {
            addCriterion("yuebancontent like", value, "yuebancontent");
            return (Criteria) this;
        }

        public Criteria andYuebancontentNotLike(String value) {
            addCriterion("yuebancontent not like", value, "yuebancontent");
            return (Criteria) this;
        }

        public Criteria andYuebancontentIn(List<String> values) {
            addCriterion("yuebancontent in", values, "yuebancontent");
            return (Criteria) this;
        }

        public Criteria andYuebancontentNotIn(List<String> values) {
            addCriterion("yuebancontent not in", values, "yuebancontent");
            return (Criteria) this;
        }

        public Criteria andYuebancontentBetween(String value1, String value2) {
            addCriterion("yuebancontent between", value1, value2, "yuebancontent");
            return (Criteria) this;
        }

        public Criteria andYuebancontentNotBetween(String value1, String value2) {
            addCriterion("yuebancontent not between", value1, value2, "yuebancontent");
            return (Criteria) this;
        }

        public Criteria andYuebantimeIsNull() {
            addCriterion("yuebantime is null");
            return (Criteria) this;
        }

        public Criteria andYuebantimeIsNotNull() {
            addCriterion("yuebantime is not null");
            return (Criteria) this;
        }

        public Criteria andYuebantimeEqualTo(String value) {
            addCriterion("yuebantime =", value, "yuebantime");
            return (Criteria) this;
        }

        public Criteria andYuebantimeNotEqualTo(String value) {
            addCriterion("yuebantime <>", value, "yuebantime");
            return (Criteria) this;
        }

        public Criteria andYuebantimeGreaterThan(String value) {
            addCriterion("yuebantime >", value, "yuebantime");
            return (Criteria) this;
        }

        public Criteria andYuebantimeGreaterThanOrEqualTo(String value) {
            addCriterion("yuebantime >=", value, "yuebantime");
            return (Criteria) this;
        }

        public Criteria andYuebantimeLessThan(String value) {
            addCriterion("yuebantime <", value, "yuebantime");
            return (Criteria) this;
        }

        public Criteria andYuebantimeLessThanOrEqualTo(String value) {
            addCriterion("yuebantime <=", value, "yuebantime");
            return (Criteria) this;
        }

        public Criteria andYuebantimeIn(List<String> values) {
            addCriterion("yuebantime in", values, "yuebantime");
            return (Criteria) this;
        }

        public Criteria andYuebantimeNotIn(List<String> values) {
            addCriterion("yuebantime not in", values, "yuebantime");
            return (Criteria) this;
        }

        public Criteria andYuebantimeBetween(String value1, String value2) {
            addCriterion("yuebantime between", value1, value2, "yuebantime");
            return (Criteria) this;
        }

        public Criteria andYuebantimeNotBetween(String value1, String value2) {
            addCriterion("yuebantime not between", value1, value2, "yuebantime");
            return (Criteria) this;
        }

        public Criteria andYuebancommentidIsNull() {
            addCriterion("yuebancommentid is null");
            return (Criteria) this;
        }

        public Criteria andYuebancommentidIsNotNull() {
            addCriterion("yuebancommentid is not null");
            return (Criteria) this;
        }

        public Criteria andYuebancommentidEqualTo(Integer value) {
            addCriterion("yuebancommentid =", value, "yuebancommentid");
            return (Criteria) this;
        }

        public Criteria andYuebancommentidNotEqualTo(Integer value) {
            addCriterion("yuebancommentid <>", value, "yuebancommentid");
            return (Criteria) this;
        }

        public Criteria andYuebancommentidGreaterThan(Integer value) {
            addCriterion("yuebancommentid >", value, "yuebancommentid");
            return (Criteria) this;
        }

        public Criteria andYuebancommentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("yuebancommentid >=", value, "yuebancommentid");
            return (Criteria) this;
        }

        public Criteria andYuebancommentidLessThan(Integer value) {
            addCriterion("yuebancommentid <", value, "yuebancommentid");
            return (Criteria) this;
        }

        public Criteria andYuebancommentidLessThanOrEqualTo(Integer value) {
            addCriterion("yuebancommentid <=", value, "yuebancommentid");
            return (Criteria) this;
        }

        public Criteria andYuebancommentidIn(List<Integer> values) {
            addCriterion("yuebancommentid in", values, "yuebancommentid");
            return (Criteria) this;
        }

        public Criteria andYuebancommentidNotIn(List<Integer> values) {
            addCriterion("yuebancommentid not in", values, "yuebancommentid");
            return (Criteria) this;
        }

        public Criteria andYuebancommentidBetween(Integer value1, Integer value2) {
            addCriterion("yuebancommentid between", value1, value2, "yuebancommentid");
            return (Criteria) this;
        }

        public Criteria andYuebancommentidNotBetween(Integer value1, Integer value2) {
            addCriterion("yuebancommentid not between", value1, value2, "yuebancommentid");
            return (Criteria) this;
        }

        public Criteria andYuebancommentsexIsNull() {
            addCriterion("yuebancommentsex is null");
            return (Criteria) this;
        }

        public Criteria andYuebancommentsexIsNotNull() {
            addCriterion("yuebancommentsex is not null");
            return (Criteria) this;
        }

        public Criteria andYuebancommentsexEqualTo(Integer value) {
            addCriterion("yuebancommentsex =", value, "yuebancommentsex");
            return (Criteria) this;
        }

        public Criteria andYuebancommentsexNotEqualTo(Integer value) {
            addCriterion("yuebancommentsex <>", value, "yuebancommentsex");
            return (Criteria) this;
        }

        public Criteria andYuebancommentsexGreaterThan(Integer value) {
            addCriterion("yuebancommentsex >", value, "yuebancommentsex");
            return (Criteria) this;
        }

        public Criteria andYuebancommentsexGreaterThanOrEqualTo(Integer value) {
            addCriterion("yuebancommentsex >=", value, "yuebancommentsex");
            return (Criteria) this;
        }

        public Criteria andYuebancommentsexLessThan(Integer value) {
            addCriterion("yuebancommentsex <", value, "yuebancommentsex");
            return (Criteria) this;
        }

        public Criteria andYuebancommentsexLessThanOrEqualTo(Integer value) {
            addCriterion("yuebancommentsex <=", value, "yuebancommentsex");
            return (Criteria) this;
        }

        public Criteria andYuebancommentsexIn(List<Integer> values) {
            addCriterion("yuebancommentsex in", values, "yuebancommentsex");
            return (Criteria) this;
        }

        public Criteria andYuebancommentsexNotIn(List<Integer> values) {
            addCriterion("yuebancommentsex not in", values, "yuebancommentsex");
            return (Criteria) this;
        }

        public Criteria andYuebancommentsexBetween(Integer value1, Integer value2) {
            addCriterion("yuebancommentsex between", value1, value2, "yuebancommentsex");
            return (Criteria) this;
        }

        public Criteria andYuebancommentsexNotBetween(Integer value1, Integer value2) {
            addCriterion("yuebancommentsex not between", value1, value2, "yuebancommentsex");
            return (Criteria) this;
        }

        public Criteria andYuebandistancIsNull() {
            addCriterion("yuebandistanc is null");
            return (Criteria) this;
        }

        public Criteria andYuebandistancIsNotNull() {
            addCriterion("yuebandistanc is not null");
            return (Criteria) this;
        }

        public Criteria andYuebandistancEqualTo(Integer value) {
            addCriterion("yuebandistanc =", value, "yuebandistanc");
            return (Criteria) this;
        }

        public Criteria andYuebandistancNotEqualTo(Integer value) {
            addCriterion("yuebandistanc <>", value, "yuebandistanc");
            return (Criteria) this;
        }

        public Criteria andYuebandistancGreaterThan(Integer value) {
            addCriterion("yuebandistanc >", value, "yuebandistanc");
            return (Criteria) this;
        }

        public Criteria andYuebandistancGreaterThanOrEqualTo(Integer value) {
            addCriterion("yuebandistanc >=", value, "yuebandistanc");
            return (Criteria) this;
        }

        public Criteria andYuebandistancLessThan(Integer value) {
            addCriterion("yuebandistanc <", value, "yuebandistanc");
            return (Criteria) this;
        }

        public Criteria andYuebandistancLessThanOrEqualTo(Integer value) {
            addCriterion("yuebandistanc <=", value, "yuebandistanc");
            return (Criteria) this;
        }

        public Criteria andYuebandistancIn(List<Integer> values) {
            addCriterion("yuebandistanc in", values, "yuebandistanc");
            return (Criteria) this;
        }

        public Criteria andYuebandistancNotIn(List<Integer> values) {
            addCriterion("yuebandistanc not in", values, "yuebandistanc");
            return (Criteria) this;
        }

        public Criteria andYuebandistancBetween(Integer value1, Integer value2) {
            addCriterion("yuebandistanc between", value1, value2, "yuebandistanc");
            return (Criteria) this;
        }

        public Criteria andYuebandistancNotBetween(Integer value1, Integer value2) {
            addCriterion("yuebandistanc not between", value1, value2, "yuebandistanc");
            return (Criteria) this;
        }

        public Criteria andYuebancommentnameIsNull() {
            addCriterion("yuebancommentname is null");
            return (Criteria) this;
        }

        public Criteria andYuebancommentnameIsNotNull() {
            addCriterion("yuebancommentname is not null");
            return (Criteria) this;
        }

        public Criteria andYuebancommentnameEqualTo(String value) {
            addCriterion("yuebancommentname =", value, "yuebancommentname");
            return (Criteria) this;
        }

        public Criteria andYuebancommentnameNotEqualTo(String value) {
            addCriterion("yuebancommentname <>", value, "yuebancommentname");
            return (Criteria) this;
        }

        public Criteria andYuebancommentnameGreaterThan(String value) {
            addCriterion("yuebancommentname >", value, "yuebancommentname");
            return (Criteria) this;
        }

        public Criteria andYuebancommentnameGreaterThanOrEqualTo(String value) {
            addCriterion("yuebancommentname >=", value, "yuebancommentname");
            return (Criteria) this;
        }

        public Criteria andYuebancommentnameLessThan(String value) {
            addCriterion("yuebancommentname <", value, "yuebancommentname");
            return (Criteria) this;
        }

        public Criteria andYuebancommentnameLessThanOrEqualTo(String value) {
            addCriterion("yuebancommentname <=", value, "yuebancommentname");
            return (Criteria) this;
        }

        public Criteria andYuebancommentnameLike(String value) {
            addCriterion("yuebancommentname like", value, "yuebancommentname");
            return (Criteria) this;
        }

        public Criteria andYuebancommentnameNotLike(String value) {
            addCriterion("yuebancommentname not like", value, "yuebancommentname");
            return (Criteria) this;
        }

        public Criteria andYuebancommentnameIn(List<String> values) {
            addCriterion("yuebancommentname in", values, "yuebancommentname");
            return (Criteria) this;
        }

        public Criteria andYuebancommentnameNotIn(List<String> values) {
            addCriterion("yuebancommentname not in", values, "yuebancommentname");
            return (Criteria) this;
        }

        public Criteria andYuebancommentnameBetween(String value1, String value2) {
            addCriterion("yuebancommentname between", value1, value2, "yuebancommentname");
            return (Criteria) this;
        }

        public Criteria andYuebancommentnameNotBetween(String value1, String value2) {
            addCriterion("yuebancommentname not between", value1, value2, "yuebancommentname");
            return (Criteria) this;
        }

        public Criteria andYuebancommenticonIsNull() {
            addCriterion("yuebancommenticon is null");
            return (Criteria) this;
        }

        public Criteria andYuebancommenticonIsNotNull() {
            addCriterion("yuebancommenticon is not null");
            return (Criteria) this;
        }

        public Criteria andYuebancommenticonEqualTo(String value) {
            addCriterion("yuebancommenticon =", value, "yuebancommenticon");
            return (Criteria) this;
        }

        public Criteria andYuebancommenticonNotEqualTo(String value) {
            addCriterion("yuebancommenticon <>", value, "yuebancommenticon");
            return (Criteria) this;
        }

        public Criteria andYuebancommenticonGreaterThan(String value) {
            addCriterion("yuebancommenticon >", value, "yuebancommenticon");
            return (Criteria) this;
        }

        public Criteria andYuebancommenticonGreaterThanOrEqualTo(String value) {
            addCriterion("yuebancommenticon >=", value, "yuebancommenticon");
            return (Criteria) this;
        }

        public Criteria andYuebancommenticonLessThan(String value) {
            addCriterion("yuebancommenticon <", value, "yuebancommenticon");
            return (Criteria) this;
        }

        public Criteria andYuebancommenticonLessThanOrEqualTo(String value) {
            addCriterion("yuebancommenticon <=", value, "yuebancommenticon");
            return (Criteria) this;
        }

        public Criteria andYuebancommenticonLike(String value) {
            addCriterion("yuebancommenticon like", value, "yuebancommenticon");
            return (Criteria) this;
        }

        public Criteria andYuebancommenticonNotLike(String value) {
            addCriterion("yuebancommenticon not like", value, "yuebancommenticon");
            return (Criteria) this;
        }

        public Criteria andYuebancommenticonIn(List<String> values) {
            addCriterion("yuebancommenticon in", values, "yuebancommenticon");
            return (Criteria) this;
        }

        public Criteria andYuebancommenticonNotIn(List<String> values) {
            addCriterion("yuebancommenticon not in", values, "yuebancommenticon");
            return (Criteria) this;
        }

        public Criteria andYuebancommenticonBetween(String value1, String value2) {
            addCriterion("yuebancommenticon between", value1, value2, "yuebancommenticon");
            return (Criteria) this;
        }

        public Criteria andYuebancommenticonNotBetween(String value1, String value2) {
            addCriterion("yuebancommenticon not between", value1, value2, "yuebancommenticon");
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