package com.eliteams.quick4j.web.model;

import java.util.ArrayList;
import java.util.List;

public class TCampsiteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCampsiteExample() {
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

        public Criteria andIsParkPaymentIsNull() {
            addCriterion("is_park_payment is null");
            return (Criteria) this;
        }

        public Criteria andIsParkPaymentIsNotNull() {
            addCriterion("is_park_payment is not null");
            return (Criteria) this;
        }

        public Criteria andIsParkPaymentEqualTo(Integer value) {
            addCriterion("is_park_payment =", value, "isParkPayment");
            return (Criteria) this;
        }

        public Criteria andIsParkPaymentNotEqualTo(Integer value) {
            addCriterion("is_park_payment <>", value, "isParkPayment");
            return (Criteria) this;
        }

        public Criteria andIsParkPaymentGreaterThan(Integer value) {
            addCriterion("is_park_payment >", value, "isParkPayment");
            return (Criteria) this;
        }

        public Criteria andIsParkPaymentGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_park_payment >=", value, "isParkPayment");
            return (Criteria) this;
        }

        public Criteria andIsParkPaymentLessThan(Integer value) {
            addCriterion("is_park_payment <", value, "isParkPayment");
            return (Criteria) this;
        }

        public Criteria andIsParkPaymentLessThanOrEqualTo(Integer value) {
            addCriterion("is_park_payment <=", value, "isParkPayment");
            return (Criteria) this;
        }

        public Criteria andIsParkPaymentIn(List<Integer> values) {
            addCriterion("is_park_payment in", values, "isParkPayment");
            return (Criteria) this;
        }

        public Criteria andIsParkPaymentNotIn(List<Integer> values) {
            addCriterion("is_park_payment not in", values, "isParkPayment");
            return (Criteria) this;
        }

        public Criteria andIsParkPaymentBetween(Integer value1, Integer value2) {
            addCriterion("is_park_payment between", value1, value2, "isParkPayment");
            return (Criteria) this;
        }

        public Criteria andIsParkPaymentNotBetween(Integer value1, Integer value2) {
            addCriterion("is_park_payment not between", value1, value2, "isParkPayment");
            return (Criteria) this;
        }

        public Criteria andIsCanParkIsNull() {
            addCriterion("is_can_park is null");
            return (Criteria) this;
        }

        public Criteria andIsCanParkIsNotNull() {
            addCriterion("is_can_park is not null");
            return (Criteria) this;
        }

        public Criteria andIsCanParkEqualTo(Integer value) {
            addCriterion("is_can_park =", value, "isCanPark");
            return (Criteria) this;
        }

        public Criteria andIsCanParkNotEqualTo(Integer value) {
            addCriterion("is_can_park <>", value, "isCanPark");
            return (Criteria) this;
        }

        public Criteria andIsCanParkGreaterThan(Integer value) {
            addCriterion("is_can_park >", value, "isCanPark");
            return (Criteria) this;
        }

        public Criteria andIsCanParkGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_can_park >=", value, "isCanPark");
            return (Criteria) this;
        }

        public Criteria andIsCanParkLessThan(Integer value) {
            addCriterion("is_can_park <", value, "isCanPark");
            return (Criteria) this;
        }

        public Criteria andIsCanParkLessThanOrEqualTo(Integer value) {
            addCriterion("is_can_park <=", value, "isCanPark");
            return (Criteria) this;
        }

        public Criteria andIsCanParkIn(List<Integer> values) {
            addCriterion("is_can_park in", values, "isCanPark");
            return (Criteria) this;
        }

        public Criteria andIsCanParkNotIn(List<Integer> values) {
            addCriterion("is_can_park not in", values, "isCanPark");
            return (Criteria) this;
        }

        public Criteria andIsCanParkBetween(Integer value1, Integer value2) {
            addCriterion("is_can_park between", value1, value2, "isCanPark");
            return (Criteria) this;
        }

        public Criteria andIsCanParkNotBetween(Integer value1, Integer value2) {
            addCriterion("is_can_park not between", value1, value2, "isCanPark");
            return (Criteria) this;
        }

        public Criteria andIsCanTrailerIsNull() {
            addCriterion("is_can_trailer is null");
            return (Criteria) this;
        }

        public Criteria andIsCanTrailerIsNotNull() {
            addCriterion("is_can_trailer is not null");
            return (Criteria) this;
        }

        public Criteria andIsCanTrailerEqualTo(Integer value) {
            addCriterion("is_can_trailer =", value, "isCanTrailer");
            return (Criteria) this;
        }

        public Criteria andIsCanTrailerNotEqualTo(Integer value) {
            addCriterion("is_can_trailer <>", value, "isCanTrailer");
            return (Criteria) this;
        }

        public Criteria andIsCanTrailerGreaterThan(Integer value) {
            addCriterion("is_can_trailer >", value, "isCanTrailer");
            return (Criteria) this;
        }

        public Criteria andIsCanTrailerGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_can_trailer >=", value, "isCanTrailer");
            return (Criteria) this;
        }

        public Criteria andIsCanTrailerLessThan(Integer value) {
            addCriterion("is_can_trailer <", value, "isCanTrailer");
            return (Criteria) this;
        }

        public Criteria andIsCanTrailerLessThanOrEqualTo(Integer value) {
            addCriterion("is_can_trailer <=", value, "isCanTrailer");
            return (Criteria) this;
        }

        public Criteria andIsCanTrailerIn(List<Integer> values) {
            addCriterion("is_can_trailer in", values, "isCanTrailer");
            return (Criteria) this;
        }

        public Criteria andIsCanTrailerNotIn(List<Integer> values) {
            addCriterion("is_can_trailer not in", values, "isCanTrailer");
            return (Criteria) this;
        }

        public Criteria andIsCanTrailerBetween(Integer value1, Integer value2) {
            addCriterion("is_can_trailer between", value1, value2, "isCanTrailer");
            return (Criteria) this;
        }

        public Criteria andIsCanTrailerNotBetween(Integer value1, Integer value2) {
            addCriterion("is_can_trailer not between", value1, value2, "isCanTrailer");
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

        public Criteria andIsCanCookingIsNull() {
            addCriterion("is_can_cooking is null");
            return (Criteria) this;
        }

        public Criteria andIsCanCookingIsNotNull() {
            addCriterion("is_can_cooking is not null");
            return (Criteria) this;
        }

        public Criteria andIsCanCookingEqualTo(Integer value) {
            addCriterion("is_can_cooking =", value, "isCanCooking");
            return (Criteria) this;
        }

        public Criteria andIsCanCookingNotEqualTo(Integer value) {
            addCriterion("is_can_cooking <>", value, "isCanCooking");
            return (Criteria) this;
        }

        public Criteria andIsCanCookingGreaterThan(Integer value) {
            addCriterion("is_can_cooking >", value, "isCanCooking");
            return (Criteria) this;
        }

        public Criteria andIsCanCookingGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_can_cooking >=", value, "isCanCooking");
            return (Criteria) this;
        }

        public Criteria andIsCanCookingLessThan(Integer value) {
            addCriterion("is_can_cooking <", value, "isCanCooking");
            return (Criteria) this;
        }

        public Criteria andIsCanCookingLessThanOrEqualTo(Integer value) {
            addCriterion("is_can_cooking <=", value, "isCanCooking");
            return (Criteria) this;
        }

        public Criteria andIsCanCookingIn(List<Integer> values) {
            addCriterion("is_can_cooking in", values, "isCanCooking");
            return (Criteria) this;
        }

        public Criteria andIsCanCookingNotIn(List<Integer> values) {
            addCriterion("is_can_cooking not in", values, "isCanCooking");
            return (Criteria) this;
        }

        public Criteria andIsCanCookingBetween(Integer value1, Integer value2) {
            addCriterion("is_can_cooking between", value1, value2, "isCanCooking");
            return (Criteria) this;
        }

        public Criteria andIsCanCookingNotBetween(Integer value1, Integer value2) {
            addCriterion("is_can_cooking not between", value1, value2, "isCanCooking");
            return (Criteria) this;
        }

        public Criteria andIsHasMarketsIsNull() {
            addCriterion("is_has_markets is null");
            return (Criteria) this;
        }

        public Criteria andIsHasMarketsIsNotNull() {
            addCriterion("is_has_markets is not null");
            return (Criteria) this;
        }

        public Criteria andIsHasMarketsEqualTo(Integer value) {
            addCriterion("is_has_markets =", value, "isHasMarkets");
            return (Criteria) this;
        }

        public Criteria andIsHasMarketsNotEqualTo(Integer value) {
            addCriterion("is_has_markets <>", value, "isHasMarkets");
            return (Criteria) this;
        }

        public Criteria andIsHasMarketsGreaterThan(Integer value) {
            addCriterion("is_has_markets >", value, "isHasMarkets");
            return (Criteria) this;
        }

        public Criteria andIsHasMarketsGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_has_markets >=", value, "isHasMarkets");
            return (Criteria) this;
        }

        public Criteria andIsHasMarketsLessThan(Integer value) {
            addCriterion("is_has_markets <", value, "isHasMarkets");
            return (Criteria) this;
        }

        public Criteria andIsHasMarketsLessThanOrEqualTo(Integer value) {
            addCriterion("is_has_markets <=", value, "isHasMarkets");
            return (Criteria) this;
        }

        public Criteria andIsHasMarketsIn(List<Integer> values) {
            addCriterion("is_has_markets in", values, "isHasMarkets");
            return (Criteria) this;
        }

        public Criteria andIsHasMarketsNotIn(List<Integer> values) {
            addCriterion("is_has_markets not in", values, "isHasMarkets");
            return (Criteria) this;
        }

        public Criteria andIsHasMarketsBetween(Integer value1, Integer value2) {
            addCriterion("is_has_markets between", value1, value2, "isHasMarkets");
            return (Criteria) this;
        }

        public Criteria andIsHasMarketsNotBetween(Integer value1, Integer value2) {
            addCriterion("is_has_markets not between", value1, value2, "isHasMarkets");
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

        public Criteria andIsCanTentIsNull() {
            addCriterion("is_can_tent is null");
            return (Criteria) this;
        }

        public Criteria andIsCanTentIsNotNull() {
            addCriterion("is_can_tent is not null");
            return (Criteria) this;
        }

        public Criteria andIsCanTentEqualTo(Integer value) {
            addCriterion("is_can_tent =", value, "isCanTent");
            return (Criteria) this;
        }

        public Criteria andIsCanTentNotEqualTo(Integer value) {
            addCriterion("is_can_tent <>", value, "isCanTent");
            return (Criteria) this;
        }

        public Criteria andIsCanTentGreaterThan(Integer value) {
            addCriterion("is_can_tent >", value, "isCanTent");
            return (Criteria) this;
        }

        public Criteria andIsCanTentGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_can_tent >=", value, "isCanTent");
            return (Criteria) this;
        }

        public Criteria andIsCanTentLessThan(Integer value) {
            addCriterion("is_can_tent <", value, "isCanTent");
            return (Criteria) this;
        }

        public Criteria andIsCanTentLessThanOrEqualTo(Integer value) {
            addCriterion("is_can_tent <=", value, "isCanTent");
            return (Criteria) this;
        }

        public Criteria andIsCanTentIn(List<Integer> values) {
            addCriterion("is_can_tent in", values, "isCanTent");
            return (Criteria) this;
        }

        public Criteria andIsCanTentNotIn(List<Integer> values) {
            addCriterion("is_can_tent not in", values, "isCanTent");
            return (Criteria) this;
        }

        public Criteria andIsCanTentBetween(Integer value1, Integer value2) {
            addCriterion("is_can_tent between", value1, value2, "isCanTent");
            return (Criteria) this;
        }

        public Criteria andIsCanTentNotBetween(Integer value1, Integer value2) {
            addCriterion("is_can_tent not between", value1, value2, "isCanTent");
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

        public Criteria andIsDefaultNameIsNull() {
            addCriterion("is_default_name is null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNameIsNotNull() {
            addCriterion("is_default_name is not null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNameEqualTo(Integer value) {
            addCriterion("is_default_name =", value, "isDefaultName");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNameNotEqualTo(Integer value) {
            addCriterion("is_default_name <>", value, "isDefaultName");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNameGreaterThan(Integer value) {
            addCriterion("is_default_name >", value, "isDefaultName");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNameGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_default_name >=", value, "isDefaultName");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNameLessThan(Integer value) {
            addCriterion("is_default_name <", value, "isDefaultName");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNameLessThanOrEqualTo(Integer value) {
            addCriterion("is_default_name <=", value, "isDefaultName");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNameIn(List<Integer> values) {
            addCriterion("is_default_name in", values, "isDefaultName");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNameNotIn(List<Integer> values) {
            addCriterion("is_default_name not in", values, "isDefaultName");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNameBetween(Integer value1, Integer value2) {
            addCriterion("is_default_name between", value1, value2, "isDefaultName");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNameNotBetween(Integer value1, Integer value2) {
            addCriterion("is_default_name not between", value1, value2, "isDefaultName");
            return (Criteria) this;
        }

        public Criteria andIsCheckIsNull() {
            addCriterion("is_check is null");
            return (Criteria) this;
        }

        public Criteria andIsCheckIsNotNull() {
            addCriterion("is_check is not null");
            return (Criteria) this;
        }

        public Criteria andIsCheckEqualTo(Integer value) {
            addCriterion("is_check =", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotEqualTo(Integer value) {
            addCriterion("is_check <>", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckGreaterThan(Integer value) {
            addCriterion("is_check >", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_check >=", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLessThan(Integer value) {
            addCriterion("is_check <", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLessThanOrEqualTo(Integer value) {
            addCriterion("is_check <=", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckIn(List<Integer> values) {
            addCriterion("is_check in", values, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotIn(List<Integer> values) {
            addCriterion("is_check not in", values, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckBetween(Integer value1, Integer value2) {
            addCriterion("is_check between", value1, value2, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotBetween(Integer value1, Integer value2) {
            addCriterion("is_check not between", value1, value2, "isCheck");
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

        public Criteria andRomantictimeIsNull() {
            addCriterion("romanticTime is null");
            return (Criteria) this;
        }

        public Criteria andRomantictimeIsNotNull() {
            addCriterion("romanticTime is not null");
            return (Criteria) this;
        }

        public Criteria andRomantictimeEqualTo(String value) {
            addCriterion("romanticTime =", value, "romantictime");
            return (Criteria) this;
        }

        public Criteria andRomantictimeNotEqualTo(String value) {
            addCriterion("romanticTime <>", value, "romantictime");
            return (Criteria) this;
        }

        public Criteria andRomantictimeGreaterThan(String value) {
            addCriterion("romanticTime >", value, "romantictime");
            return (Criteria) this;
        }

        public Criteria andRomantictimeGreaterThanOrEqualTo(String value) {
            addCriterion("romanticTime >=", value, "romantictime");
            return (Criteria) this;
        }

        public Criteria andRomantictimeLessThan(String value) {
            addCriterion("romanticTime <", value, "romantictime");
            return (Criteria) this;
        }

        public Criteria andRomantictimeLessThanOrEqualTo(String value) {
            addCriterion("romanticTime <=", value, "romantictime");
            return (Criteria) this;
        }

        public Criteria andRomantictimeLike(String value) {
            addCriterion("romanticTime like", value, "romantictime");
            return (Criteria) this;
        }

        public Criteria andRomantictimeNotLike(String value) {
            addCriterion("romanticTime not like", value, "romantictime");
            return (Criteria) this;
        }

        public Criteria andRomantictimeIn(List<String> values) {
            addCriterion("romanticTime in", values, "romantictime");
            return (Criteria) this;
        }

        public Criteria andRomantictimeNotIn(List<String> values) {
            addCriterion("romanticTime not in", values, "romantictime");
            return (Criteria) this;
        }

        public Criteria andRomantictimeBetween(String value1, String value2) {
            addCriterion("romanticTime between", value1, value2, "romantictime");
            return (Criteria) this;
        }

        public Criteria andRomantictimeNotBetween(String value1, String value2) {
            addCriterion("romanticTime not between", value1, value2, "romantictime");
            return (Criteria) this;
        }

        public Criteria andRomanticlongIsNull() {
            addCriterion("romanticLong is null");
            return (Criteria) this;
        }

        public Criteria andRomanticlongIsNotNull() {
            addCriterion("romanticLong is not null");
            return (Criteria) this;
        }

        public Criteria andRomanticlongEqualTo(String value) {
            addCriterion("romanticLong =", value, "romanticlong");
            return (Criteria) this;
        }

        public Criteria andRomanticlongNotEqualTo(String value) {
            addCriterion("romanticLong <>", value, "romanticlong");
            return (Criteria) this;
        }

        public Criteria andRomanticlongGreaterThan(String value) {
            addCriterion("romanticLong >", value, "romanticlong");
            return (Criteria) this;
        }

        public Criteria andRomanticlongGreaterThanOrEqualTo(String value) {
            addCriterion("romanticLong >=", value, "romanticlong");
            return (Criteria) this;
        }

        public Criteria andRomanticlongLessThan(String value) {
            addCriterion("romanticLong <", value, "romanticlong");
            return (Criteria) this;
        }

        public Criteria andRomanticlongLessThanOrEqualTo(String value) {
            addCriterion("romanticLong <=", value, "romanticlong");
            return (Criteria) this;
        }

        public Criteria andRomanticlongLike(String value) {
            addCriterion("romanticLong like", value, "romanticlong");
            return (Criteria) this;
        }

        public Criteria andRomanticlongNotLike(String value) {
            addCriterion("romanticLong not like", value, "romanticlong");
            return (Criteria) this;
        }

        public Criteria andRomanticlongIn(List<String> values) {
            addCriterion("romanticLong in", values, "romanticlong");
            return (Criteria) this;
        }

        public Criteria andRomanticlongNotIn(List<String> values) {
            addCriterion("romanticLong not in", values, "romanticlong");
            return (Criteria) this;
        }

        public Criteria andRomanticlongBetween(String value1, String value2) {
            addCriterion("romanticLong between", value1, value2, "romanticlong");
            return (Criteria) this;
        }

        public Criteria andRomanticlongNotBetween(String value1, String value2) {
            addCriterion("romanticLong not between", value1, value2, "romanticlong");
            return (Criteria) this;
        }

        public Criteria andWithdeviceIsNull() {
            addCriterion("withDevice is null");
            return (Criteria) this;
        }

        public Criteria andWithdeviceIsNotNull() {
            addCriterion("withDevice is not null");
            return (Criteria) this;
        }

        public Criteria andWithdeviceEqualTo(String value) {
            addCriterion("withDevice =", value, "withdevice");
            return (Criteria) this;
        }

        public Criteria andWithdeviceNotEqualTo(String value) {
            addCriterion("withDevice <>", value, "withdevice");
            return (Criteria) this;
        }

        public Criteria andWithdeviceGreaterThan(String value) {
            addCriterion("withDevice >", value, "withdevice");
            return (Criteria) this;
        }

        public Criteria andWithdeviceGreaterThanOrEqualTo(String value) {
            addCriterion("withDevice >=", value, "withdevice");
            return (Criteria) this;
        }

        public Criteria andWithdeviceLessThan(String value) {
            addCriterion("withDevice <", value, "withdevice");
            return (Criteria) this;
        }

        public Criteria andWithdeviceLessThanOrEqualTo(String value) {
            addCriterion("withDevice <=", value, "withdevice");
            return (Criteria) this;
        }

        public Criteria andWithdeviceLike(String value) {
            addCriterion("withDevice like", value, "withdevice");
            return (Criteria) this;
        }

        public Criteria andWithdeviceNotLike(String value) {
            addCriterion("withDevice not like", value, "withdevice");
            return (Criteria) this;
        }

        public Criteria andWithdeviceIn(List<String> values) {
            addCriterion("withDevice in", values, "withdevice");
            return (Criteria) this;
        }

        public Criteria andWithdeviceNotIn(List<String> values) {
            addCriterion("withDevice not in", values, "withdevice");
            return (Criteria) this;
        }

        public Criteria andWithdeviceBetween(String value1, String value2) {
            addCriterion("withDevice between", value1, value2, "withdevice");
            return (Criteria) this;
        }

        public Criteria andWithdeviceNotBetween(String value1, String value2) {
            addCriterion("withDevice not between", value1, value2, "withdevice");
            return (Criteria) this;
        }

        public Criteria andRomanticstarttimeIsNull() {
            addCriterion("romanticStartTime is null");
            return (Criteria) this;
        }

        public Criteria andRomanticstarttimeIsNotNull() {
            addCriterion("romanticStartTime is not null");
            return (Criteria) this;
        }

        public Criteria andRomanticstarttimeEqualTo(String value) {
            addCriterion("romanticStartTime =", value, "romanticstarttime");
            return (Criteria) this;
        }

        public Criteria andRomanticstarttimeNotEqualTo(String value) {
            addCriterion("romanticStartTime <>", value, "romanticstarttime");
            return (Criteria) this;
        }

        public Criteria andRomanticstarttimeGreaterThan(String value) {
            addCriterion("romanticStartTime >", value, "romanticstarttime");
            return (Criteria) this;
        }

        public Criteria andRomanticstarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("romanticStartTime >=", value, "romanticstarttime");
            return (Criteria) this;
        }

        public Criteria andRomanticstarttimeLessThan(String value) {
            addCriterion("romanticStartTime <", value, "romanticstarttime");
            return (Criteria) this;
        }

        public Criteria andRomanticstarttimeLessThanOrEqualTo(String value) {
            addCriterion("romanticStartTime <=", value, "romanticstarttime");
            return (Criteria) this;
        }

        public Criteria andRomanticstarttimeLike(String value) {
            addCriterion("romanticStartTime like", value, "romanticstarttime");
            return (Criteria) this;
        }

        public Criteria andRomanticstarttimeNotLike(String value) {
            addCriterion("romanticStartTime not like", value, "romanticstarttime");
            return (Criteria) this;
        }

        public Criteria andRomanticstarttimeIn(List<String> values) {
            addCriterion("romanticStartTime in", values, "romanticstarttime");
            return (Criteria) this;
        }

        public Criteria andRomanticstarttimeNotIn(List<String> values) {
            addCriterion("romanticStartTime not in", values, "romanticstarttime");
            return (Criteria) this;
        }

        public Criteria andRomanticstarttimeBetween(String value1, String value2) {
            addCriterion("romanticStartTime between", value1, value2, "romanticstarttime");
            return (Criteria) this;
        }

        public Criteria andRomanticstarttimeNotBetween(String value1, String value2) {
            addCriterion("romanticStartTime not between", value1, value2, "romanticstarttime");
            return (Criteria) this;
        }

        public Criteria andRomanticendtimeIsNull() {
            addCriterion("romanticEndTime is null");
            return (Criteria) this;
        }

        public Criteria andRomanticendtimeIsNotNull() {
            addCriterion("romanticEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andRomanticendtimeEqualTo(String value) {
            addCriterion("romanticEndTime =", value, "romanticendtime");
            return (Criteria) this;
        }

        public Criteria andRomanticendtimeNotEqualTo(String value) {
            addCriterion("romanticEndTime <>", value, "romanticendtime");
            return (Criteria) this;
        }

        public Criteria andRomanticendtimeGreaterThan(String value) {
            addCriterion("romanticEndTime >", value, "romanticendtime");
            return (Criteria) this;
        }

        public Criteria andRomanticendtimeGreaterThanOrEqualTo(String value) {
            addCriterion("romanticEndTime >=", value, "romanticendtime");
            return (Criteria) this;
        }

        public Criteria andRomanticendtimeLessThan(String value) {
            addCriterion("romanticEndTime <", value, "romanticendtime");
            return (Criteria) this;
        }

        public Criteria andRomanticendtimeLessThanOrEqualTo(String value) {
            addCriterion("romanticEndTime <=", value, "romanticendtime");
            return (Criteria) this;
        }

        public Criteria andRomanticendtimeLike(String value) {
            addCriterion("romanticEndTime like", value, "romanticendtime");
            return (Criteria) this;
        }

        public Criteria andRomanticendtimeNotLike(String value) {
            addCriterion("romanticEndTime not like", value, "romanticendtime");
            return (Criteria) this;
        }

        public Criteria andRomanticendtimeIn(List<String> values) {
            addCriterion("romanticEndTime in", values, "romanticendtime");
            return (Criteria) this;
        }

        public Criteria andRomanticendtimeNotIn(List<String> values) {
            addCriterion("romanticEndTime not in", values, "romanticendtime");
            return (Criteria) this;
        }

        public Criteria andRomanticendtimeBetween(String value1, String value2) {
            addCriterion("romanticEndTime between", value1, value2, "romanticendtime");
            return (Criteria) this;
        }

        public Criteria andRomanticendtimeNotBetween(String value1, String value2) {
            addCriterion("romanticEndTime not between", value1, value2, "romanticendtime");
            return (Criteria) this;
        }

        public Criteria andTicketpriceIsNull() {
            addCriterion("ticketPrice is null");
            return (Criteria) this;
        }

        public Criteria andTicketpriceIsNotNull() {
            addCriterion("ticketPrice is not null");
            return (Criteria) this;
        }

        public Criteria andTicketpriceEqualTo(String value) {
            addCriterion("ticketPrice =", value, "ticketprice");
            return (Criteria) this;
        }

        public Criteria andTicketpriceNotEqualTo(String value) {
            addCriterion("ticketPrice <>", value, "ticketprice");
            return (Criteria) this;
        }

        public Criteria andTicketpriceGreaterThan(String value) {
            addCriterion("ticketPrice >", value, "ticketprice");
            return (Criteria) this;
        }

        public Criteria andTicketpriceGreaterThanOrEqualTo(String value) {
            addCriterion("ticketPrice >=", value, "ticketprice");
            return (Criteria) this;
        }

        public Criteria andTicketpriceLessThan(String value) {
            addCriterion("ticketPrice <", value, "ticketprice");
            return (Criteria) this;
        }

        public Criteria andTicketpriceLessThanOrEqualTo(String value) {
            addCriterion("ticketPrice <=", value, "ticketprice");
            return (Criteria) this;
        }

        public Criteria andTicketpriceLike(String value) {
            addCriterion("ticketPrice like", value, "ticketprice");
            return (Criteria) this;
        }

        public Criteria andTicketpriceNotLike(String value) {
            addCriterion("ticketPrice not like", value, "ticketprice");
            return (Criteria) this;
        }

        public Criteria andTicketpriceIn(List<String> values) {
            addCriterion("ticketPrice in", values, "ticketprice");
            return (Criteria) this;
        }

        public Criteria andTicketpriceNotIn(List<String> values) {
            addCriterion("ticketPrice not in", values, "ticketprice");
            return (Criteria) this;
        }

        public Criteria andTicketpriceBetween(String value1, String value2) {
            addCriterion("ticketPrice between", value1, value2, "ticketprice");
            return (Criteria) this;
        }

        public Criteria andTicketpriceNotBetween(String value1, String value2) {
            addCriterion("ticketPrice not between", value1, value2, "ticketprice");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIsNull() {
            addCriterion("specialty is null");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIsNotNull() {
            addCriterion("specialty is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialtyEqualTo(String value) {
            addCriterion("specialty =", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNotEqualTo(String value) {
            addCriterion("specialty <>", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyGreaterThan(String value) {
            addCriterion("specialty >", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyGreaterThanOrEqualTo(String value) {
            addCriterion("specialty >=", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyLessThan(String value) {
            addCriterion("specialty <", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyLessThanOrEqualTo(String value) {
            addCriterion("specialty <=", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyLike(String value) {
            addCriterion("specialty like", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNotLike(String value) {
            addCriterion("specialty not like", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIn(List<String> values) {
            addCriterion("specialty in", values, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNotIn(List<String> values) {
            addCriterion("specialty not in", values, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyBetween(String value1, String value2) {
            addCriterion("specialty between", value1, value2, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNotBetween(String value1, String value2) {
            addCriterion("specialty not between", value1, value2, "specialty");
            return (Criteria) this;
        }

        public Criteria andConsumeIsNull() {
            addCriterion("consume is null");
            return (Criteria) this;
        }

        public Criteria andConsumeIsNotNull() {
            addCriterion("consume is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeEqualTo(String value) {
            addCriterion("consume =", value, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeNotEqualTo(String value) {
            addCriterion("consume <>", value, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeGreaterThan(String value) {
            addCriterion("consume >", value, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeGreaterThanOrEqualTo(String value) {
            addCriterion("consume >=", value, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeLessThan(String value) {
            addCriterion("consume <", value, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeLessThanOrEqualTo(String value) {
            addCriterion("consume <=", value, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeLike(String value) {
            addCriterion("consume like", value, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeNotLike(String value) {
            addCriterion("consume not like", value, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeIn(List<String> values) {
            addCriterion("consume in", values, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeNotIn(List<String> values) {
            addCriterion("consume not in", values, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeBetween(String value1, String value2) {
            addCriterion("consume between", value1, value2, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeNotBetween(String value1, String value2) {
            addCriterion("consume not between", value1, value2, "consume");
            return (Criteria) this;
        }

        public Criteria andImpressionIsNull() {
            addCriterion("impression is null");
            return (Criteria) this;
        }

        public Criteria andImpressionIsNotNull() {
            addCriterion("impression is not null");
            return (Criteria) this;
        }

        public Criteria andImpressionEqualTo(String value) {
            addCriterion("impression =", value, "impression");
            return (Criteria) this;
        }

        public Criteria andImpressionNotEqualTo(String value) {
            addCriterion("impression <>", value, "impression");
            return (Criteria) this;
        }

        public Criteria andImpressionGreaterThan(String value) {
            addCriterion("impression >", value, "impression");
            return (Criteria) this;
        }

        public Criteria andImpressionGreaterThanOrEqualTo(String value) {
            addCriterion("impression >=", value, "impression");
            return (Criteria) this;
        }

        public Criteria andImpressionLessThan(String value) {
            addCriterion("impression <", value, "impression");
            return (Criteria) this;
        }

        public Criteria andImpressionLessThanOrEqualTo(String value) {
            addCriterion("impression <=", value, "impression");
            return (Criteria) this;
        }

        public Criteria andImpressionLike(String value) {
            addCriterion("impression like", value, "impression");
            return (Criteria) this;
        }

        public Criteria andImpressionNotLike(String value) {
            addCriterion("impression not like", value, "impression");
            return (Criteria) this;
        }

        public Criteria andImpressionIn(List<String> values) {
            addCriterion("impression in", values, "impression");
            return (Criteria) this;
        }

        public Criteria andImpressionNotIn(List<String> values) {
            addCriterion("impression not in", values, "impression");
            return (Criteria) this;
        }

        public Criteria andImpressionBetween(String value1, String value2) {
            addCriterion("impression between", value1, value2, "impression");
            return (Criteria) this;
        }

        public Criteria andImpressionNotBetween(String value1, String value2) {
            addCriterion("impression not between", value1, value2, "impression");
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