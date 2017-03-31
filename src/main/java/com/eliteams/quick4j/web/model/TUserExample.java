package com.eliteams.quick4j.web.model;

import java.util.ArrayList;
import java.util.List;

public class TUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUserExample() {
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

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
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

        public Criteria andNickNameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(Integer value) {
            addCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(Integer value) {
            addCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(Integer value) {
            addCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(Integer value) {
            addCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(Integer value) {
            addCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(Integer value) {
            addCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<Integer> values) {
            addCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<Integer> values) {
            addCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(Integer value1, Integer value2) {
            addCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(Integer value1, Integer value2) {
            addCriterion("nick_name not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenIsNull() {
            addCriterion("device_token is null");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenIsNotNull() {
            addCriterion("device_token is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenEqualTo(String value) {
            addCriterion("device_token =", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenNotEqualTo(String value) {
            addCriterion("device_token <>", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenGreaterThan(String value) {
            addCriterion("device_token >", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenGreaterThanOrEqualTo(String value) {
            addCriterion("device_token >=", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenLessThan(String value) {
            addCriterion("device_token <", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenLessThanOrEqualTo(String value) {
            addCriterion("device_token <=", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenLike(String value) {
            addCriterion("device_token like", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenNotLike(String value) {
            addCriterion("device_token not like", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenIn(List<String> values) {
            addCriterion("device_token in", values, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenNotIn(List<String> values) {
            addCriterion("device_token not in", values, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenBetween(String value1, String value2) {
            addCriterion("device_token between", value1, value2, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenNotBetween(String value1, String value2) {
            addCriterion("device_token not between", value1, value2, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andPushSetIsNull() {
            addCriterion("push_set is null");
            return (Criteria) this;
        }

        public Criteria andPushSetIsNotNull() {
            addCriterion("push_set is not null");
            return (Criteria) this;
        }

        public Criteria andPushSetEqualTo(Integer value) {
            addCriterion("push_set =", value, "pushSet");
            return (Criteria) this;
        }

        public Criteria andPushSetNotEqualTo(Integer value) {
            addCriterion("push_set <>", value, "pushSet");
            return (Criteria) this;
        }

        public Criteria andPushSetGreaterThan(Integer value) {
            addCriterion("push_set >", value, "pushSet");
            return (Criteria) this;
        }

        public Criteria andPushSetGreaterThanOrEqualTo(Integer value) {
            addCriterion("push_set >=", value, "pushSet");
            return (Criteria) this;
        }

        public Criteria andPushSetLessThan(Integer value) {
            addCriterion("push_set <", value, "pushSet");
            return (Criteria) this;
        }

        public Criteria andPushSetLessThanOrEqualTo(Integer value) {
            addCriterion("push_set <=", value, "pushSet");
            return (Criteria) this;
        }

        public Criteria andPushSetIn(List<Integer> values) {
            addCriterion("push_set in", values, "pushSet");
            return (Criteria) this;
        }

        public Criteria andPushSetNotIn(List<Integer> values) {
            addCriterion("push_set not in", values, "pushSet");
            return (Criteria) this;
        }

        public Criteria andPushSetBetween(Integer value1, Integer value2) {
            addCriterion("push_set between", value1, value2, "pushSet");
            return (Criteria) this;
        }

        public Criteria andPushSetNotBetween(Integer value1, Integer value2) {
            addCriterion("push_set not between", value1, value2, "pushSet");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("icon like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("icon not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("icon not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateIsNull() {
            addCriterion("last_login_date is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateIsNotNull() {
            addCriterion("last_login_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateEqualTo(String value) {
            addCriterion("last_login_date =", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateNotEqualTo(String value) {
            addCriterion("last_login_date <>", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateGreaterThan(String value) {
            addCriterion("last_login_date >", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateGreaterThanOrEqualTo(String value) {
            addCriterion("last_login_date >=", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateLessThan(String value) {
            addCriterion("last_login_date <", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateLessThanOrEqualTo(String value) {
            addCriterion("last_login_date <=", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateIn(List<String> values) {
            addCriterion("last_login_date in", values, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateNotIn(List<String> values) {
            addCriterion("last_login_date not in", values, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateBetween(String value1, String value2) {
            addCriterion("last_login_date between", value1, value2, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateNotBetween(String value1, String value2) {
            addCriterion("last_login_date not between", value1, value2, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andAccessTokenIsNull() {
            addCriterion("access_token is null");
            return (Criteria) this;
        }

        public Criteria andAccessTokenIsNotNull() {
            addCriterion("access_token is not null");
            return (Criteria) this;
        }

        public Criteria andAccessTokenEqualTo(String value) {
            addCriterion("access_token =", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotEqualTo(String value) {
            addCriterion("access_token <>", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenGreaterThan(String value) {
            addCriterion("access_token >", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenGreaterThanOrEqualTo(String value) {
            addCriterion("access_token >=", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLessThan(String value) {
            addCriterion("access_token <", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLessThanOrEqualTo(String value) {
            addCriterion("access_token <=", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLike(String value) {
            addCriterion("access_token like", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotLike(String value) {
            addCriterion("access_token not like", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenIn(List<String> values) {
            addCriterion("access_token in", values, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotIn(List<String> values) {
            addCriterion("access_token not in", values, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenBetween(String value1, String value2) {
            addCriterion("access_token between", value1, value2, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotBetween(String value1, String value2) {
            addCriterion("access_token not between", value1, value2, "accessToken");
            return (Criteria) this;
        }

        public Criteria andUniqueTokenIsNull() {
            addCriterion("unique_token is null");
            return (Criteria) this;
        }

        public Criteria andUniqueTokenIsNotNull() {
            addCriterion("unique_token is not null");
            return (Criteria) this;
        }

        public Criteria andUniqueTokenEqualTo(String value) {
            addCriterion("unique_token =", value, "uniqueToken");
            return (Criteria) this;
        }

        public Criteria andUniqueTokenNotEqualTo(String value) {
            addCriterion("unique_token <>", value, "uniqueToken");
            return (Criteria) this;
        }

        public Criteria andUniqueTokenGreaterThan(String value) {
            addCriterion("unique_token >", value, "uniqueToken");
            return (Criteria) this;
        }

        public Criteria andUniqueTokenGreaterThanOrEqualTo(String value) {
            addCriterion("unique_token >=", value, "uniqueToken");
            return (Criteria) this;
        }

        public Criteria andUniqueTokenLessThan(String value) {
            addCriterion("unique_token <", value, "uniqueToken");
            return (Criteria) this;
        }

        public Criteria andUniqueTokenLessThanOrEqualTo(String value) {
            addCriterion("unique_token <=", value, "uniqueToken");
            return (Criteria) this;
        }

        public Criteria andUniqueTokenLike(String value) {
            addCriterion("unique_token like", value, "uniqueToken");
            return (Criteria) this;
        }

        public Criteria andUniqueTokenNotLike(String value) {
            addCriterion("unique_token not like", value, "uniqueToken");
            return (Criteria) this;
        }

        public Criteria andUniqueTokenIn(List<String> values) {
            addCriterion("unique_token in", values, "uniqueToken");
            return (Criteria) this;
        }

        public Criteria andUniqueTokenNotIn(List<String> values) {
            addCriterion("unique_token not in", values, "uniqueToken");
            return (Criteria) this;
        }

        public Criteria andUniqueTokenBetween(String value1, String value2) {
            addCriterion("unique_token between", value1, value2, "uniqueToken");
            return (Criteria) this;
        }

        public Criteria andUniqueTokenNotBetween(String value1, String value2) {
            addCriterion("unique_token not between", value1, value2, "uniqueToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIsNull() {
            addCriterion("device_type is null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIsNotNull() {
            addCriterion("device_type is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeEqualTo(Integer value) {
            addCriterion("device_type =", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotEqualTo(Integer value) {
            addCriterion("device_type <>", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeGreaterThan(Integer value) {
            addCriterion("device_type >", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_type >=", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLessThan(Integer value) {
            addCriterion("device_type <", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("device_type <=", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIn(List<Integer> values) {
            addCriterion("device_type in", values, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotIn(List<Integer> values) {
            addCriterion("device_type not in", values, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeBetween(Integer value1, Integer value2) {
            addCriterion("device_type between", value1, value2, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("device_type not between", value1, value2, "deviceType");
            return (Criteria) this;
        }

        public Criteria andOsVersionIsNull() {
            addCriterion("os_version is null");
            return (Criteria) this;
        }

        public Criteria andOsVersionIsNotNull() {
            addCriterion("os_version is not null");
            return (Criteria) this;
        }

        public Criteria andOsVersionEqualTo(String value) {
            addCriterion("os_version =", value, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionNotEqualTo(String value) {
            addCriterion("os_version <>", value, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionGreaterThan(String value) {
            addCriterion("os_version >", value, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionGreaterThanOrEqualTo(String value) {
            addCriterion("os_version >=", value, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionLessThan(String value) {
            addCriterion("os_version <", value, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionLessThanOrEqualTo(String value) {
            addCriterion("os_version <=", value, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionLike(String value) {
            addCriterion("os_version like", value, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionNotLike(String value) {
            addCriterion("os_version not like", value, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionIn(List<String> values) {
            addCriterion("os_version in", values, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionNotIn(List<String> values) {
            addCriterion("os_version not in", values, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionBetween(String value1, String value2) {
            addCriterion("os_version between", value1, value2, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionNotBetween(String value1, String value2) {
            addCriterion("os_version not between", value1, value2, "osVersion");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNull() {
            addCriterion("phone_number is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNotNull() {
            addCriterion("phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberEqualTo(String value) {
            addCriterion("phone_number =", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotEqualTo(String value) {
            addCriterion("phone_number <>", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThan(String value) {
            addCriterion("phone_number >", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("phone_number >=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThan(String value) {
            addCriterion("phone_number <", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("phone_number <=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLike(String value) {
            addCriterion("phone_number like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotLike(String value) {
            addCriterion("phone_number not like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIn(List<String> values) {
            addCriterion("phone_number in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotIn(List<String> values) {
            addCriterion("phone_number not in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBetween(String value1, String value2) {
            addCriterion("phone_number between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("phone_number not between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andCredentialNumIsNull() {
            addCriterion("credential_num is null");
            return (Criteria) this;
        }

        public Criteria andCredentialNumIsNotNull() {
            addCriterion("credential_num is not null");
            return (Criteria) this;
        }

        public Criteria andCredentialNumEqualTo(Integer value) {
            addCriterion("credential_num =", value, "credentialNum");
            return (Criteria) this;
        }

        public Criteria andCredentialNumNotEqualTo(Integer value) {
            addCriterion("credential_num <>", value, "credentialNum");
            return (Criteria) this;
        }

        public Criteria andCredentialNumGreaterThan(Integer value) {
            addCriterion("credential_num >", value, "credentialNum");
            return (Criteria) this;
        }

        public Criteria andCredentialNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("credential_num >=", value, "credentialNum");
            return (Criteria) this;
        }

        public Criteria andCredentialNumLessThan(Integer value) {
            addCriterion("credential_num <", value, "credentialNum");
            return (Criteria) this;
        }

        public Criteria andCredentialNumLessThanOrEqualTo(Integer value) {
            addCriterion("credential_num <=", value, "credentialNum");
            return (Criteria) this;
        }

        public Criteria andCredentialNumIn(List<Integer> values) {
            addCriterion("credential_num in", values, "credentialNum");
            return (Criteria) this;
        }

        public Criteria andCredentialNumNotIn(List<Integer> values) {
            addCriterion("credential_num not in", values, "credentialNum");
            return (Criteria) this;
        }

        public Criteria andCredentialNumBetween(Integer value1, Integer value2) {
            addCriterion("credential_num between", value1, value2, "credentialNum");
            return (Criteria) this;
        }

        public Criteria andCredentialNumNotBetween(Integer value1, Integer value2) {
            addCriterion("credential_num not between", value1, value2, "credentialNum");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeIsNull() {
            addCriterion("credential_type is null");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeIsNotNull() {
            addCriterion("credential_type is not null");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeEqualTo(Integer value) {
            addCriterion("credential_type =", value, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeNotEqualTo(Integer value) {
            addCriterion("credential_type <>", value, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeGreaterThan(Integer value) {
            addCriterion("credential_type >", value, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("credential_type >=", value, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeLessThan(Integer value) {
            addCriterion("credential_type <", value, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeLessThanOrEqualTo(Integer value) {
            addCriterion("credential_type <=", value, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeIn(List<Integer> values) {
            addCriterion("credential_type in", values, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeNotIn(List<Integer> values) {
            addCriterion("credential_type not in", values, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeBetween(Integer value1, Integer value2) {
            addCriterion("credential_type between", value1, value2, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("credential_type not between", value1, value2, "credentialType");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andSnsTokenIsNull() {
            addCriterion("sns_token is null");
            return (Criteria) this;
        }

        public Criteria andSnsTokenIsNotNull() {
            addCriterion("sns_token is not null");
            return (Criteria) this;
        }

        public Criteria andSnsTokenEqualTo(String value) {
            addCriterion("sns_token =", value, "snsToken");
            return (Criteria) this;
        }

        public Criteria andSnsTokenNotEqualTo(String value) {
            addCriterion("sns_token <>", value, "snsToken");
            return (Criteria) this;
        }

        public Criteria andSnsTokenGreaterThan(String value) {
            addCriterion("sns_token >", value, "snsToken");
            return (Criteria) this;
        }

        public Criteria andSnsTokenGreaterThanOrEqualTo(String value) {
            addCriterion("sns_token >=", value, "snsToken");
            return (Criteria) this;
        }

        public Criteria andSnsTokenLessThan(String value) {
            addCriterion("sns_token <", value, "snsToken");
            return (Criteria) this;
        }

        public Criteria andSnsTokenLessThanOrEqualTo(String value) {
            addCriterion("sns_token <=", value, "snsToken");
            return (Criteria) this;
        }

        public Criteria andSnsTokenLike(String value) {
            addCriterion("sns_token like", value, "snsToken");
            return (Criteria) this;
        }

        public Criteria andSnsTokenNotLike(String value) {
            addCriterion("sns_token not like", value, "snsToken");
            return (Criteria) this;
        }

        public Criteria andSnsTokenIn(List<String> values) {
            addCriterion("sns_token in", values, "snsToken");
            return (Criteria) this;
        }

        public Criteria andSnsTokenNotIn(List<String> values) {
            addCriterion("sns_token not in", values, "snsToken");
            return (Criteria) this;
        }

        public Criteria andSnsTokenBetween(String value1, String value2) {
            addCriterion("sns_token between", value1, value2, "snsToken");
            return (Criteria) this;
        }

        public Criteria andSnsTokenNotBetween(String value1, String value2) {
            addCriterion("sns_token not between", value1, value2, "snsToken");
            return (Criteria) this;
        }

        public Criteria andSnsIdIsNull() {
            addCriterion("sns_id is null");
            return (Criteria) this;
        }

        public Criteria andSnsIdIsNotNull() {
            addCriterion("sns_id is not null");
            return (Criteria) this;
        }

        public Criteria andSnsIdEqualTo(String value) {
            addCriterion("sns_id =", value, "snsId");
            return (Criteria) this;
        }

        public Criteria andSnsIdNotEqualTo(String value) {
            addCriterion("sns_id <>", value, "snsId");
            return (Criteria) this;
        }

        public Criteria andSnsIdGreaterThan(String value) {
            addCriterion("sns_id >", value, "snsId");
            return (Criteria) this;
        }

        public Criteria andSnsIdGreaterThanOrEqualTo(String value) {
            addCriterion("sns_id >=", value, "snsId");
            return (Criteria) this;
        }

        public Criteria andSnsIdLessThan(String value) {
            addCriterion("sns_id <", value, "snsId");
            return (Criteria) this;
        }

        public Criteria andSnsIdLessThanOrEqualTo(String value) {
            addCriterion("sns_id <=", value, "snsId");
            return (Criteria) this;
        }

        public Criteria andSnsIdLike(String value) {
            addCriterion("sns_id like", value, "snsId");
            return (Criteria) this;
        }

        public Criteria andSnsIdNotLike(String value) {
            addCriterion("sns_id not like", value, "snsId");
            return (Criteria) this;
        }

        public Criteria andSnsIdIn(List<String> values) {
            addCriterion("sns_id in", values, "snsId");
            return (Criteria) this;
        }

        public Criteria andSnsIdNotIn(List<String> values) {
            addCriterion("sns_id not in", values, "snsId");
            return (Criteria) this;
        }

        public Criteria andSnsIdBetween(String value1, String value2) {
            addCriterion("sns_id between", value1, value2, "snsId");
            return (Criteria) this;
        }

        public Criteria andSnsIdNotBetween(String value1, String value2) {
            addCriterion("sns_id not between", value1, value2, "snsId");
            return (Criteria) this;
        }

        public Criteria andSnsTypeIsNull() {
            addCriterion("sns_type is null");
            return (Criteria) this;
        }

        public Criteria andSnsTypeIsNotNull() {
            addCriterion("sns_type is not null");
            return (Criteria) this;
        }

        public Criteria andSnsTypeEqualTo(Integer value) {
            addCriterion("sns_type =", value, "snsType");
            return (Criteria) this;
        }

        public Criteria andSnsTypeNotEqualTo(Integer value) {
            addCriterion("sns_type <>", value, "snsType");
            return (Criteria) this;
        }

        public Criteria andSnsTypeGreaterThan(Integer value) {
            addCriterion("sns_type >", value, "snsType");
            return (Criteria) this;
        }

        public Criteria andSnsTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sns_type >=", value, "snsType");
            return (Criteria) this;
        }

        public Criteria andSnsTypeLessThan(Integer value) {
            addCriterion("sns_type <", value, "snsType");
            return (Criteria) this;
        }

        public Criteria andSnsTypeLessThanOrEqualTo(Integer value) {
            addCriterion("sns_type <=", value, "snsType");
            return (Criteria) this;
        }

        public Criteria andSnsTypeIn(List<Integer> values) {
            addCriterion("sns_type in", values, "snsType");
            return (Criteria) this;
        }

        public Criteria andSnsTypeNotIn(List<Integer> values) {
            addCriterion("sns_type not in", values, "snsType");
            return (Criteria) this;
        }

        public Criteria andSnsTypeBetween(Integer value1, Integer value2) {
            addCriterion("sns_type between", value1, value2, "snsType");
            return (Criteria) this;
        }

        public Criteria andSnsTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("sns_type not between", value1, value2, "snsType");
            return (Criteria) this;
        }

        public Criteria andSnsAccountIsNull() {
            addCriterion("sns_account is null");
            return (Criteria) this;
        }

        public Criteria andSnsAccountIsNotNull() {
            addCriterion("sns_account is not null");
            return (Criteria) this;
        }

        public Criteria andSnsAccountEqualTo(String value) {
            addCriterion("sns_account =", value, "snsAccount");
            return (Criteria) this;
        }

        public Criteria andSnsAccountNotEqualTo(String value) {
            addCriterion("sns_account <>", value, "snsAccount");
            return (Criteria) this;
        }

        public Criteria andSnsAccountGreaterThan(String value) {
            addCriterion("sns_account >", value, "snsAccount");
            return (Criteria) this;
        }

        public Criteria andSnsAccountGreaterThanOrEqualTo(String value) {
            addCriterion("sns_account >=", value, "snsAccount");
            return (Criteria) this;
        }

        public Criteria andSnsAccountLessThan(String value) {
            addCriterion("sns_account <", value, "snsAccount");
            return (Criteria) this;
        }

        public Criteria andSnsAccountLessThanOrEqualTo(String value) {
            addCriterion("sns_account <=", value, "snsAccount");
            return (Criteria) this;
        }

        public Criteria andSnsAccountLike(String value) {
            addCriterion("sns_account like", value, "snsAccount");
            return (Criteria) this;
        }

        public Criteria andSnsAccountNotLike(String value) {
            addCriterion("sns_account not like", value, "snsAccount");
            return (Criteria) this;
        }

        public Criteria andSnsAccountIn(List<String> values) {
            addCriterion("sns_account in", values, "snsAccount");
            return (Criteria) this;
        }

        public Criteria andSnsAccountNotIn(List<String> values) {
            addCriterion("sns_account not in", values, "snsAccount");
            return (Criteria) this;
        }

        public Criteria andSnsAccountBetween(String value1, String value2) {
            addCriterion("sns_account between", value1, value2, "snsAccount");
            return (Criteria) this;
        }

        public Criteria andSnsAccountNotBetween(String value1, String value2) {
            addCriterion("sns_account not between", value1, value2, "snsAccount");
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

        public Criteria andIsShareIsNull() {
            addCriterion("is_share is null");
            return (Criteria) this;
        }

        public Criteria andIsShareIsNotNull() {
            addCriterion("is_share is not null");
            return (Criteria) this;
        }

        public Criteria andIsShareEqualTo(Integer value) {
            addCriterion("is_share =", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareNotEqualTo(Integer value) {
            addCriterion("is_share <>", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareGreaterThan(Integer value) {
            addCriterion("is_share >", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_share >=", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareLessThan(Integer value) {
            addCriterion("is_share <", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareLessThanOrEqualTo(Integer value) {
            addCriterion("is_share <=", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareIn(List<Integer> values) {
            addCriterion("is_share in", values, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareNotIn(List<Integer> values) {
            addCriterion("is_share not in", values, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareBetween(Integer value1, Integer value2) {
            addCriterion("is_share between", value1, value2, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareNotBetween(Integer value1, Integer value2) {
            addCriterion("is_share not between", value1, value2, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsVisibleIsNull() {
            addCriterion("is_visible is null");
            return (Criteria) this;
        }

        public Criteria andIsVisibleIsNotNull() {
            addCriterion("is_visible is not null");
            return (Criteria) this;
        }

        public Criteria andIsVisibleEqualTo(Integer value) {
            addCriterion("is_visible =", value, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleNotEqualTo(Integer value) {
            addCriterion("is_visible <>", value, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleGreaterThan(Integer value) {
            addCriterion("is_visible >", value, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_visible >=", value, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleLessThan(Integer value) {
            addCriterion("is_visible <", value, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleLessThanOrEqualTo(Integer value) {
            addCriterion("is_visible <=", value, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleIn(List<Integer> values) {
            addCriterion("is_visible in", values, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleNotIn(List<Integer> values) {
            addCriterion("is_visible not in", values, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleBetween(Integer value1, Integer value2) {
            addCriterion("is_visible between", value1, value2, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleNotBetween(Integer value1, Integer value2) {
            addCriterion("is_visible not between", value1, value2, "isVisible");
            return (Criteria) this;
        }

        public Criteria andWowoCountIsNull() {
            addCriterion("wowo_count is null");
            return (Criteria) this;
        }

        public Criteria andWowoCountIsNotNull() {
            addCriterion("wowo_count is not null");
            return (Criteria) this;
        }

        public Criteria andWowoCountEqualTo(Integer value) {
            addCriterion("wowo_count =", value, "wowoCount");
            return (Criteria) this;
        }

        public Criteria andWowoCountNotEqualTo(Integer value) {
            addCriterion("wowo_count <>", value, "wowoCount");
            return (Criteria) this;
        }

        public Criteria andWowoCountGreaterThan(Integer value) {
            addCriterion("wowo_count >", value, "wowoCount");
            return (Criteria) this;
        }

        public Criteria andWowoCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("wowo_count >=", value, "wowoCount");
            return (Criteria) this;
        }

        public Criteria andWowoCountLessThan(Integer value) {
            addCriterion("wowo_count <", value, "wowoCount");
            return (Criteria) this;
        }

        public Criteria andWowoCountLessThanOrEqualTo(Integer value) {
            addCriterion("wowo_count <=", value, "wowoCount");
            return (Criteria) this;
        }

        public Criteria andWowoCountIn(List<Integer> values) {
            addCriterion("wowo_count in", values, "wowoCount");
            return (Criteria) this;
        }

        public Criteria andWowoCountNotIn(List<Integer> values) {
            addCriterion("wowo_count not in", values, "wowoCount");
            return (Criteria) this;
        }

        public Criteria andWowoCountBetween(Integer value1, Integer value2) {
            addCriterion("wowo_count between", value1, value2, "wowoCount");
            return (Criteria) this;
        }

        public Criteria andWowoCountNotBetween(Integer value1, Integer value2) {
            addCriterion("wowo_count not between", value1, value2, "wowoCount");
            return (Criteria) this;
        }

        public Criteria andAttractionCountIsNull() {
            addCriterion("attraction_count is null");
            return (Criteria) this;
        }

        public Criteria andAttractionCountIsNotNull() {
            addCriterion("attraction_count is not null");
            return (Criteria) this;
        }

        public Criteria andAttractionCountEqualTo(Integer value) {
            addCriterion("attraction_count =", value, "attractionCount");
            return (Criteria) this;
        }

        public Criteria andAttractionCountNotEqualTo(Integer value) {
            addCriterion("attraction_count <>", value, "attractionCount");
            return (Criteria) this;
        }

        public Criteria andAttractionCountGreaterThan(Integer value) {
            addCriterion("attraction_count >", value, "attractionCount");
            return (Criteria) this;
        }

        public Criteria andAttractionCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("attraction_count >=", value, "attractionCount");
            return (Criteria) this;
        }

        public Criteria andAttractionCountLessThan(Integer value) {
            addCriterion("attraction_count <", value, "attractionCount");
            return (Criteria) this;
        }

        public Criteria andAttractionCountLessThanOrEqualTo(Integer value) {
            addCriterion("attraction_count <=", value, "attractionCount");
            return (Criteria) this;
        }

        public Criteria andAttractionCountIn(List<Integer> values) {
            addCriterion("attraction_count in", values, "attractionCount");
            return (Criteria) this;
        }

        public Criteria andAttractionCountNotIn(List<Integer> values) {
            addCriterion("attraction_count not in", values, "attractionCount");
            return (Criteria) this;
        }

        public Criteria andAttractionCountBetween(Integer value1, Integer value2) {
            addCriterion("attraction_count between", value1, value2, "attractionCount");
            return (Criteria) this;
        }

        public Criteria andAttractionCountNotBetween(Integer value1, Integer value2) {
            addCriterion("attraction_count not between", value1, value2, "attractionCount");
            return (Criteria) this;
        }

        public Criteria andStayCountIsNull() {
            addCriterion("stay_count is null");
            return (Criteria) this;
        }

        public Criteria andStayCountIsNotNull() {
            addCriterion("stay_count is not null");
            return (Criteria) this;
        }

        public Criteria andStayCountEqualTo(Integer value) {
            addCriterion("stay_count =", value, "stayCount");
            return (Criteria) this;
        }

        public Criteria andStayCountNotEqualTo(Integer value) {
            addCriterion("stay_count <>", value, "stayCount");
            return (Criteria) this;
        }

        public Criteria andStayCountGreaterThan(Integer value) {
            addCriterion("stay_count >", value, "stayCount");
            return (Criteria) this;
        }

        public Criteria andStayCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("stay_count >=", value, "stayCount");
            return (Criteria) this;
        }

        public Criteria andStayCountLessThan(Integer value) {
            addCriterion("stay_count <", value, "stayCount");
            return (Criteria) this;
        }

        public Criteria andStayCountLessThanOrEqualTo(Integer value) {
            addCriterion("stay_count <=", value, "stayCount");
            return (Criteria) this;
        }

        public Criteria andStayCountIn(List<Integer> values) {
            addCriterion("stay_count in", values, "stayCount");
            return (Criteria) this;
        }

        public Criteria andStayCountNotIn(List<Integer> values) {
            addCriterion("stay_count not in", values, "stayCount");
            return (Criteria) this;
        }

        public Criteria andStayCountBetween(Integer value1, Integer value2) {
            addCriterion("stay_count between", value1, value2, "stayCount");
            return (Criteria) this;
        }

        public Criteria andStayCountNotBetween(Integer value1, Integer value2) {
            addCriterion("stay_count not between", value1, value2, "stayCount");
            return (Criteria) this;
        }

        public Criteria andEnterainmentCountIsNull() {
            addCriterion("enterainment_count is null");
            return (Criteria) this;
        }

        public Criteria andEnterainmentCountIsNotNull() {
            addCriterion("enterainment_count is not null");
            return (Criteria) this;
        }

        public Criteria andEnterainmentCountEqualTo(Integer value) {
            addCriterion("enterainment_count =", value, "enterainmentCount");
            return (Criteria) this;
        }

        public Criteria andEnterainmentCountNotEqualTo(Integer value) {
            addCriterion("enterainment_count <>", value, "enterainmentCount");
            return (Criteria) this;
        }

        public Criteria andEnterainmentCountGreaterThan(Integer value) {
            addCriterion("enterainment_count >", value, "enterainmentCount");
            return (Criteria) this;
        }

        public Criteria andEnterainmentCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("enterainment_count >=", value, "enterainmentCount");
            return (Criteria) this;
        }

        public Criteria andEnterainmentCountLessThan(Integer value) {
            addCriterion("enterainment_count <", value, "enterainmentCount");
            return (Criteria) this;
        }

        public Criteria andEnterainmentCountLessThanOrEqualTo(Integer value) {
            addCriterion("enterainment_count <=", value, "enterainmentCount");
            return (Criteria) this;
        }

        public Criteria andEnterainmentCountIn(List<Integer> values) {
            addCriterion("enterainment_count in", values, "enterainmentCount");
            return (Criteria) this;
        }

        public Criteria andEnterainmentCountNotIn(List<Integer> values) {
            addCriterion("enterainment_count not in", values, "enterainmentCount");
            return (Criteria) this;
        }

        public Criteria andEnterainmentCountBetween(Integer value1, Integer value2) {
            addCriterion("enterainment_count between", value1, value2, "enterainmentCount");
            return (Criteria) this;
        }

        public Criteria andEnterainmentCountNotBetween(Integer value1, Integer value2) {
            addCriterion("enterainment_count not between", value1, value2, "enterainmentCount");
            return (Criteria) this;
        }

        public Criteria andFoodCountIsNull() {
            addCriterion("food_count is null");
            return (Criteria) this;
        }

        public Criteria andFoodCountIsNotNull() {
            addCriterion("food_count is not null");
            return (Criteria) this;
        }

        public Criteria andFoodCountEqualTo(Integer value) {
            addCriterion("food_count =", value, "foodCount");
            return (Criteria) this;
        }

        public Criteria andFoodCountNotEqualTo(Integer value) {
            addCriterion("food_count <>", value, "foodCount");
            return (Criteria) this;
        }

        public Criteria andFoodCountGreaterThan(Integer value) {
            addCriterion("food_count >", value, "foodCount");
            return (Criteria) this;
        }

        public Criteria andFoodCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("food_count >=", value, "foodCount");
            return (Criteria) this;
        }

        public Criteria andFoodCountLessThan(Integer value) {
            addCriterion("food_count <", value, "foodCount");
            return (Criteria) this;
        }

        public Criteria andFoodCountLessThanOrEqualTo(Integer value) {
            addCriterion("food_count <=", value, "foodCount");
            return (Criteria) this;
        }

        public Criteria andFoodCountIn(List<Integer> values) {
            addCriterion("food_count in", values, "foodCount");
            return (Criteria) this;
        }

        public Criteria andFoodCountNotIn(List<Integer> values) {
            addCriterion("food_count not in", values, "foodCount");
            return (Criteria) this;
        }

        public Criteria andFoodCountBetween(Integer value1, Integer value2) {
            addCriterion("food_count between", value1, value2, "foodCount");
            return (Criteria) this;
        }

        public Criteria andFoodCountNotBetween(Integer value1, Integer value2) {
            addCriterion("food_count not between", value1, value2, "foodCount");
            return (Criteria) this;
        }

        public Criteria andRandStrIsNull() {
            addCriterion("rand_str is null");
            return (Criteria) this;
        }

        public Criteria andRandStrIsNotNull() {
            addCriterion("rand_str is not null");
            return (Criteria) this;
        }

        public Criteria andRandStrEqualTo(String value) {
            addCriterion("rand_str =", value, "randStr");
            return (Criteria) this;
        }

        public Criteria andRandStrNotEqualTo(String value) {
            addCriterion("rand_str <>", value, "randStr");
            return (Criteria) this;
        }

        public Criteria andRandStrGreaterThan(String value) {
            addCriterion("rand_str >", value, "randStr");
            return (Criteria) this;
        }

        public Criteria andRandStrGreaterThanOrEqualTo(String value) {
            addCriterion("rand_str >=", value, "randStr");
            return (Criteria) this;
        }

        public Criteria andRandStrLessThan(String value) {
            addCriterion("rand_str <", value, "randStr");
            return (Criteria) this;
        }

        public Criteria andRandStrLessThanOrEqualTo(String value) {
            addCriterion("rand_str <=", value, "randStr");
            return (Criteria) this;
        }

        public Criteria andRandStrLike(String value) {
            addCriterion("rand_str like", value, "randStr");
            return (Criteria) this;
        }

        public Criteria andRandStrNotLike(String value) {
            addCriterion("rand_str not like", value, "randStr");
            return (Criteria) this;
        }

        public Criteria andRandStrIn(List<String> values) {
            addCriterion("rand_str in", values, "randStr");
            return (Criteria) this;
        }

        public Criteria andRandStrNotIn(List<String> values) {
            addCriterion("rand_str not in", values, "randStr");
            return (Criteria) this;
        }

        public Criteria andRandStrBetween(String value1, String value2) {
            addCriterion("rand_str between", value1, value2, "randStr");
            return (Criteria) this;
        }

        public Criteria andRandStrNotBetween(String value1, String value2) {
            addCriterion("rand_str not between", value1, value2, "randStr");
            return (Criteria) this;
        }

        public Criteria andPointsIsNull() {
            addCriterion("points is null");
            return (Criteria) this;
        }

        public Criteria andPointsIsNotNull() {
            addCriterion("points is not null");
            return (Criteria) this;
        }

        public Criteria andPointsEqualTo(Integer value) {
            addCriterion("points =", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotEqualTo(Integer value) {
            addCriterion("points <>", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThan(Integer value) {
            addCriterion("points >", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("points >=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThan(Integer value) {
            addCriterion("points <", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThanOrEqualTo(Integer value) {
            addCriterion("points <=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsIn(List<Integer> values) {
            addCriterion("points in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotIn(List<Integer> values) {
            addCriterion("points not in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsBetween(Integer value1, Integer value2) {
            addCriterion("points between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("points not between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andIsPhoneAuthIsNull() {
            addCriterion("is_phone_auth is null");
            return (Criteria) this;
        }

        public Criteria andIsPhoneAuthIsNotNull() {
            addCriterion("is_phone_auth is not null");
            return (Criteria) this;
        }

        public Criteria andIsPhoneAuthEqualTo(Integer value) {
            addCriterion("is_phone_auth =", value, "isPhoneAuth");
            return (Criteria) this;
        }

        public Criteria andIsPhoneAuthNotEqualTo(Integer value) {
            addCriterion("is_phone_auth <>", value, "isPhoneAuth");
            return (Criteria) this;
        }

        public Criteria andIsPhoneAuthGreaterThan(Integer value) {
            addCriterion("is_phone_auth >", value, "isPhoneAuth");
            return (Criteria) this;
        }

        public Criteria andIsPhoneAuthGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_phone_auth >=", value, "isPhoneAuth");
            return (Criteria) this;
        }

        public Criteria andIsPhoneAuthLessThan(Integer value) {
            addCriterion("is_phone_auth <", value, "isPhoneAuth");
            return (Criteria) this;
        }

        public Criteria andIsPhoneAuthLessThanOrEqualTo(Integer value) {
            addCriterion("is_phone_auth <=", value, "isPhoneAuth");
            return (Criteria) this;
        }

        public Criteria andIsPhoneAuthIn(List<Integer> values) {
            addCriterion("is_phone_auth in", values, "isPhoneAuth");
            return (Criteria) this;
        }

        public Criteria andIsPhoneAuthNotIn(List<Integer> values) {
            addCriterion("is_phone_auth not in", values, "isPhoneAuth");
            return (Criteria) this;
        }

        public Criteria andIsPhoneAuthBetween(Integer value1, Integer value2) {
            addCriterion("is_phone_auth between", value1, value2, "isPhoneAuth");
            return (Criteria) this;
        }

        public Criteria andIsPhoneAuthNotBetween(Integer value1, Integer value2) {
            addCriterion("is_phone_auth not between", value1, value2, "isPhoneAuth");
            return (Criteria) this;
        }

        public Criteria andLicenseAuthStatusIsNull() {
            addCriterion("license_auth_status is null");
            return (Criteria) this;
        }

        public Criteria andLicenseAuthStatusIsNotNull() {
            addCriterion("license_auth_status is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseAuthStatusEqualTo(Integer value) {
            addCriterion("license_auth_status =", value, "licenseAuthStatus");
            return (Criteria) this;
        }

        public Criteria andLicenseAuthStatusNotEqualTo(Integer value) {
            addCriterion("license_auth_status <>", value, "licenseAuthStatus");
            return (Criteria) this;
        }

        public Criteria andLicenseAuthStatusGreaterThan(Integer value) {
            addCriterion("license_auth_status >", value, "licenseAuthStatus");
            return (Criteria) this;
        }

        public Criteria andLicenseAuthStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("license_auth_status >=", value, "licenseAuthStatus");
            return (Criteria) this;
        }

        public Criteria andLicenseAuthStatusLessThan(Integer value) {
            addCriterion("license_auth_status <", value, "licenseAuthStatus");
            return (Criteria) this;
        }

        public Criteria andLicenseAuthStatusLessThanOrEqualTo(Integer value) {
            addCriterion("license_auth_status <=", value, "licenseAuthStatus");
            return (Criteria) this;
        }

        public Criteria andLicenseAuthStatusIn(List<Integer> values) {
            addCriterion("license_auth_status in", values, "licenseAuthStatus");
            return (Criteria) this;
        }

        public Criteria andLicenseAuthStatusNotIn(List<Integer> values) {
            addCriterion("license_auth_status not in", values, "licenseAuthStatus");
            return (Criteria) this;
        }

        public Criteria andLicenseAuthStatusBetween(Integer value1, Integer value2) {
            addCriterion("license_auth_status between", value1, value2, "licenseAuthStatus");
            return (Criteria) this;
        }

        public Criteria andLicenseAuthStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("license_auth_status not between", value1, value2, "licenseAuthStatus");
            return (Criteria) this;
        }

        public Criteria andLicenseIsNull() {
            addCriterion("license is null");
            return (Criteria) this;
        }

        public Criteria andLicenseIsNotNull() {
            addCriterion("license is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseEqualTo(String value) {
            addCriterion("license =", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotEqualTo(String value) {
            addCriterion("license <>", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseGreaterThan(String value) {
            addCriterion("license >", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("license >=", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLessThan(String value) {
            addCriterion("license <", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLessThanOrEqualTo(String value) {
            addCriterion("license <=", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLike(String value) {
            addCriterion("license like", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotLike(String value) {
            addCriterion("license not like", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseIn(List<String> values) {
            addCriterion("license in", values, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotIn(List<String> values) {
            addCriterion("license not in", values, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseBetween(String value1, String value2) {
            addCriterion("license between", value1, value2, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotBetween(String value1, String value2) {
            addCriterion("license not between", value1, value2, "license");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNull() {
            addCriterion("shop_name is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("shop_name =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("shop_name <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("shop_name >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_name >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("shop_name <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("shop_name <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("shop_name like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("shop_name not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("shop_name in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("shop_name not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("shop_name between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("shop_name not between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopAddressIsNull() {
            addCriterion("shop_address is null");
            return (Criteria) this;
        }

        public Criteria andShopAddressIsNotNull() {
            addCriterion("shop_address is not null");
            return (Criteria) this;
        }

        public Criteria andShopAddressEqualTo(String value) {
            addCriterion("shop_address =", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotEqualTo(String value) {
            addCriterion("shop_address <>", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressGreaterThan(String value) {
            addCriterion("shop_address >", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressGreaterThanOrEqualTo(String value) {
            addCriterion("shop_address >=", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressLessThan(String value) {
            addCriterion("shop_address <", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressLessThanOrEqualTo(String value) {
            addCriterion("shop_address <=", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressLike(String value) {
            addCriterion("shop_address like", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotLike(String value) {
            addCriterion("shop_address not like", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressIn(List<String> values) {
            addCriterion("shop_address in", values, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotIn(List<String> values) {
            addCriterion("shop_address not in", values, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressBetween(String value1, String value2) {
            addCriterion("shop_address between", value1, value2, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotBetween(String value1, String value2) {
            addCriterion("shop_address not between", value1, value2, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopPhoneIsNull() {
            addCriterion("shop_phone is null");
            return (Criteria) this;
        }

        public Criteria andShopPhoneIsNotNull() {
            addCriterion("shop_phone is not null");
            return (Criteria) this;
        }

        public Criteria andShopPhoneEqualTo(String value) {
            addCriterion("shop_phone =", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneNotEqualTo(String value) {
            addCriterion("shop_phone <>", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneGreaterThan(String value) {
            addCriterion("shop_phone >", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("shop_phone >=", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneLessThan(String value) {
            addCriterion("shop_phone <", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneLessThanOrEqualTo(String value) {
            addCriterion("shop_phone <=", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneLike(String value) {
            addCriterion("shop_phone like", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneNotLike(String value) {
            addCriterion("shop_phone not like", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneIn(List<String> values) {
            addCriterion("shop_phone in", values, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneNotIn(List<String> values) {
            addCriterion("shop_phone not in", values, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneBetween(String value1, String value2) {
            addCriterion("shop_phone between", value1, value2, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneNotBetween(String value1, String value2) {
            addCriterion("shop_phone not between", value1, value2, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopLatIsNull() {
            addCriterion("shop_lat is null");
            return (Criteria) this;
        }

        public Criteria andShopLatIsNotNull() {
            addCriterion("shop_lat is not null");
            return (Criteria) this;
        }

        public Criteria andShopLatEqualTo(Double value) {
            addCriterion("shop_lat =", value, "shopLat");
            return (Criteria) this;
        }

        public Criteria andShopLatNotEqualTo(Double value) {
            addCriterion("shop_lat <>", value, "shopLat");
            return (Criteria) this;
        }

        public Criteria andShopLatGreaterThan(Double value) {
            addCriterion("shop_lat >", value, "shopLat");
            return (Criteria) this;
        }

        public Criteria andShopLatGreaterThanOrEqualTo(Double value) {
            addCriterion("shop_lat >=", value, "shopLat");
            return (Criteria) this;
        }

        public Criteria andShopLatLessThan(Double value) {
            addCriterion("shop_lat <", value, "shopLat");
            return (Criteria) this;
        }

        public Criteria andShopLatLessThanOrEqualTo(Double value) {
            addCriterion("shop_lat <=", value, "shopLat");
            return (Criteria) this;
        }

        public Criteria andShopLatIn(List<Double> values) {
            addCriterion("shop_lat in", values, "shopLat");
            return (Criteria) this;
        }

        public Criteria andShopLatNotIn(List<Double> values) {
            addCriterion("shop_lat not in", values, "shopLat");
            return (Criteria) this;
        }

        public Criteria andShopLatBetween(Double value1, Double value2) {
            addCriterion("shop_lat between", value1, value2, "shopLat");
            return (Criteria) this;
        }

        public Criteria andShopLatNotBetween(Double value1, Double value2) {
            addCriterion("shop_lat not between", value1, value2, "shopLat");
            return (Criteria) this;
        }

        public Criteria andShopLngIsNull() {
            addCriterion("shop_lng is null");
            return (Criteria) this;
        }

        public Criteria andShopLngIsNotNull() {
            addCriterion("shop_lng is not null");
            return (Criteria) this;
        }

        public Criteria andShopLngEqualTo(Double value) {
            addCriterion("shop_lng =", value, "shopLng");
            return (Criteria) this;
        }

        public Criteria andShopLngNotEqualTo(Double value) {
            addCriterion("shop_lng <>", value, "shopLng");
            return (Criteria) this;
        }

        public Criteria andShopLngGreaterThan(Double value) {
            addCriterion("shop_lng >", value, "shopLng");
            return (Criteria) this;
        }

        public Criteria andShopLngGreaterThanOrEqualTo(Double value) {
            addCriterion("shop_lng >=", value, "shopLng");
            return (Criteria) this;
        }

        public Criteria andShopLngLessThan(Double value) {
            addCriterion("shop_lng <", value, "shopLng");
            return (Criteria) this;
        }

        public Criteria andShopLngLessThanOrEqualTo(Double value) {
            addCriterion("shop_lng <=", value, "shopLng");
            return (Criteria) this;
        }

        public Criteria andShopLngIn(List<Double> values) {
            addCriterion("shop_lng in", values, "shopLng");
            return (Criteria) this;
        }

        public Criteria andShopLngNotIn(List<Double> values) {
            addCriterion("shop_lng not in", values, "shopLng");
            return (Criteria) this;
        }

        public Criteria andShopLngBetween(Double value1, Double value2) {
            addCriterion("shop_lng between", value1, value2, "shopLng");
            return (Criteria) this;
        }

        public Criteria andShopLngNotBetween(Double value1, Double value2) {
            addCriterion("shop_lng not between", value1, value2, "shopLng");
            return (Criteria) this;
        }

        public Criteria andRoleIsNull() {
            addCriterion("role is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("role is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(Integer value) {
            addCriterion("role =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(Integer value) {
            addCriterion("role <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(Integer value) {
            addCriterion("role >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(Integer value) {
            addCriterion("role >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(Integer value) {
            addCriterion("role <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(Integer value) {
            addCriterion("role <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<Integer> values) {
            addCriterion("role in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<Integer> values) {
            addCriterion("role not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(Integer value1, Integer value2) {
            addCriterion("role between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(Integer value1, Integer value2) {
            addCriterion("role not between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andKCodeIsNull() {
            addCriterion("k_code is null");
            return (Criteria) this;
        }

        public Criteria andKCodeIsNotNull() {
            addCriterion("k_code is not null");
            return (Criteria) this;
        }

        public Criteria andKCodeEqualTo(String value) {
            addCriterion("k_code =", value, "kCode");
            return (Criteria) this;
        }

        public Criteria andKCodeNotEqualTo(String value) {
            addCriterion("k_code <>", value, "kCode");
            return (Criteria) this;
        }

        public Criteria andKCodeGreaterThan(String value) {
            addCriterion("k_code >", value, "kCode");
            return (Criteria) this;
        }

        public Criteria andKCodeGreaterThanOrEqualTo(String value) {
            addCriterion("k_code >=", value, "kCode");
            return (Criteria) this;
        }

        public Criteria andKCodeLessThan(String value) {
            addCriterion("k_code <", value, "kCode");
            return (Criteria) this;
        }

        public Criteria andKCodeLessThanOrEqualTo(String value) {
            addCriterion("k_code <=", value, "kCode");
            return (Criteria) this;
        }

        public Criteria andKCodeLike(String value) {
            addCriterion("k_code like", value, "kCode");
            return (Criteria) this;
        }

        public Criteria andKCodeNotLike(String value) {
            addCriterion("k_code not like", value, "kCode");
            return (Criteria) this;
        }

        public Criteria andKCodeIn(List<String> values) {
            addCriterion("k_code in", values, "kCode");
            return (Criteria) this;
        }

        public Criteria andKCodeNotIn(List<String> values) {
            addCriterion("k_code not in", values, "kCode");
            return (Criteria) this;
        }

        public Criteria andKCodeBetween(String value1, String value2) {
            addCriterion("k_code between", value1, value2, "kCode");
            return (Criteria) this;
        }

        public Criteria andKCodeNotBetween(String value1, String value2) {
            addCriterion("k_code not between", value1, value2, "kCode");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNull() {
            addCriterion("is_valid is null");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNotNull() {
            addCriterion("is_valid is not null");
            return (Criteria) this;
        }

        public Criteria andIsValidEqualTo(Integer value) {
            addCriterion("is_valid =", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotEqualTo(Integer value) {
            addCriterion("is_valid <>", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThan(Integer value) {
            addCriterion("is_valid >", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_valid >=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThan(Integer value) {
            addCriterion("is_valid <", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThanOrEqualTo(Integer value) {
            addCriterion("is_valid <=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidIn(List<Integer> values) {
            addCriterion("is_valid in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotIn(List<Integer> values) {
            addCriterion("is_valid not in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidBetween(Integer value1, Integer value2) {
            addCriterion("is_valid between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotBetween(Integer value1, Integer value2) {
            addCriterion("is_valid not between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsBlackIsNull() {
            addCriterion("is_black is null");
            return (Criteria) this;
        }

        public Criteria andIsBlackIsNotNull() {
            addCriterion("is_black is not null");
            return (Criteria) this;
        }

        public Criteria andIsBlackEqualTo(Integer value) {
            addCriterion("is_black =", value, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackNotEqualTo(Integer value) {
            addCriterion("is_black <>", value, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackGreaterThan(Integer value) {
            addCriterion("is_black >", value, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_black >=", value, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackLessThan(Integer value) {
            addCriterion("is_black <", value, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackLessThanOrEqualTo(Integer value) {
            addCriterion("is_black <=", value, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackIn(List<Integer> values) {
            addCriterion("is_black in", values, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackNotIn(List<Integer> values) {
            addCriterion("is_black not in", values, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackBetween(Integer value1, Integer value2) {
            addCriterion("is_black between", value1, value2, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackNotBetween(Integer value1, Integer value2) {
            addCriterion("is_black not between", value1, value2, "isBlack");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(String value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(String value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(String value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(String value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(String value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(String value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<String> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<String> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(String value1, String value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(String value1, String value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(String value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(String value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(String value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(String value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(String value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(String value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<String> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<String> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(String value1, String value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(String value1, String value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
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