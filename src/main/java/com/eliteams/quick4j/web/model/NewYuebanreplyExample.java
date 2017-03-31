package com.eliteams.quick4j.web.model;

import java.util.ArrayList;
import java.util.List;

public class NewYuebanreplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewYuebanreplyExample() {
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

        public Criteria andYuebancommentreplyidIsNull() {
            addCriterion("yuebancommentreplyid is null");
            return (Criteria) this;
        }

        public Criteria andYuebancommentreplyidIsNotNull() {
            addCriterion("yuebancommentreplyid is not null");
            return (Criteria) this;
        }

        public Criteria andYuebancommentreplyidEqualTo(Integer value) {
            addCriterion("yuebancommentreplyid =", value, "yuebancommentreplyid");
            return (Criteria) this;
        }

        public Criteria andYuebancommentreplyidNotEqualTo(Integer value) {
            addCriterion("yuebancommentreplyid <>", value, "yuebancommentreplyid");
            return (Criteria) this;
        }

        public Criteria andYuebancommentreplyidGreaterThan(Integer value) {
            addCriterion("yuebancommentreplyid >", value, "yuebancommentreplyid");
            return (Criteria) this;
        }

        public Criteria andYuebancommentreplyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("yuebancommentreplyid >=", value, "yuebancommentreplyid");
            return (Criteria) this;
        }

        public Criteria andYuebancommentreplyidLessThan(Integer value) {
            addCriterion("yuebancommentreplyid <", value, "yuebancommentreplyid");
            return (Criteria) this;
        }

        public Criteria andYuebancommentreplyidLessThanOrEqualTo(Integer value) {
            addCriterion("yuebancommentreplyid <=", value, "yuebancommentreplyid");
            return (Criteria) this;
        }

        public Criteria andYuebancommentreplyidIn(List<Integer> values) {
            addCriterion("yuebancommentreplyid in", values, "yuebancommentreplyid");
            return (Criteria) this;
        }

        public Criteria andYuebancommentreplyidNotIn(List<Integer> values) {
            addCriterion("yuebancommentreplyid not in", values, "yuebancommentreplyid");
            return (Criteria) this;
        }

        public Criteria andYuebancommentreplyidBetween(Integer value1, Integer value2) {
            addCriterion("yuebancommentreplyid between", value1, value2, "yuebancommentreplyid");
            return (Criteria) this;
        }

        public Criteria andYuebancommentreplyidNotBetween(Integer value1, Integer value2) {
            addCriterion("yuebancommentreplyid not between", value1, value2, "yuebancommentreplyid");
            return (Criteria) this;
        }

        public Criteria andYuebanreplydateIsNull() {
            addCriterion("yuebanreplydate is null");
            return (Criteria) this;
        }

        public Criteria andYuebanreplydateIsNotNull() {
            addCriterion("yuebanreplydate is not null");
            return (Criteria) this;
        }

        public Criteria andYuebanreplydateEqualTo(String value) {
            addCriterion("yuebanreplydate =", value, "yuebanreplydate");
            return (Criteria) this;
        }

        public Criteria andYuebanreplydateNotEqualTo(String value) {
            addCriterion("yuebanreplydate <>", value, "yuebanreplydate");
            return (Criteria) this;
        }

        public Criteria andYuebanreplydateGreaterThan(String value) {
            addCriterion("yuebanreplydate >", value, "yuebanreplydate");
            return (Criteria) this;
        }

        public Criteria andYuebanreplydateGreaterThanOrEqualTo(String value) {
            addCriterion("yuebanreplydate >=", value, "yuebanreplydate");
            return (Criteria) this;
        }

        public Criteria andYuebanreplydateLessThan(String value) {
            addCriterion("yuebanreplydate <", value, "yuebanreplydate");
            return (Criteria) this;
        }

        public Criteria andYuebanreplydateLessThanOrEqualTo(String value) {
            addCriterion("yuebanreplydate <=", value, "yuebanreplydate");
            return (Criteria) this;
        }

        public Criteria andYuebanreplydateIn(List<String> values) {
            addCriterion("yuebanreplydate in", values, "yuebanreplydate");
            return (Criteria) this;
        }

        public Criteria andYuebanreplydateNotIn(List<String> values) {
            addCriterion("yuebanreplydate not in", values, "yuebanreplydate");
            return (Criteria) this;
        }

        public Criteria andYuebanreplydateBetween(String value1, String value2) {
            addCriterion("yuebanreplydate between", value1, value2, "yuebanreplydate");
            return (Criteria) this;
        }

        public Criteria andYuebanreplydateNotBetween(String value1, String value2) {
            addCriterion("yuebanreplydate not between", value1, value2, "yuebanreplydate");
            return (Criteria) this;
        }

        public Criteria andYuebanreplycontentIsNull() {
            addCriterion("yuebanreplycontent is null");
            return (Criteria) this;
        }

        public Criteria andYuebanreplycontentIsNotNull() {
            addCriterion("yuebanreplycontent is not null");
            return (Criteria) this;
        }

        public Criteria andYuebanreplycontentEqualTo(String value) {
            addCriterion("yuebanreplycontent =", value, "yuebanreplycontent");
            return (Criteria) this;
        }

        public Criteria andYuebanreplycontentNotEqualTo(String value) {
            addCriterion("yuebanreplycontent <>", value, "yuebanreplycontent");
            return (Criteria) this;
        }

        public Criteria andYuebanreplycontentGreaterThan(String value) {
            addCriterion("yuebanreplycontent >", value, "yuebanreplycontent");
            return (Criteria) this;
        }

        public Criteria andYuebanreplycontentGreaterThanOrEqualTo(String value) {
            addCriterion("yuebanreplycontent >=", value, "yuebanreplycontent");
            return (Criteria) this;
        }

        public Criteria andYuebanreplycontentLessThan(String value) {
            addCriterion("yuebanreplycontent <", value, "yuebanreplycontent");
            return (Criteria) this;
        }

        public Criteria andYuebanreplycontentLessThanOrEqualTo(String value) {
            addCriterion("yuebanreplycontent <=", value, "yuebanreplycontent");
            return (Criteria) this;
        }

        public Criteria andYuebanreplycontentLike(String value) {
            addCriterion("yuebanreplycontent like", value, "yuebanreplycontent");
            return (Criteria) this;
        }

        public Criteria andYuebanreplycontentNotLike(String value) {
            addCriterion("yuebanreplycontent not like", value, "yuebanreplycontent");
            return (Criteria) this;
        }

        public Criteria andYuebanreplycontentIn(List<String> values) {
            addCriterion("yuebanreplycontent in", values, "yuebanreplycontent");
            return (Criteria) this;
        }

        public Criteria andYuebanreplycontentNotIn(List<String> values) {
            addCriterion("yuebanreplycontent not in", values, "yuebanreplycontent");
            return (Criteria) this;
        }

        public Criteria andYuebanreplycontentBetween(String value1, String value2) {
            addCriterion("yuebanreplycontent between", value1, value2, "yuebanreplycontent");
            return (Criteria) this;
        }

        public Criteria andYuebanreplycontentNotBetween(String value1, String value2) {
            addCriterion("yuebanreplycontent not between", value1, value2, "yuebanreplycontent");
            return (Criteria) this;
        }

        public Criteria andYuebanreplytoIsNull() {
            addCriterion("yuebanreplyto is null");
            return (Criteria) this;
        }

        public Criteria andYuebanreplytoIsNotNull() {
            addCriterion("yuebanreplyto is not null");
            return (Criteria) this;
        }

        public Criteria andYuebanreplytoEqualTo(String value) {
            addCriterion("yuebanreplyto =", value, "yuebanreplyto");
            return (Criteria) this;
        }

        public Criteria andYuebanreplytoNotEqualTo(String value) {
            addCriterion("yuebanreplyto <>", value, "yuebanreplyto");
            return (Criteria) this;
        }

        public Criteria andYuebanreplytoGreaterThan(String value) {
            addCriterion("yuebanreplyto >", value, "yuebanreplyto");
            return (Criteria) this;
        }

        public Criteria andYuebanreplytoGreaterThanOrEqualTo(String value) {
            addCriterion("yuebanreplyto >=", value, "yuebanreplyto");
            return (Criteria) this;
        }

        public Criteria andYuebanreplytoLessThan(String value) {
            addCriterion("yuebanreplyto <", value, "yuebanreplyto");
            return (Criteria) this;
        }

        public Criteria andYuebanreplytoLessThanOrEqualTo(String value) {
            addCriterion("yuebanreplyto <=", value, "yuebanreplyto");
            return (Criteria) this;
        }

        public Criteria andYuebanreplytoLike(String value) {
            addCriterion("yuebanreplyto like", value, "yuebanreplyto");
            return (Criteria) this;
        }

        public Criteria andYuebanreplytoNotLike(String value) {
            addCriterion("yuebanreplyto not like", value, "yuebanreplyto");
            return (Criteria) this;
        }

        public Criteria andYuebanreplytoIn(List<String> values) {
            addCriterion("yuebanreplyto in", values, "yuebanreplyto");
            return (Criteria) this;
        }

        public Criteria andYuebanreplytoNotIn(List<String> values) {
            addCriterion("yuebanreplyto not in", values, "yuebanreplyto");
            return (Criteria) this;
        }

        public Criteria andYuebanreplytoBetween(String value1, String value2) {
            addCriterion("yuebanreplyto between", value1, value2, "yuebanreplyto");
            return (Criteria) this;
        }

        public Criteria andYuebanreplytoNotBetween(String value1, String value2) {
            addCriterion("yuebanreplyto not between", value1, value2, "yuebanreplyto");
            return (Criteria) this;
        }

        public Criteria andYuebanreplyusernameIsNull() {
            addCriterion("yuebanreplyusername is null");
            return (Criteria) this;
        }

        public Criteria andYuebanreplyusernameIsNotNull() {
            addCriterion("yuebanreplyusername is not null");
            return (Criteria) this;
        }

        public Criteria andYuebanreplyusernameEqualTo(String value) {
            addCriterion("yuebanreplyusername =", value, "yuebanreplyusername");
            return (Criteria) this;
        }

        public Criteria andYuebanreplyusernameNotEqualTo(String value) {
            addCriterion("yuebanreplyusername <>", value, "yuebanreplyusername");
            return (Criteria) this;
        }

        public Criteria andYuebanreplyusernameGreaterThan(String value) {
            addCriterion("yuebanreplyusername >", value, "yuebanreplyusername");
            return (Criteria) this;
        }

        public Criteria andYuebanreplyusernameGreaterThanOrEqualTo(String value) {
            addCriterion("yuebanreplyusername >=", value, "yuebanreplyusername");
            return (Criteria) this;
        }

        public Criteria andYuebanreplyusernameLessThan(String value) {
            addCriterion("yuebanreplyusername <", value, "yuebanreplyusername");
            return (Criteria) this;
        }

        public Criteria andYuebanreplyusernameLessThanOrEqualTo(String value) {
            addCriterion("yuebanreplyusername <=", value, "yuebanreplyusername");
            return (Criteria) this;
        }

        public Criteria andYuebanreplyusernameLike(String value) {
            addCriterion("yuebanreplyusername like", value, "yuebanreplyusername");
            return (Criteria) this;
        }

        public Criteria andYuebanreplyusernameNotLike(String value) {
            addCriterion("yuebanreplyusername not like", value, "yuebanreplyusername");
            return (Criteria) this;
        }

        public Criteria andYuebanreplyusernameIn(List<String> values) {
            addCriterion("yuebanreplyusername in", values, "yuebanreplyusername");
            return (Criteria) this;
        }

        public Criteria andYuebanreplyusernameNotIn(List<String> values) {
            addCriterion("yuebanreplyusername not in", values, "yuebanreplyusername");
            return (Criteria) this;
        }

        public Criteria andYuebanreplyusernameBetween(String value1, String value2) {
            addCriterion("yuebanreplyusername between", value1, value2, "yuebanreplyusername");
            return (Criteria) this;
        }

        public Criteria andYuebanreplyusernameNotBetween(String value1, String value2) {
            addCriterion("yuebanreplyusername not between", value1, value2, "yuebanreplyusername");
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