package com.tata.invitation.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InvitationVOExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public InvitationVOExample() {
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

        public Criteria andInvitationidIsNull() {
            addCriterion("invitationid is null");
            return (Criteria) this;
        }

        public Criteria andInvitationidIsNotNull() {
            addCriterion("invitationid is not null");
            return (Criteria) this;
        }

        public Criteria andInvitationidEqualTo(Integer value) {
            addCriterion("invitationid =", value, "invitationid");
            return (Criteria) this;
        }

        public Criteria andInvitationidNotEqualTo(Integer value) {
            addCriterion("invitationid <>", value, "invitationid");
            return (Criteria) this;
        }

        public Criteria andInvitationidGreaterThan(Integer value) {
            addCriterion("invitationid >", value, "invitationid");
            return (Criteria) this;
        }

        public Criteria andInvitationidGreaterThanOrEqualTo(Integer value) {
            addCriterion("invitationid >=", value, "invitationid");
            return (Criteria) this;
        }

        public Criteria andInvitationidLessThan(Integer value) {
            addCriterion("invitationid <", value, "invitationid");
            return (Criteria) this;
        }

        public Criteria andInvitationidLessThanOrEqualTo(Integer value) {
            addCriterion("invitationid <=", value, "invitationid");
            return (Criteria) this;
        }

        public Criteria andInvitationidIn(List<Integer> values) {
            addCriterion("invitationid in", values, "invitationid");
            return (Criteria) this;
        }

        public Criteria andInvitationidNotIn(List<Integer> values) {
            addCriterion("invitationid not in", values, "invitationid");
            return (Criteria) this;
        }

        public Criteria andInvitationidBetween(Integer value1, Integer value2) {
            addCriterion("invitationid between", value1, value2, "invitationid");
            return (Criteria) this;
        }

        public Criteria andInvitationidNotBetween(Integer value1, Integer value2) {
            addCriterion("invitationid not between", value1, value2, "invitationid");
            return (Criteria) this;
        }

        public Criteria andSendinviteidIsNull() {
            addCriterion("sendinviteid is null");
            return (Criteria) this;
        }

        public Criteria andSendinviteidIsNotNull() {
            addCriterion("sendinviteid is not null");
            return (Criteria) this;
        }

        public Criteria andSendinviteidEqualTo(Integer value) {
            addCriterion("sendinviteid =", value, "sendinviteid");
            return (Criteria) this;
        }

        public Criteria andSendinviteidNotEqualTo(Integer value) {
            addCriterion("sendinviteid <>", value, "sendinviteid");
            return (Criteria) this;
        }

        public Criteria andSendinviteidGreaterThan(Integer value) {
            addCriterion("sendinviteid >", value, "sendinviteid");
            return (Criteria) this;
        }

        public Criteria andSendinviteidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sendinviteid >=", value, "sendinviteid");
            return (Criteria) this;
        }

        public Criteria andSendinviteidLessThan(Integer value) {
            addCriterion("sendinviteid <", value, "sendinviteid");
            return (Criteria) this;
        }

        public Criteria andSendinviteidLessThanOrEqualTo(Integer value) {
            addCriterion("sendinviteid <=", value, "sendinviteid");
            return (Criteria) this;
        }

        public Criteria andSendinviteidIn(List<Integer> values) {
            addCriterion("sendinviteid in", values, "sendinviteid");
            return (Criteria) this;
        }

        public Criteria andSendinviteidNotIn(List<Integer> values) {
            addCriterion("sendinviteid not in", values, "sendinviteid");
            return (Criteria) this;
        }

        public Criteria andSendinviteidBetween(Integer value1, Integer value2) {
            addCriterion("sendinviteid between", value1, value2, "sendinviteid");
            return (Criteria) this;
        }

        public Criteria andSendinviteidNotBetween(Integer value1, Integer value2) {
            addCriterion("sendinviteid not between", value1, value2, "sendinviteid");
            return (Criteria) this;
        }

        public Criteria andReceiveinviteidIsNull() {
            addCriterion("receiveinviteid is null");
            return (Criteria) this;
        }

        public Criteria andReceiveinviteidIsNotNull() {
            addCriterion("receiveinviteid is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveinviteidEqualTo(Integer value) {
            addCriterion("receiveinviteid =", value, "receiveinviteid");
            return (Criteria) this;
        }

        public Criteria andReceiveinviteidNotEqualTo(Integer value) {
            addCriterion("receiveinviteid <>", value, "receiveinviteid");
            return (Criteria) this;
        }

        public Criteria andReceiveinviteidGreaterThan(Integer value) {
            addCriterion("receiveinviteid >", value, "receiveinviteid");
            return (Criteria) this;
        }

        public Criteria andReceiveinviteidGreaterThanOrEqualTo(Integer value) {
            addCriterion("receiveinviteid >=", value, "receiveinviteid");
            return (Criteria) this;
        }

        public Criteria andReceiveinviteidLessThan(Integer value) {
            addCriterion("receiveinviteid <", value, "receiveinviteid");
            return (Criteria) this;
        }

        public Criteria andReceiveinviteidLessThanOrEqualTo(Integer value) {
            addCriterion("receiveinviteid <=", value, "receiveinviteid");
            return (Criteria) this;
        }

        public Criteria andReceiveinviteidIn(List<Integer> values) {
            addCriterion("receiveinviteid in", values, "receiveinviteid");
            return (Criteria) this;
        }

        public Criteria andReceiveinviteidNotIn(List<Integer> values) {
            addCriterion("receiveinviteid not in", values, "receiveinviteid");
            return (Criteria) this;
        }

        public Criteria andReceiveinviteidBetween(Integer value1, Integer value2) {
            addCriterion("receiveinviteid between", value1, value2, "receiveinviteid");
            return (Criteria) this;
        }

        public Criteria andReceiveinviteidNotBetween(Integer value1, Integer value2) {
            addCriterion("receiveinviteid not between", value1, value2, "receiveinviteid");
            return (Criteria) this;
        }

        public Criteria andSuccessIsNull() {
            addCriterion("success is null");
            return (Criteria) this;
        }

        public Criteria andSuccessIsNotNull() {
            addCriterion("success is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessEqualTo(String value) {
            addCriterion("success =", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessNotEqualTo(String value) {
            addCriterion("success <>", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessGreaterThan(String value) {
            addCriterion("success >", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessGreaterThanOrEqualTo(String value) {
            addCriterion("success >=", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessLessThan(String value) {
            addCriterion("success <", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessLessThanOrEqualTo(String value) {
            addCriterion("success <=", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessLike(String value) {
            addCriterion("success like", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessNotLike(String value) {
            addCriterion("success not like", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessIn(List<String> values) {
            addCriterion("success in", values, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessNotIn(List<String> values) {
            addCriterion("success not in", values, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessBetween(String value1, String value2) {
            addCriterion("success between", value1, value2, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessNotBetween(String value1, String value2) {
            addCriterion("success not between", value1, value2, "success");
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