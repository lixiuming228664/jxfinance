package com.qf.jxfinance.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class UserProfitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserProfitExample() {
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

        public Criteria andTodayTermDepositsProfitIsNull() {
            addCriterion("today_term_deposits_profit is null");
            return (Criteria) this;
        }

        public Criteria andTodayTermDepositsProfitIsNotNull() {
            addCriterion("today_term_deposits_profit is not null");
            return (Criteria) this;
        }

        public Criteria andTodayTermDepositsProfitEqualTo(Integer value) {
            addCriterion("today_term_deposits_profit =", value, "todayTermDepositsProfit");
            return (Criteria) this;
        }

        public Criteria andTodayTermDepositsProfitNotEqualTo(Integer value) {
            addCriterion("today_term_deposits_profit <>", value, "todayTermDepositsProfit");
            return (Criteria) this;
        }

        public Criteria andTodayTermDepositsProfitGreaterThan(Integer value) {
            addCriterion("today_term_deposits_profit >", value, "todayTermDepositsProfit");
            return (Criteria) this;
        }

        public Criteria andTodayTermDepositsProfitGreaterThanOrEqualTo(Integer value) {
            addCriterion("today_term_deposits_profit >=", value, "todayTermDepositsProfit");
            return (Criteria) this;
        }

        public Criteria andTodayTermDepositsProfitLessThan(Integer value) {
            addCriterion("today_term_deposits_profit <", value, "todayTermDepositsProfit");
            return (Criteria) this;
        }

        public Criteria andTodayTermDepositsProfitLessThanOrEqualTo(Integer value) {
            addCriterion("today_term_deposits_profit <=", value, "todayTermDepositsProfit");
            return (Criteria) this;
        }

        public Criteria andTodayTermDepositsProfitIn(List<Integer> values) {
            addCriterion("today_term_deposits_profit in", values, "todayTermDepositsProfit");
            return (Criteria) this;
        }

        public Criteria andTodayTermDepositsProfitNotIn(List<Integer> values) {
            addCriterion("today_term_deposits_profit not in", values, "todayTermDepositsProfit");
            return (Criteria) this;
        }

        public Criteria andTodayTermDepositsProfitBetween(Integer value1, Integer value2) {
            addCriterion("today_term_deposits_profit between", value1, value2, "todayTermDepositsProfit");
            return (Criteria) this;
        }

        public Criteria andTodayTermDepositsProfitNotBetween(Integer value1, Integer value2) {
            addCriterion("today_term_deposits_profit not between", value1, value2, "todayTermDepositsProfit");
            return (Criteria) this;
        }

        public Criteria andTodayFundProfitIsNull() {
            addCriterion("today_Fund_profit is null");
            return (Criteria) this;
        }

        public Criteria andTodayFundProfitIsNotNull() {
            addCriterion("today_Fund_profit is not null");
            return (Criteria) this;
        }

        public Criteria andTodayFundProfitEqualTo(Integer value) {
            addCriterion("today_Fund_profit =", value, "todayFundProfit");
            return (Criteria) this;
        }

        public Criteria andTodayFundProfitNotEqualTo(Integer value) {
            addCriterion("today_Fund_profit <>", value, "todayFundProfit");
            return (Criteria) this;
        }

        public Criteria andTodayFundProfitGreaterThan(Integer value) {
            addCriterion("today_Fund_profit >", value, "todayFundProfit");
            return (Criteria) this;
        }

        public Criteria andTodayFundProfitGreaterThanOrEqualTo(Integer value) {
            addCriterion("today_Fund_profit >=", value, "todayFundProfit");
            return (Criteria) this;
        }

        public Criteria andTodayFundProfitLessThan(Integer value) {
            addCriterion("today_Fund_profit <", value, "todayFundProfit");
            return (Criteria) this;
        }

        public Criteria andTodayFundProfitLessThanOrEqualTo(Integer value) {
            addCriterion("today_Fund_profit <=", value, "todayFundProfit");
            return (Criteria) this;
        }

        public Criteria andTodayFundProfitIn(List<Integer> values) {
            addCriterion("today_Fund_profit in", values, "todayFundProfit");
            return (Criteria) this;
        }

        public Criteria andTodayFundProfitNotIn(List<Integer> values) {
            addCriterion("today_Fund_profit not in", values, "todayFundProfit");
            return (Criteria) this;
        }

        public Criteria andTodayFundProfitBetween(Integer value1, Integer value2) {
            addCriterion("today_Fund_profit between", value1, value2, "todayFundProfit");
            return (Criteria) this;
        }

        public Criteria andTodayFundProfitNotBetween(Integer value1, Integer value2) {
            addCriterion("today_Fund_profit not between", value1, value2, "todayFundProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitIsNull() {
            addCriterion("total_profit is null");
            return (Criteria) this;
        }

        public Criteria andTotalProfitIsNotNull() {
            addCriterion("total_profit is not null");
            return (Criteria) this;
        }

        public Criteria andTotalProfitEqualTo(Integer value) {
            addCriterion("total_profit =", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitNotEqualTo(Integer value) {
            addCriterion("total_profit <>", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitGreaterThan(Integer value) {
            addCriterion("total_profit >", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_profit >=", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitLessThan(Integer value) {
            addCriterion("total_profit <", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitLessThanOrEqualTo(Integer value) {
            addCriterion("total_profit <=", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitIn(List<Integer> values) {
            addCriterion("total_profit in", values, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitNotIn(List<Integer> values) {
            addCriterion("total_profit not in", values, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitBetween(Integer value1, Integer value2) {
            addCriterion("total_profit between", value1, value2, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitNotBetween(Integer value1, Integer value2) {
            addCriterion("total_profit not between", value1, value2, "totalProfit");
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