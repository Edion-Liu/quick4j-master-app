package com.eliteams.quick4j.web.model;

import java.util.ArrayList;
import java.util.List;

public class TResortExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TResortExample() {
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

        public Criteria andCampsiteTypeIsNull() {
            addCriterion("campsite_type is null");
            return (Criteria) this;
        }

        public Criteria andCampsiteTypeIsNotNull() {
            addCriterion("campsite_type is not null");
            return (Criteria) this;
        }

        public Criteria andCampsiteTypeEqualTo(String value) {
            addCriterion("campsite_type =", value, "campsiteType");
            return (Criteria) this;
        }

        public Criteria andCampsiteTypeNotEqualTo(String value) {
            addCriterion("campsite_type <>", value, "campsiteType");
            return (Criteria) this;
        }

        public Criteria andCampsiteTypeGreaterThan(String value) {
            addCriterion("campsite_type >", value, "campsiteType");
            return (Criteria) this;
        }

        public Criteria andCampsiteTypeGreaterThanOrEqualTo(String value) {
            addCriterion("campsite_type >=", value, "campsiteType");
            return (Criteria) this;
        }

        public Criteria andCampsiteTypeLessThan(String value) {
            addCriterion("campsite_type <", value, "campsiteType");
            return (Criteria) this;
        }

        public Criteria andCampsiteTypeLessThanOrEqualTo(String value) {
            addCriterion("campsite_type <=", value, "campsiteType");
            return (Criteria) this;
        }

        public Criteria andCampsiteTypeLike(String value) {
            addCriterion("campsite_type like", value, "campsiteType");
            return (Criteria) this;
        }

        public Criteria andCampsiteTypeNotLike(String value) {
            addCriterion("campsite_type not like", value, "campsiteType");
            return (Criteria) this;
        }

        public Criteria andCampsiteTypeIn(List<String> values) {
            addCriterion("campsite_type in", values, "campsiteType");
            return (Criteria) this;
        }

        public Criteria andCampsiteTypeNotIn(List<String> values) {
            addCriterion("campsite_type not in", values, "campsiteType");
            return (Criteria) this;
        }

        public Criteria andCampsiteTypeBetween(String value1, String value2) {
            addCriterion("campsite_type between", value1, value2, "campsiteType");
            return (Criteria) this;
        }

        public Criteria andCampsiteTypeNotBetween(String value1, String value2) {
            addCriterion("campsite_type not between", value1, value2, "campsiteType");
            return (Criteria) this;
        }

        public Criteria andStyleIsNull() {
            addCriterion("style is null");
            return (Criteria) this;
        }

        public Criteria andStyleIsNotNull() {
            addCriterion("style is not null");
            return (Criteria) this;
        }

        public Criteria andStyleEqualTo(String value) {
            addCriterion("style =", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotEqualTo(String value) {
            addCriterion("style <>", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleGreaterThan(String value) {
            addCriterion("style >", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleGreaterThanOrEqualTo(String value) {
            addCriterion("style >=", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLessThan(String value) {
            addCriterion("style <", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLessThanOrEqualTo(String value) {
            addCriterion("style <=", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLike(String value) {
            addCriterion("style like", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotLike(String value) {
            addCriterion("style not like", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleIn(List<String> values) {
            addCriterion("style in", values, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotIn(List<String> values) {
            addCriterion("style not in", values, "style");
            return (Criteria) this;
        }

        public Criteria andStyleBetween(String value1, String value2) {
            addCriterion("style between", value1, value2, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotBetween(String value1, String value2) {
            addCriterion("style not between", value1, value2, "style");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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

        public Criteria andIsHasWaterIsNull() {
            addCriterion("is_has_water is null");
            return (Criteria) this;
        }

        public Criteria andIsHasWaterIsNotNull() {
            addCriterion("is_has_water is not null");
            return (Criteria) this;
        }

        public Criteria andIsHasWaterEqualTo(Integer value) {
            addCriterion("is_has_water =", value, "isHasWater");
            return (Criteria) this;
        }

        public Criteria andIsHasWaterNotEqualTo(Integer value) {
            addCriterion("is_has_water <>", value, "isHasWater");
            return (Criteria) this;
        }

        public Criteria andIsHasWaterGreaterThan(Integer value) {
            addCriterion("is_has_water >", value, "isHasWater");
            return (Criteria) this;
        }

        public Criteria andIsHasWaterGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_has_water >=", value, "isHasWater");
            return (Criteria) this;
        }

        public Criteria andIsHasWaterLessThan(Integer value) {
            addCriterion("is_has_water <", value, "isHasWater");
            return (Criteria) this;
        }

        public Criteria andIsHasWaterLessThanOrEqualTo(Integer value) {
            addCriterion("is_has_water <=", value, "isHasWater");
            return (Criteria) this;
        }

        public Criteria andIsHasWaterIn(List<Integer> values) {
            addCriterion("is_has_water in", values, "isHasWater");
            return (Criteria) this;
        }

        public Criteria andIsHasWaterNotIn(List<Integer> values) {
            addCriterion("is_has_water not in", values, "isHasWater");
            return (Criteria) this;
        }

        public Criteria andIsHasWaterBetween(Integer value1, Integer value2) {
            addCriterion("is_has_water between", value1, value2, "isHasWater");
            return (Criteria) this;
        }

        public Criteria andIsHasWaterNotBetween(Integer value1, Integer value2) {
            addCriterion("is_has_water not between", value1, value2, "isHasWater");
            return (Criteria) this;
        }

        public Criteria andIsHasElectricIsNull() {
            addCriterion("is_has_electric is null");
            return (Criteria) this;
        }

        public Criteria andIsHasElectricIsNotNull() {
            addCriterion("is_has_electric is not null");
            return (Criteria) this;
        }

        public Criteria andIsHasElectricEqualTo(Integer value) {
            addCriterion("is_has_electric =", value, "isHasElectric");
            return (Criteria) this;
        }

        public Criteria andIsHasElectricNotEqualTo(Integer value) {
            addCriterion("is_has_electric <>", value, "isHasElectric");
            return (Criteria) this;
        }

        public Criteria andIsHasElectricGreaterThan(Integer value) {
            addCriterion("is_has_electric >", value, "isHasElectric");
            return (Criteria) this;
        }

        public Criteria andIsHasElectricGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_has_electric >=", value, "isHasElectric");
            return (Criteria) this;
        }

        public Criteria andIsHasElectricLessThan(Integer value) {
            addCriterion("is_has_electric <", value, "isHasElectric");
            return (Criteria) this;
        }

        public Criteria andIsHasElectricLessThanOrEqualTo(Integer value) {
            addCriterion("is_has_electric <=", value, "isHasElectric");
            return (Criteria) this;
        }

        public Criteria andIsHasElectricIn(List<Integer> values) {
            addCriterion("is_has_electric in", values, "isHasElectric");
            return (Criteria) this;
        }

        public Criteria andIsHasElectricNotIn(List<Integer> values) {
            addCriterion("is_has_electric not in", values, "isHasElectric");
            return (Criteria) this;
        }

        public Criteria andIsHasElectricBetween(Integer value1, Integer value2) {
            addCriterion("is_has_electric between", value1, value2, "isHasElectric");
            return (Criteria) this;
        }

        public Criteria andIsHasElectricNotBetween(Integer value1, Integer value2) {
            addCriterion("is_has_electric not between", value1, value2, "isHasElectric");
            return (Criteria) this;
        }

        public Criteria andIsHasToiletIsNull() {
            addCriterion("is_has_toilet is null");
            return (Criteria) this;
        }

        public Criteria andIsHasToiletIsNotNull() {
            addCriterion("is_has_toilet is not null");
            return (Criteria) this;
        }

        public Criteria andIsHasToiletEqualTo(Integer value) {
            addCriterion("is_has_toilet =", value, "isHasToilet");
            return (Criteria) this;
        }

        public Criteria andIsHasToiletNotEqualTo(Integer value) {
            addCriterion("is_has_toilet <>", value, "isHasToilet");
            return (Criteria) this;
        }

        public Criteria andIsHasToiletGreaterThan(Integer value) {
            addCriterion("is_has_toilet >", value, "isHasToilet");
            return (Criteria) this;
        }

        public Criteria andIsHasToiletGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_has_toilet >=", value, "isHasToilet");
            return (Criteria) this;
        }

        public Criteria andIsHasToiletLessThan(Integer value) {
            addCriterion("is_has_toilet <", value, "isHasToilet");
            return (Criteria) this;
        }

        public Criteria andIsHasToiletLessThanOrEqualTo(Integer value) {
            addCriterion("is_has_toilet <=", value, "isHasToilet");
            return (Criteria) this;
        }

        public Criteria andIsHasToiletIn(List<Integer> values) {
            addCriterion("is_has_toilet in", values, "isHasToilet");
            return (Criteria) this;
        }

        public Criteria andIsHasToiletNotIn(List<Integer> values) {
            addCriterion("is_has_toilet not in", values, "isHasToilet");
            return (Criteria) this;
        }

        public Criteria andIsHasToiletBetween(Integer value1, Integer value2) {
            addCriterion("is_has_toilet between", value1, value2, "isHasToilet");
            return (Criteria) this;
        }

        public Criteria andIsHasToiletNotBetween(Integer value1, Integer value2) {
            addCriterion("is_has_toilet not between", value1, value2, "isHasToilet");
            return (Criteria) this;
        }

        public Criteria andIsCanBatheIsNull() {
            addCriterion("is_can_bathe is null");
            return (Criteria) this;
        }

        public Criteria andIsCanBatheIsNotNull() {
            addCriterion("is_can_bathe is not null");
            return (Criteria) this;
        }

        public Criteria andIsCanBatheEqualTo(Integer value) {
            addCriterion("is_can_bathe =", value, "isCanBathe");
            return (Criteria) this;
        }

        public Criteria andIsCanBatheNotEqualTo(Integer value) {
            addCriterion("is_can_bathe <>", value, "isCanBathe");
            return (Criteria) this;
        }

        public Criteria andIsCanBatheGreaterThan(Integer value) {
            addCriterion("is_can_bathe >", value, "isCanBathe");
            return (Criteria) this;
        }

        public Criteria andIsCanBatheGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_can_bathe >=", value, "isCanBathe");
            return (Criteria) this;
        }

        public Criteria andIsCanBatheLessThan(Integer value) {
            addCriterion("is_can_bathe <", value, "isCanBathe");
            return (Criteria) this;
        }

        public Criteria andIsCanBatheLessThanOrEqualTo(Integer value) {
            addCriterion("is_can_bathe <=", value, "isCanBathe");
            return (Criteria) this;
        }

        public Criteria andIsCanBatheIn(List<Integer> values) {
            addCriterion("is_can_bathe in", values, "isCanBathe");
            return (Criteria) this;
        }

        public Criteria andIsCanBatheNotIn(List<Integer> values) {
            addCriterion("is_can_bathe not in", values, "isCanBathe");
            return (Criteria) this;
        }

        public Criteria andIsCanBatheBetween(Integer value1, Integer value2) {
            addCriterion("is_can_bathe between", value1, value2, "isCanBathe");
            return (Criteria) this;
        }

        public Criteria andIsCanBatheNotBetween(Integer value1, Integer value2) {
            addCriterion("is_can_bathe not between", value1, value2, "isCanBathe");
            return (Criteria) this;
        }

        public Criteria andIsHasRestaurantIsNull() {
            addCriterion("is_has_restaurant is null");
            return (Criteria) this;
        }

        public Criteria andIsHasRestaurantIsNotNull() {
            addCriterion("is_has_restaurant is not null");
            return (Criteria) this;
        }

        public Criteria andIsHasRestaurantEqualTo(Integer value) {
            addCriterion("is_has_restaurant =", value, "isHasRestaurant");
            return (Criteria) this;
        }

        public Criteria andIsHasRestaurantNotEqualTo(Integer value) {
            addCriterion("is_has_restaurant <>", value, "isHasRestaurant");
            return (Criteria) this;
        }

        public Criteria andIsHasRestaurantGreaterThan(Integer value) {
            addCriterion("is_has_restaurant >", value, "isHasRestaurant");
            return (Criteria) this;
        }

        public Criteria andIsHasRestaurantGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_has_restaurant >=", value, "isHasRestaurant");
            return (Criteria) this;
        }

        public Criteria andIsHasRestaurantLessThan(Integer value) {
            addCriterion("is_has_restaurant <", value, "isHasRestaurant");
            return (Criteria) this;
        }

        public Criteria andIsHasRestaurantLessThanOrEqualTo(Integer value) {
            addCriterion("is_has_restaurant <=", value, "isHasRestaurant");
            return (Criteria) this;
        }

        public Criteria andIsHasRestaurantIn(List<Integer> values) {
            addCriterion("is_has_restaurant in", values, "isHasRestaurant");
            return (Criteria) this;
        }

        public Criteria andIsHasRestaurantNotIn(List<Integer> values) {
            addCriterion("is_has_restaurant not in", values, "isHasRestaurant");
            return (Criteria) this;
        }

        public Criteria andIsHasRestaurantBetween(Integer value1, Integer value2) {
            addCriterion("is_has_restaurant between", value1, value2, "isHasRestaurant");
            return (Criteria) this;
        }

        public Criteria andIsHasRestaurantNotBetween(Integer value1, Integer value2) {
            addCriterion("is_has_restaurant not between", value1, value2, "isHasRestaurant");
            return (Criteria) this;
        }

        public Criteria andIsCanShoppingIsNull() {
            addCriterion("is_can_shopping is null");
            return (Criteria) this;
        }

        public Criteria andIsCanShoppingIsNotNull() {
            addCriterion("is_can_shopping is not null");
            return (Criteria) this;
        }

        public Criteria andIsCanShoppingEqualTo(Integer value) {
            addCriterion("is_can_shopping =", value, "isCanShopping");
            return (Criteria) this;
        }

        public Criteria andIsCanShoppingNotEqualTo(Integer value) {
            addCriterion("is_can_shopping <>", value, "isCanShopping");
            return (Criteria) this;
        }

        public Criteria andIsCanShoppingGreaterThan(Integer value) {
            addCriterion("is_can_shopping >", value, "isCanShopping");
            return (Criteria) this;
        }

        public Criteria andIsCanShoppingGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_can_shopping >=", value, "isCanShopping");
            return (Criteria) this;
        }

        public Criteria andIsCanShoppingLessThan(Integer value) {
            addCriterion("is_can_shopping <", value, "isCanShopping");
            return (Criteria) this;
        }

        public Criteria andIsCanShoppingLessThanOrEqualTo(Integer value) {
            addCriterion("is_can_shopping <=", value, "isCanShopping");
            return (Criteria) this;
        }

        public Criteria andIsCanShoppingIn(List<Integer> values) {
            addCriterion("is_can_shopping in", values, "isCanShopping");
            return (Criteria) this;
        }

        public Criteria andIsCanShoppingNotIn(List<Integer> values) {
            addCriterion("is_can_shopping not in", values, "isCanShopping");
            return (Criteria) this;
        }

        public Criteria andIsCanShoppingBetween(Integer value1, Integer value2) {
            addCriterion("is_can_shopping between", value1, value2, "isCanShopping");
            return (Criteria) this;
        }

        public Criteria andIsCanShoppingNotBetween(Integer value1, Integer value2) {
            addCriterion("is_can_shopping not between", value1, value2, "isCanShopping");
            return (Criteria) this;
        }

        public Criteria andIsHasBarIsNull() {
            addCriterion("is_has_bar is null");
            return (Criteria) this;
        }

        public Criteria andIsHasBarIsNotNull() {
            addCriterion("is_has_bar is not null");
            return (Criteria) this;
        }

        public Criteria andIsHasBarEqualTo(Integer value) {
            addCriterion("is_has_bar =", value, "isHasBar");
            return (Criteria) this;
        }

        public Criteria andIsHasBarNotEqualTo(Integer value) {
            addCriterion("is_has_bar <>", value, "isHasBar");
            return (Criteria) this;
        }

        public Criteria andIsHasBarGreaterThan(Integer value) {
            addCriterion("is_has_bar >", value, "isHasBar");
            return (Criteria) this;
        }

        public Criteria andIsHasBarGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_has_bar >=", value, "isHasBar");
            return (Criteria) this;
        }

        public Criteria andIsHasBarLessThan(Integer value) {
            addCriterion("is_has_bar <", value, "isHasBar");
            return (Criteria) this;
        }

        public Criteria andIsHasBarLessThanOrEqualTo(Integer value) {
            addCriterion("is_has_bar <=", value, "isHasBar");
            return (Criteria) this;
        }

        public Criteria andIsHasBarIn(List<Integer> values) {
            addCriterion("is_has_bar in", values, "isHasBar");
            return (Criteria) this;
        }

        public Criteria andIsHasBarNotIn(List<Integer> values) {
            addCriterion("is_has_bar not in", values, "isHasBar");
            return (Criteria) this;
        }

        public Criteria andIsHasBarBetween(Integer value1, Integer value2) {
            addCriterion("is_has_bar between", value1, value2, "isHasBar");
            return (Criteria) this;
        }

        public Criteria andIsHasBarNotBetween(Integer value1, Integer value2) {
            addCriterion("is_has_bar not between", value1, value2, "isHasBar");
            return (Criteria) this;
        }

        public Criteria andIsCanBarbecueIsNull() {
            addCriterion("is_can_barbecue is null");
            return (Criteria) this;
        }

        public Criteria andIsCanBarbecueIsNotNull() {
            addCriterion("is_can_barbecue is not null");
            return (Criteria) this;
        }

        public Criteria andIsCanBarbecueEqualTo(Integer value) {
            addCriterion("is_can_barbecue =", value, "isCanBarbecue");
            return (Criteria) this;
        }

        public Criteria andIsCanBarbecueNotEqualTo(Integer value) {
            addCriterion("is_can_barbecue <>", value, "isCanBarbecue");
            return (Criteria) this;
        }

        public Criteria andIsCanBarbecueGreaterThan(Integer value) {
            addCriterion("is_can_barbecue >", value, "isCanBarbecue");
            return (Criteria) this;
        }

        public Criteria andIsCanBarbecueGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_can_barbecue >=", value, "isCanBarbecue");
            return (Criteria) this;
        }

        public Criteria andIsCanBarbecueLessThan(Integer value) {
            addCriterion("is_can_barbecue <", value, "isCanBarbecue");
            return (Criteria) this;
        }

        public Criteria andIsCanBarbecueLessThanOrEqualTo(Integer value) {
            addCriterion("is_can_barbecue <=", value, "isCanBarbecue");
            return (Criteria) this;
        }

        public Criteria andIsCanBarbecueIn(List<Integer> values) {
            addCriterion("is_can_barbecue in", values, "isCanBarbecue");
            return (Criteria) this;
        }

        public Criteria andIsCanBarbecueNotIn(List<Integer> values) {
            addCriterion("is_can_barbecue not in", values, "isCanBarbecue");
            return (Criteria) this;
        }

        public Criteria andIsCanBarbecueBetween(Integer value1, Integer value2) {
            addCriterion("is_can_barbecue between", value1, value2, "isCanBarbecue");
            return (Criteria) this;
        }

        public Criteria andIsCanBarbecueNotBetween(Integer value1, Integer value2) {
            addCriterion("is_can_barbecue not between", value1, value2, "isCanBarbecue");
            return (Criteria) this;
        }

        public Criteria andIsCanSkiIsNull() {
            addCriterion("is_can_ski is null");
            return (Criteria) this;
        }

        public Criteria andIsCanSkiIsNotNull() {
            addCriterion("is_can_ski is not null");
            return (Criteria) this;
        }

        public Criteria andIsCanSkiEqualTo(Integer value) {
            addCriterion("is_can_ski =", value, "isCanSki");
            return (Criteria) this;
        }

        public Criteria andIsCanSkiNotEqualTo(Integer value) {
            addCriterion("is_can_ski <>", value, "isCanSki");
            return (Criteria) this;
        }

        public Criteria andIsCanSkiGreaterThan(Integer value) {
            addCriterion("is_can_ski >", value, "isCanSki");
            return (Criteria) this;
        }

        public Criteria andIsCanSkiGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_can_ski >=", value, "isCanSki");
            return (Criteria) this;
        }

        public Criteria andIsCanSkiLessThan(Integer value) {
            addCriterion("is_can_ski <", value, "isCanSki");
            return (Criteria) this;
        }

        public Criteria andIsCanSkiLessThanOrEqualTo(Integer value) {
            addCriterion("is_can_ski <=", value, "isCanSki");
            return (Criteria) this;
        }

        public Criteria andIsCanSkiIn(List<Integer> values) {
            addCriterion("is_can_ski in", values, "isCanSki");
            return (Criteria) this;
        }

        public Criteria andIsCanSkiNotIn(List<Integer> values) {
            addCriterion("is_can_ski not in", values, "isCanSki");
            return (Criteria) this;
        }

        public Criteria andIsCanSkiBetween(Integer value1, Integer value2) {
            addCriterion("is_can_ski between", value1, value2, "isCanSki");
            return (Criteria) this;
        }

        public Criteria andIsCanSkiNotBetween(Integer value1, Integer value2) {
            addCriterion("is_can_ski not between", value1, value2, "isCanSki");
            return (Criteria) this;
        }

        public Criteria andIsHasPlaygroundIsNull() {
            addCriterion("is_has_playground is null");
            return (Criteria) this;
        }

        public Criteria andIsHasPlaygroundIsNotNull() {
            addCriterion("is_has_playground is not null");
            return (Criteria) this;
        }

        public Criteria andIsHasPlaygroundEqualTo(Integer value) {
            addCriterion("is_has_playground =", value, "isHasPlayground");
            return (Criteria) this;
        }

        public Criteria andIsHasPlaygroundNotEqualTo(Integer value) {
            addCriterion("is_has_playground <>", value, "isHasPlayground");
            return (Criteria) this;
        }

        public Criteria andIsHasPlaygroundGreaterThan(Integer value) {
            addCriterion("is_has_playground >", value, "isHasPlayground");
            return (Criteria) this;
        }

        public Criteria andIsHasPlaygroundGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_has_playground >=", value, "isHasPlayground");
            return (Criteria) this;
        }

        public Criteria andIsHasPlaygroundLessThan(Integer value) {
            addCriterion("is_has_playground <", value, "isHasPlayground");
            return (Criteria) this;
        }

        public Criteria andIsHasPlaygroundLessThanOrEqualTo(Integer value) {
            addCriterion("is_has_playground <=", value, "isHasPlayground");
            return (Criteria) this;
        }

        public Criteria andIsHasPlaygroundIn(List<Integer> values) {
            addCriterion("is_has_playground in", values, "isHasPlayground");
            return (Criteria) this;
        }

        public Criteria andIsHasPlaygroundNotIn(List<Integer> values) {
            addCriterion("is_has_playground not in", values, "isHasPlayground");
            return (Criteria) this;
        }

        public Criteria andIsHasPlaygroundBetween(Integer value1, Integer value2) {
            addCriterion("is_has_playground between", value1, value2, "isHasPlayground");
            return (Criteria) this;
        }

        public Criteria andIsHasPlaygroundNotBetween(Integer value1, Integer value2) {
            addCriterion("is_has_playground not between", value1, value2, "isHasPlayground");
            return (Criteria) this;
        }

        public Criteria andIsCanFootpathIsNull() {
            addCriterion("is_can_footpath is null");
            return (Criteria) this;
        }

        public Criteria andIsCanFootpathIsNotNull() {
            addCriterion("is_can_footpath is not null");
            return (Criteria) this;
        }

        public Criteria andIsCanFootpathEqualTo(Integer value) {
            addCriterion("is_can_footpath =", value, "isCanFootpath");
            return (Criteria) this;
        }

        public Criteria andIsCanFootpathNotEqualTo(Integer value) {
            addCriterion("is_can_footpath <>", value, "isCanFootpath");
            return (Criteria) this;
        }

        public Criteria andIsCanFootpathGreaterThan(Integer value) {
            addCriterion("is_can_footpath >", value, "isCanFootpath");
            return (Criteria) this;
        }

        public Criteria andIsCanFootpathGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_can_footpath >=", value, "isCanFootpath");
            return (Criteria) this;
        }

        public Criteria andIsCanFootpathLessThan(Integer value) {
            addCriterion("is_can_footpath <", value, "isCanFootpath");
            return (Criteria) this;
        }

        public Criteria andIsCanFootpathLessThanOrEqualTo(Integer value) {
            addCriterion("is_can_footpath <=", value, "isCanFootpath");
            return (Criteria) this;
        }

        public Criteria andIsCanFootpathIn(List<Integer> values) {
            addCriterion("is_can_footpath in", values, "isCanFootpath");
            return (Criteria) this;
        }

        public Criteria andIsCanFootpathNotIn(List<Integer> values) {
            addCriterion("is_can_footpath not in", values, "isCanFootpath");
            return (Criteria) this;
        }

        public Criteria andIsCanFootpathBetween(Integer value1, Integer value2) {
            addCriterion("is_can_footpath between", value1, value2, "isCanFootpath");
            return (Criteria) this;
        }

        public Criteria andIsCanFootpathNotBetween(Integer value1, Integer value2) {
            addCriterion("is_can_footpath not between", value1, value2, "isCanFootpath");
            return (Criteria) this;
        }

        public Criteria andIsCanCycleIsNull() {
            addCriterion("is_can_cycle is null");
            return (Criteria) this;
        }

        public Criteria andIsCanCycleIsNotNull() {
            addCriterion("is_can_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andIsCanCycleEqualTo(Integer value) {
            addCriterion("is_can_cycle =", value, "isCanCycle");
            return (Criteria) this;
        }

        public Criteria andIsCanCycleNotEqualTo(Integer value) {
            addCriterion("is_can_cycle <>", value, "isCanCycle");
            return (Criteria) this;
        }

        public Criteria andIsCanCycleGreaterThan(Integer value) {
            addCriterion("is_can_cycle >", value, "isCanCycle");
            return (Criteria) this;
        }

        public Criteria andIsCanCycleGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_can_cycle >=", value, "isCanCycle");
            return (Criteria) this;
        }

        public Criteria andIsCanCycleLessThan(Integer value) {
            addCriterion("is_can_cycle <", value, "isCanCycle");
            return (Criteria) this;
        }

        public Criteria andIsCanCycleLessThanOrEqualTo(Integer value) {
            addCriterion("is_can_cycle <=", value, "isCanCycle");
            return (Criteria) this;
        }

        public Criteria andIsCanCycleIn(List<Integer> values) {
            addCriterion("is_can_cycle in", values, "isCanCycle");
            return (Criteria) this;
        }

        public Criteria andIsCanCycleNotIn(List<Integer> values) {
            addCriterion("is_can_cycle not in", values, "isCanCycle");
            return (Criteria) this;
        }

        public Criteria andIsCanCycleBetween(Integer value1, Integer value2) {
            addCriterion("is_can_cycle between", value1, value2, "isCanCycle");
            return (Criteria) this;
        }

        public Criteria andIsCanCycleNotBetween(Integer value1, Integer value2) {
            addCriterion("is_can_cycle not between", value1, value2, "isCanCycle");
            return (Criteria) this;
        }

        public Criteria andIsCanFishingIsNull() {
            addCriterion("is_can_fishing is null");
            return (Criteria) this;
        }

        public Criteria andIsCanFishingIsNotNull() {
            addCriterion("is_can_fishing is not null");
            return (Criteria) this;
        }

        public Criteria andIsCanFishingEqualTo(Integer value) {
            addCriterion("is_can_fishing =", value, "isCanFishing");
            return (Criteria) this;
        }

        public Criteria andIsCanFishingNotEqualTo(Integer value) {
            addCriterion("is_can_fishing <>", value, "isCanFishing");
            return (Criteria) this;
        }

        public Criteria andIsCanFishingGreaterThan(Integer value) {
            addCriterion("is_can_fishing >", value, "isCanFishing");
            return (Criteria) this;
        }

        public Criteria andIsCanFishingGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_can_fishing >=", value, "isCanFishing");
            return (Criteria) this;
        }

        public Criteria andIsCanFishingLessThan(Integer value) {
            addCriterion("is_can_fishing <", value, "isCanFishing");
            return (Criteria) this;
        }

        public Criteria andIsCanFishingLessThanOrEqualTo(Integer value) {
            addCriterion("is_can_fishing <=", value, "isCanFishing");
            return (Criteria) this;
        }

        public Criteria andIsCanFishingIn(List<Integer> values) {
            addCriterion("is_can_fishing in", values, "isCanFishing");
            return (Criteria) this;
        }

        public Criteria andIsCanFishingNotIn(List<Integer> values) {
            addCriterion("is_can_fishing not in", values, "isCanFishing");
            return (Criteria) this;
        }

        public Criteria andIsCanFishingBetween(Integer value1, Integer value2) {
            addCriterion("is_can_fishing between", value1, value2, "isCanFishing");
            return (Criteria) this;
        }

        public Criteria andIsCanFishingNotBetween(Integer value1, Integer value2) {
            addCriterion("is_can_fishing not between", value1, value2, "isCanFishing");
            return (Criteria) this;
        }

        public Criteria andIsCanRideIsNull() {
            addCriterion("is_can_ride is null");
            return (Criteria) this;
        }

        public Criteria andIsCanRideIsNotNull() {
            addCriterion("is_can_ride is not null");
            return (Criteria) this;
        }

        public Criteria andIsCanRideEqualTo(Integer value) {
            addCriterion("is_can_ride =", value, "isCanRide");
            return (Criteria) this;
        }

        public Criteria andIsCanRideNotEqualTo(Integer value) {
            addCriterion("is_can_ride <>", value, "isCanRide");
            return (Criteria) this;
        }

        public Criteria andIsCanRideGreaterThan(Integer value) {
            addCriterion("is_can_ride >", value, "isCanRide");
            return (Criteria) this;
        }

        public Criteria andIsCanRideGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_can_ride >=", value, "isCanRide");
            return (Criteria) this;
        }

        public Criteria andIsCanRideLessThan(Integer value) {
            addCriterion("is_can_ride <", value, "isCanRide");
            return (Criteria) this;
        }

        public Criteria andIsCanRideLessThanOrEqualTo(Integer value) {
            addCriterion("is_can_ride <=", value, "isCanRide");
            return (Criteria) this;
        }

        public Criteria andIsCanRideIn(List<Integer> values) {
            addCriterion("is_can_ride in", values, "isCanRide");
            return (Criteria) this;
        }

        public Criteria andIsCanRideNotIn(List<Integer> values) {
            addCriterion("is_can_ride not in", values, "isCanRide");
            return (Criteria) this;
        }

        public Criteria andIsCanRideBetween(Integer value1, Integer value2) {
            addCriterion("is_can_ride between", value1, value2, "isCanRide");
            return (Criteria) this;
        }

        public Criteria andIsCanRideNotBetween(Integer value1, Integer value2) {
            addCriterion("is_can_ride not between", value1, value2, "isCanRide");
            return (Criteria) this;
        }

        public Criteria andIsHasWifiIsNull() {
            addCriterion("is_has_wifi is null");
            return (Criteria) this;
        }

        public Criteria andIsHasWifiIsNotNull() {
            addCriterion("is_has_wifi is not null");
            return (Criteria) this;
        }

        public Criteria andIsHasWifiEqualTo(Integer value) {
            addCriterion("is_has_wifi =", value, "isHasWifi");
            return (Criteria) this;
        }

        public Criteria andIsHasWifiNotEqualTo(Integer value) {
            addCriterion("is_has_wifi <>", value, "isHasWifi");
            return (Criteria) this;
        }

        public Criteria andIsHasWifiGreaterThan(Integer value) {
            addCriterion("is_has_wifi >", value, "isHasWifi");
            return (Criteria) this;
        }

        public Criteria andIsHasWifiGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_has_wifi >=", value, "isHasWifi");
            return (Criteria) this;
        }

        public Criteria andIsHasWifiLessThan(Integer value) {
            addCriterion("is_has_wifi <", value, "isHasWifi");
            return (Criteria) this;
        }

        public Criteria andIsHasWifiLessThanOrEqualTo(Integer value) {
            addCriterion("is_has_wifi <=", value, "isHasWifi");
            return (Criteria) this;
        }

        public Criteria andIsHasWifiIn(List<Integer> values) {
            addCriterion("is_has_wifi in", values, "isHasWifi");
            return (Criteria) this;
        }

        public Criteria andIsHasWifiNotIn(List<Integer> values) {
            addCriterion("is_has_wifi not in", values, "isHasWifi");
            return (Criteria) this;
        }

        public Criteria andIsHasWifiBetween(Integer value1, Integer value2) {
            addCriterion("is_has_wifi between", value1, value2, "isHasWifi");
            return (Criteria) this;
        }

        public Criteria andIsHasWifiNotBetween(Integer value1, Integer value2) {
            addCriterion("is_has_wifi not between", value1, value2, "isHasWifi");
            return (Criteria) this;
        }

        public Criteria andIsHasAmusementIsNull() {
            addCriterion("is_has_amusement is null");
            return (Criteria) this;
        }

        public Criteria andIsHasAmusementIsNotNull() {
            addCriterion("is_has_amusement is not null");
            return (Criteria) this;
        }

        public Criteria andIsHasAmusementEqualTo(Integer value) {
            addCriterion("is_has_amusement =", value, "isHasAmusement");
            return (Criteria) this;
        }

        public Criteria andIsHasAmusementNotEqualTo(Integer value) {
            addCriterion("is_has_amusement <>", value, "isHasAmusement");
            return (Criteria) this;
        }

        public Criteria andIsHasAmusementGreaterThan(Integer value) {
            addCriterion("is_has_amusement >", value, "isHasAmusement");
            return (Criteria) this;
        }

        public Criteria andIsHasAmusementGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_has_amusement >=", value, "isHasAmusement");
            return (Criteria) this;
        }

        public Criteria andIsHasAmusementLessThan(Integer value) {
            addCriterion("is_has_amusement <", value, "isHasAmusement");
            return (Criteria) this;
        }

        public Criteria andIsHasAmusementLessThanOrEqualTo(Integer value) {
            addCriterion("is_has_amusement <=", value, "isHasAmusement");
            return (Criteria) this;
        }

        public Criteria andIsHasAmusementIn(List<Integer> values) {
            addCriterion("is_has_amusement in", values, "isHasAmusement");
            return (Criteria) this;
        }

        public Criteria andIsHasAmusementNotIn(List<Integer> values) {
            addCriterion("is_has_amusement not in", values, "isHasAmusement");
            return (Criteria) this;
        }

        public Criteria andIsHasAmusementBetween(Integer value1, Integer value2) {
            addCriterion("is_has_amusement between", value1, value2, "isHasAmusement");
            return (Criteria) this;
        }

        public Criteria andIsHasAmusementNotBetween(Integer value1, Integer value2) {
            addCriterion("is_has_amusement not between", value1, value2, "isHasAmusement");
            return (Criteria) this;
        }

        public Criteria andIsCanSwimmingIsNull() {
            addCriterion("is_can_swimming is null");
            return (Criteria) this;
        }

        public Criteria andIsCanSwimmingIsNotNull() {
            addCriterion("is_can_swimming is not null");
            return (Criteria) this;
        }

        public Criteria andIsCanSwimmingEqualTo(Integer value) {
            addCriterion("is_can_swimming =", value, "isCanSwimming");
            return (Criteria) this;
        }

        public Criteria andIsCanSwimmingNotEqualTo(Integer value) {
            addCriterion("is_can_swimming <>", value, "isCanSwimming");
            return (Criteria) this;
        }

        public Criteria andIsCanSwimmingGreaterThan(Integer value) {
            addCriterion("is_can_swimming >", value, "isCanSwimming");
            return (Criteria) this;
        }

        public Criteria andIsCanSwimmingGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_can_swimming >=", value, "isCanSwimming");
            return (Criteria) this;
        }

        public Criteria andIsCanSwimmingLessThan(Integer value) {
            addCriterion("is_can_swimming <", value, "isCanSwimming");
            return (Criteria) this;
        }

        public Criteria andIsCanSwimmingLessThanOrEqualTo(Integer value) {
            addCriterion("is_can_swimming <=", value, "isCanSwimming");
            return (Criteria) this;
        }

        public Criteria andIsCanSwimmingIn(List<Integer> values) {
            addCriterion("is_can_swimming in", values, "isCanSwimming");
            return (Criteria) this;
        }

        public Criteria andIsCanSwimmingNotIn(List<Integer> values) {
            addCriterion("is_can_swimming not in", values, "isCanSwimming");
            return (Criteria) this;
        }

        public Criteria andIsCanSwimmingBetween(Integer value1, Integer value2) {
            addCriterion("is_can_swimming between", value1, value2, "isCanSwimming");
            return (Criteria) this;
        }

        public Criteria andIsCanSwimmingNotBetween(Integer value1, Integer value2) {
            addCriterion("is_can_swimming not between", value1, value2, "isCanSwimming");
            return (Criteria) this;
        }

        public Criteria andIsHasWaterRecreationIsNull() {
            addCriterion("is_has_water_recreation is null");
            return (Criteria) this;
        }

        public Criteria andIsHasWaterRecreationIsNotNull() {
            addCriterion("is_has_water_recreation is not null");
            return (Criteria) this;
        }

        public Criteria andIsHasWaterRecreationEqualTo(Integer value) {
            addCriterion("is_has_water_recreation =", value, "isHasWaterRecreation");
            return (Criteria) this;
        }

        public Criteria andIsHasWaterRecreationNotEqualTo(Integer value) {
            addCriterion("is_has_water_recreation <>", value, "isHasWaterRecreation");
            return (Criteria) this;
        }

        public Criteria andIsHasWaterRecreationGreaterThan(Integer value) {
            addCriterion("is_has_water_recreation >", value, "isHasWaterRecreation");
            return (Criteria) this;
        }

        public Criteria andIsHasWaterRecreationGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_has_water_recreation >=", value, "isHasWaterRecreation");
            return (Criteria) this;
        }

        public Criteria andIsHasWaterRecreationLessThan(Integer value) {
            addCriterion("is_has_water_recreation <", value, "isHasWaterRecreation");
            return (Criteria) this;
        }

        public Criteria andIsHasWaterRecreationLessThanOrEqualTo(Integer value) {
            addCriterion("is_has_water_recreation <=", value, "isHasWaterRecreation");
            return (Criteria) this;
        }

        public Criteria andIsHasWaterRecreationIn(List<Integer> values) {
            addCriterion("is_has_water_recreation in", values, "isHasWaterRecreation");
            return (Criteria) this;
        }

        public Criteria andIsHasWaterRecreationNotIn(List<Integer> values) {
            addCriterion("is_has_water_recreation not in", values, "isHasWaterRecreation");
            return (Criteria) this;
        }

        public Criteria andIsHasWaterRecreationBetween(Integer value1, Integer value2) {
            addCriterion("is_has_water_recreation between", value1, value2, "isHasWaterRecreation");
            return (Criteria) this;
        }

        public Criteria andIsHasWaterRecreationNotBetween(Integer value1, Integer value2) {
            addCriterion("is_has_water_recreation not between", value1, value2, "isHasWaterRecreation");
            return (Criteria) this;
        }

        public Criteria andIsHasThermaIsNull() {
            addCriterion("is_has_therma is null");
            return (Criteria) this;
        }

        public Criteria andIsHasThermaIsNotNull() {
            addCriterion("is_has_therma is not null");
            return (Criteria) this;
        }

        public Criteria andIsHasThermaEqualTo(Integer value) {
            addCriterion("is_has_therma =", value, "isHasTherma");
            return (Criteria) this;
        }

        public Criteria andIsHasThermaNotEqualTo(Integer value) {
            addCriterion("is_has_therma <>", value, "isHasTherma");
            return (Criteria) this;
        }

        public Criteria andIsHasThermaGreaterThan(Integer value) {
            addCriterion("is_has_therma >", value, "isHasTherma");
            return (Criteria) this;
        }

        public Criteria andIsHasThermaGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_has_therma >=", value, "isHasTherma");
            return (Criteria) this;
        }

        public Criteria andIsHasThermaLessThan(Integer value) {
            addCriterion("is_has_therma <", value, "isHasTherma");
            return (Criteria) this;
        }

        public Criteria andIsHasThermaLessThanOrEqualTo(Integer value) {
            addCriterion("is_has_therma <=", value, "isHasTherma");
            return (Criteria) this;
        }

        public Criteria andIsHasThermaIn(List<Integer> values) {
            addCriterion("is_has_therma in", values, "isHasTherma");
            return (Criteria) this;
        }

        public Criteria andIsHasThermaNotIn(List<Integer> values) {
            addCriterion("is_has_therma not in", values, "isHasTherma");
            return (Criteria) this;
        }

        public Criteria andIsHasThermaBetween(Integer value1, Integer value2) {
            addCriterion("is_has_therma between", value1, value2, "isHasTherma");
            return (Criteria) this;
        }

        public Criteria andIsHasThermaNotBetween(Integer value1, Integer value2) {
            addCriterion("is_has_therma not between", value1, value2, "isHasTherma");
            return (Criteria) this;
        }

        public Criteria andIsCanMeetingIsNull() {
            addCriterion("is_can_meeting is null");
            return (Criteria) this;
        }

        public Criteria andIsCanMeetingIsNotNull() {
            addCriterion("is_can_meeting is not null");
            return (Criteria) this;
        }

        public Criteria andIsCanMeetingEqualTo(Integer value) {
            addCriterion("is_can_meeting =", value, "isCanMeeting");
            return (Criteria) this;
        }

        public Criteria andIsCanMeetingNotEqualTo(Integer value) {
            addCriterion("is_can_meeting <>", value, "isCanMeeting");
            return (Criteria) this;
        }

        public Criteria andIsCanMeetingGreaterThan(Integer value) {
            addCriterion("is_can_meeting >", value, "isCanMeeting");
            return (Criteria) this;
        }

        public Criteria andIsCanMeetingGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_can_meeting >=", value, "isCanMeeting");
            return (Criteria) this;
        }

        public Criteria andIsCanMeetingLessThan(Integer value) {
            addCriterion("is_can_meeting <", value, "isCanMeeting");
            return (Criteria) this;
        }

        public Criteria andIsCanMeetingLessThanOrEqualTo(Integer value) {
            addCriterion("is_can_meeting <=", value, "isCanMeeting");
            return (Criteria) this;
        }

        public Criteria andIsCanMeetingIn(List<Integer> values) {
            addCriterion("is_can_meeting in", values, "isCanMeeting");
            return (Criteria) this;
        }

        public Criteria andIsCanMeetingNotIn(List<Integer> values) {
            addCriterion("is_can_meeting not in", values, "isCanMeeting");
            return (Criteria) this;
        }

        public Criteria andIsCanMeetingBetween(Integer value1, Integer value2) {
            addCriterion("is_can_meeting between", value1, value2, "isCanMeeting");
            return (Criteria) this;
        }

        public Criteria andIsCanMeetingNotBetween(Integer value1, Integer value2) {
            addCriterion("is_can_meeting not between", value1, value2, "isCanMeeting");
            return (Criteria) this;
        }

        public Criteria andIsCanBoatingIsNull() {
            addCriterion("is_can_boating is null");
            return (Criteria) this;
        }

        public Criteria andIsCanBoatingIsNotNull() {
            addCriterion("is_can_boating is not null");
            return (Criteria) this;
        }

        public Criteria andIsCanBoatingEqualTo(Integer value) {
            addCriterion("is_can_boating =", value, "isCanBoating");
            return (Criteria) this;
        }

        public Criteria andIsCanBoatingNotEqualTo(Integer value) {
            addCriterion("is_can_boating <>", value, "isCanBoating");
            return (Criteria) this;
        }

        public Criteria andIsCanBoatingGreaterThan(Integer value) {
            addCriterion("is_can_boating >", value, "isCanBoating");
            return (Criteria) this;
        }

        public Criteria andIsCanBoatingGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_can_boating >=", value, "isCanBoating");
            return (Criteria) this;
        }

        public Criteria andIsCanBoatingLessThan(Integer value) {
            addCriterion("is_can_boating <", value, "isCanBoating");
            return (Criteria) this;
        }

        public Criteria andIsCanBoatingLessThanOrEqualTo(Integer value) {
            addCriterion("is_can_boating <=", value, "isCanBoating");
            return (Criteria) this;
        }

        public Criteria andIsCanBoatingIn(List<Integer> values) {
            addCriterion("is_can_boating in", values, "isCanBoating");
            return (Criteria) this;
        }

        public Criteria andIsCanBoatingNotIn(List<Integer> values) {
            addCriterion("is_can_boating not in", values, "isCanBoating");
            return (Criteria) this;
        }

        public Criteria andIsCanBoatingBetween(Integer value1, Integer value2) {
            addCriterion("is_can_boating between", value1, value2, "isCanBoating");
            return (Criteria) this;
        }

        public Criteria andIsCanBoatingNotBetween(Integer value1, Integer value2) {
            addCriterion("is_can_boating not between", value1, value2, "isCanBoating");
            return (Criteria) this;
        }

        public Criteria andIsHasStayIsNull() {
            addCriterion("is_has_stay is null");
            return (Criteria) this;
        }

        public Criteria andIsHasStayIsNotNull() {
            addCriterion("is_has_stay is not null");
            return (Criteria) this;
        }

        public Criteria andIsHasStayEqualTo(Integer value) {
            addCriterion("is_has_stay =", value, "isHasStay");
            return (Criteria) this;
        }

        public Criteria andIsHasStayNotEqualTo(Integer value) {
            addCriterion("is_has_stay <>", value, "isHasStay");
            return (Criteria) this;
        }

        public Criteria andIsHasStayGreaterThan(Integer value) {
            addCriterion("is_has_stay >", value, "isHasStay");
            return (Criteria) this;
        }

        public Criteria andIsHasStayGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_has_stay >=", value, "isHasStay");
            return (Criteria) this;
        }

        public Criteria andIsHasStayLessThan(Integer value) {
            addCriterion("is_has_stay <", value, "isHasStay");
            return (Criteria) this;
        }

        public Criteria andIsHasStayLessThanOrEqualTo(Integer value) {
            addCriterion("is_has_stay <=", value, "isHasStay");
            return (Criteria) this;
        }

        public Criteria andIsHasStayIn(List<Integer> values) {
            addCriterion("is_has_stay in", values, "isHasStay");
            return (Criteria) this;
        }

        public Criteria andIsHasStayNotIn(List<Integer> values) {
            addCriterion("is_has_stay not in", values, "isHasStay");
            return (Criteria) this;
        }

        public Criteria andIsHasStayBetween(Integer value1, Integer value2) {
            addCriterion("is_has_stay between", value1, value2, "isHasStay");
            return (Criteria) this;
        }

        public Criteria andIsHasStayNotBetween(Integer value1, Integer value2) {
            addCriterion("is_has_stay not between", value1, value2, "isHasStay");
            return (Criteria) this;
        }

        public Criteria andIsHasHealthcareIsNull() {
            addCriterion("is_has_healthcare is null");
            return (Criteria) this;
        }

        public Criteria andIsHasHealthcareIsNotNull() {
            addCriterion("is_has_healthcare is not null");
            return (Criteria) this;
        }

        public Criteria andIsHasHealthcareEqualTo(Integer value) {
            addCriterion("is_has_healthcare =", value, "isHasHealthcare");
            return (Criteria) this;
        }

        public Criteria andIsHasHealthcareNotEqualTo(Integer value) {
            addCriterion("is_has_healthcare <>", value, "isHasHealthcare");
            return (Criteria) this;
        }

        public Criteria andIsHasHealthcareGreaterThan(Integer value) {
            addCriterion("is_has_healthcare >", value, "isHasHealthcare");
            return (Criteria) this;
        }

        public Criteria andIsHasHealthcareGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_has_healthcare >=", value, "isHasHealthcare");
            return (Criteria) this;
        }

        public Criteria andIsHasHealthcareLessThan(Integer value) {
            addCriterion("is_has_healthcare <", value, "isHasHealthcare");
            return (Criteria) this;
        }

        public Criteria andIsHasHealthcareLessThanOrEqualTo(Integer value) {
            addCriterion("is_has_healthcare <=", value, "isHasHealthcare");
            return (Criteria) this;
        }

        public Criteria andIsHasHealthcareIn(List<Integer> values) {
            addCriterion("is_has_healthcare in", values, "isHasHealthcare");
            return (Criteria) this;
        }

        public Criteria andIsHasHealthcareNotIn(List<Integer> values) {
            addCriterion("is_has_healthcare not in", values, "isHasHealthcare");
            return (Criteria) this;
        }

        public Criteria andIsHasHealthcareBetween(Integer value1, Integer value2) {
            addCriterion("is_has_healthcare between", value1, value2, "isHasHealthcare");
            return (Criteria) this;
        }

        public Criteria andIsHasHealthcareNotBetween(Integer value1, Integer value2) {
            addCriterion("is_has_healthcare not between", value1, value2, "isHasHealthcare");
            return (Criteria) this;
        }

        public Criteria andIsHasOrchardIsNull() {
            addCriterion("is_has_orchard is null");
            return (Criteria) this;
        }

        public Criteria andIsHasOrchardIsNotNull() {
            addCriterion("is_has_orchard is not null");
            return (Criteria) this;
        }

        public Criteria andIsHasOrchardEqualTo(Integer value) {
            addCriterion("is_has_orchard =", value, "isHasOrchard");
            return (Criteria) this;
        }

        public Criteria andIsHasOrchardNotEqualTo(Integer value) {
            addCriterion("is_has_orchard <>", value, "isHasOrchard");
            return (Criteria) this;
        }

        public Criteria andIsHasOrchardGreaterThan(Integer value) {
            addCriterion("is_has_orchard >", value, "isHasOrchard");
            return (Criteria) this;
        }

        public Criteria andIsHasOrchardGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_has_orchard >=", value, "isHasOrchard");
            return (Criteria) this;
        }

        public Criteria andIsHasOrchardLessThan(Integer value) {
            addCriterion("is_has_orchard <", value, "isHasOrchard");
            return (Criteria) this;
        }

        public Criteria andIsHasOrchardLessThanOrEqualTo(Integer value) {
            addCriterion("is_has_orchard <=", value, "isHasOrchard");
            return (Criteria) this;
        }

        public Criteria andIsHasOrchardIn(List<Integer> values) {
            addCriterion("is_has_orchard in", values, "isHasOrchard");
            return (Criteria) this;
        }

        public Criteria andIsHasOrchardNotIn(List<Integer> values) {
            addCriterion("is_has_orchard not in", values, "isHasOrchard");
            return (Criteria) this;
        }

        public Criteria andIsHasOrchardBetween(Integer value1, Integer value2) {
            addCriterion("is_has_orchard between", value1, value2, "isHasOrchard");
            return (Criteria) this;
        }

        public Criteria andIsHasOrchardNotBetween(Integer value1, Integer value2) {
            addCriterion("is_has_orchard not between", value1, value2, "isHasOrchard");
            return (Criteria) this;
        }

        public Criteria andRvParkingNumIsNull() {
            addCriterion("rv_parking_num is null");
            return (Criteria) this;
        }

        public Criteria andRvParkingNumIsNotNull() {
            addCriterion("rv_parking_num is not null");
            return (Criteria) this;
        }

        public Criteria andRvParkingNumEqualTo(Integer value) {
            addCriterion("rv_parking_num =", value, "rvParkingNum");
            return (Criteria) this;
        }

        public Criteria andRvParkingNumNotEqualTo(Integer value) {
            addCriterion("rv_parking_num <>", value, "rvParkingNum");
            return (Criteria) this;
        }

        public Criteria andRvParkingNumGreaterThan(Integer value) {
            addCriterion("rv_parking_num >", value, "rvParkingNum");
            return (Criteria) this;
        }

        public Criteria andRvParkingNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("rv_parking_num >=", value, "rvParkingNum");
            return (Criteria) this;
        }

        public Criteria andRvParkingNumLessThan(Integer value) {
            addCriterion("rv_parking_num <", value, "rvParkingNum");
            return (Criteria) this;
        }

        public Criteria andRvParkingNumLessThanOrEqualTo(Integer value) {
            addCriterion("rv_parking_num <=", value, "rvParkingNum");
            return (Criteria) this;
        }

        public Criteria andRvParkingNumIn(List<Integer> values) {
            addCriterion("rv_parking_num in", values, "rvParkingNum");
            return (Criteria) this;
        }

        public Criteria andRvParkingNumNotIn(List<Integer> values) {
            addCriterion("rv_parking_num not in", values, "rvParkingNum");
            return (Criteria) this;
        }

        public Criteria andRvParkingNumBetween(Integer value1, Integer value2) {
            addCriterion("rv_parking_num between", value1, value2, "rvParkingNum");
            return (Criteria) this;
        }

        public Criteria andRvParkingNumNotBetween(Integer value1, Integer value2) {
            addCriterion("rv_parking_num not between", value1, value2, "rvParkingNum");
            return (Criteria) this;
        }

        public Criteria andRvParkingPriceIsNull() {
            addCriterion("rv_parking_price is null");
            return (Criteria) this;
        }

        public Criteria andRvParkingPriceIsNotNull() {
            addCriterion("rv_parking_price is not null");
            return (Criteria) this;
        }

        public Criteria andRvParkingPriceEqualTo(Integer value) {
            addCriterion("rv_parking_price =", value, "rvParkingPrice");
            return (Criteria) this;
        }

        public Criteria andRvParkingPriceNotEqualTo(Integer value) {
            addCriterion("rv_parking_price <>", value, "rvParkingPrice");
            return (Criteria) this;
        }

        public Criteria andRvParkingPriceGreaterThan(Integer value) {
            addCriterion("rv_parking_price >", value, "rvParkingPrice");
            return (Criteria) this;
        }

        public Criteria andRvParkingPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("rv_parking_price >=", value, "rvParkingPrice");
            return (Criteria) this;
        }

        public Criteria andRvParkingPriceLessThan(Integer value) {
            addCriterion("rv_parking_price <", value, "rvParkingPrice");
            return (Criteria) this;
        }

        public Criteria andRvParkingPriceLessThanOrEqualTo(Integer value) {
            addCriterion("rv_parking_price <=", value, "rvParkingPrice");
            return (Criteria) this;
        }

        public Criteria andRvParkingPriceIn(List<Integer> values) {
            addCriterion("rv_parking_price in", values, "rvParkingPrice");
            return (Criteria) this;
        }

        public Criteria andRvParkingPriceNotIn(List<Integer> values) {
            addCriterion("rv_parking_price not in", values, "rvParkingPrice");
            return (Criteria) this;
        }

        public Criteria andRvParkingPriceBetween(Integer value1, Integer value2) {
            addCriterion("rv_parking_price between", value1, value2, "rvParkingPrice");
            return (Criteria) this;
        }

        public Criteria andRvParkingPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("rv_parking_price not between", value1, value2, "rvParkingPrice");
            return (Criteria) this;
        }

        public Criteria andTrailerParkingNumIsNull() {
            addCriterion("trailer_parking_num is null");
            return (Criteria) this;
        }

        public Criteria andTrailerParkingNumIsNotNull() {
            addCriterion("trailer_parking_num is not null");
            return (Criteria) this;
        }

        public Criteria andTrailerParkingNumEqualTo(Integer value) {
            addCriterion("trailer_parking_num =", value, "trailerParkingNum");
            return (Criteria) this;
        }

        public Criteria andTrailerParkingNumNotEqualTo(Integer value) {
            addCriterion("trailer_parking_num <>", value, "trailerParkingNum");
            return (Criteria) this;
        }

        public Criteria andTrailerParkingNumGreaterThan(Integer value) {
            addCriterion("trailer_parking_num >", value, "trailerParkingNum");
            return (Criteria) this;
        }

        public Criteria andTrailerParkingNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("trailer_parking_num >=", value, "trailerParkingNum");
            return (Criteria) this;
        }

        public Criteria andTrailerParkingNumLessThan(Integer value) {
            addCriterion("trailer_parking_num <", value, "trailerParkingNum");
            return (Criteria) this;
        }

        public Criteria andTrailerParkingNumLessThanOrEqualTo(Integer value) {
            addCriterion("trailer_parking_num <=", value, "trailerParkingNum");
            return (Criteria) this;
        }

        public Criteria andTrailerParkingNumIn(List<Integer> values) {
            addCriterion("trailer_parking_num in", values, "trailerParkingNum");
            return (Criteria) this;
        }

        public Criteria andTrailerParkingNumNotIn(List<Integer> values) {
            addCriterion("trailer_parking_num not in", values, "trailerParkingNum");
            return (Criteria) this;
        }

        public Criteria andTrailerParkingNumBetween(Integer value1, Integer value2) {
            addCriterion("trailer_parking_num between", value1, value2, "trailerParkingNum");
            return (Criteria) this;
        }

        public Criteria andTrailerParkingNumNotBetween(Integer value1, Integer value2) {
            addCriterion("trailer_parking_num not between", value1, value2, "trailerParkingNum");
            return (Criteria) this;
        }

        public Criteria andTrailerParkingPriceIsNull() {
            addCriterion("trailer_parking_price is null");
            return (Criteria) this;
        }

        public Criteria andTrailerParkingPriceIsNotNull() {
            addCriterion("trailer_parking_price is not null");
            return (Criteria) this;
        }

        public Criteria andTrailerParkingPriceEqualTo(Integer value) {
            addCriterion("trailer_parking_price =", value, "trailerParkingPrice");
            return (Criteria) this;
        }

        public Criteria andTrailerParkingPriceNotEqualTo(Integer value) {
            addCriterion("trailer_parking_price <>", value, "trailerParkingPrice");
            return (Criteria) this;
        }

        public Criteria andTrailerParkingPriceGreaterThan(Integer value) {
            addCriterion("trailer_parking_price >", value, "trailerParkingPrice");
            return (Criteria) this;
        }

        public Criteria andTrailerParkingPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("trailer_parking_price >=", value, "trailerParkingPrice");
            return (Criteria) this;
        }

        public Criteria andTrailerParkingPriceLessThan(Integer value) {
            addCriterion("trailer_parking_price <", value, "trailerParkingPrice");
            return (Criteria) this;
        }

        public Criteria andTrailerParkingPriceLessThanOrEqualTo(Integer value) {
            addCriterion("trailer_parking_price <=", value, "trailerParkingPrice");
            return (Criteria) this;
        }

        public Criteria andTrailerParkingPriceIn(List<Integer> values) {
            addCriterion("trailer_parking_price in", values, "trailerParkingPrice");
            return (Criteria) this;
        }

        public Criteria andTrailerParkingPriceNotIn(List<Integer> values) {
            addCriterion("trailer_parking_price not in", values, "trailerParkingPrice");
            return (Criteria) this;
        }

        public Criteria andTrailerParkingPriceBetween(Integer value1, Integer value2) {
            addCriterion("trailer_parking_price between", value1, value2, "trailerParkingPrice");
            return (Criteria) this;
        }

        public Criteria andTrailerParkingPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("trailer_parking_price not between", value1, value2, "trailerParkingPrice");
            return (Criteria) this;
        }

        public Criteria andTentNumIsNull() {
            addCriterion("tent_num is null");
            return (Criteria) this;
        }

        public Criteria andTentNumIsNotNull() {
            addCriterion("tent_num is not null");
            return (Criteria) this;
        }

        public Criteria andTentNumEqualTo(Integer value) {
            addCriterion("tent_num =", value, "tentNum");
            return (Criteria) this;
        }

        public Criteria andTentNumNotEqualTo(Integer value) {
            addCriterion("tent_num <>", value, "tentNum");
            return (Criteria) this;
        }

        public Criteria andTentNumGreaterThan(Integer value) {
            addCriterion("tent_num >", value, "tentNum");
            return (Criteria) this;
        }

        public Criteria andTentNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("tent_num >=", value, "tentNum");
            return (Criteria) this;
        }

        public Criteria andTentNumLessThan(Integer value) {
            addCriterion("tent_num <", value, "tentNum");
            return (Criteria) this;
        }

        public Criteria andTentNumLessThanOrEqualTo(Integer value) {
            addCriterion("tent_num <=", value, "tentNum");
            return (Criteria) this;
        }

        public Criteria andTentNumIn(List<Integer> values) {
            addCriterion("tent_num in", values, "tentNum");
            return (Criteria) this;
        }

        public Criteria andTentNumNotIn(List<Integer> values) {
            addCriterion("tent_num not in", values, "tentNum");
            return (Criteria) this;
        }

        public Criteria andTentNumBetween(Integer value1, Integer value2) {
            addCriterion("tent_num between", value1, value2, "tentNum");
            return (Criteria) this;
        }

        public Criteria andTentNumNotBetween(Integer value1, Integer value2) {
            addCriterion("tent_num not between", value1, value2, "tentNum");
            return (Criteria) this;
        }

        public Criteria andTentPriceIsNull() {
            addCriterion("tent_price is null");
            return (Criteria) this;
        }

        public Criteria andTentPriceIsNotNull() {
            addCriterion("tent_price is not null");
            return (Criteria) this;
        }

        public Criteria andTentPriceEqualTo(Integer value) {
            addCriterion("tent_price =", value, "tentPrice");
            return (Criteria) this;
        }

        public Criteria andTentPriceNotEqualTo(Integer value) {
            addCriterion("tent_price <>", value, "tentPrice");
            return (Criteria) this;
        }

        public Criteria andTentPriceGreaterThan(Integer value) {
            addCriterion("tent_price >", value, "tentPrice");
            return (Criteria) this;
        }

        public Criteria andTentPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("tent_price >=", value, "tentPrice");
            return (Criteria) this;
        }

        public Criteria andTentPriceLessThan(Integer value) {
            addCriterion("tent_price <", value, "tentPrice");
            return (Criteria) this;
        }

        public Criteria andTentPriceLessThanOrEqualTo(Integer value) {
            addCriterion("tent_price <=", value, "tentPrice");
            return (Criteria) this;
        }

        public Criteria andTentPriceIn(List<Integer> values) {
            addCriterion("tent_price in", values, "tentPrice");
            return (Criteria) this;
        }

        public Criteria andTentPriceNotIn(List<Integer> values) {
            addCriterion("tent_price not in", values, "tentPrice");
            return (Criteria) this;
        }

        public Criteria andTentPriceBetween(Integer value1, Integer value2) {
            addCriterion("tent_price between", value1, value2, "tentPrice");
            return (Criteria) this;
        }

        public Criteria andTentPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("tent_price not between", value1, value2, "tentPrice");
            return (Criteria) this;
        }

        public Criteria andOpenSeasonIsNull() {
            addCriterion("open_season is null");
            return (Criteria) this;
        }

        public Criteria andOpenSeasonIsNotNull() {
            addCriterion("open_season is not null");
            return (Criteria) this;
        }

        public Criteria andOpenSeasonEqualTo(String value) {
            addCriterion("open_season =", value, "openSeason");
            return (Criteria) this;
        }

        public Criteria andOpenSeasonNotEqualTo(String value) {
            addCriterion("open_season <>", value, "openSeason");
            return (Criteria) this;
        }

        public Criteria andOpenSeasonGreaterThan(String value) {
            addCriterion("open_season >", value, "openSeason");
            return (Criteria) this;
        }

        public Criteria andOpenSeasonGreaterThanOrEqualTo(String value) {
            addCriterion("open_season >=", value, "openSeason");
            return (Criteria) this;
        }

        public Criteria andOpenSeasonLessThan(String value) {
            addCriterion("open_season <", value, "openSeason");
            return (Criteria) this;
        }

        public Criteria andOpenSeasonLessThanOrEqualTo(String value) {
            addCriterion("open_season <=", value, "openSeason");
            return (Criteria) this;
        }

        public Criteria andOpenSeasonLike(String value) {
            addCriterion("open_season like", value, "openSeason");
            return (Criteria) this;
        }

        public Criteria andOpenSeasonNotLike(String value) {
            addCriterion("open_season not like", value, "openSeason");
            return (Criteria) this;
        }

        public Criteria andOpenSeasonIn(List<String> values) {
            addCriterion("open_season in", values, "openSeason");
            return (Criteria) this;
        }

        public Criteria andOpenSeasonNotIn(List<String> values) {
            addCriterion("open_season not in", values, "openSeason");
            return (Criteria) this;
        }

        public Criteria andOpenSeasonBetween(String value1, String value2) {
            addCriterion("open_season between", value1, value2, "openSeason");
            return (Criteria) this;
        }

        public Criteria andOpenSeasonNotBetween(String value1, String value2) {
            addCriterion("open_season not between", value1, value2, "openSeason");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(String value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(String value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(String value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(String value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(String value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<String> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<String> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(String value1, String value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(String value1, String value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(String value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(String value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(String value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(String value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(String value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<String> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<String> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(String value1, String value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(String value1, String value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIsNull() {
            addCriterion("video_url is null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIsNotNull() {
            addCriterion("video_url is not null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlEqualTo(String value) {
            addCriterion("video_url =", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotEqualTo(String value) {
            addCriterion("video_url <>", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThan(String value) {
            addCriterion("video_url >", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("video_url >=", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThan(String value) {
            addCriterion("video_url <", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThanOrEqualTo(String value) {
            addCriterion("video_url <=", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLike(String value) {
            addCriterion("video_url like", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotLike(String value) {
            addCriterion("video_url not like", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIn(List<String> values) {
            addCriterion("video_url in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotIn(List<String> values) {
            addCriterion("video_url not in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlBetween(String value1, String value2) {
            addCriterion("video_url between", value1, value2, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotBetween(String value1, String value2) {
            addCriterion("video_url not between", value1, value2, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoThumIsNull() {
            addCriterion("video_thum is null");
            return (Criteria) this;
        }

        public Criteria andVideoThumIsNotNull() {
            addCriterion("video_thum is not null");
            return (Criteria) this;
        }

        public Criteria andVideoThumEqualTo(String value) {
            addCriterion("video_thum =", value, "videoThum");
            return (Criteria) this;
        }

        public Criteria andVideoThumNotEqualTo(String value) {
            addCriterion("video_thum <>", value, "videoThum");
            return (Criteria) this;
        }

        public Criteria andVideoThumGreaterThan(String value) {
            addCriterion("video_thum >", value, "videoThum");
            return (Criteria) this;
        }

        public Criteria andVideoThumGreaterThanOrEqualTo(String value) {
            addCriterion("video_thum >=", value, "videoThum");
            return (Criteria) this;
        }

        public Criteria andVideoThumLessThan(String value) {
            addCriterion("video_thum <", value, "videoThum");
            return (Criteria) this;
        }

        public Criteria andVideoThumLessThanOrEqualTo(String value) {
            addCriterion("video_thum <=", value, "videoThum");
            return (Criteria) this;
        }

        public Criteria andVideoThumLike(String value) {
            addCriterion("video_thum like", value, "videoThum");
            return (Criteria) this;
        }

        public Criteria andVideoThumNotLike(String value) {
            addCriterion("video_thum not like", value, "videoThum");
            return (Criteria) this;
        }

        public Criteria andVideoThumIn(List<String> values) {
            addCriterion("video_thum in", values, "videoThum");
            return (Criteria) this;
        }

        public Criteria andVideoThumNotIn(List<String> values) {
            addCriterion("video_thum not in", values, "videoThum");
            return (Criteria) this;
        }

        public Criteria andVideoThumBetween(String value1, String value2) {
            addCriterion("video_thum between", value1, value2, "videoThum");
            return (Criteria) this;
        }

        public Criteria andVideoThumNotBetween(String value1, String value2) {
            addCriterion("video_thum not between", value1, value2, "videoThum");
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

        public Criteria andSubtypeIsNull() {
            addCriterion("subtype is null");
            return (Criteria) this;
        }

        public Criteria andSubtypeIsNotNull() {
            addCriterion("subtype is not null");
            return (Criteria) this;
        }

        public Criteria andSubtypeEqualTo(Integer value) {
            addCriterion("subtype =", value, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeNotEqualTo(Integer value) {
            addCriterion("subtype <>", value, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeGreaterThan(Integer value) {
            addCriterion("subtype >", value, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("subtype >=", value, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeLessThan(Integer value) {
            addCriterion("subtype <", value, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeLessThanOrEqualTo(Integer value) {
            addCriterion("subtype <=", value, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeIn(List<Integer> values) {
            addCriterion("subtype in", values, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeNotIn(List<Integer> values) {
            addCriterion("subtype not in", values, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeBetween(Integer value1, Integer value2) {
            addCriterion("subtype between", value1, value2, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("subtype not between", value1, value2, "subtype");
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