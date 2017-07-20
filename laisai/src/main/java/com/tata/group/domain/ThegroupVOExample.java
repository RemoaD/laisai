package com.tata.group.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ThegroupVOExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ThegroupVOExample() {
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

        public Criteria andGroupidIsNull() {
            addCriterion("groupid is null");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNotNull() {
            addCriterion("groupid is not null");
            return (Criteria) this;
        }

        public Criteria andGroupidEqualTo(Integer value) {
            addCriterion("groupid =", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotEqualTo(Integer value) {
            addCriterion("groupid <>", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThan(Integer value) {
            addCriterion("groupid >", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("groupid >=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThan(Integer value) {
            addCriterion("groupid <", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThanOrEqualTo(Integer value) {
            addCriterion("groupid <=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidIn(List<Integer> values) {
            addCriterion("groupid in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotIn(List<Integer> values) {
            addCriterion("groupid not in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidBetween(Integer value1, Integer value2) {
            addCriterion("groupid between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotBetween(Integer value1, Integer value2) {
            addCriterion("groupid not between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupfirstmemberidIsNull() {
            addCriterion("groupfirstmemberid is null");
            return (Criteria) this;
        }

        public Criteria andGroupfirstmemberidIsNotNull() {
            addCriterion("groupfirstmemberid is not null");
            return (Criteria) this;
        }

        public Criteria andGroupfirstmemberidEqualTo(Integer value) {
            addCriterion("groupfirstmemberid =", value, "groupfirstmemberid");
            return (Criteria) this;
        }

        public Criteria andGroupfirstmemberidNotEqualTo(Integer value) {
            addCriterion("groupfirstmemberid <>", value, "groupfirstmemberid");
            return (Criteria) this;
        }

        public Criteria andGroupfirstmemberidGreaterThan(Integer value) {
            addCriterion("groupfirstmemberid >", value, "groupfirstmemberid");
            return (Criteria) this;
        }

        public Criteria andGroupfirstmemberidGreaterThanOrEqualTo(Integer value) {
            addCriterion("groupfirstmemberid >=", value, "groupfirstmemberid");
            return (Criteria) this;
        }

        public Criteria andGroupfirstmemberidLessThan(Integer value) {
            addCriterion("groupfirstmemberid <", value, "groupfirstmemberid");
            return (Criteria) this;
        }

        public Criteria andGroupfirstmemberidLessThanOrEqualTo(Integer value) {
            addCriterion("groupfirstmemberid <=", value, "groupfirstmemberid");
            return (Criteria) this;
        }

        public Criteria andGroupfirstmemberidIn(List<Integer> values) {
            addCriterion("groupfirstmemberid in", values, "groupfirstmemberid");
            return (Criteria) this;
        }

        public Criteria andGroupfirstmemberidNotIn(List<Integer> values) {
            addCriterion("groupfirstmemberid not in", values, "groupfirstmemberid");
            return (Criteria) this;
        }

        public Criteria andGroupfirstmemberidBetween(Integer value1, Integer value2) {
            addCriterion("groupfirstmemberid between", value1, value2, "groupfirstmemberid");
            return (Criteria) this;
        }

        public Criteria andGroupfirstmemberidNotBetween(Integer value1, Integer value2) {
            addCriterion("groupfirstmemberid not between", value1, value2, "groupfirstmemberid");
            return (Criteria) this;
        }

        public Criteria andGroupfirsttruenameIsNull() {
            addCriterion("groupfirsttruename is null");
            return (Criteria) this;
        }

        public Criteria andGroupfirsttruenameIsNotNull() {
            addCriterion("groupfirsttruename is not null");
            return (Criteria) this;
        }

        public Criteria andGroupfirsttruenameEqualTo(String value) {
            addCriterion("groupfirsttruename =", value, "groupfirsttruename");
            return (Criteria) this;
        }

        public Criteria andGroupfirsttruenameNotEqualTo(String value) {
            addCriterion("groupfirsttruename <>", value, "groupfirsttruename");
            return (Criteria) this;
        }

        public Criteria andGroupfirsttruenameGreaterThan(String value) {
            addCriterion("groupfirsttruename >", value, "groupfirsttruename");
            return (Criteria) this;
        }

        public Criteria andGroupfirsttruenameGreaterThanOrEqualTo(String value) {
            addCriterion("groupfirsttruename >=", value, "groupfirsttruename");
            return (Criteria) this;
        }

        public Criteria andGroupfirsttruenameLessThan(String value) {
            addCriterion("groupfirsttruename <", value, "groupfirsttruename");
            return (Criteria) this;
        }

        public Criteria andGroupfirsttruenameLessThanOrEqualTo(String value) {
            addCriterion("groupfirsttruename <=", value, "groupfirsttruename");
            return (Criteria) this;
        }

        public Criteria andGroupfirsttruenameLike(String value) {
            addCriterion("groupfirsttruename like", value, "groupfirsttruename");
            return (Criteria) this;
        }

        public Criteria andGroupfirsttruenameNotLike(String value) {
            addCriterion("groupfirsttruename not like", value, "groupfirsttruename");
            return (Criteria) this;
        }

        public Criteria andGroupfirsttruenameIn(List<String> values) {
            addCriterion("groupfirsttruename in", values, "groupfirsttruename");
            return (Criteria) this;
        }

        public Criteria andGroupfirsttruenameNotIn(List<String> values) {
            addCriterion("groupfirsttruename not in", values, "groupfirsttruename");
            return (Criteria) this;
        }

        public Criteria andGroupfirsttruenameBetween(String value1, String value2) {
            addCriterion("groupfirsttruename between", value1, value2, "groupfirsttruename");
            return (Criteria) this;
        }

        public Criteria andGroupfirsttruenameNotBetween(String value1, String value2) {
            addCriterion("groupfirsttruename not between", value1, value2, "groupfirsttruename");
            return (Criteria) this;
        }

        public Criteria andGroupfirstpropertyIsNull() {
            addCriterion("groupfirstproperty is null");
            return (Criteria) this;
        }

        public Criteria andGroupfirstpropertyIsNotNull() {
            addCriterion("groupfirstproperty is not null");
            return (Criteria) this;
        }

        public Criteria andGroupfirstpropertyEqualTo(String value) {
            addCriterion("groupfirstproperty =", value, "groupfirstproperty");
            return (Criteria) this;
        }

        public Criteria andGroupfirstpropertyNotEqualTo(String value) {
            addCriterion("groupfirstproperty <>", value, "groupfirstproperty");
            return (Criteria) this;
        }

        public Criteria andGroupfirstpropertyGreaterThan(String value) {
            addCriterion("groupfirstproperty >", value, "groupfirstproperty");
            return (Criteria) this;
        }

        public Criteria andGroupfirstpropertyGreaterThanOrEqualTo(String value) {
            addCriterion("groupfirstproperty >=", value, "groupfirstproperty");
            return (Criteria) this;
        }

        public Criteria andGroupfirstpropertyLessThan(String value) {
            addCriterion("groupfirstproperty <", value, "groupfirstproperty");
            return (Criteria) this;
        }

        public Criteria andGroupfirstpropertyLessThanOrEqualTo(String value) {
            addCriterion("groupfirstproperty <=", value, "groupfirstproperty");
            return (Criteria) this;
        }

        public Criteria andGroupfirstpropertyLike(String value) {
            addCriterion("groupfirstproperty like", value, "groupfirstproperty");
            return (Criteria) this;
        }

        public Criteria andGroupfirstpropertyNotLike(String value) {
            addCriterion("groupfirstproperty not like", value, "groupfirstproperty");
            return (Criteria) this;
        }

        public Criteria andGroupfirstpropertyIn(List<String> values) {
            addCriterion("groupfirstproperty in", values, "groupfirstproperty");
            return (Criteria) this;
        }

        public Criteria andGroupfirstpropertyNotIn(List<String> values) {
            addCriterion("groupfirstproperty not in", values, "groupfirstproperty");
            return (Criteria) this;
        }

        public Criteria andGroupfirstpropertyBetween(String value1, String value2) {
            addCriterion("groupfirstproperty between", value1, value2, "groupfirstproperty");
            return (Criteria) this;
        }

        public Criteria andGroupfirstpropertyNotBetween(String value1, String value2) {
            addCriterion("groupfirstproperty not between", value1, value2, "groupfirstproperty");
            return (Criteria) this;
        }

        public Criteria andGroupsecondmemberidIsNull() {
            addCriterion("groupsecondmemberid is null");
            return (Criteria) this;
        }

        public Criteria andGroupsecondmemberidIsNotNull() {
            addCriterion("groupsecondmemberid is not null");
            return (Criteria) this;
        }

        public Criteria andGroupsecondmemberidEqualTo(Integer value) {
            addCriterion("groupsecondmemberid =", value, "groupsecondmemberid");
            return (Criteria) this;
        }

        public Criteria andGroupsecondmemberidNotEqualTo(Integer value) {
            addCriterion("groupsecondmemberid <>", value, "groupsecondmemberid");
            return (Criteria) this;
        }

        public Criteria andGroupsecondmemberidGreaterThan(Integer value) {
            addCriterion("groupsecondmemberid >", value, "groupsecondmemberid");
            return (Criteria) this;
        }

        public Criteria andGroupsecondmemberidGreaterThanOrEqualTo(Integer value) {
            addCriterion("groupsecondmemberid >=", value, "groupsecondmemberid");
            return (Criteria) this;
        }

        public Criteria andGroupsecondmemberidLessThan(Integer value) {
            addCriterion("groupsecondmemberid <", value, "groupsecondmemberid");
            return (Criteria) this;
        }

        public Criteria andGroupsecondmemberidLessThanOrEqualTo(Integer value) {
            addCriterion("groupsecondmemberid <=", value, "groupsecondmemberid");
            return (Criteria) this;
        }

        public Criteria andGroupsecondmemberidIn(List<Integer> values) {
            addCriterion("groupsecondmemberid in", values, "groupsecondmemberid");
            return (Criteria) this;
        }

        public Criteria andGroupsecondmemberidNotIn(List<Integer> values) {
            addCriterion("groupsecondmemberid not in", values, "groupsecondmemberid");
            return (Criteria) this;
        }

        public Criteria andGroupsecondmemberidBetween(Integer value1, Integer value2) {
            addCriterion("groupsecondmemberid between", value1, value2, "groupsecondmemberid");
            return (Criteria) this;
        }

        public Criteria andGroupsecondmemberidNotBetween(Integer value1, Integer value2) {
            addCriterion("groupsecondmemberid not between", value1, value2, "groupsecondmemberid");
            return (Criteria) this;
        }

        public Criteria andGroupsecondtruenameIsNull() {
            addCriterion("groupsecondtruename is null");
            return (Criteria) this;
        }

        public Criteria andGroupsecondtruenameIsNotNull() {
            addCriterion("groupsecondtruename is not null");
            return (Criteria) this;
        }

        public Criteria andGroupsecondtruenameEqualTo(String value) {
            addCriterion("groupsecondtruename =", value, "groupsecondtruename");
            return (Criteria) this;
        }

        public Criteria andGroupsecondtruenameNotEqualTo(String value) {
            addCriterion("groupsecondtruename <>", value, "groupsecondtruename");
            return (Criteria) this;
        }

        public Criteria andGroupsecondtruenameGreaterThan(String value) {
            addCriterion("groupsecondtruename >", value, "groupsecondtruename");
            return (Criteria) this;
        }

        public Criteria andGroupsecondtruenameGreaterThanOrEqualTo(String value) {
            addCriterion("groupsecondtruename >=", value, "groupsecondtruename");
            return (Criteria) this;
        }

        public Criteria andGroupsecondtruenameLessThan(String value) {
            addCriterion("groupsecondtruename <", value, "groupsecondtruename");
            return (Criteria) this;
        }

        public Criteria andGroupsecondtruenameLessThanOrEqualTo(String value) {
            addCriterion("groupsecondtruename <=", value, "groupsecondtruename");
            return (Criteria) this;
        }

        public Criteria andGroupsecondtruenameLike(String value) {
            addCriterion("groupsecondtruename like", value, "groupsecondtruename");
            return (Criteria) this;
        }

        public Criteria andGroupsecondtruenameNotLike(String value) {
            addCriterion("groupsecondtruename not like", value, "groupsecondtruename");
            return (Criteria) this;
        }

        public Criteria andGroupsecondtruenameIn(List<String> values) {
            addCriterion("groupsecondtruename in", values, "groupsecondtruename");
            return (Criteria) this;
        }

        public Criteria andGroupsecondtruenameNotIn(List<String> values) {
            addCriterion("groupsecondtruename not in", values, "groupsecondtruename");
            return (Criteria) this;
        }

        public Criteria andGroupsecondtruenameBetween(String value1, String value2) {
            addCriterion("groupsecondtruename between", value1, value2, "groupsecondtruename");
            return (Criteria) this;
        }

        public Criteria andGroupsecondtruenameNotBetween(String value1, String value2) {
            addCriterion("groupsecondtruename not between", value1, value2, "groupsecondtruename");
            return (Criteria) this;
        }

        public Criteria andGroupsecondpropertyIsNull() {
            addCriterion("groupsecondproperty is null");
            return (Criteria) this;
        }

        public Criteria andGroupsecondpropertyIsNotNull() {
            addCriterion("groupsecondproperty is not null");
            return (Criteria) this;
        }

        public Criteria andGroupsecondpropertyEqualTo(String value) {
            addCriterion("groupsecondproperty =", value, "groupsecondproperty");
            return (Criteria) this;
        }

        public Criteria andGroupsecondpropertyNotEqualTo(String value) {
            addCriterion("groupsecondproperty <>", value, "groupsecondproperty");
            return (Criteria) this;
        }

        public Criteria andGroupsecondpropertyGreaterThan(String value) {
            addCriterion("groupsecondproperty >", value, "groupsecondproperty");
            return (Criteria) this;
        }

        public Criteria andGroupsecondpropertyGreaterThanOrEqualTo(String value) {
            addCriterion("groupsecondproperty >=", value, "groupsecondproperty");
            return (Criteria) this;
        }

        public Criteria andGroupsecondpropertyLessThan(String value) {
            addCriterion("groupsecondproperty <", value, "groupsecondproperty");
            return (Criteria) this;
        }

        public Criteria andGroupsecondpropertyLessThanOrEqualTo(String value) {
            addCriterion("groupsecondproperty <=", value, "groupsecondproperty");
            return (Criteria) this;
        }

        public Criteria andGroupsecondpropertyLike(String value) {
            addCriterion("groupsecondproperty like", value, "groupsecondproperty");
            return (Criteria) this;
        }

        public Criteria andGroupsecondpropertyNotLike(String value) {
            addCriterion("groupsecondproperty not like", value, "groupsecondproperty");
            return (Criteria) this;
        }

        public Criteria andGroupsecondpropertyIn(List<String> values) {
            addCriterion("groupsecondproperty in", values, "groupsecondproperty");
            return (Criteria) this;
        }

        public Criteria andGroupsecondpropertyNotIn(List<String> values) {
            addCriterion("groupsecondproperty not in", values, "groupsecondproperty");
            return (Criteria) this;
        }

        public Criteria andGroupsecondpropertyBetween(String value1, String value2) {
            addCriterion("groupsecondproperty between", value1, value2, "groupsecondproperty");
            return (Criteria) this;
        }

        public Criteria andGroupsecondpropertyNotBetween(String value1, String value2) {
            addCriterion("groupsecondproperty not between", value1, value2, "groupsecondproperty");
            return (Criteria) this;
        }

        public Criteria andGroupthirdmemberidIsNull() {
            addCriterion("groupthirdmemberid is null");
            return (Criteria) this;
        }

        public Criteria andGroupthirdmemberidIsNotNull() {
            addCriterion("groupthirdmemberid is not null");
            return (Criteria) this;
        }

        public Criteria andGroupthirdmemberidEqualTo(Integer value) {
            addCriterion("groupthirdmemberid =", value, "groupthirdmemberid");
            return (Criteria) this;
        }

        public Criteria andGroupthirdmemberidNotEqualTo(Integer value) {
            addCriterion("groupthirdmemberid <>", value, "groupthirdmemberid");
            return (Criteria) this;
        }

        public Criteria andGroupthirdmemberidGreaterThan(Integer value) {
            addCriterion("groupthirdmemberid >", value, "groupthirdmemberid");
            return (Criteria) this;
        }

        public Criteria andGroupthirdmemberidGreaterThanOrEqualTo(Integer value) {
            addCriterion("groupthirdmemberid >=", value, "groupthirdmemberid");
            return (Criteria) this;
        }

        public Criteria andGroupthirdmemberidLessThan(Integer value) {
            addCriterion("groupthirdmemberid <", value, "groupthirdmemberid");
            return (Criteria) this;
        }

        public Criteria andGroupthirdmemberidLessThanOrEqualTo(Integer value) {
            addCriterion("groupthirdmemberid <=", value, "groupthirdmemberid");
            return (Criteria) this;
        }

        public Criteria andGroupthirdmemberidIn(List<Integer> values) {
            addCriterion("groupthirdmemberid in", values, "groupthirdmemberid");
            return (Criteria) this;
        }

        public Criteria andGroupthirdmemberidNotIn(List<Integer> values) {
            addCriterion("groupthirdmemberid not in", values, "groupthirdmemberid");
            return (Criteria) this;
        }

        public Criteria andGroupthirdmemberidBetween(Integer value1, Integer value2) {
            addCriterion("groupthirdmemberid between", value1, value2, "groupthirdmemberid");
            return (Criteria) this;
        }

        public Criteria andGroupthirdmemberidNotBetween(Integer value1, Integer value2) {
            addCriterion("groupthirdmemberid not between", value1, value2, "groupthirdmemberid");
            return (Criteria) this;
        }

        public Criteria andGroupthirdtruenameIsNull() {
            addCriterion("groupthirdtruename is null");
            return (Criteria) this;
        }

        public Criteria andGroupthirdtruenameIsNotNull() {
            addCriterion("groupthirdtruename is not null");
            return (Criteria) this;
        }

        public Criteria andGroupthirdtruenameEqualTo(String value) {
            addCriterion("groupthirdtruename =", value, "groupthirdtruename");
            return (Criteria) this;
        }

        public Criteria andGroupthirdtruenameNotEqualTo(String value) {
            addCriterion("groupthirdtruename <>", value, "groupthirdtruename");
            return (Criteria) this;
        }

        public Criteria andGroupthirdtruenameGreaterThan(String value) {
            addCriterion("groupthirdtruename >", value, "groupthirdtruename");
            return (Criteria) this;
        }

        public Criteria andGroupthirdtruenameGreaterThanOrEqualTo(String value) {
            addCriterion("groupthirdtruename >=", value, "groupthirdtruename");
            return (Criteria) this;
        }

        public Criteria andGroupthirdtruenameLessThan(String value) {
            addCriterion("groupthirdtruename <", value, "groupthirdtruename");
            return (Criteria) this;
        }

        public Criteria andGroupthirdtruenameLessThanOrEqualTo(String value) {
            addCriterion("groupthirdtruename <=", value, "groupthirdtruename");
            return (Criteria) this;
        }

        public Criteria andGroupthirdtruenameLike(String value) {
            addCriterion("groupthirdtruename like", value, "groupthirdtruename");
            return (Criteria) this;
        }

        public Criteria andGroupthirdtruenameNotLike(String value) {
            addCriterion("groupthirdtruename not like", value, "groupthirdtruename");
            return (Criteria) this;
        }

        public Criteria andGroupthirdtruenameIn(List<String> values) {
            addCriterion("groupthirdtruename in", values, "groupthirdtruename");
            return (Criteria) this;
        }

        public Criteria andGroupthirdtruenameNotIn(List<String> values) {
            addCriterion("groupthirdtruename not in", values, "groupthirdtruename");
            return (Criteria) this;
        }

        public Criteria andGroupthirdtruenameBetween(String value1, String value2) {
            addCriterion("groupthirdtruename between", value1, value2, "groupthirdtruename");
            return (Criteria) this;
        }

        public Criteria andGroupthirdtruenameNotBetween(String value1, String value2) {
            addCriterion("groupthirdtruename not between", value1, value2, "groupthirdtruename");
            return (Criteria) this;
        }

        public Criteria andGroupthirdpropertyIsNull() {
            addCriterion("groupthirdproperty is null");
            return (Criteria) this;
        }

        public Criteria andGroupthirdpropertyIsNotNull() {
            addCriterion("groupthirdproperty is not null");
            return (Criteria) this;
        }

        public Criteria andGroupthirdpropertyEqualTo(String value) {
            addCriterion("groupthirdproperty =", value, "groupthirdproperty");
            return (Criteria) this;
        }

        public Criteria andGroupthirdpropertyNotEqualTo(String value) {
            addCriterion("groupthirdproperty <>", value, "groupthirdproperty");
            return (Criteria) this;
        }

        public Criteria andGroupthirdpropertyGreaterThan(String value) {
            addCriterion("groupthirdproperty >", value, "groupthirdproperty");
            return (Criteria) this;
        }

        public Criteria andGroupthirdpropertyGreaterThanOrEqualTo(String value) {
            addCriterion("groupthirdproperty >=", value, "groupthirdproperty");
            return (Criteria) this;
        }

        public Criteria andGroupthirdpropertyLessThan(String value) {
            addCriterion("groupthirdproperty <", value, "groupthirdproperty");
            return (Criteria) this;
        }

        public Criteria andGroupthirdpropertyLessThanOrEqualTo(String value) {
            addCriterion("groupthirdproperty <=", value, "groupthirdproperty");
            return (Criteria) this;
        }

        public Criteria andGroupthirdpropertyLike(String value) {
            addCriterion("groupthirdproperty like", value, "groupthirdproperty");
            return (Criteria) this;
        }

        public Criteria andGroupthirdpropertyNotLike(String value) {
            addCriterion("groupthirdproperty not like", value, "groupthirdproperty");
            return (Criteria) this;
        }

        public Criteria andGroupthirdpropertyIn(List<String> values) {
            addCriterion("groupthirdproperty in", values, "groupthirdproperty");
            return (Criteria) this;
        }

        public Criteria andGroupthirdpropertyNotIn(List<String> values) {
            addCriterion("groupthirdproperty not in", values, "groupthirdproperty");
            return (Criteria) this;
        }

        public Criteria andGroupthirdpropertyBetween(String value1, String value2) {
            addCriterion("groupthirdproperty between", value1, value2, "groupthirdproperty");
            return (Criteria) this;
        }

        public Criteria andGroupthirdpropertyNotBetween(String value1, String value2) {
            addCriterion("groupthirdproperty not between", value1, value2, "groupthirdproperty");
            return (Criteria) this;
        }

        public Criteria andGroupintroduceIsNull() {
            addCriterion("groupintroduce is null");
            return (Criteria) this;
        }

        public Criteria andGroupintroduceIsNotNull() {
            addCriterion("groupintroduce is not null");
            return (Criteria) this;
        }

        public Criteria andGroupintroduceEqualTo(String value) {
            addCriterion("groupintroduce =", value, "groupintroduce");
            return (Criteria) this;
        }

        public Criteria andGroupintroduceNotEqualTo(String value) {
            addCriterion("groupintroduce <>", value, "groupintroduce");
            return (Criteria) this;
        }

        public Criteria andGroupintroduceGreaterThan(String value) {
            addCriterion("groupintroduce >", value, "groupintroduce");
            return (Criteria) this;
        }

        public Criteria andGroupintroduceGreaterThanOrEqualTo(String value) {
            addCriterion("groupintroduce >=", value, "groupintroduce");
            return (Criteria) this;
        }

        public Criteria andGroupintroduceLessThan(String value) {
            addCriterion("groupintroduce <", value, "groupintroduce");
            return (Criteria) this;
        }

        public Criteria andGroupintroduceLessThanOrEqualTo(String value) {
            addCriterion("groupintroduce <=", value, "groupintroduce");
            return (Criteria) this;
        }

        public Criteria andGroupintroduceLike(String value) {
            addCriterion("groupintroduce like", value, "groupintroduce");
            return (Criteria) this;
        }

        public Criteria andGroupintroduceNotLike(String value) {
            addCriterion("groupintroduce not like", value, "groupintroduce");
            return (Criteria) this;
        }

        public Criteria andGroupintroduceIn(List<String> values) {
            addCriterion("groupintroduce in", values, "groupintroduce");
            return (Criteria) this;
        }

        public Criteria andGroupintroduceNotIn(List<String> values) {
            addCriterion("groupintroduce not in", values, "groupintroduce");
            return (Criteria) this;
        }

        public Criteria andGroupintroduceBetween(String value1, String value2) {
            addCriterion("groupintroduce between", value1, value2, "groupintroduce");
            return (Criteria) this;
        }

        public Criteria andGroupintroduceNotBetween(String value1, String value2) {
            addCriterion("groupintroduce not between", value1, value2, "groupintroduce");
            return (Criteria) this;
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