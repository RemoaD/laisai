package com.tata.application.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApplicationVOExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ApplicationVOExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria implements Serializable {
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

        public Criteria andApplicationidIsNull() {
            addCriterion("applicationid is null");
            return (Criteria) this;
        }

        public Criteria andApplicationidIsNotNull() {
            addCriterion("applicationid is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationidEqualTo(Integer value) {
            addCriterion("applicationid =", value, "applicationid");
            return (Criteria) this;
        }

        public Criteria andApplicationidNotEqualTo(Integer value) {
            addCriterion("applicationid <>", value, "applicationid");
            return (Criteria) this;
        }

        public Criteria andApplicationidGreaterThan(Integer value) {
            addCriterion("applicationid >", value, "applicationid");
            return (Criteria) this;
        }

        public Criteria andApplicationidGreaterThanOrEqualTo(Integer value) {
            addCriterion("applicationid >=", value, "applicationid");
            return (Criteria) this;
        }

        public Criteria andApplicationidLessThan(Integer value) {
            addCriterion("applicationid <", value, "applicationid");
            return (Criteria) this;
        }

        public Criteria andApplicationidLessThanOrEqualTo(Integer value) {
            addCriterion("applicationid <=", value, "applicationid");
            return (Criteria) this;
        }

        public Criteria andApplicationidIn(List<Integer> values) {
            addCriterion("applicationid in", values, "applicationid");
            return (Criteria) this;
        }

        public Criteria andApplicationidNotIn(List<Integer> values) {
            addCriterion("applicationid not in", values, "applicationid");
            return (Criteria) this;
        }

        public Criteria andApplicationidBetween(Integer value1, Integer value2) {
            addCriterion("applicationid between", value1, value2, "applicationid");
            return (Criteria) this;
        }

        public Criteria andApplicationidNotBetween(Integer value1, Integer value2) {
            addCriterion("applicationid not between", value1, value2, "applicationid");
            return (Criteria) this;
        }

        public Criteria andSendapplicationidIsNull() {
            addCriterion("sendapplicationid is null");
            return (Criteria) this;
        }

        public Criteria andSendapplicationidIsNotNull() {
            addCriterion("sendapplicationid is not null");
            return (Criteria) this;
        }

        public Criteria andSendapplicationidEqualTo(Integer value) {
            addCriterion("sendapplicationid =", value, "sendapplicationid");
            return (Criteria) this;
        }

        public Criteria andSendapplicationidNotEqualTo(Integer value) {
            addCriterion("sendapplicationid <>", value, "sendapplicationid");
            return (Criteria) this;
        }

        public Criteria andSendapplicationidGreaterThan(Integer value) {
            addCriterion("sendapplicationid >", value, "sendapplicationid");
            return (Criteria) this;
        }

        public Criteria andSendapplicationidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sendapplicationid >=", value, "sendapplicationid");
            return (Criteria) this;
        }

        public Criteria andSendapplicationidLessThan(Integer value) {
            addCriterion("sendapplicationid <", value, "sendapplicationid");
            return (Criteria) this;
        }

        public Criteria andSendapplicationidLessThanOrEqualTo(Integer value) {
            addCriterion("sendapplicationid <=", value, "sendapplicationid");
            return (Criteria) this;
        }

        public Criteria andSendapplicationidIn(List<Integer> values) {
            addCriterion("sendapplicationid in", values, "sendapplicationid");
            return (Criteria) this;
        }

        public Criteria andSendapplicationidNotIn(List<Integer> values) {
            addCriterion("sendapplicationid not in", values, "sendapplicationid");
            return (Criteria) this;
        }

        public Criteria andSendapplicationidBetween(Integer value1, Integer value2) {
            addCriterion("sendapplicationid between", value1, value2, "sendapplicationid");
            return (Criteria) this;
        }

        public Criteria andSendapplicationidNotBetween(Integer value1, Integer value2) {
            addCriterion("sendapplicationid not between", value1, value2, "sendapplicationid");
            return (Criteria) this;
        }

        public Criteria andFirstmemberidIsNull() {
            addCriterion("firstmemberid is null");
            return (Criteria) this;
        }

        public Criteria andFirstmemberidIsNotNull() {
            addCriterion("firstmemberid is not null");
            return (Criteria) this;
        }

        public Criteria andFirstmemberidEqualTo(Integer value) {
            addCriterion("firstmemberid =", value, "firstmemberid");
            return (Criteria) this;
        }

        public Criteria andFirstmemberidNotEqualTo(Integer value) {
            addCriterion("firstmemberid <>", value, "firstmemberid");
            return (Criteria) this;
        }

        public Criteria andFirstmemberidGreaterThan(Integer value) {
            addCriterion("firstmemberid >", value, "firstmemberid");
            return (Criteria) this;
        }

        public Criteria andFirstmemberidGreaterThanOrEqualTo(Integer value) {
            addCriterion("firstmemberid >=", value, "firstmemberid");
            return (Criteria) this;
        }

        public Criteria andFirstmemberidLessThan(Integer value) {
            addCriterion("firstmemberid <", value, "firstmemberid");
            return (Criteria) this;
        }

        public Criteria andFirstmemberidLessThanOrEqualTo(Integer value) {
            addCriterion("firstmemberid <=", value, "firstmemberid");
            return (Criteria) this;
        }

        public Criteria andFirstmemberidIn(List<Integer> values) {
            addCriterion("firstmemberid in", values, "firstmemberid");
            return (Criteria) this;
        }

        public Criteria andFirstmemberidNotIn(List<Integer> values) {
            addCriterion("firstmemberid not in", values, "firstmemberid");
            return (Criteria) this;
        }

        public Criteria andFirstmemberidBetween(Integer value1, Integer value2) {
            addCriterion("firstmemberid between", value1, value2, "firstmemberid");
            return (Criteria) this;
        }

        public Criteria andFirstmemberidNotBetween(Integer value1, Integer value2) {
            addCriterion("firstmemberid not between", value1, value2, "firstmemberid");
            return (Criteria) this;
        }

        public Criteria andSecondmemberidIsNull() {
            addCriterion("secondmemberid is null");
            return (Criteria) this;
        }

        public Criteria andSecondmemberidIsNotNull() {
            addCriterion("secondmemberid is not null");
            return (Criteria) this;
        }

        public Criteria andSecondmemberidEqualTo(Integer value) {
            addCriterion("secondmemberid =", value, "secondmemberid");
            return (Criteria) this;
        }

        public Criteria andSecondmemberidNotEqualTo(Integer value) {
            addCriterion("secondmemberid <>", value, "secondmemberid");
            return (Criteria) this;
        }

        public Criteria andSecondmemberidGreaterThan(Integer value) {
            addCriterion("secondmemberid >", value, "secondmemberid");
            return (Criteria) this;
        }

        public Criteria andSecondmemberidGreaterThanOrEqualTo(Integer value) {
            addCriterion("secondmemberid >=", value, "secondmemberid");
            return (Criteria) this;
        }

        public Criteria andSecondmemberidLessThan(Integer value) {
            addCriterion("secondmemberid <", value, "secondmemberid");
            return (Criteria) this;
        }

        public Criteria andSecondmemberidLessThanOrEqualTo(Integer value) {
            addCriterion("secondmemberid <=", value, "secondmemberid");
            return (Criteria) this;
        }

        public Criteria andSecondmemberidIn(List<Integer> values) {
            addCriterion("secondmemberid in", values, "secondmemberid");
            return (Criteria) this;
        }

        public Criteria andSecondmemberidNotIn(List<Integer> values) {
            addCriterion("secondmemberid not in", values, "secondmemberid");
            return (Criteria) this;
        }

        public Criteria andSecondmemberidBetween(Integer value1, Integer value2) {
            addCriterion("secondmemberid between", value1, value2, "secondmemberid");
            return (Criteria) this;
        }

        public Criteria andSecondmemberidNotBetween(Integer value1, Integer value2) {
            addCriterion("secondmemberid not between", value1, value2, "secondmemberid");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
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