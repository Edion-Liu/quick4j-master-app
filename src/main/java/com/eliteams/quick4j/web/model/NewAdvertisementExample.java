package com.eliteams.quick4j.web.model;

import java.util.ArrayList;
import java.util.List;

public class NewAdvertisementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewAdvertisementExample() {
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

        public Criteria andAdupdateIsNull() {
            addCriterion("adupdate is null");
            return (Criteria) this;
        }

        public Criteria andAdupdateIsNotNull() {
            addCriterion("adupdate is not null");
            return (Criteria) this;
        }

        public Criteria andAdupdateEqualTo(String value) {
            addCriterion("adupdate =", value, "adupdate");
            return (Criteria) this;
        }

        public Criteria andAdupdateNotEqualTo(String value) {
            addCriterion("adupdate <>", value, "adupdate");
            return (Criteria) this;
        }

        public Criteria andAdupdateGreaterThan(String value) {
            addCriterion("adupdate >", value, "adupdate");
            return (Criteria) this;
        }

        public Criteria andAdupdateGreaterThanOrEqualTo(String value) {
            addCriterion("adupdate >=", value, "adupdate");
            return (Criteria) this;
        }

        public Criteria andAdupdateLessThan(String value) {
            addCriterion("adupdate <", value, "adupdate");
            return (Criteria) this;
        }

        public Criteria andAdupdateLessThanOrEqualTo(String value) {
            addCriterion("adupdate <=", value, "adupdate");
            return (Criteria) this;
        }

        public Criteria andAdupdateIn(List<String> values) {
            addCriterion("adupdate in", values, "adupdate");
            return (Criteria) this;
        }

        public Criteria andAdupdateNotIn(List<String> values) {
            addCriterion("adupdate not in", values, "adupdate");
            return (Criteria) this;
        }

        public Criteria andAdupdateBetween(String value1, String value2) {
            addCriterion("adupdate between", value1, value2, "adupdate");
            return (Criteria) this;
        }

        public Criteria andAdupdateNotBetween(String value1, String value2) {
            addCriterion("adupdate not between", value1, value2, "adupdate");
            return (Criteria) this;
        }

        public Criteria andAdtitleIsNull() {
            addCriterion("adtitle is null");
            return (Criteria) this;
        }

        public Criteria andAdtitleIsNotNull() {
            addCriterion("adtitle is not null");
            return (Criteria) this;
        }

        public Criteria andAdtitleEqualTo(String value) {
            addCriterion("adtitle =", value, "adtitle");
            return (Criteria) this;
        }

        public Criteria andAdtitleNotEqualTo(String value) {
            addCriterion("adtitle <>", value, "adtitle");
            return (Criteria) this;
        }

        public Criteria andAdtitleGreaterThan(String value) {
            addCriterion("adtitle >", value, "adtitle");
            return (Criteria) this;
        }

        public Criteria andAdtitleGreaterThanOrEqualTo(String value) {
            addCriterion("adtitle >=", value, "adtitle");
            return (Criteria) this;
        }

        public Criteria andAdtitleLessThan(String value) {
            addCriterion("adtitle <", value, "adtitle");
            return (Criteria) this;
        }

        public Criteria andAdtitleLessThanOrEqualTo(String value) {
            addCriterion("adtitle <=", value, "adtitle");
            return (Criteria) this;
        }

        public Criteria andAdtitleLike(String value) {
            addCriterion("adtitle like", value, "adtitle");
            return (Criteria) this;
        }

        public Criteria andAdtitleNotLike(String value) {
            addCriterion("adtitle not like", value, "adtitle");
            return (Criteria) this;
        }

        public Criteria andAdtitleIn(List<String> values) {
            addCriterion("adtitle in", values, "adtitle");
            return (Criteria) this;
        }

        public Criteria andAdtitleNotIn(List<String> values) {
            addCriterion("adtitle not in", values, "adtitle");
            return (Criteria) this;
        }

        public Criteria andAdtitleBetween(String value1, String value2) {
            addCriterion("adtitle between", value1, value2, "adtitle");
            return (Criteria) this;
        }

        public Criteria andAdtitleNotBetween(String value1, String value2) {
            addCriterion("adtitle not between", value1, value2, "adtitle");
            return (Criteria) this;
        }

        public Criteria andAddescribeIsNull() {
            addCriterion("addescribe is null");
            return (Criteria) this;
        }

        public Criteria andAddescribeIsNotNull() {
            addCriterion("addescribe is not null");
            return (Criteria) this;
        }

        public Criteria andAddescribeEqualTo(String value) {
            addCriterion("addescribe =", value, "addescribe");
            return (Criteria) this;
        }

        public Criteria andAddescribeNotEqualTo(String value) {
            addCriterion("addescribe <>", value, "addescribe");
            return (Criteria) this;
        }

        public Criteria andAddescribeGreaterThan(String value) {
            addCriterion("addescribe >", value, "addescribe");
            return (Criteria) this;
        }

        public Criteria andAddescribeGreaterThanOrEqualTo(String value) {
            addCriterion("addescribe >=", value, "addescribe");
            return (Criteria) this;
        }

        public Criteria andAddescribeLessThan(String value) {
            addCriterion("addescribe <", value, "addescribe");
            return (Criteria) this;
        }

        public Criteria andAddescribeLessThanOrEqualTo(String value) {
            addCriterion("addescribe <=", value, "addescribe");
            return (Criteria) this;
        }

        public Criteria andAddescribeLike(String value) {
            addCriterion("addescribe like", value, "addescribe");
            return (Criteria) this;
        }

        public Criteria andAddescribeNotLike(String value) {
            addCriterion("addescribe not like", value, "addescribe");
            return (Criteria) this;
        }

        public Criteria andAddescribeIn(List<String> values) {
            addCriterion("addescribe in", values, "addescribe");
            return (Criteria) this;
        }

        public Criteria andAddescribeNotIn(List<String> values) {
            addCriterion("addescribe not in", values, "addescribe");
            return (Criteria) this;
        }

        public Criteria andAddescribeBetween(String value1, String value2) {
            addCriterion("addescribe between", value1, value2, "addescribe");
            return (Criteria) this;
        }

        public Criteria andAddescribeNotBetween(String value1, String value2) {
            addCriterion("addescribe not between", value1, value2, "addescribe");
            return (Criteria) this;
        }

        public Criteria andAdimageIsNull() {
            addCriterion("adimage is null");
            return (Criteria) this;
        }

        public Criteria andAdimageIsNotNull() {
            addCriterion("adimage is not null");
            return (Criteria) this;
        }

        public Criteria andAdimageEqualTo(String value) {
            addCriterion("adimage =", value, "adimage");
            return (Criteria) this;
        }

        public Criteria andAdimageNotEqualTo(String value) {
            addCriterion("adimage <>", value, "adimage");
            return (Criteria) this;
        }

        public Criteria andAdimageGreaterThan(String value) {
            addCriterion("adimage >", value, "adimage");
            return (Criteria) this;
        }

        public Criteria andAdimageGreaterThanOrEqualTo(String value) {
            addCriterion("adimage >=", value, "adimage");
            return (Criteria) this;
        }

        public Criteria andAdimageLessThan(String value) {
            addCriterion("adimage <", value, "adimage");
            return (Criteria) this;
        }

        public Criteria andAdimageLessThanOrEqualTo(String value) {
            addCriterion("adimage <=", value, "adimage");
            return (Criteria) this;
        }

        public Criteria andAdimageLike(String value) {
            addCriterion("adimage like", value, "adimage");
            return (Criteria) this;
        }

        public Criteria andAdimageNotLike(String value) {
            addCriterion("adimage not like", value, "adimage");
            return (Criteria) this;
        }

        public Criteria andAdimageIn(List<String> values) {
            addCriterion("adimage in", values, "adimage");
            return (Criteria) this;
        }

        public Criteria andAdimageNotIn(List<String> values) {
            addCriterion("adimage not in", values, "adimage");
            return (Criteria) this;
        }

        public Criteria andAdimageBetween(String value1, String value2) {
            addCriterion("adimage between", value1, value2, "adimage");
            return (Criteria) this;
        }

        public Criteria andAdimageNotBetween(String value1, String value2) {
            addCriterion("adimage not between", value1, value2, "adimage");
            return (Criteria) this;
        }

        public Criteria andAdtypeIsNull() {
            addCriterion("adtype is null");
            return (Criteria) this;
        }

        public Criteria andAdtypeIsNotNull() {
            addCriterion("adtype is not null");
            return (Criteria) this;
        }

        public Criteria andAdtypeEqualTo(Integer value) {
            addCriterion("adtype =", value, "adtype");
            return (Criteria) this;
        }

        public Criteria andAdtypeNotEqualTo(Integer value) {
            addCriterion("adtype <>", value, "adtype");
            return (Criteria) this;
        }

        public Criteria andAdtypeGreaterThan(Integer value) {
            addCriterion("adtype >", value, "adtype");
            return (Criteria) this;
        }

        public Criteria andAdtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("adtype >=", value, "adtype");
            return (Criteria) this;
        }

        public Criteria andAdtypeLessThan(Integer value) {
            addCriterion("adtype <", value, "adtype");
            return (Criteria) this;
        }

        public Criteria andAdtypeLessThanOrEqualTo(Integer value) {
            addCriterion("adtype <=", value, "adtype");
            return (Criteria) this;
        }

        public Criteria andAdtypeIn(List<Integer> values) {
            addCriterion("adtype in", values, "adtype");
            return (Criteria) this;
        }

        public Criteria andAdtypeNotIn(List<Integer> values) {
            addCriterion("adtype not in", values, "adtype");
            return (Criteria) this;
        }

        public Criteria andAdtypeBetween(Integer value1, Integer value2) {
            addCriterion("adtype between", value1, value2, "adtype");
            return (Criteria) this;
        }

        public Criteria andAdtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("adtype not between", value1, value2, "adtype");
            return (Criteria) this;
        }

        public Criteria andAdlinkIsNull() {
            addCriterion("adlink is null");
            return (Criteria) this;
        }

        public Criteria andAdlinkIsNotNull() {
            addCriterion("adlink is not null");
            return (Criteria) this;
        }

        public Criteria andAdlinkEqualTo(String value) {
            addCriterion("adlink =", value, "adlink");
            return (Criteria) this;
        }

        public Criteria andAdlinkNotEqualTo(String value) {
            addCriterion("adlink <>", value, "adlink");
            return (Criteria) this;
        }

        public Criteria andAdlinkGreaterThan(String value) {
            addCriterion("adlink >", value, "adlink");
            return (Criteria) this;
        }

        public Criteria andAdlinkGreaterThanOrEqualTo(String value) {
            addCriterion("adlink >=", value, "adlink");
            return (Criteria) this;
        }

        public Criteria andAdlinkLessThan(String value) {
            addCriterion("adlink <", value, "adlink");
            return (Criteria) this;
        }

        public Criteria andAdlinkLessThanOrEqualTo(String value) {
            addCriterion("adlink <=", value, "adlink");
            return (Criteria) this;
        }

        public Criteria andAdlinkLike(String value) {
            addCriterion("adlink like", value, "adlink");
            return (Criteria) this;
        }

        public Criteria andAdlinkNotLike(String value) {
            addCriterion("adlink not like", value, "adlink");
            return (Criteria) this;
        }

        public Criteria andAdlinkIn(List<String> values) {
            addCriterion("adlink in", values, "adlink");
            return (Criteria) this;
        }

        public Criteria andAdlinkNotIn(List<String> values) {
            addCriterion("adlink not in", values, "adlink");
            return (Criteria) this;
        }

        public Criteria andAdlinkBetween(String value1, String value2) {
            addCriterion("adlink between", value1, value2, "adlink");
            return (Criteria) this;
        }

        public Criteria andAdlinkNotBetween(String value1, String value2) {
            addCriterion("adlink not between", value1, value2, "adlink");
            return (Criteria) this;
        }

        public Criteria andAdclickcountIsNull() {
            addCriterion("adclickcount is null");
            return (Criteria) this;
        }

        public Criteria andAdclickcountIsNotNull() {
            addCriterion("adclickcount is not null");
            return (Criteria) this;
        }

        public Criteria andAdclickcountEqualTo(Integer value) {
            addCriterion("adclickcount =", value, "adclickcount");
            return (Criteria) this;
        }

        public Criteria andAdclickcountNotEqualTo(Integer value) {
            addCriterion("adclickcount <>", value, "adclickcount");
            return (Criteria) this;
        }

        public Criteria andAdclickcountGreaterThan(Integer value) {
            addCriterion("adclickcount >", value, "adclickcount");
            return (Criteria) this;
        }

        public Criteria andAdclickcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("adclickcount >=", value, "adclickcount");
            return (Criteria) this;
        }

        public Criteria andAdclickcountLessThan(Integer value) {
            addCriterion("adclickcount <", value, "adclickcount");
            return (Criteria) this;
        }

        public Criteria andAdclickcountLessThanOrEqualTo(Integer value) {
            addCriterion("adclickcount <=", value, "adclickcount");
            return (Criteria) this;
        }

        public Criteria andAdclickcountIn(List<Integer> values) {
            addCriterion("adclickcount in", values, "adclickcount");
            return (Criteria) this;
        }

        public Criteria andAdclickcountNotIn(List<Integer> values) {
            addCriterion("adclickcount not in", values, "adclickcount");
            return (Criteria) this;
        }

        public Criteria andAdclickcountBetween(Integer value1, Integer value2) {
            addCriterion("adclickcount between", value1, value2, "adclickcount");
            return (Criteria) this;
        }

        public Criteria andAdclickcountNotBetween(Integer value1, Integer value2) {
            addCriterion("adclickcount not between", value1, value2, "adclickcount");
            return (Criteria) this;
        }

        public Criteria andAdbusinessIsNull() {
            addCriterion("adbusiness is null");
            return (Criteria) this;
        }

        public Criteria andAdbusinessIsNotNull() {
            addCriterion("adbusiness is not null");
            return (Criteria) this;
        }

        public Criteria andAdbusinessEqualTo(Integer value) {
            addCriterion("adbusiness =", value, "adbusiness");
            return (Criteria) this;
        }

        public Criteria andAdbusinessNotEqualTo(Integer value) {
            addCriterion("adbusiness <>", value, "adbusiness");
            return (Criteria) this;
        }

        public Criteria andAdbusinessGreaterThan(Integer value) {
            addCriterion("adbusiness >", value, "adbusiness");
            return (Criteria) this;
        }

        public Criteria andAdbusinessGreaterThanOrEqualTo(Integer value) {
            addCriterion("adbusiness >=", value, "adbusiness");
            return (Criteria) this;
        }

        public Criteria andAdbusinessLessThan(Integer value) {
            addCriterion("adbusiness <", value, "adbusiness");
            return (Criteria) this;
        }

        public Criteria andAdbusinessLessThanOrEqualTo(Integer value) {
            addCriterion("adbusiness <=", value, "adbusiness");
            return (Criteria) this;
        }

        public Criteria andAdbusinessIn(List<Integer> values) {
            addCriterion("adbusiness in", values, "adbusiness");
            return (Criteria) this;
        }

        public Criteria andAdbusinessNotIn(List<Integer> values) {
            addCriterion("adbusiness not in", values, "adbusiness");
            return (Criteria) this;
        }

        public Criteria andAdbusinessBetween(Integer value1, Integer value2) {
            addCriterion("adbusiness between", value1, value2, "adbusiness");
            return (Criteria) this;
        }

        public Criteria andAdbusinessNotBetween(Integer value1, Integer value2) {
            addCriterion("adbusiness not between", value1, value2, "adbusiness");
            return (Criteria) this;
        }

        public Criteria andAdphoneIsNull() {
            addCriterion("adphone is null");
            return (Criteria) this;
        }

        public Criteria andAdphoneIsNotNull() {
            addCriterion("adphone is not null");
            return (Criteria) this;
        }

        public Criteria andAdphoneEqualTo(String value) {
            addCriterion("adphone =", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneNotEqualTo(String value) {
            addCriterion("adphone <>", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneGreaterThan(String value) {
            addCriterion("adphone >", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneGreaterThanOrEqualTo(String value) {
            addCriterion("adphone >=", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneLessThan(String value) {
            addCriterion("adphone <", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneLessThanOrEqualTo(String value) {
            addCriterion("adphone <=", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneLike(String value) {
            addCriterion("adphone like", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneNotLike(String value) {
            addCriterion("adphone not like", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneIn(List<String> values) {
            addCriterion("adphone in", values, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneNotIn(List<String> values) {
            addCriterion("adphone not in", values, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneBetween(String value1, String value2) {
            addCriterion("adphone between", value1, value2, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneNotBetween(String value1, String value2) {
            addCriterion("adphone not between", value1, value2, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdvaliddateIsNull() {
            addCriterion("advaliddate is null");
            return (Criteria) this;
        }

        public Criteria andAdvaliddateIsNotNull() {
            addCriterion("advaliddate is not null");
            return (Criteria) this;
        }

        public Criteria andAdvaliddateEqualTo(String value) {
            addCriterion("advaliddate =", value, "advaliddate");
            return (Criteria) this;
        }

        public Criteria andAdvaliddateNotEqualTo(String value) {
            addCriterion("advaliddate <>", value, "advaliddate");
            return (Criteria) this;
        }

        public Criteria andAdvaliddateGreaterThan(String value) {
            addCriterion("advaliddate >", value, "advaliddate");
            return (Criteria) this;
        }

        public Criteria andAdvaliddateGreaterThanOrEqualTo(String value) {
            addCriterion("advaliddate >=", value, "advaliddate");
            return (Criteria) this;
        }

        public Criteria andAdvaliddateLessThan(String value) {
            addCriterion("advaliddate <", value, "advaliddate");
            return (Criteria) this;
        }

        public Criteria andAdvaliddateLessThanOrEqualTo(String value) {
            addCriterion("advaliddate <=", value, "advaliddate");
            return (Criteria) this;
        }

        public Criteria andAdvaliddateIn(List<String> values) {
            addCriterion("advaliddate in", values, "advaliddate");
            return (Criteria) this;
        }

        public Criteria andAdvaliddateNotIn(List<String> values) {
            addCriterion("advaliddate not in", values, "advaliddate");
            return (Criteria) this;
        }

        public Criteria andAdvaliddateBetween(String value1, String value2) {
            addCriterion("advaliddate between", value1, value2, "advaliddate");
            return (Criteria) this;
        }

        public Criteria andAdvaliddateNotBetween(String value1, String value2) {
            addCriterion("advaliddate not between", value1, value2, "advaliddate");
            return (Criteria) this;
        }

        public Criteria andAdvalidcountIsNull() {
            addCriterion("advalidcount is null");
            return (Criteria) this;
        }

        public Criteria andAdvalidcountIsNotNull() {
            addCriterion("advalidcount is not null");
            return (Criteria) this;
        }

        public Criteria andAdvalidcountEqualTo(Integer value) {
            addCriterion("advalidcount =", value, "advalidcount");
            return (Criteria) this;
        }

        public Criteria andAdvalidcountNotEqualTo(Integer value) {
            addCriterion("advalidcount <>", value, "advalidcount");
            return (Criteria) this;
        }

        public Criteria andAdvalidcountGreaterThan(Integer value) {
            addCriterion("advalidcount >", value, "advalidcount");
            return (Criteria) this;
        }

        public Criteria andAdvalidcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("advalidcount >=", value, "advalidcount");
            return (Criteria) this;
        }

        public Criteria andAdvalidcountLessThan(Integer value) {
            addCriterion("advalidcount <", value, "advalidcount");
            return (Criteria) this;
        }

        public Criteria andAdvalidcountLessThanOrEqualTo(Integer value) {
            addCriterion("advalidcount <=", value, "advalidcount");
            return (Criteria) this;
        }

        public Criteria andAdvalidcountIn(List<Integer> values) {
            addCriterion("advalidcount in", values, "advalidcount");
            return (Criteria) this;
        }

        public Criteria andAdvalidcountNotIn(List<Integer> values) {
            addCriterion("advalidcount not in", values, "advalidcount");
            return (Criteria) this;
        }

        public Criteria andAdvalidcountBetween(Integer value1, Integer value2) {
            addCriterion("advalidcount between", value1, value2, "advalidcount");
            return (Criteria) this;
        }

        public Criteria andAdvalidcountNotBetween(Integer value1, Integer value2) {
            addCriterion("advalidcount not between", value1, value2, "advalidcount");
            return (Criteria) this;
        }

        public Criteria andAdvalidtypeIsNull() {
            addCriterion("advalidtype is null");
            return (Criteria) this;
        }

        public Criteria andAdvalidtypeIsNotNull() {
            addCriterion("advalidtype is not null");
            return (Criteria) this;
        }

        public Criteria andAdvalidtypeEqualTo(Integer value) {
            addCriterion("advalidtype =", value, "advalidtype");
            return (Criteria) this;
        }

        public Criteria andAdvalidtypeNotEqualTo(Integer value) {
            addCriterion("advalidtype <>", value, "advalidtype");
            return (Criteria) this;
        }

        public Criteria andAdvalidtypeGreaterThan(Integer value) {
            addCriterion("advalidtype >", value, "advalidtype");
            return (Criteria) this;
        }

        public Criteria andAdvalidtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("advalidtype >=", value, "advalidtype");
            return (Criteria) this;
        }

        public Criteria andAdvalidtypeLessThan(Integer value) {
            addCriterion("advalidtype <", value, "advalidtype");
            return (Criteria) this;
        }

        public Criteria andAdvalidtypeLessThanOrEqualTo(Integer value) {
            addCriterion("advalidtype <=", value, "advalidtype");
            return (Criteria) this;
        }

        public Criteria andAdvalidtypeIn(List<Integer> values) {
            addCriterion("advalidtype in", values, "advalidtype");
            return (Criteria) this;
        }

        public Criteria andAdvalidtypeNotIn(List<Integer> values) {
            addCriterion("advalidtype not in", values, "advalidtype");
            return (Criteria) this;
        }

        public Criteria andAdvalidtypeBetween(Integer value1, Integer value2) {
            addCriterion("advalidtype between", value1, value2, "advalidtype");
            return (Criteria) this;
        }

        public Criteria andAdvalidtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("advalidtype not between", value1, value2, "advalidtype");
            return (Criteria) this;
        }

        public Criteria andAdstatusIsNull() {
            addCriterion("adstatus is null");
            return (Criteria) this;
        }

        public Criteria andAdstatusIsNotNull() {
            addCriterion("adstatus is not null");
            return (Criteria) this;
        }

        public Criteria andAdstatusEqualTo(Integer value) {
            addCriterion("adstatus =", value, "adstatus");
            return (Criteria) this;
        }

        public Criteria andAdstatusNotEqualTo(Integer value) {
            addCriterion("adstatus <>", value, "adstatus");
            return (Criteria) this;
        }

        public Criteria andAdstatusGreaterThan(Integer value) {
            addCriterion("adstatus >", value, "adstatus");
            return (Criteria) this;
        }

        public Criteria andAdstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("adstatus >=", value, "adstatus");
            return (Criteria) this;
        }

        public Criteria andAdstatusLessThan(Integer value) {
            addCriterion("adstatus <", value, "adstatus");
            return (Criteria) this;
        }

        public Criteria andAdstatusLessThanOrEqualTo(Integer value) {
            addCriterion("adstatus <=", value, "adstatus");
            return (Criteria) this;
        }

        public Criteria andAdstatusIn(List<Integer> values) {
            addCriterion("adstatus in", values, "adstatus");
            return (Criteria) this;
        }

        public Criteria andAdstatusNotIn(List<Integer> values) {
            addCriterion("adstatus not in", values, "adstatus");
            return (Criteria) this;
        }

        public Criteria andAdstatusBetween(Integer value1, Integer value2) {
            addCriterion("adstatus between", value1, value2, "adstatus");
            return (Criteria) this;
        }

        public Criteria andAdstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("adstatus not between", value1, value2, "adstatus");
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