package com.qf.jxfinance.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class FixedtimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FixedtimeExample() {
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

        public Criteria andComidIsNull() {
            addCriterion("comid is null");
            return (Criteria) this;
        }

        public Criteria andComidIsNotNull() {
            addCriterion("comid is not null");
            return (Criteria) this;
        }

        public Criteria andComidEqualTo(Long value) {
            addCriterion("comid =", value, "comid");
            return (Criteria) this;
        }

        public Criteria andComidNotEqualTo(Long value) {
            addCriterion("comid <>", value, "comid");
            return (Criteria) this;
        }

        public Criteria andComidGreaterThan(Long value) {
            addCriterion("comid >", value, "comid");
            return (Criteria) this;
        }

        public Criteria andComidGreaterThanOrEqualTo(Long value) {
            addCriterion("comid >=", value, "comid");
            return (Criteria) this;
        }

        public Criteria andComidLessThan(Long value) {
            addCriterion("comid <", value, "comid");
            return (Criteria) this;
        }

        public Criteria andComidLessThanOrEqualTo(Long value) {
            addCriterion("comid <=", value, "comid");
            return (Criteria) this;
        }

        public Criteria andComidIn(List<Long> values) {
            addCriterion("comid in", values, "comid");
            return (Criteria) this;
        }

        public Criteria andComidNotIn(List<Long> values) {
            addCriterion("comid not in", values, "comid");
            return (Criteria) this;
        }

        public Criteria andComidBetween(Long value1, Long value2) {
            addCriterion("comid between", value1, value2, "comid");
            return (Criteria) this;
        }

        public Criteria andComidNotBetween(Long value1, Long value2) {
            addCriterion("comid not between", value1, value2, "comid");
            return (Criteria) this;
        }

        public Criteria andSevenEarningsIsNull() {
            addCriterion("seven_earnings is null");
            return (Criteria) this;
        }

        public Criteria andSevenEarningsIsNotNull() {
            addCriterion("seven_earnings is not null");
            return (Criteria) this;
        }

        public Criteria andSevenEarningsEqualTo(Integer value) {
            addCriterion("seven_earnings =", value, "sevenEarnings");
            return (Criteria) this;
        }

        public Criteria andSevenEarningsNotEqualTo(Integer value) {
            addCriterion("seven_earnings <>", value, "sevenEarnings");
            return (Criteria) this;
        }

        public Criteria andSevenEarningsGreaterThan(Integer value) {
            addCriterion("seven_earnings >", value, "sevenEarnings");
            return (Criteria) this;
        }

        public Criteria andSevenEarningsGreaterThanOrEqualTo(Integer value) {
            addCriterion("seven_earnings >=", value, "sevenEarnings");
            return (Criteria) this;
        }

        public Criteria andSevenEarningsLessThan(Integer value) {
            addCriterion("seven_earnings <", value, "sevenEarnings");
            return (Criteria) this;
        }

        public Criteria andSevenEarningsLessThanOrEqualTo(Integer value) {
            addCriterion("seven_earnings <=", value, "sevenEarnings");
            return (Criteria) this;
        }

        public Criteria andSevenEarningsIn(List<Integer> values) {
            addCriterion("seven_earnings in", values, "sevenEarnings");
            return (Criteria) this;
        }

        public Criteria andSevenEarningsNotIn(List<Integer> values) {
            addCriterion("seven_earnings not in", values, "sevenEarnings");
            return (Criteria) this;
        }

        public Criteria andSevenEarningsBetween(Integer value1, Integer value2) {
            addCriterion("seven_earnings between", value1, value2, "sevenEarnings");
            return (Criteria) this;
        }

        public Criteria andSevenEarningsNotBetween(Integer value1, Integer value2) {
            addCriterion("seven_earnings not between", value1, value2, "sevenEarnings");
            return (Criteria) this;
        }

        public Criteria andCopiesIsNull() {
            addCriterion("copies is null");
            return (Criteria) this;
        }

        public Criteria andCopiesIsNotNull() {
            addCriterion("copies is not null");
            return (Criteria) this;
        }

        public Criteria andCopiesEqualTo(Integer value) {
            addCriterion("copies =", value, "copies");
            return (Criteria) this;
        }

        public Criteria andCopiesNotEqualTo(Integer value) {
            addCriterion("copies <>", value, "copies");
            return (Criteria) this;
        }

        public Criteria andCopiesGreaterThan(Integer value) {
            addCriterion("copies >", value, "copies");
            return (Criteria) this;
        }

        public Criteria andCopiesGreaterThanOrEqualTo(Integer value) {
            addCriterion("copies >=", value, "copies");
            return (Criteria) this;
        }

        public Criteria andCopiesLessThan(Integer value) {
            addCriterion("copies <", value, "copies");
            return (Criteria) this;
        }

        public Criteria andCopiesLessThanOrEqualTo(Integer value) {
            addCriterion("copies <=", value, "copies");
            return (Criteria) this;
        }

        public Criteria andCopiesIn(List<Integer> values) {
            addCriterion("copies in", values, "copies");
            return (Criteria) this;
        }

        public Criteria andCopiesNotIn(List<Integer> values) {
            addCriterion("copies not in", values, "copies");
            return (Criteria) this;
        }

        public Criteria andCopiesBetween(Integer value1, Integer value2) {
            addCriterion("copies between", value1, value2, "copies");
            return (Criteria) this;
        }

        public Criteria andCopiesNotBetween(Integer value1, Integer value2) {
            addCriterion("copies not between", value1, value2, "copies");
            return (Criteria) this;
        }

        public Criteria andPeriodCycleIsNull() {
            addCriterion("period_cycle is null");
            return (Criteria) this;
        }

        public Criteria andPeriodCycleIsNotNull() {
            addCriterion("period_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodCycleEqualTo(Integer value) {
            addCriterion("period_cycle =", value, "periodCycle");
            return (Criteria) this;
        }

        public Criteria andPeriodCycleNotEqualTo(Integer value) {
            addCriterion("period_cycle <>", value, "periodCycle");
            return (Criteria) this;
        }

        public Criteria andPeriodCycleGreaterThan(Integer value) {
            addCriterion("period_cycle >", value, "periodCycle");
            return (Criteria) this;
        }

        public Criteria andPeriodCycleGreaterThanOrEqualTo(Integer value) {
            addCriterion("period_cycle >=", value, "periodCycle");
            return (Criteria) this;
        }

        public Criteria andPeriodCycleLessThan(Integer value) {
            addCriterion("period_cycle <", value, "periodCycle");
            return (Criteria) this;
        }

        public Criteria andPeriodCycleLessThanOrEqualTo(Integer value) {
            addCriterion("period_cycle <=", value, "periodCycle");
            return (Criteria) this;
        }

        public Criteria andPeriodCycleIn(List<Integer> values) {
            addCriterion("period_cycle in", values, "periodCycle");
            return (Criteria) this;
        }

        public Criteria andPeriodCycleNotIn(List<Integer> values) {
            addCriterion("period_cycle not in", values, "periodCycle");
            return (Criteria) this;
        }

        public Criteria andPeriodCycleBetween(Integer value1, Integer value2) {
            addCriterion("period_cycle between", value1, value2, "periodCycle");
            return (Criteria) this;
        }

        public Criteria andPeriodCycleNotBetween(Integer value1, Integer value2) {
            addCriterion("period_cycle not between", value1, value2, "periodCycle");
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