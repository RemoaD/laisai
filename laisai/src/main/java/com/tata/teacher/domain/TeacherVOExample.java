package com.tata.teacher.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TeacherVOExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TeacherVOExample() {
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

        public Criteria andGroupteacheridIsNull() {
            addCriterion("groupteacherid is null");
            return (Criteria) this;
        }

        public Criteria andGroupteacheridIsNotNull() {
            addCriterion("groupteacherid is not null");
            return (Criteria) this;
        }

        public Criteria andGroupteacheridEqualTo(Integer value) {
            addCriterion("groupteacherid =", value, "groupteacherid");
            return (Criteria) this;
        }

        public Criteria andGroupteacheridNotEqualTo(Integer value) {
            addCriterion("groupteacherid <>", value, "groupteacherid");
            return (Criteria) this;
        }

        public Criteria andGroupteacheridGreaterThan(Integer value) {
            addCriterion("groupteacherid >", value, "groupteacherid");
            return (Criteria) this;
        }

        public Criteria andGroupteacheridGreaterThanOrEqualTo(Integer value) {
            addCriterion("groupteacherid >=", value, "groupteacherid");
            return (Criteria) this;
        }

        public Criteria andGroupteacheridLessThan(Integer value) {
            addCriterion("groupteacherid <", value, "groupteacherid");
            return (Criteria) this;
        }

        public Criteria andGroupteacheridLessThanOrEqualTo(Integer value) {
            addCriterion("groupteacherid <=", value, "groupteacherid");
            return (Criteria) this;
        }

        public Criteria andGroupteacheridIn(List<Integer> values) {
            addCriterion("groupteacherid in", values, "groupteacherid");
            return (Criteria) this;
        }

        public Criteria andGroupteacheridNotIn(List<Integer> values) {
            addCriterion("groupteacherid not in", values, "groupteacherid");
            return (Criteria) this;
        }

        public Criteria andGroupteacheridBetween(Integer value1, Integer value2) {
            addCriterion("groupteacherid between", value1, value2, "groupteacherid");
            return (Criteria) this;
        }

        public Criteria andGroupteacheridNotBetween(Integer value1, Integer value2) {
            addCriterion("groupteacherid not between", value1, value2, "groupteacherid");
            return (Criteria) this;
        }

        public Criteria andGroupteachernameIsNull() {
            addCriterion("groupteachername is null");
            return (Criteria) this;
        }

        public Criteria andGroupteachernameIsNotNull() {
            addCriterion("groupteachername is not null");
            return (Criteria) this;
        }

        public Criteria andGroupteachernameEqualTo(String value) {
            addCriterion("groupteachername =", value, "groupteachername");
            return (Criteria) this;
        }

        public Criteria andGroupteachernameNotEqualTo(String value) {
            addCriterion("groupteachername <>", value, "groupteachername");
            return (Criteria) this;
        }

        public Criteria andGroupteachernameGreaterThan(String value) {
            addCriterion("groupteachername >", value, "groupteachername");
            return (Criteria) this;
        }

        public Criteria andGroupteachernameGreaterThanOrEqualTo(String value) {
            addCriterion("groupteachername >=", value, "groupteachername");
            return (Criteria) this;
        }

        public Criteria andGroupteachernameLessThan(String value) {
            addCriterion("groupteachername <", value, "groupteachername");
            return (Criteria) this;
        }

        public Criteria andGroupteachernameLessThanOrEqualTo(String value) {
            addCriterion("groupteachername <=", value, "groupteachername");
            return (Criteria) this;
        }

        public Criteria andGroupteachernameLike(String value) {
            addCriterion("groupteachername like", value, "groupteachername");
            return (Criteria) this;
        }

        public Criteria andGroupteachernameNotLike(String value) {
            addCriterion("groupteachername not like", value, "groupteachername");
            return (Criteria) this;
        }

        public Criteria andGroupteachernameIn(List<String> values) {
            addCriterion("groupteachername in", values, "groupteachername");
            return (Criteria) this;
        }

        public Criteria andGroupteachernameNotIn(List<String> values) {
            addCriterion("groupteachername not in", values, "groupteachername");
            return (Criteria) this;
        }

        public Criteria andGroupteachernameBetween(String value1, String value2) {
            addCriterion("groupteachername between", value1, value2, "groupteachername");
            return (Criteria) this;
        }

        public Criteria andGroupteachernameNotBetween(String value1, String value2) {
            addCriterion("groupteachername not between", value1, value2, "groupteachername");
            return (Criteria) this;
        }

        public Criteria andStudentnumberIsNull() {
            addCriterion("studentnumber is null");
            return (Criteria) this;
        }

        public Criteria andStudentnumberIsNotNull() {
            addCriterion("studentnumber is not null");
            return (Criteria) this;
        }

        public Criteria andStudentnumberEqualTo(Integer value) {
            addCriterion("studentnumber =", value, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberNotEqualTo(Integer value) {
            addCriterion("studentnumber <>", value, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberGreaterThan(Integer value) {
            addCriterion("studentnumber >", value, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("studentnumber >=", value, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberLessThan(Integer value) {
            addCriterion("studentnumber <", value, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberLessThanOrEqualTo(Integer value) {
            addCriterion("studentnumber <=", value, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberIn(List<Integer> values) {
            addCriterion("studentnumber in", values, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberNotIn(List<Integer> values) {
            addCriterion("studentnumber not in", values, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberBetween(Integer value1, Integer value2) {
            addCriterion("studentnumber between", value1, value2, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("studentnumber not between", value1, value2, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andYidainumberIsNull() {
            addCriterion("yidainumber is null");
            return (Criteria) this;
        }

        public Criteria andYidainumberIsNotNull() {
            addCriterion("yidainumber is not null");
            return (Criteria) this;
        }

        public Criteria andYidainumberEqualTo(Integer value) {
            addCriterion("yidainumber =", value, "yidainumber");
            return (Criteria) this;
        }

        public Criteria andYidainumberNotEqualTo(Integer value) {
            addCriterion("yidainumber <>", value, "yidainumber");
            return (Criteria) this;
        }

        public Criteria andYidainumberGreaterThan(Integer value) {
            addCriterion("yidainumber >", value, "yidainumber");
            return (Criteria) this;
        }

        public Criteria andYidainumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("yidainumber >=", value, "yidainumber");
            return (Criteria) this;
        }

        public Criteria andYidainumberLessThan(Integer value) {
            addCriterion("yidainumber <", value, "yidainumber");
            return (Criteria) this;
        }

        public Criteria andYidainumberLessThanOrEqualTo(Integer value) {
            addCriterion("yidainumber <=", value, "yidainumber");
            return (Criteria) this;
        }

        public Criteria andYidainumberIn(List<Integer> values) {
            addCriterion("yidainumber in", values, "yidainumber");
            return (Criteria) this;
        }

        public Criteria andYidainumberNotIn(List<Integer> values) {
            addCriterion("yidainumber not in", values, "yidainumber");
            return (Criteria) this;
        }

        public Criteria andYidainumberBetween(Integer value1, Integer value2) {
            addCriterion("yidainumber between", value1, value2, "yidainumber");
            return (Criteria) this;
        }

        public Criteria andYidainumberNotBetween(Integer value1, Integer value2) {
            addCriterion("yidainumber not between", value1, value2, "yidainumber");
            return (Criteria) this;
        }

        public Criteria andRemainnumberIsNull() {
            addCriterion("remainnumber is null");
            return (Criteria) this;
        }

        public Criteria andRemainnumberIsNotNull() {
            addCriterion("remainnumber is not null");
            return (Criteria) this;
        }

        public Criteria andRemainnumberEqualTo(Integer value) {
            addCriterion("remainnumber =", value, "remainnumber");
            return (Criteria) this;
        }

        public Criteria andRemainnumberNotEqualTo(Integer value) {
            addCriterion("remainnumber <>", value, "remainnumber");
            return (Criteria) this;
        }

        public Criteria andRemainnumberGreaterThan(Integer value) {
            addCriterion("remainnumber >", value, "remainnumber");
            return (Criteria) this;
        }

        public Criteria andRemainnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("remainnumber >=", value, "remainnumber");
            return (Criteria) this;
        }

        public Criteria andRemainnumberLessThan(Integer value) {
            addCriterion("remainnumber <", value, "remainnumber");
            return (Criteria) this;
        }

        public Criteria andRemainnumberLessThanOrEqualTo(Integer value) {
            addCriterion("remainnumber <=", value, "remainnumber");
            return (Criteria) this;
        }

        public Criteria andRemainnumberIn(List<Integer> values) {
            addCriterion("remainnumber in", values, "remainnumber");
            return (Criteria) this;
        }

        public Criteria andRemainnumberNotIn(List<Integer> values) {
            addCriterion("remainnumber not in", values, "remainnumber");
            return (Criteria) this;
        }

        public Criteria andRemainnumberBetween(Integer value1, Integer value2) {
            addCriterion("remainnumber between", value1, value2, "remainnumber");
            return (Criteria) this;
        }

        public Criteria andRemainnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("remainnumber not between", value1, value2, "remainnumber");
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