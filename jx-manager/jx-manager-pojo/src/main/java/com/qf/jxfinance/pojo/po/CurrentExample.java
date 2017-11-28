package com.qf.jxfinance.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CurrentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CurrentExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFcIdIsNull() {
            addCriterion("fc_id is null");
            return (Criteria) this;
        }

        public Criteria andFcIdIsNotNull() {
            addCriterion("fc_id is not null");
            return (Criteria) this;
        }

        public Criteria andFcIdEqualTo(Long value) {
            addCriterion("fc_id =", value, "fcId");
            return (Criteria) this;
        }

        public Criteria andFcIdNotEqualTo(Long value) {
            addCriterion("fc_id <>", value, "fcId");
            return (Criteria) this;
        }

        public Criteria andFcIdGreaterThan(Long value) {
            addCriterion("fc_id >", value, "fcId");
            return (Criteria) this;
        }

        public Criteria andFcIdGreaterThanOrEqualTo(Long value) {
            addCriterion("fc_id >=", value, "fcId");
            return (Criteria) this;
        }

        public Criteria andFcIdLessThan(Long value) {
            addCriterion("fc_id <", value, "fcId");
            return (Criteria) this;
        }

        public Criteria andFcIdLessThanOrEqualTo(Long value) {
            addCriterion("fc_id <=", value, "fcId");
            return (Criteria) this;
        }

        public Criteria andFcIdIn(List<Long> values) {
            addCriterion("fc_id in", values, "fcId");
            return (Criteria) this;
        }

        public Criteria andFcIdNotIn(List<Long> values) {
            addCriterion("fc_id not in", values, "fcId");
            return (Criteria) this;
        }

        public Criteria andFcIdBetween(Long value1, Long value2) {
            addCriterion("fc_id between", value1, value2, "fcId");
            return (Criteria) this;
        }

        public Criteria andFcIdNotBetween(Long value1, Long value2) {
            addCriterion("fc_id not between", value1, value2, "fcId");
            return (Criteria) this;
        }

        public Criteria andRiskIsNull() {
            addCriterion("risk is null");
            return (Criteria) this;
        }

        public Criteria andRiskIsNotNull() {
            addCriterion("risk is not null");
            return (Criteria) this;
        }

        public Criteria andRiskEqualTo(Integer value) {
            addCriterion("risk =", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskNotEqualTo(Integer value) {
            addCriterion("risk <>", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskGreaterThan(Integer value) {
            addCriterion("risk >", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskGreaterThanOrEqualTo(Integer value) {
            addCriterion("risk >=", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskLessThan(Integer value) {
            addCriterion("risk <", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskLessThanOrEqualTo(Integer value) {
            addCriterion("risk <=", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskIn(List<Integer> values) {
            addCriterion("risk in", values, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskNotIn(List<Integer> values) {
            addCriterion("risk not in", values, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskBetween(Integer value1, Integer value2) {
            addCriterion("risk between", value1, value2, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskNotBetween(Integer value1, Integer value2) {
            addCriterion("risk not between", value1, value2, "risk");
            return (Criteria) this;
        }

        public Criteria andNavIsNull() {
            addCriterion("nav is null");
            return (Criteria) this;
        }

        public Criteria andNavIsNotNull() {
            addCriterion("nav is not null");
            return (Criteria) this;
        }

        public Criteria andNavEqualTo(Integer value) {
            addCriterion("nav =", value, "nav");
            return (Criteria) this;
        }

        public Criteria andNavNotEqualTo(Integer value) {
            addCriterion("nav <>", value, "nav");
            return (Criteria) this;
        }

        public Criteria andNavGreaterThan(Integer value) {
            addCriterion("nav >", value, "nav");
            return (Criteria) this;
        }

        public Criteria andNavGreaterThanOrEqualTo(Integer value) {
            addCriterion("nav >=", value, "nav");
            return (Criteria) this;
        }

        public Criteria andNavLessThan(Integer value) {
            addCriterion("nav <", value, "nav");
            return (Criteria) this;
        }

        public Criteria andNavLessThanOrEqualTo(Integer value) {
            addCriterion("nav <=", value, "nav");
            return (Criteria) this;
        }

        public Criteria andNavIn(List<Integer> values) {
            addCriterion("nav in", values, "nav");
            return (Criteria) this;
        }

        public Criteria andNavNotIn(List<Integer> values) {
            addCriterion("nav not in", values, "nav");
            return (Criteria) this;
        }

        public Criteria andNavBetween(Integer value1, Integer value2) {
            addCriterion("nav between", value1, value2, "nav");
            return (Criteria) this;
        }

        public Criteria andNavNotBetween(Integer value1, Integer value2) {
            addCriterion("nav not between", value1, value2, "nav");
            return (Criteria) this;
        }

        public Criteria andThreeRateIsNull() {
            addCriterion("three_rate is null");
            return (Criteria) this;
        }

        public Criteria andThreeRateIsNotNull() {
            addCriterion("three_rate is not null");
            return (Criteria) this;
        }

        public Criteria andThreeRateEqualTo(Integer value) {
            addCriterion("three_rate =", value, "threeRate");
            return (Criteria) this;
        }

        public Criteria andThreeRateNotEqualTo(Integer value) {
            addCriterion("three_rate <>", value, "threeRate");
            return (Criteria) this;
        }

        public Criteria andThreeRateGreaterThan(Integer value) {
            addCriterion("three_rate >", value, "threeRate");
            return (Criteria) this;
        }

        public Criteria andThreeRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("three_rate >=", value, "threeRate");
            return (Criteria) this;
        }

        public Criteria andThreeRateLessThan(Integer value) {
            addCriterion("three_rate <", value, "threeRate");
            return (Criteria) this;
        }

        public Criteria andThreeRateLessThanOrEqualTo(Integer value) {
            addCriterion("three_rate <=", value, "threeRate");
            return (Criteria) this;
        }

        public Criteria andThreeRateIn(List<Integer> values) {
            addCriterion("three_rate in", values, "threeRate");
            return (Criteria) this;
        }

        public Criteria andThreeRateNotIn(List<Integer> values) {
            addCriterion("three_rate not in", values, "threeRate");
            return (Criteria) this;
        }

        public Criteria andThreeRateBetween(Integer value1, Integer value2) {
            addCriterion("three_rate between", value1, value2, "threeRate");
            return (Criteria) this;
        }

        public Criteria andThreeRateNotBetween(Integer value1, Integer value2) {
            addCriterion("three_rate not between", value1, value2, "threeRate");
            return (Criteria) this;
        }

        public Criteria andRedempTimeIsNull() {
            addCriterion("redemp_time is null");
            return (Criteria) this;
        }

        public Criteria andRedempTimeIsNotNull() {
            addCriterion("redemp_time is not null");
            return (Criteria) this;
        }

        public Criteria andRedempTimeEqualTo(Integer value) {
            addCriterion("redemp_time =", value, "redempTime");
            return (Criteria) this;
        }

        public Criteria andRedempTimeNotEqualTo(Integer value) {
            addCriterion("redemp_time <>", value, "redempTime");
            return (Criteria) this;
        }

        public Criteria andRedempTimeGreaterThan(Integer value) {
            addCriterion("redemp_time >", value, "redempTime");
            return (Criteria) this;
        }

        public Criteria andRedempTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("redemp_time >=", value, "redempTime");
            return (Criteria) this;
        }

        public Criteria andRedempTimeLessThan(Integer value) {
            addCriterion("redemp_time <", value, "redempTime");
            return (Criteria) this;
        }

        public Criteria andRedempTimeLessThanOrEqualTo(Integer value) {
            addCriterion("redemp_time <=", value, "redempTime");
            return (Criteria) this;
        }

        public Criteria andRedempTimeIn(List<Integer> values) {
            addCriterion("redemp_time in", values, "redempTime");
            return (Criteria) this;
        }

        public Criteria andRedempTimeNotIn(List<Integer> values) {
            addCriterion("redemp_time not in", values, "redempTime");
            return (Criteria) this;
        }

        public Criteria andRedempTimeBetween(Integer value1, Integer value2) {
            addCriterion("redemp_time between", value1, value2, "redempTime");
            return (Criteria) this;
        }

        public Criteria andRedempTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("redemp_time not between", value1, value2, "redempTime");
            return (Criteria) this;
        }

        public Criteria andNearYearIsNull() {
            addCriterion("near_year is null");
            return (Criteria) this;
        }

        public Criteria andNearYearIsNotNull() {
            addCriterion("near_year is not null");
            return (Criteria) this;
        }

        public Criteria andNearYearEqualTo(Integer value) {
            addCriterion("near_year =", value, "nearYear");
            return (Criteria) this;
        }

        public Criteria andNearYearNotEqualTo(Integer value) {
            addCriterion("near_year <>", value, "nearYear");
            return (Criteria) this;
        }

        public Criteria andNearYearGreaterThan(Integer value) {
            addCriterion("near_year >", value, "nearYear");
            return (Criteria) this;
        }

        public Criteria andNearYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("near_year >=", value, "nearYear");
            return (Criteria) this;
        }

        public Criteria andNearYearLessThan(Integer value) {
            addCriterion("near_year <", value, "nearYear");
            return (Criteria) this;
        }

        public Criteria andNearYearLessThanOrEqualTo(Integer value) {
            addCriterion("near_year <=", value, "nearYear");
            return (Criteria) this;
        }

        public Criteria andNearYearIn(List<Integer> values) {
            addCriterion("near_year in", values, "nearYear");
            return (Criteria) this;
        }

        public Criteria andNearYearNotIn(List<Integer> values) {
            addCriterion("near_year not in", values, "nearYear");
            return (Criteria) this;
        }

        public Criteria andNearYearBetween(Integer value1, Integer value2) {
            addCriterion("near_year between", value1, value2, "nearYear");
            return (Criteria) this;
        }

        public Criteria andNearYearNotBetween(Integer value1, Integer value2) {
            addCriterion("near_year not between", value1, value2, "nearYear");
            return (Criteria) this;
        }

        public Criteria andInitAmountIsNull() {
            addCriterion("init_amount is null");
            return (Criteria) this;
        }

        public Criteria andInitAmountIsNotNull() {
            addCriterion("init_amount is not null");
            return (Criteria) this;
        }

        public Criteria andInitAmountEqualTo(Integer value) {
            addCriterion("init_amount =", value, "initAmount");
            return (Criteria) this;
        }

        public Criteria andInitAmountNotEqualTo(Integer value) {
            addCriterion("init_amount <>", value, "initAmount");
            return (Criteria) this;
        }

        public Criteria andInitAmountGreaterThan(Integer value) {
            addCriterion("init_amount >", value, "initAmount");
            return (Criteria) this;
        }

        public Criteria andInitAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("init_amount >=", value, "initAmount");
            return (Criteria) this;
        }

        public Criteria andInitAmountLessThan(Integer value) {
            addCriterion("init_amount <", value, "initAmount");
            return (Criteria) this;
        }

        public Criteria andInitAmountLessThanOrEqualTo(Integer value) {
            addCriterion("init_amount <=", value, "initAmount");
            return (Criteria) this;
        }

        public Criteria andInitAmountIn(List<Integer> values) {
            addCriterion("init_amount in", values, "initAmount");
            return (Criteria) this;
        }

        public Criteria andInitAmountNotIn(List<Integer> values) {
            addCriterion("init_amount not in", values, "initAmount");
            return (Criteria) this;
        }

        public Criteria andInitAmountBetween(Integer value1, Integer value2) {
            addCriterion("init_amount between", value1, value2, "initAmount");
            return (Criteria) this;
        }

        public Criteria andInitAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("init_amount not between", value1, value2, "initAmount");
            return (Criteria) this;
        }

        public Criteria andSetTimeIsNull() {
            addCriterion("set_time is null");
            return (Criteria) this;
        }

        public Criteria andSetTimeIsNotNull() {
            addCriterion("set_time is not null");
            return (Criteria) this;
        }

        public Criteria andSetTimeEqualTo(Date value) {
            addCriterion("set_time =", value, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeNotEqualTo(Date value) {
            addCriterion("set_time <>", value, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeGreaterThan(Date value) {
            addCriterion("set_time >", value, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("set_time >=", value, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeLessThan(Date value) {
            addCriterion("set_time <", value, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeLessThanOrEqualTo(Date value) {
            addCriterion("set_time <=", value, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeIn(List<Date> values) {
            addCriterion("set_time in", values, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeNotIn(List<Date> values) {
            addCriterion("set_time not in", values, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeBetween(Date value1, Date value2) {
            addCriterion("set_time between", value1, value2, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeNotBetween(Date value1, Date value2) {
            addCriterion("set_time not between", value1, value2, "setTime");
            return (Criteria) this;
        }

        public Criteria andNewScaleIsNull() {
            addCriterion("new_scale is null");
            return (Criteria) this;
        }

        public Criteria andNewScaleIsNotNull() {
            addCriterion("new_scale is not null");
            return (Criteria) this;
        }

        public Criteria andNewScaleEqualTo(String value) {
            addCriterion("new_scale =", value, "newScale");
            return (Criteria) this;
        }

        public Criteria andNewScaleNotEqualTo(String value) {
            addCriterion("new_scale <>", value, "newScale");
            return (Criteria) this;
        }

        public Criteria andNewScaleGreaterThan(String value) {
            addCriterion("new_scale >", value, "newScale");
            return (Criteria) this;
        }

        public Criteria andNewScaleGreaterThanOrEqualTo(String value) {
            addCriterion("new_scale >=", value, "newScale");
            return (Criteria) this;
        }

        public Criteria andNewScaleLessThan(String value) {
            addCriterion("new_scale <", value, "newScale");
            return (Criteria) this;
        }

        public Criteria andNewScaleLessThanOrEqualTo(String value) {
            addCriterion("new_scale <=", value, "newScale");
            return (Criteria) this;
        }

        public Criteria andNewScaleLike(String value) {
            addCriterion("new_scale like", value, "newScale");
            return (Criteria) this;
        }

        public Criteria andNewScaleNotLike(String value) {
            addCriterion("new_scale not like", value, "newScale");
            return (Criteria) this;
        }

        public Criteria andNewScaleIn(List<String> values) {
            addCriterion("new_scale in", values, "newScale");
            return (Criteria) this;
        }

        public Criteria andNewScaleNotIn(List<String> values) {
            addCriterion("new_scale not in", values, "newScale");
            return (Criteria) this;
        }

        public Criteria andNewScaleBetween(String value1, String value2) {
            addCriterion("new_scale between", value1, value2, "newScale");
            return (Criteria) this;
        }

        public Criteria andNewScaleNotBetween(String value1, String value2) {
            addCriterion("new_scale not between", value1, value2, "newScale");
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

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
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