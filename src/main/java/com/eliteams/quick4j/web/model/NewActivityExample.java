package com.eliteams.quick4j.web.model;

import java.util.ArrayList;
import java.util.List;

public class NewActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewActivityExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("starttime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("starttime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(String value) {
            addCriterion("starttime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(String value) {
            addCriterion("starttime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(String value) {
            addCriterion("starttime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("starttime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(String value) {
            addCriterion("starttime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(String value) {
            addCriterion("starttime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<String> values) {
            addCriterion("starttime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<String> values) {
            addCriterion("starttime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(String value1, String value2) {
            addCriterion("starttime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(String value1, String value2) {
            addCriterion("starttime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(String value) {
            addCriterion("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(String value) {
            addCriterion("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(String value) {
            addCriterion("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(String value) {
            addCriterion("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(String value) {
            addCriterion("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(String value) {
            addCriterion("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<String> values) {
            addCriterion("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<String> values) {
            addCriterion("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(String value1, String value2) {
            addCriterion("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(String value1, String value2) {
            addCriterion("endtime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andActivityaddressIsNull() {
            addCriterion("activityaddress is null");
            return (Criteria) this;
        }

        public Criteria andActivityaddressIsNotNull() {
            addCriterion("activityaddress is not null");
            return (Criteria) this;
        }

        public Criteria andActivityaddressEqualTo(String value) {
            addCriterion("activityaddress =", value, "activityaddress");
            return (Criteria) this;
        }

        public Criteria andActivityaddressNotEqualTo(String value) {
            addCriterion("activityaddress <>", value, "activityaddress");
            return (Criteria) this;
        }

        public Criteria andActivityaddressGreaterThan(String value) {
            addCriterion("activityaddress >", value, "activityaddress");
            return (Criteria) this;
        }

        public Criteria andActivityaddressGreaterThanOrEqualTo(String value) {
            addCriterion("activityaddress >=", value, "activityaddress");
            return (Criteria) this;
        }

        public Criteria andActivityaddressLessThan(String value) {
            addCriterion("activityaddress <", value, "activityaddress");
            return (Criteria) this;
        }

        public Criteria andActivityaddressLessThanOrEqualTo(String value) {
            addCriterion("activityaddress <=", value, "activityaddress");
            return (Criteria) this;
        }

        public Criteria andActivityaddressLike(String value) {
            addCriterion("activityaddress like", value, "activityaddress");
            return (Criteria) this;
        }

        public Criteria andActivityaddressNotLike(String value) {
            addCriterion("activityaddress not like", value, "activityaddress");
            return (Criteria) this;
        }

        public Criteria andActivityaddressIn(List<String> values) {
            addCriterion("activityaddress in", values, "activityaddress");
            return (Criteria) this;
        }

        public Criteria andActivityaddressNotIn(List<String> values) {
            addCriterion("activityaddress not in", values, "activityaddress");
            return (Criteria) this;
        }

        public Criteria andActivityaddressBetween(String value1, String value2) {
            addCriterion("activityaddress between", value1, value2, "activityaddress");
            return (Criteria) this;
        }

        public Criteria andActivityaddressNotBetween(String value1, String value2) {
            addCriterion("activityaddress not between", value1, value2, "activityaddress");
            return (Criteria) this;
        }

        public Criteria andSmReimbursetypeIsNull() {
            addCriterion("sm_reimbursetype is null");
            return (Criteria) this;
        }

        public Criteria andSmReimbursetypeIsNotNull() {
            addCriterion("sm_reimbursetype is not null");
            return (Criteria) this;
        }

        public Criteria andSmReimbursetypeEqualTo(Integer value) {
            addCriterion("sm_reimbursetype =", value, "smReimbursetype");
            return (Criteria) this;
        }

        public Criteria andSmReimbursetypeNotEqualTo(Integer value) {
            addCriterion("sm_reimbursetype <>", value, "smReimbursetype");
            return (Criteria) this;
        }

        public Criteria andSmReimbursetypeGreaterThan(Integer value) {
            addCriterion("sm_reimbursetype >", value, "smReimbursetype");
            return (Criteria) this;
        }

        public Criteria andSmReimbursetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sm_reimbursetype >=", value, "smReimbursetype");
            return (Criteria) this;
        }

        public Criteria andSmReimbursetypeLessThan(Integer value) {
            addCriterion("sm_reimbursetype <", value, "smReimbursetype");
            return (Criteria) this;
        }

        public Criteria andSmReimbursetypeLessThanOrEqualTo(Integer value) {
            addCriterion("sm_reimbursetype <=", value, "smReimbursetype");
            return (Criteria) this;
        }

        public Criteria andSmReimbursetypeIn(List<Integer> values) {
            addCriterion("sm_reimbursetype in", values, "smReimbursetype");
            return (Criteria) this;
        }

        public Criteria andSmReimbursetypeNotIn(List<Integer> values) {
            addCriterion("sm_reimbursetype not in", values, "smReimbursetype");
            return (Criteria) this;
        }

        public Criteria andSmReimbursetypeBetween(Integer value1, Integer value2) {
            addCriterion("sm_reimbursetype between", value1, value2, "smReimbursetype");
            return (Criteria) this;
        }

        public Criteria andSmReimbursetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("sm_reimbursetype not between", value1, value2, "smReimbursetype");
            return (Criteria) this;
        }

        public Criteria andSmRmdateIsNull() {
            addCriterion("sm_rmdate is null");
            return (Criteria) this;
        }

        public Criteria andSmRmdateIsNotNull() {
            addCriterion("sm_rmdate is not null");
            return (Criteria) this;
        }

        public Criteria andSmRmdateEqualTo(Integer value) {
            addCriterion("sm_rmdate =", value, "smRmdate");
            return (Criteria) this;
        }

        public Criteria andSmRmdateNotEqualTo(Integer value) {
            addCriterion("sm_rmdate <>", value, "smRmdate");
            return (Criteria) this;
        }

        public Criteria andSmRmdateGreaterThan(Integer value) {
            addCriterion("sm_rmdate >", value, "smRmdate");
            return (Criteria) this;
        }

        public Criteria andSmRmdateGreaterThanOrEqualTo(Integer value) {
            addCriterion("sm_rmdate >=", value, "smRmdate");
            return (Criteria) this;
        }

        public Criteria andSmRmdateLessThan(Integer value) {
            addCriterion("sm_rmdate <", value, "smRmdate");
            return (Criteria) this;
        }

        public Criteria andSmRmdateLessThanOrEqualTo(Integer value) {
            addCriterion("sm_rmdate <=", value, "smRmdate");
            return (Criteria) this;
        }

        public Criteria andSmRmdateIn(List<Integer> values) {
            addCriterion("sm_rmdate in", values, "smRmdate");
            return (Criteria) this;
        }

        public Criteria andSmRmdateNotIn(List<Integer> values) {
            addCriterion("sm_rmdate not in", values, "smRmdate");
            return (Criteria) this;
        }

        public Criteria andSmRmdateBetween(Integer value1, Integer value2) {
            addCriterion("sm_rmdate between", value1, value2, "smRmdate");
            return (Criteria) this;
        }

        public Criteria andSmRmdateNotBetween(Integer value1, Integer value2) {
            addCriterion("sm_rmdate not between", value1, value2, "smRmdate");
            return (Criteria) this;
        }

        public Criteria andSuPhoneIsNull() {
            addCriterion("su_phone is null");
            return (Criteria) this;
        }

        public Criteria andSuPhoneIsNotNull() {
            addCriterion("su_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSuPhoneEqualTo(String value) {
            addCriterion("su_phone =", value, "suPhone");
            return (Criteria) this;
        }

        public Criteria andSuPhoneNotEqualTo(String value) {
            addCriterion("su_phone <>", value, "suPhone");
            return (Criteria) this;
        }

        public Criteria andSuPhoneGreaterThan(String value) {
            addCriterion("su_phone >", value, "suPhone");
            return (Criteria) this;
        }

        public Criteria andSuPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("su_phone >=", value, "suPhone");
            return (Criteria) this;
        }

        public Criteria andSuPhoneLessThan(String value) {
            addCriterion("su_phone <", value, "suPhone");
            return (Criteria) this;
        }

        public Criteria andSuPhoneLessThanOrEqualTo(String value) {
            addCriterion("su_phone <=", value, "suPhone");
            return (Criteria) this;
        }

        public Criteria andSuPhoneLike(String value) {
            addCriterion("su_phone like", value, "suPhone");
            return (Criteria) this;
        }

        public Criteria andSuPhoneNotLike(String value) {
            addCriterion("su_phone not like", value, "suPhone");
            return (Criteria) this;
        }

        public Criteria andSuPhoneIn(List<String> values) {
            addCriterion("su_phone in", values, "suPhone");
            return (Criteria) this;
        }

        public Criteria andSuPhoneNotIn(List<String> values) {
            addCriterion("su_phone not in", values, "suPhone");
            return (Criteria) this;
        }

        public Criteria andSuPhoneBetween(String value1, String value2) {
            addCriterion("su_phone between", value1, value2, "suPhone");
            return (Criteria) this;
        }

        public Criteria andSuPhoneNotBetween(String value1, String value2) {
            addCriterion("su_phone not between", value1, value2, "suPhone");
            return (Criteria) this;
        }

        public Criteria andSuEndtimeIsNull() {
            addCriterion("su_endtime is null");
            return (Criteria) this;
        }

        public Criteria andSuEndtimeIsNotNull() {
            addCriterion("su_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andSuEndtimeEqualTo(Integer value) {
            addCriterion("su_endtime =", value, "suEndtime");
            return (Criteria) this;
        }

        public Criteria andSuEndtimeNotEqualTo(Integer value) {
            addCriterion("su_endtime <>", value, "suEndtime");
            return (Criteria) this;
        }

        public Criteria andSuEndtimeGreaterThan(Integer value) {
            addCriterion("su_endtime >", value, "suEndtime");
            return (Criteria) this;
        }

        public Criteria andSuEndtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("su_endtime >=", value, "suEndtime");
            return (Criteria) this;
        }

        public Criteria andSuEndtimeLessThan(Integer value) {
            addCriterion("su_endtime <", value, "suEndtime");
            return (Criteria) this;
        }

        public Criteria andSuEndtimeLessThanOrEqualTo(Integer value) {
            addCriterion("su_endtime <=", value, "suEndtime");
            return (Criteria) this;
        }

        public Criteria andSuEndtimeIn(List<Integer> values) {
            addCriterion("su_endtime in", values, "suEndtime");
            return (Criteria) this;
        }

        public Criteria andSuEndtimeNotIn(List<Integer> values) {
            addCriterion("su_endtime not in", values, "suEndtime");
            return (Criteria) this;
        }

        public Criteria andSuEndtimeBetween(Integer value1, Integer value2) {
            addCriterion("su_endtime between", value1, value2, "suEndtime");
            return (Criteria) this;
        }

        public Criteria andSuEndtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("su_endtime not between", value1, value2, "suEndtime");
            return (Criteria) this;
        }

        public Criteria andSuNametypeIsNull() {
            addCriterion("su_nametype is null");
            return (Criteria) this;
        }

        public Criteria andSuNametypeIsNotNull() {
            addCriterion("su_nametype is not null");
            return (Criteria) this;
        }

        public Criteria andSuNametypeEqualTo(Integer value) {
            addCriterion("su_nametype =", value, "suNametype");
            return (Criteria) this;
        }

        public Criteria andSuNametypeNotEqualTo(Integer value) {
            addCriterion("su_nametype <>", value, "suNametype");
            return (Criteria) this;
        }

        public Criteria andSuNametypeGreaterThan(Integer value) {
            addCriterion("su_nametype >", value, "suNametype");
            return (Criteria) this;
        }

        public Criteria andSuNametypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("su_nametype >=", value, "suNametype");
            return (Criteria) this;
        }

        public Criteria andSuNametypeLessThan(Integer value) {
            addCriterion("su_nametype <", value, "suNametype");
            return (Criteria) this;
        }

        public Criteria andSuNametypeLessThanOrEqualTo(Integer value) {
            addCriterion("su_nametype <=", value, "suNametype");
            return (Criteria) this;
        }

        public Criteria andSuNametypeIn(List<Integer> values) {
            addCriterion("su_nametype in", values, "suNametype");
            return (Criteria) this;
        }

        public Criteria andSuNametypeNotIn(List<Integer> values) {
            addCriterion("su_nametype not in", values, "suNametype");
            return (Criteria) this;
        }

        public Criteria andSuNametypeBetween(Integer value1, Integer value2) {
            addCriterion("su_nametype between", value1, value2, "suNametype");
            return (Criteria) this;
        }

        public Criteria andSuNametypeNotBetween(Integer value1, Integer value2) {
            addCriterion("su_nametype not between", value1, value2, "suNametype");
            return (Criteria) this;
        }

        public Criteria andSuPhonetypeIsNull() {
            addCriterion("su_phonetype is null");
            return (Criteria) this;
        }

        public Criteria andSuPhonetypeIsNotNull() {
            addCriterion("su_phonetype is not null");
            return (Criteria) this;
        }

        public Criteria andSuPhonetypeEqualTo(Integer value) {
            addCriterion("su_phonetype =", value, "suPhonetype");
            return (Criteria) this;
        }

        public Criteria andSuPhonetypeNotEqualTo(Integer value) {
            addCriterion("su_phonetype <>", value, "suPhonetype");
            return (Criteria) this;
        }

        public Criteria andSuPhonetypeGreaterThan(Integer value) {
            addCriterion("su_phonetype >", value, "suPhonetype");
            return (Criteria) this;
        }

        public Criteria andSuPhonetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("su_phonetype >=", value, "suPhonetype");
            return (Criteria) this;
        }

        public Criteria andSuPhonetypeLessThan(Integer value) {
            addCriterion("su_phonetype <", value, "suPhonetype");
            return (Criteria) this;
        }

        public Criteria andSuPhonetypeLessThanOrEqualTo(Integer value) {
            addCriterion("su_phonetype <=", value, "suPhonetype");
            return (Criteria) this;
        }

        public Criteria andSuPhonetypeIn(List<Integer> values) {
            addCriterion("su_phonetype in", values, "suPhonetype");
            return (Criteria) this;
        }

        public Criteria andSuPhonetypeNotIn(List<Integer> values) {
            addCriterion("su_phonetype not in", values, "suPhonetype");
            return (Criteria) this;
        }

        public Criteria andSuPhonetypeBetween(Integer value1, Integer value2) {
            addCriterion("su_phonetype between", value1, value2, "suPhonetype");
            return (Criteria) this;
        }

        public Criteria andSuPhonetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("su_phonetype not between", value1, value2, "suPhonetype");
            return (Criteria) this;
        }

        public Criteria andSuWechattypeIsNull() {
            addCriterion("su_wechattype is null");
            return (Criteria) this;
        }

        public Criteria andSuWechattypeIsNotNull() {
            addCriterion("su_wechattype is not null");
            return (Criteria) this;
        }

        public Criteria andSuWechattypeEqualTo(Integer value) {
            addCriterion("su_wechattype =", value, "suWechattype");
            return (Criteria) this;
        }

        public Criteria andSuWechattypeNotEqualTo(Integer value) {
            addCriterion("su_wechattype <>", value, "suWechattype");
            return (Criteria) this;
        }

        public Criteria andSuWechattypeGreaterThan(Integer value) {
            addCriterion("su_wechattype >", value, "suWechattype");
            return (Criteria) this;
        }

        public Criteria andSuWechattypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("su_wechattype >=", value, "suWechattype");
            return (Criteria) this;
        }

        public Criteria andSuWechattypeLessThan(Integer value) {
            addCriterion("su_wechattype <", value, "suWechattype");
            return (Criteria) this;
        }

        public Criteria andSuWechattypeLessThanOrEqualTo(Integer value) {
            addCriterion("su_wechattype <=", value, "suWechattype");
            return (Criteria) this;
        }

        public Criteria andSuWechattypeIn(List<Integer> values) {
            addCriterion("su_wechattype in", values, "suWechattype");
            return (Criteria) this;
        }

        public Criteria andSuWechattypeNotIn(List<Integer> values) {
            addCriterion("su_wechattype not in", values, "suWechattype");
            return (Criteria) this;
        }

        public Criteria andSuWechattypeBetween(Integer value1, Integer value2) {
            addCriterion("su_wechattype between", value1, value2, "suWechattype");
            return (Criteria) this;
        }

        public Criteria andSuWechattypeNotBetween(Integer value1, Integer value2) {
            addCriterion("su_wechattype not between", value1, value2, "suWechattype");
            return (Criteria) this;
        }

        public Criteria andSuQqtypeIsNull() {
            addCriterion("su_qqtype is null");
            return (Criteria) this;
        }

        public Criteria andSuQqtypeIsNotNull() {
            addCriterion("su_qqtype is not null");
            return (Criteria) this;
        }

        public Criteria andSuQqtypeEqualTo(Integer value) {
            addCriterion("su_qqtype =", value, "suQqtype");
            return (Criteria) this;
        }

        public Criteria andSuQqtypeNotEqualTo(Integer value) {
            addCriterion("su_qqtype <>", value, "suQqtype");
            return (Criteria) this;
        }

        public Criteria andSuQqtypeGreaterThan(Integer value) {
            addCriterion("su_qqtype >", value, "suQqtype");
            return (Criteria) this;
        }

        public Criteria andSuQqtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("su_qqtype >=", value, "suQqtype");
            return (Criteria) this;
        }

        public Criteria andSuQqtypeLessThan(Integer value) {
            addCriterion("su_qqtype <", value, "suQqtype");
            return (Criteria) this;
        }

        public Criteria andSuQqtypeLessThanOrEqualTo(Integer value) {
            addCriterion("su_qqtype <=", value, "suQqtype");
            return (Criteria) this;
        }

        public Criteria andSuQqtypeIn(List<Integer> values) {
            addCriterion("su_qqtype in", values, "suQqtype");
            return (Criteria) this;
        }

        public Criteria andSuQqtypeNotIn(List<Integer> values) {
            addCriterion("su_qqtype not in", values, "suQqtype");
            return (Criteria) this;
        }

        public Criteria andSuQqtypeBetween(Integer value1, Integer value2) {
            addCriterion("su_qqtype between", value1, value2, "suQqtype");
            return (Criteria) this;
        }

        public Criteria andSuQqtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("su_qqtype not between", value1, value2, "suQqtype");
            return (Criteria) this;
        }

        public Criteria andActivitythemeIsNull() {
            addCriterion("activitytheme is null");
            return (Criteria) this;
        }

        public Criteria andActivitythemeIsNotNull() {
            addCriterion("activitytheme is not null");
            return (Criteria) this;
        }

        public Criteria andActivitythemeEqualTo(String value) {
            addCriterion("activitytheme =", value, "activitytheme");
            return (Criteria) this;
        }

        public Criteria andActivitythemeNotEqualTo(String value) {
            addCriterion("activitytheme <>", value, "activitytheme");
            return (Criteria) this;
        }

        public Criteria andActivitythemeGreaterThan(String value) {
            addCriterion("activitytheme >", value, "activitytheme");
            return (Criteria) this;
        }

        public Criteria andActivitythemeGreaterThanOrEqualTo(String value) {
            addCriterion("activitytheme >=", value, "activitytheme");
            return (Criteria) this;
        }

        public Criteria andActivitythemeLessThan(String value) {
            addCriterion("activitytheme <", value, "activitytheme");
            return (Criteria) this;
        }

        public Criteria andActivitythemeLessThanOrEqualTo(String value) {
            addCriterion("activitytheme <=", value, "activitytheme");
            return (Criteria) this;
        }

        public Criteria andActivitythemeLike(String value) {
            addCriterion("activitytheme like", value, "activitytheme");
            return (Criteria) this;
        }

        public Criteria andActivitythemeNotLike(String value) {
            addCriterion("activitytheme not like", value, "activitytheme");
            return (Criteria) this;
        }

        public Criteria andActivitythemeIn(List<String> values) {
            addCriterion("activitytheme in", values, "activitytheme");
            return (Criteria) this;
        }

        public Criteria andActivitythemeNotIn(List<String> values) {
            addCriterion("activitytheme not in", values, "activitytheme");
            return (Criteria) this;
        }

        public Criteria andActivitythemeBetween(String value1, String value2) {
            addCriterion("activitytheme between", value1, value2, "activitytheme");
            return (Criteria) this;
        }

        public Criteria andActivitythemeNotBetween(String value1, String value2) {
            addCriterion("activitytheme not between", value1, value2, "activitytheme");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIsNull() {
            addCriterion("publishtime is null");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIsNotNull() {
            addCriterion("publishtime is not null");
            return (Criteria) this;
        }

        public Criteria andPublishtimeEqualTo(String value) {
            addCriterion("publishtime =", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotEqualTo(String value) {
            addCriterion("publishtime <>", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeGreaterThan(String value) {
            addCriterion("publishtime >", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeGreaterThanOrEqualTo(String value) {
            addCriterion("publishtime >=", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLessThan(String value) {
            addCriterion("publishtime <", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLessThanOrEqualTo(String value) {
            addCriterion("publishtime <=", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIn(List<String> values) {
            addCriterion("publishtime in", values, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotIn(List<String> values) {
            addCriterion("publishtime not in", values, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeBetween(String value1, String value2) {
            addCriterion("publishtime between", value1, value2, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotBetween(String value1, String value2) {
            addCriterion("publishtime not between", value1, value2, "publishtime");
            return (Criteria) this;
        }

        public Criteria andThemedetailIsNull() {
            addCriterion("themedetail is null");
            return (Criteria) this;
        }

        public Criteria andThemedetailIsNotNull() {
            addCriterion("themedetail is not null");
            return (Criteria) this;
        }

        public Criteria andThemedetailEqualTo(String value) {
            addCriterion("themedetail =", value, "themedetail");
            return (Criteria) this;
        }

        public Criteria andThemedetailNotEqualTo(String value) {
            addCriterion("themedetail <>", value, "themedetail");
            return (Criteria) this;
        }

        public Criteria andThemedetailGreaterThan(String value) {
            addCriterion("themedetail >", value, "themedetail");
            return (Criteria) this;
        }

        public Criteria andThemedetailGreaterThanOrEqualTo(String value) {
            addCriterion("themedetail >=", value, "themedetail");
            return (Criteria) this;
        }

        public Criteria andThemedetailLessThan(String value) {
            addCriterion("themedetail <", value, "themedetail");
            return (Criteria) this;
        }

        public Criteria andThemedetailLessThanOrEqualTo(String value) {
            addCriterion("themedetail <=", value, "themedetail");
            return (Criteria) this;
        }

        public Criteria andThemedetailLike(String value) {
            addCriterion("themedetail like", value, "themedetail");
            return (Criteria) this;
        }

        public Criteria andThemedetailNotLike(String value) {
            addCriterion("themedetail not like", value, "themedetail");
            return (Criteria) this;
        }

        public Criteria andThemedetailIn(List<String> values) {
            addCriterion("themedetail in", values, "themedetail");
            return (Criteria) this;
        }

        public Criteria andThemedetailNotIn(List<String> values) {
            addCriterion("themedetail not in", values, "themedetail");
            return (Criteria) this;
        }

        public Criteria andThemedetailBetween(String value1, String value2) {
            addCriterion("themedetail between", value1, value2, "themedetail");
            return (Criteria) this;
        }

        public Criteria andThemedetailNotBetween(String value1, String value2) {
            addCriterion("themedetail not between", value1, value2, "themedetail");
            return (Criteria) this;
        }

        public Criteria andPersontypeIsNull() {
            addCriterion("persontype is null");
            return (Criteria) this;
        }

        public Criteria andPersontypeIsNotNull() {
            addCriterion("persontype is not null");
            return (Criteria) this;
        }

        public Criteria andPersontypeEqualTo(Integer value) {
            addCriterion("persontype =", value, "persontype");
            return (Criteria) this;
        }

        public Criteria andPersontypeNotEqualTo(Integer value) {
            addCriterion("persontype <>", value, "persontype");
            return (Criteria) this;
        }

        public Criteria andPersontypeGreaterThan(Integer value) {
            addCriterion("persontype >", value, "persontype");
            return (Criteria) this;
        }

        public Criteria andPersontypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("persontype >=", value, "persontype");
            return (Criteria) this;
        }

        public Criteria andPersontypeLessThan(Integer value) {
            addCriterion("persontype <", value, "persontype");
            return (Criteria) this;
        }

        public Criteria andPersontypeLessThanOrEqualTo(Integer value) {
            addCriterion("persontype <=", value, "persontype");
            return (Criteria) this;
        }

        public Criteria andPersontypeIn(List<Integer> values) {
            addCriterion("persontype in", values, "persontype");
            return (Criteria) this;
        }

        public Criteria andPersontypeNotIn(List<Integer> values) {
            addCriterion("persontype not in", values, "persontype");
            return (Criteria) this;
        }

        public Criteria andPersontypeBetween(Integer value1, Integer value2) {
            addCriterion("persontype between", value1, value2, "persontype");
            return (Criteria) this;
        }

        public Criteria andPersontypeNotBetween(Integer value1, Integer value2) {
            addCriterion("persontype not between", value1, value2, "persontype");
            return (Criteria) this;
        }

        public Criteria andPersoncountIsNull() {
            addCriterion("personcount is null");
            return (Criteria) this;
        }

        public Criteria andPersoncountIsNotNull() {
            addCriterion("personcount is not null");
            return (Criteria) this;
        }

        public Criteria andPersoncountEqualTo(Integer value) {
            addCriterion("personcount =", value, "personcount");
            return (Criteria) this;
        }

        public Criteria andPersoncountNotEqualTo(Integer value) {
            addCriterion("personcount <>", value, "personcount");
            return (Criteria) this;
        }

        public Criteria andPersoncountGreaterThan(Integer value) {
            addCriterion("personcount >", value, "personcount");
            return (Criteria) this;
        }

        public Criteria andPersoncountGreaterThanOrEqualTo(Integer value) {
            addCriterion("personcount >=", value, "personcount");
            return (Criteria) this;
        }

        public Criteria andPersoncountLessThan(Integer value) {
            addCriterion("personcount <", value, "personcount");
            return (Criteria) this;
        }

        public Criteria andPersoncountLessThanOrEqualTo(Integer value) {
            addCriterion("personcount <=", value, "personcount");
            return (Criteria) this;
        }

        public Criteria andPersoncountIn(List<Integer> values) {
            addCriterion("personcount in", values, "personcount");
            return (Criteria) this;
        }

        public Criteria andPersoncountNotIn(List<Integer> values) {
            addCriterion("personcount not in", values, "personcount");
            return (Criteria) this;
        }

        public Criteria andPersoncountBetween(Integer value1, Integer value2) {
            addCriterion("personcount between", value1, value2, "personcount");
            return (Criteria) this;
        }

        public Criteria andPersoncountNotBetween(Integer value1, Integer value2) {
            addCriterion("personcount not between", value1, value2, "personcount");
            return (Criteria) this;
        }

        public Criteria andPersonmaxIsNull() {
            addCriterion("personmax is null");
            return (Criteria) this;
        }

        public Criteria andPersonmaxIsNotNull() {
            addCriterion("personmax is not null");
            return (Criteria) this;
        }

        public Criteria andPersonmaxEqualTo(Integer value) {
            addCriterion("personmax =", value, "personmax");
            return (Criteria) this;
        }

        public Criteria andPersonmaxNotEqualTo(Integer value) {
            addCriterion("personmax <>", value, "personmax");
            return (Criteria) this;
        }

        public Criteria andPersonmaxGreaterThan(Integer value) {
            addCriterion("personmax >", value, "personmax");
            return (Criteria) this;
        }

        public Criteria andPersonmaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("personmax >=", value, "personmax");
            return (Criteria) this;
        }

        public Criteria andPersonmaxLessThan(Integer value) {
            addCriterion("personmax <", value, "personmax");
            return (Criteria) this;
        }

        public Criteria andPersonmaxLessThanOrEqualTo(Integer value) {
            addCriterion("personmax <=", value, "personmax");
            return (Criteria) this;
        }

        public Criteria andPersonmaxIn(List<Integer> values) {
            addCriterion("personmax in", values, "personmax");
            return (Criteria) this;
        }

        public Criteria andPersonmaxNotIn(List<Integer> values) {
            addCriterion("personmax not in", values, "personmax");
            return (Criteria) this;
        }

        public Criteria andPersonmaxBetween(Integer value1, Integer value2) {
            addCriterion("personmax between", value1, value2, "personmax");
            return (Criteria) this;
        }

        public Criteria andPersonmaxNotBetween(Integer value1, Integer value2) {
            addCriterion("personmax not between", value1, value2, "personmax");
            return (Criteria) this;
        }

        public Criteria andChargenameIsNull() {
            addCriterion("chargename is null");
            return (Criteria) this;
        }

        public Criteria andChargenameIsNotNull() {
            addCriterion("chargename is not null");
            return (Criteria) this;
        }

        public Criteria andChargenameEqualTo(String value) {
            addCriterion("chargename =", value, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameNotEqualTo(String value) {
            addCriterion("chargename <>", value, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameGreaterThan(String value) {
            addCriterion("chargename >", value, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameGreaterThanOrEqualTo(String value) {
            addCriterion("chargename >=", value, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameLessThan(String value) {
            addCriterion("chargename <", value, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameLessThanOrEqualTo(String value) {
            addCriterion("chargename <=", value, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameLike(String value) {
            addCriterion("chargename like", value, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameNotLike(String value) {
            addCriterion("chargename not like", value, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameIn(List<String> values) {
            addCriterion("chargename in", values, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameNotIn(List<String> values) {
            addCriterion("chargename not in", values, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameBetween(String value1, String value2) {
            addCriterion("chargename between", value1, value2, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameNotBetween(String value1, String value2) {
            addCriterion("chargename not between", value1, value2, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargeIsNull() {
            addCriterion("charge is null");
            return (Criteria) this;
        }

        public Criteria andChargeIsNotNull() {
            addCriterion("charge is not null");
            return (Criteria) this;
        }

        public Criteria andChargeEqualTo(Integer value) {
            addCriterion("charge =", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeNotEqualTo(Integer value) {
            addCriterion("charge <>", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeGreaterThan(Integer value) {
            addCriterion("charge >", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeGreaterThanOrEqualTo(Integer value) {
            addCriterion("charge >=", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeLessThan(Integer value) {
            addCriterion("charge <", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeLessThanOrEqualTo(Integer value) {
            addCriterion("charge <=", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeIn(List<Integer> values) {
            addCriterion("charge in", values, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeNotIn(List<Integer> values) {
            addCriterion("charge not in", values, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeBetween(Integer value1, Integer value2) {
            addCriterion("charge between", value1, value2, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeNotBetween(Integer value1, Integer value2) {
            addCriterion("charge not between", value1, value2, "charge");
            return (Criteria) this;
        }

        public Criteria andVideourlIsNull() {
            addCriterion("videourl is null");
            return (Criteria) this;
        }

        public Criteria andVideourlIsNotNull() {
            addCriterion("videourl is not null");
            return (Criteria) this;
        }

        public Criteria andVideourlEqualTo(String value) {
            addCriterion("videourl =", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlNotEqualTo(String value) {
            addCriterion("videourl <>", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlGreaterThan(String value) {
            addCriterion("videourl >", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlGreaterThanOrEqualTo(String value) {
            addCriterion("videourl >=", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlLessThan(String value) {
            addCriterion("videourl <", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlLessThanOrEqualTo(String value) {
            addCriterion("videourl <=", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlLike(String value) {
            addCriterion("videourl like", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlNotLike(String value) {
            addCriterion("videourl not like", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlIn(List<String> values) {
            addCriterion("videourl in", values, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlNotIn(List<String> values) {
            addCriterion("videourl not in", values, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlBetween(String value1, String value2) {
            addCriterion("videourl between", value1, value2, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlNotBetween(String value1, String value2) {
            addCriterion("videourl not between", value1, value2, "videourl");
            return (Criteria) this;
        }

        public Criteria andScancountIsNull() {
            addCriterion("scancount is null");
            return (Criteria) this;
        }

        public Criteria andScancountIsNotNull() {
            addCriterion("scancount is not null");
            return (Criteria) this;
        }

        public Criteria andScancountEqualTo(Integer value) {
            addCriterion("scancount =", value, "scancount");
            return (Criteria) this;
        }

        public Criteria andScancountNotEqualTo(Integer value) {
            addCriterion("scancount <>", value, "scancount");
            return (Criteria) this;
        }

        public Criteria andScancountGreaterThan(Integer value) {
            addCriterion("scancount >", value, "scancount");
            return (Criteria) this;
        }

        public Criteria andScancountGreaterThanOrEqualTo(Integer value) {
            addCriterion("scancount >=", value, "scancount");
            return (Criteria) this;
        }

        public Criteria andScancountLessThan(Integer value) {
            addCriterion("scancount <", value, "scancount");
            return (Criteria) this;
        }

        public Criteria andScancountLessThanOrEqualTo(Integer value) {
            addCriterion("scancount <=", value, "scancount");
            return (Criteria) this;
        }

        public Criteria andScancountIn(List<Integer> values) {
            addCriterion("scancount in", values, "scancount");
            return (Criteria) this;
        }

        public Criteria andScancountNotIn(List<Integer> values) {
            addCriterion("scancount not in", values, "scancount");
            return (Criteria) this;
        }

        public Criteria andScancountBetween(Integer value1, Integer value2) {
            addCriterion("scancount between", value1, value2, "scancount");
            return (Criteria) this;
        }

        public Criteria andScancountNotBetween(Integer value1, Integer value2) {
            addCriterion("scancount not between", value1, value2, "scancount");
            return (Criteria) this;
        }

        public Criteria andSharecountIsNull() {
            addCriterion("sharecount is null");
            return (Criteria) this;
        }

        public Criteria andSharecountIsNotNull() {
            addCriterion("sharecount is not null");
            return (Criteria) this;
        }

        public Criteria andSharecountEqualTo(Integer value) {
            addCriterion("sharecount =", value, "sharecount");
            return (Criteria) this;
        }

        public Criteria andSharecountNotEqualTo(Integer value) {
            addCriterion("sharecount <>", value, "sharecount");
            return (Criteria) this;
        }

        public Criteria andSharecountGreaterThan(Integer value) {
            addCriterion("sharecount >", value, "sharecount");
            return (Criteria) this;
        }

        public Criteria andSharecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("sharecount >=", value, "sharecount");
            return (Criteria) this;
        }

        public Criteria andSharecountLessThan(Integer value) {
            addCriterion("sharecount <", value, "sharecount");
            return (Criteria) this;
        }

        public Criteria andSharecountLessThanOrEqualTo(Integer value) {
            addCriterion("sharecount <=", value, "sharecount");
            return (Criteria) this;
        }

        public Criteria andSharecountIn(List<Integer> values) {
            addCriterion("sharecount in", values, "sharecount");
            return (Criteria) this;
        }

        public Criteria andSharecountNotIn(List<Integer> values) {
            addCriterion("sharecount not in", values, "sharecount");
            return (Criteria) this;
        }

        public Criteria andSharecountBetween(Integer value1, Integer value2) {
            addCriterion("sharecount between", value1, value2, "sharecount");
            return (Criteria) this;
        }

        public Criteria andSharecountNotBetween(Integer value1, Integer value2) {
            addCriterion("sharecount not between", value1, value2, "sharecount");
            return (Criteria) this;
        }

        public Criteria andImageurlIsNull() {
            addCriterion("imageurl is null");
            return (Criteria) this;
        }

        public Criteria andImageurlIsNotNull() {
            addCriterion("imageurl is not null");
            return (Criteria) this;
        }

        public Criteria andImageurlEqualTo(String value) {
            addCriterion("imageurl =", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlNotEqualTo(String value) {
            addCriterion("imageurl <>", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlGreaterThan(String value) {
            addCriterion("imageurl >", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlGreaterThanOrEqualTo(String value) {
            addCriterion("imageurl >=", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlLessThan(String value) {
            addCriterion("imageurl <", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlLessThanOrEqualTo(String value) {
            addCriterion("imageurl <=", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlLike(String value) {
            addCriterion("imageurl like", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlNotLike(String value) {
            addCriterion("imageurl not like", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlIn(List<String> values) {
            addCriterion("imageurl in", values, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlNotIn(List<String> values) {
            addCriterion("imageurl not in", values, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlBetween(String value1, String value2) {
            addCriterion("imageurl between", value1, value2, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlNotBetween(String value1, String value2) {
            addCriterion("imageurl not between", value1, value2, "imageurl");
            return (Criteria) this;
        }

        public Criteria andSignatureIsNull() {
            addCriterion("signature is null");
            return (Criteria) this;
        }

        public Criteria andSignatureIsNotNull() {
            addCriterion("signature is not null");
            return (Criteria) this;
        }

        public Criteria andSignatureEqualTo(String value) {
            addCriterion("signature =", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotEqualTo(String value) {
            addCriterion("signature <>", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThan(String value) {
            addCriterion("signature >", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("signature >=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThan(String value) {
            addCriterion("signature <", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThanOrEqualTo(String value) {
            addCriterion("signature <=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLike(String value) {
            addCriterion("signature like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotLike(String value) {
            addCriterion("signature not like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureIn(List<String> values) {
            addCriterion("signature in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotIn(List<String> values) {
            addCriterion("signature not in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureBetween(String value1, String value2) {
            addCriterion("signature between", value1, value2, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotBetween(String value1, String value2) {
            addCriterion("signature not between", value1, value2, "signature");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIdentityAuthenticationIsNull() {
            addCriterion("identity_authentication is null");
            return (Criteria) this;
        }

        public Criteria andIdentityAuthenticationIsNotNull() {
            addCriterion("identity_authentication is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityAuthenticationEqualTo(String value) {
            addCriterion("identity_authentication =", value, "identityAuthentication");
            return (Criteria) this;
        }

        public Criteria andIdentityAuthenticationNotEqualTo(String value) {
            addCriterion("identity_authentication <>", value, "identityAuthentication");
            return (Criteria) this;
        }

        public Criteria andIdentityAuthenticationGreaterThan(String value) {
            addCriterion("identity_authentication >", value, "identityAuthentication");
            return (Criteria) this;
        }

        public Criteria andIdentityAuthenticationGreaterThanOrEqualTo(String value) {
            addCriterion("identity_authentication >=", value, "identityAuthentication");
            return (Criteria) this;
        }

        public Criteria andIdentityAuthenticationLessThan(String value) {
            addCriterion("identity_authentication <", value, "identityAuthentication");
            return (Criteria) this;
        }

        public Criteria andIdentityAuthenticationLessThanOrEqualTo(String value) {
            addCriterion("identity_authentication <=", value, "identityAuthentication");
            return (Criteria) this;
        }

        public Criteria andIdentityAuthenticationLike(String value) {
            addCriterion("identity_authentication like", value, "identityAuthentication");
            return (Criteria) this;
        }

        public Criteria andIdentityAuthenticationNotLike(String value) {
            addCriterion("identity_authentication not like", value, "identityAuthentication");
            return (Criteria) this;
        }

        public Criteria andIdentityAuthenticationIn(List<String> values) {
            addCriterion("identity_authentication in", values, "identityAuthentication");
            return (Criteria) this;
        }

        public Criteria andIdentityAuthenticationNotIn(List<String> values) {
            addCriterion("identity_authentication not in", values, "identityAuthentication");
            return (Criteria) this;
        }

        public Criteria andIdentityAuthenticationBetween(String value1, String value2) {
            addCriterion("identity_authentication between", value1, value2, "identityAuthentication");
            return (Criteria) this;
        }

        public Criteria andIdentityAuthenticationNotBetween(String value1, String value2) {
            addCriterion("identity_authentication not between", value1, value2, "identityAuthentication");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andJoinstatusIsNull() {
            addCriterion("joinstatus is null");
            return (Criteria) this;
        }

        public Criteria andJoinstatusIsNotNull() {
            addCriterion("joinstatus is not null");
            return (Criteria) this;
        }

        public Criteria andJoinstatusEqualTo(Integer value) {
            addCriterion("joinstatus =", value, "joinstatus");
            return (Criteria) this;
        }

        public Criteria andJoinstatusNotEqualTo(Integer value) {
            addCriterion("joinstatus <>", value, "joinstatus");
            return (Criteria) this;
        }

        public Criteria andJoinstatusGreaterThan(Integer value) {
            addCriterion("joinstatus >", value, "joinstatus");
            return (Criteria) this;
        }

        public Criteria andJoinstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("joinstatus >=", value, "joinstatus");
            return (Criteria) this;
        }

        public Criteria andJoinstatusLessThan(Integer value) {
            addCriterion("joinstatus <", value, "joinstatus");
            return (Criteria) this;
        }

        public Criteria andJoinstatusLessThanOrEqualTo(Integer value) {
            addCriterion("joinstatus <=", value, "joinstatus");
            return (Criteria) this;
        }

        public Criteria andJoinstatusIn(List<Integer> values) {
            addCriterion("joinstatus in", values, "joinstatus");
            return (Criteria) this;
        }

        public Criteria andJoinstatusNotIn(List<Integer> values) {
            addCriterion("joinstatus not in", values, "joinstatus");
            return (Criteria) this;
        }

        public Criteria andJoinstatusBetween(Integer value1, Integer value2) {
            addCriterion("joinstatus between", value1, value2, "joinstatus");
            return (Criteria) this;
        }

        public Criteria andJoinstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("joinstatus not between", value1, value2, "joinstatus");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(Double value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(Double value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(Double value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(Double value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<Double> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<Double> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(Double value1, Double value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(Double value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(Double value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(Double value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(Double value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<Double> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<Double> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(Double value1, Double value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(Integer value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(Integer value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(Integer value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(Integer value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(Integer value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(Integer value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<Integer> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<Integer> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(Integer value1, Integer value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(Integer value1, Integer value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andGoodactivityIsNull() {
            addCriterion("goodactivity is null");
            return (Criteria) this;
        }

        public Criteria andGoodactivityIsNotNull() {
            addCriterion("goodactivity is not null");
            return (Criteria) this;
        }

        public Criteria andGoodactivityEqualTo(Integer value) {
            addCriterion("goodactivity =", value, "goodactivity");
            return (Criteria) this;
        }

        public Criteria andGoodactivityNotEqualTo(Integer value) {
            addCriterion("goodactivity <>", value, "goodactivity");
            return (Criteria) this;
        }

        public Criteria andGoodactivityGreaterThan(Integer value) {
            addCriterion("goodactivity >", value, "goodactivity");
            return (Criteria) this;
        }

        public Criteria andGoodactivityGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodactivity >=", value, "goodactivity");
            return (Criteria) this;
        }

        public Criteria andGoodactivityLessThan(Integer value) {
            addCriterion("goodactivity <", value, "goodactivity");
            return (Criteria) this;
        }

        public Criteria andGoodactivityLessThanOrEqualTo(Integer value) {
            addCriterion("goodactivity <=", value, "goodactivity");
            return (Criteria) this;
        }

        public Criteria andGoodactivityIn(List<Integer> values) {
            addCriterion("goodactivity in", values, "goodactivity");
            return (Criteria) this;
        }

        public Criteria andGoodactivityNotIn(List<Integer> values) {
            addCriterion("goodactivity not in", values, "goodactivity");
            return (Criteria) this;
        }

        public Criteria andGoodactivityBetween(Integer value1, Integer value2) {
            addCriterion("goodactivity between", value1, value2, "goodactivity");
            return (Criteria) this;
        }

        public Criteria andGoodactivityNotBetween(Integer value1, Integer value2) {
            addCriterion("goodactivity not between", value1, value2, "goodactivity");
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