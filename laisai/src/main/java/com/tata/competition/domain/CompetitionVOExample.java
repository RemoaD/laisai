package com.tata.competition.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompetitionVOExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public CompetitionVOExample() {
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

        public Criteria andCompetitionidIsNull() {
            addCriterion("competitionid is null");
            return (Criteria) this;
        }

        public Criteria andCompetitionidIsNotNull() {
            addCriterion("competitionid is not null");
            return (Criteria) this;
        }

        public Criteria andCompetitionidEqualTo(Integer value) {
            addCriterion("competitionid =", value, "competitionid");
            return (Criteria) this;
        }

        public Criteria andCompetitionidNotEqualTo(Integer value) {
            addCriterion("competitionid <>", value, "competitionid");
            return (Criteria) this;
        }

        public Criteria andCompetitionidGreaterThan(Integer value) {
            addCriterion("competitionid >", value, "competitionid");
            return (Criteria) this;
        }

        public Criteria andCompetitionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("competitionid >=", value, "competitionid");
            return (Criteria) this;
        }

        public Criteria andCompetitionidLessThan(Integer value) {
            addCriterion("competitionid <", value, "competitionid");
            return (Criteria) this;
        }

        public Criteria andCompetitionidLessThanOrEqualTo(Integer value) {
            addCriterion("competitionid <=", value, "competitionid");
            return (Criteria) this;
        }

        public Criteria andCompetitionidIn(List<Integer> values) {
            addCriterion("competitionid in", values, "competitionid");
            return (Criteria) this;
        }

        public Criteria andCompetitionidNotIn(List<Integer> values) {
            addCriterion("competitionid not in", values, "competitionid");
            return (Criteria) this;
        }

        public Criteria andCompetitionidBetween(Integer value1, Integer value2) {
            addCriterion("competitionid between", value1, value2, "competitionid");
            return (Criteria) this;
        }

        public Criteria andCompetitionidNotBetween(Integer value1, Integer value2) {
            addCriterion("competitionid not between", value1, value2, "competitionid");
            return (Criteria) this;
        }

        public Criteria andCompetitionnameIsNull() {
            addCriterion("competitionname is null");
            return (Criteria) this;
        }

        public Criteria andCompetitionnameIsNotNull() {
            addCriterion("competitionname is not null");
            return (Criteria) this;
        }

        public Criteria andCompetitionnameEqualTo(String value) {
            addCriterion("competitionname =", value, "competitionname");
            return (Criteria) this;
        }

        public Criteria andCompetitionnameNotEqualTo(String value) {
            addCriterion("competitionname <>", value, "competitionname");
            return (Criteria) this;
        }

        public Criteria andCompetitionnameGreaterThan(String value) {
            addCriterion("competitionname >", value, "competitionname");
            return (Criteria) this;
        }

        public Criteria andCompetitionnameGreaterThanOrEqualTo(String value) {
            addCriterion("competitionname >=", value, "competitionname");
            return (Criteria) this;
        }

        public Criteria andCompetitionnameLessThan(String value) {
            addCriterion("competitionname <", value, "competitionname");
            return (Criteria) this;
        }

        public Criteria andCompetitionnameLessThanOrEqualTo(String value) {
            addCriterion("competitionname <=", value, "competitionname");
            return (Criteria) this;
        }

        public Criteria andCompetitionnameLike(String value) {
            addCriterion("competitionname like", value, "competitionname");
            return (Criteria) this;
        }

        public Criteria andCompetitionnameNotLike(String value) {
            addCriterion("competitionname not like", value, "competitionname");
            return (Criteria) this;
        }

        public Criteria andCompetitionnameIn(List<String> values) {
            addCriterion("competitionname in", values, "competitionname");
            return (Criteria) this;
        }

        public Criteria andCompetitionnameNotIn(List<String> values) {
            addCriterion("competitionname not in", values, "competitionname");
            return (Criteria) this;
        }

        public Criteria andCompetitionnameBetween(String value1, String value2) {
            addCriterion("competitionname between", value1, value2, "competitionname");
            return (Criteria) this;
        }

        public Criteria andCompetitionnameNotBetween(String value1, String value2) {
            addCriterion("competitionname not between", value1, value2, "competitionname");
            return (Criteria) this;
        }

        public Criteria andCompetitiontimeIsNull() {
            addCriterion("competitiontime is null");
            return (Criteria) this;
        }

        public Criteria andCompetitiontimeIsNotNull() {
            addCriterion("competitiontime is not null");
            return (Criteria) this;
        }

        public Criteria andCompetitiontimeEqualTo(Date value) {
            addCriterion("competitiontime =", value, "competitiontime");
            return (Criteria) this;
        }

        public Criteria andCompetitiontimeNotEqualTo(Date value) {
            addCriterion("competitiontime <>", value, "competitiontime");
            return (Criteria) this;
        }

        public Criteria andCompetitiontimeGreaterThan(Date value) {
            addCriterion("competitiontime >", value, "competitiontime");
            return (Criteria) this;
        }

        public Criteria andCompetitiontimeGreaterThanOrEqualTo(Date value) {
            addCriterion("competitiontime >=", value, "competitiontime");
            return (Criteria) this;
        }

        public Criteria andCompetitiontimeLessThan(Date value) {
            addCriterion("competitiontime <", value, "competitiontime");
            return (Criteria) this;
        }

        public Criteria andCompetitiontimeLessThanOrEqualTo(Date value) {
            addCriterion("competitiontime <=", value, "competitiontime");
            return (Criteria) this;
        }

        public Criteria andCompetitiontimeIn(List<Date> values) {
            addCriterion("competitiontime in", values, "competitiontime");
            return (Criteria) this;
        }

        public Criteria andCompetitiontimeNotIn(List<Date> values) {
            addCriterion("competitiontime not in", values, "competitiontime");
            return (Criteria) this;
        }

        public Criteria andCompetitiontimeBetween(Date value1, Date value2) {
            addCriterion("competitiontime between", value1, value2, "competitiontime");
            return (Criteria) this;
        }

        public Criteria andCompetitiontimeNotBetween(Date value1, Date value2) {
            addCriterion("competitiontime not between", value1, value2, "competitiontime");
            return (Criteria) this;
        }

        public Criteria andGroupdeadlineIsNull() {
            addCriterion("groupdeadline is null");
            return (Criteria) this;
        }

        public Criteria andGroupdeadlineIsNotNull() {
            addCriterion("groupdeadline is not null");
            return (Criteria) this;
        }

        public Criteria andGroupdeadlineEqualTo(Date value) {
            addCriterion("groupdeadline =", value, "groupdeadline");
            return (Criteria) this;
        }

        public Criteria andGroupdeadlineNotEqualTo(Date value) {
            addCriterion("groupdeadline <>", value, "groupdeadline");
            return (Criteria) this;
        }

        public Criteria andGroupdeadlineGreaterThan(Date value) {
            addCriterion("groupdeadline >", value, "groupdeadline");
            return (Criteria) this;
        }

        public Criteria andGroupdeadlineGreaterThanOrEqualTo(Date value) {
            addCriterion("groupdeadline >=", value, "groupdeadline");
            return (Criteria) this;
        }

        public Criteria andGroupdeadlineLessThan(Date value) {
            addCriterion("groupdeadline <", value, "groupdeadline");
            return (Criteria) this;
        }

        public Criteria andGroupdeadlineLessThanOrEqualTo(Date value) {
            addCriterion("groupdeadline <=", value, "groupdeadline");
            return (Criteria) this;
        }

        public Criteria andGroupdeadlineIn(List<Date> values) {
            addCriterion("groupdeadline in", values, "groupdeadline");
            return (Criteria) this;
        }

        public Criteria andGroupdeadlineNotIn(List<Date> values) {
            addCriterion("groupdeadline not in", values, "groupdeadline");
            return (Criteria) this;
        }

        public Criteria andGroupdeadlineBetween(Date value1, Date value2) {
            addCriterion("groupdeadline between", value1, value2, "groupdeadline");
            return (Criteria) this;
        }

        public Criteria andGroupdeadlineNotBetween(Date value1, Date value2) {
            addCriterion("groupdeadline not between", value1, value2, "groupdeadline");
            return (Criteria) this;
        }

        public Criteria andCompetitioncontentIsNull() {
            addCriterion("competitioncontent is null");
            return (Criteria) this;
        }

        public Criteria andCompetitioncontentIsNotNull() {
            addCriterion("competitioncontent is not null");
            return (Criteria) this;
        }

        public Criteria andCompetitioncontentEqualTo(String value) {
            addCriterion("competitioncontent =", value, "competitioncontent");
            return (Criteria) this;
        }

        public Criteria andCompetitioncontentNotEqualTo(String value) {
            addCriterion("competitioncontent <>", value, "competitioncontent");
            return (Criteria) this;
        }

        public Criteria andCompetitioncontentGreaterThan(String value) {
            addCriterion("competitioncontent >", value, "competitioncontent");
            return (Criteria) this;
        }

        public Criteria andCompetitioncontentGreaterThanOrEqualTo(String value) {
            addCriterion("competitioncontent >=", value, "competitioncontent");
            return (Criteria) this;
        }

        public Criteria andCompetitioncontentLessThan(String value) {
            addCriterion("competitioncontent <", value, "competitioncontent");
            return (Criteria) this;
        }

        public Criteria andCompetitioncontentLessThanOrEqualTo(String value) {
            addCriterion("competitioncontent <=", value, "competitioncontent");
            return (Criteria) this;
        }

        public Criteria andCompetitioncontentLike(String value) {
            addCriterion("competitioncontent like", value, "competitioncontent");
            return (Criteria) this;
        }

        public Criteria andCompetitioncontentNotLike(String value) {
            addCriterion("competitioncontent not like", value, "competitioncontent");
            return (Criteria) this;
        }

        public Criteria andCompetitioncontentIn(List<String> values) {
            addCriterion("competitioncontent in", values, "competitioncontent");
            return (Criteria) this;
        }

        public Criteria andCompetitioncontentNotIn(List<String> values) {
            addCriterion("competitioncontent not in", values, "competitioncontent");
            return (Criteria) this;
        }

        public Criteria andCompetitioncontentBetween(String value1, String value2) {
            addCriterion("competitioncontent between", value1, value2, "competitioncontent");
            return (Criteria) this;
        }

        public Criteria andCompetitioncontentNotBetween(String value1, String value2) {
            addCriterion("competitioncontent not between", value1, value2, "competitioncontent");
            return (Criteria) this;
        }

        public Criteria andCompetitionpropertyIsNull() {
            addCriterion("competitionproperty is null");
            return (Criteria) this;
        }

        public Criteria andCompetitionpropertyIsNotNull() {
            addCriterion("competitionproperty is not null");
            return (Criteria) this;
        }

        public Criteria andCompetitionpropertyEqualTo(String value) {
            addCriterion("competitionproperty =", value, "competitionproperty");
            return (Criteria) this;
        }

        public Criteria andCompetitionpropertyNotEqualTo(String value) {
            addCriterion("competitionproperty <>", value, "competitionproperty");
            return (Criteria) this;
        }

        public Criteria andCompetitionpropertyGreaterThan(String value) {
            addCriterion("competitionproperty >", value, "competitionproperty");
            return (Criteria) this;
        }

        public Criteria andCompetitionpropertyGreaterThanOrEqualTo(String value) {
            addCriterion("competitionproperty >=", value, "competitionproperty");
            return (Criteria) this;
        }

        public Criteria andCompetitionpropertyLessThan(String value) {
            addCriterion("competitionproperty <", value, "competitionproperty");
            return (Criteria) this;
        }

        public Criteria andCompetitionpropertyLessThanOrEqualTo(String value) {
            addCriterion("competitionproperty <=", value, "competitionproperty");
            return (Criteria) this;
        }

        public Criteria andCompetitionpropertyLike(String value) {
            addCriterion("competitionproperty like", value, "competitionproperty");
            return (Criteria) this;
        }

        public Criteria andCompetitionpropertyNotLike(String value) {
            addCriterion("competitionproperty not like", value, "competitionproperty");
            return (Criteria) this;
        }

        public Criteria andCompetitionpropertyIn(List<String> values) {
            addCriterion("competitionproperty in", values, "competitionproperty");
            return (Criteria) this;
        }

        public Criteria andCompetitionpropertyNotIn(List<String> values) {
            addCriterion("competitionproperty not in", values, "competitionproperty");
            return (Criteria) this;
        }

        public Criteria andCompetitionpropertyBetween(String value1, String value2) {
            addCriterion("competitionproperty between", value1, value2, "competitionproperty");
            return (Criteria) this;
        }

        public Criteria andCompetitionpropertyNotBetween(String value1, String value2) {
            addCriterion("competitionproperty not between", value1, value2, "competitionproperty");
            return (Criteria) this;
        }

        public Criteria andStudentdemandIsNull() {
            addCriterion("studentdemand is null");
            return (Criteria) this;
        }

        public Criteria andStudentdemandIsNotNull() {
            addCriterion("studentdemand is not null");
            return (Criteria) this;
        }

        public Criteria andStudentdemandEqualTo(String value) {
            addCriterion("studentdemand =", value, "studentdemand");
            return (Criteria) this;
        }

        public Criteria andStudentdemandNotEqualTo(String value) {
            addCriterion("studentdemand <>", value, "studentdemand");
            return (Criteria) this;
        }

        public Criteria andStudentdemandGreaterThan(String value) {
            addCriterion("studentdemand >", value, "studentdemand");
            return (Criteria) this;
        }

        public Criteria andStudentdemandGreaterThanOrEqualTo(String value) {
            addCriterion("studentdemand >=", value, "studentdemand");
            return (Criteria) this;
        }

        public Criteria andStudentdemandLessThan(String value) {
            addCriterion("studentdemand <", value, "studentdemand");
            return (Criteria) this;
        }

        public Criteria andStudentdemandLessThanOrEqualTo(String value) {
            addCriterion("studentdemand <=", value, "studentdemand");
            return (Criteria) this;
        }

        public Criteria andStudentdemandLike(String value) {
            addCriterion("studentdemand like", value, "studentdemand");
            return (Criteria) this;
        }

        public Criteria andStudentdemandNotLike(String value) {
            addCriterion("studentdemand not like", value, "studentdemand");
            return (Criteria) this;
        }

        public Criteria andStudentdemandIn(List<String> values) {
            addCriterion("studentdemand in", values, "studentdemand");
            return (Criteria) this;
        }

        public Criteria andStudentdemandNotIn(List<String> values) {
            addCriterion("studentdemand not in", values, "studentdemand");
            return (Criteria) this;
        }

        public Criteria andStudentdemandBetween(String value1, String value2) {
            addCriterion("studentdemand between", value1, value2, "studentdemand");
            return (Criteria) this;
        }

        public Criteria andStudentdemandNotBetween(String value1, String value2) {
            addCriterion("studentdemand not between", value1, value2, "studentdemand");
            return (Criteria) this;
        }

        public Criteria andIsrunningIsNull() {
            addCriterion("isrunning is null");
            return (Criteria) this;
        }

        public Criteria andIsrunningIsNotNull() {
            addCriterion("isrunning is not null");
            return (Criteria) this;
        }

        public Criteria andIsrunningEqualTo(String value) {
            addCriterion("isrunning =", value, "isrunning");
            return (Criteria) this;
        }

        public Criteria andIsrunningNotEqualTo(String value) {
            addCriterion("isrunning <>", value, "isrunning");
            return (Criteria) this;
        }

        public Criteria andIsrunningGreaterThan(String value) {
            addCriterion("isrunning >", value, "isrunning");
            return (Criteria) this;
        }

        public Criteria andIsrunningGreaterThanOrEqualTo(String value) {
            addCriterion("isrunning >=", value, "isrunning");
            return (Criteria) this;
        }

        public Criteria andIsrunningLessThan(String value) {
            addCriterion("isrunning <", value, "isrunning");
            return (Criteria) this;
        }

        public Criteria andIsrunningLessThanOrEqualTo(String value) {
            addCriterion("isrunning <=", value, "isrunning");
            return (Criteria) this;
        }

        public Criteria andIsrunningLike(String value) {
            addCriterion("isrunning like", value, "isrunning");
            return (Criteria) this;
        }

        public Criteria andIsrunningNotLike(String value) {
            addCriterion("isrunning not like", value, "isrunning");
            return (Criteria) this;
        }

        public Criteria andIsrunningIn(List<String> values) {
            addCriterion("isrunning in", values, "isrunning");
            return (Criteria) this;
        }

        public Criteria andIsrunningNotIn(List<String> values) {
            addCriterion("isrunning not in", values, "isrunning");
            return (Criteria) this;
        }

        public Criteria andIsrunningBetween(String value1, String value2) {
            addCriterion("isrunning between", value1, value2, "isrunning");
            return (Criteria) this;
        }

        public Criteria andIsrunningNotBetween(String value1, String value2) {
            addCriterion("isrunning not between", value1, value2, "isrunning");
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