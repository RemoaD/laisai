package com.tata.groupbaoming.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GroupbaomingVOExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public GroupbaomingVOExample() {
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

        public Criteria andBaomingidIsNull() {
            addCriterion("baomingid is null");
            return (Criteria) this;
        }

        public Criteria andBaomingidIsNotNull() {
            addCriterion("baomingid is not null");
            return (Criteria) this;
        }

        public Criteria andBaomingidEqualTo(Integer value) {
            addCriterion("baomingid =", value, "baomingid");
            return (Criteria) this;
        }

        public Criteria andBaomingidNotEqualTo(Integer value) {
            addCriterion("baomingid <>", value, "baomingid");
            return (Criteria) this;
        }

        public Criteria andBaomingidGreaterThan(Integer value) {
            addCriterion("baomingid >", value, "baomingid");
            return (Criteria) this;
        }

        public Criteria andBaomingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("baomingid >=", value, "baomingid");
            return (Criteria) this;
        }

        public Criteria andBaomingidLessThan(Integer value) {
            addCriterion("baomingid <", value, "baomingid");
            return (Criteria) this;
        }

        public Criteria andBaomingidLessThanOrEqualTo(Integer value) {
            addCriterion("baomingid <=", value, "baomingid");
            return (Criteria) this;
        }

        public Criteria andBaomingidIn(List<Integer> values) {
            addCriterion("baomingid in", values, "baomingid");
            return (Criteria) this;
        }

        public Criteria andBaomingidNotIn(List<Integer> values) {
            addCriterion("baomingid not in", values, "baomingid");
            return (Criteria) this;
        }

        public Criteria andBaomingidBetween(Integer value1, Integer value2) {
            addCriterion("baomingid between", value1, value2, "baomingid");
            return (Criteria) this;
        }

        public Criteria andBaomingidNotBetween(Integer value1, Integer value2) {
            addCriterion("baomingid not between", value1, value2, "baomingid");
            return (Criteria) this;
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

        public Criteria andUsertruename1IsNull() {
            addCriterion("usertruename1 is null");
            return (Criteria) this;
        }

        public Criteria andUsertruename1IsNotNull() {
            addCriterion("usertruename1 is not null");
            return (Criteria) this;
        }

        public Criteria andUsertruename1EqualTo(String value) {
            addCriterion("usertruename1 =", value, "usertruename1");
            return (Criteria) this;
        }

        public Criteria andUsertruename1NotEqualTo(String value) {
            addCriterion("usertruename1 <>", value, "usertruename1");
            return (Criteria) this;
        }

        public Criteria andUsertruename1GreaterThan(String value) {
            addCriterion("usertruename1 >", value, "usertruename1");
            return (Criteria) this;
        }

        public Criteria andUsertruename1GreaterThanOrEqualTo(String value) {
            addCriterion("usertruename1 >=", value, "usertruename1");
            return (Criteria) this;
        }

        public Criteria andUsertruename1LessThan(String value) {
            addCriterion("usertruename1 <", value, "usertruename1");
            return (Criteria) this;
        }

        public Criteria andUsertruename1LessThanOrEqualTo(String value) {
            addCriterion("usertruename1 <=", value, "usertruename1");
            return (Criteria) this;
        }

        public Criteria andUsertruename1Like(String value) {
            addCriterion("usertruename1 like", value, "usertruename1");
            return (Criteria) this;
        }

        public Criteria andUsertruename1NotLike(String value) {
            addCriterion("usertruename1 not like", value, "usertruename1");
            return (Criteria) this;
        }

        public Criteria andUsertruename1In(List<String> values) {
            addCriterion("usertruename1 in", values, "usertruename1");
            return (Criteria) this;
        }

        public Criteria andUsertruename1NotIn(List<String> values) {
            addCriterion("usertruename1 not in", values, "usertruename1");
            return (Criteria) this;
        }

        public Criteria andUsertruename1Between(String value1, String value2) {
            addCriterion("usertruename1 between", value1, value2, "usertruename1");
            return (Criteria) this;
        }

        public Criteria andUsertruename1NotBetween(String value1, String value2) {
            addCriterion("usertruename1 not between", value1, value2, "usertruename1");
            return (Criteria) this;
        }

        public Criteria andUserpinyin1IsNull() {
            addCriterion("userpinyin1 is null");
            return (Criteria) this;
        }

        public Criteria andUserpinyin1IsNotNull() {
            addCriterion("userpinyin1 is not null");
            return (Criteria) this;
        }

        public Criteria andUserpinyin1EqualTo(String value) {
            addCriterion("userpinyin1 =", value, "userpinyin1");
            return (Criteria) this;
        }

        public Criteria andUserpinyin1NotEqualTo(String value) {
            addCriterion("userpinyin1 <>", value, "userpinyin1");
            return (Criteria) this;
        }

        public Criteria andUserpinyin1GreaterThan(String value) {
            addCriterion("userpinyin1 >", value, "userpinyin1");
            return (Criteria) this;
        }

        public Criteria andUserpinyin1GreaterThanOrEqualTo(String value) {
            addCriterion("userpinyin1 >=", value, "userpinyin1");
            return (Criteria) this;
        }

        public Criteria andUserpinyin1LessThan(String value) {
            addCriterion("userpinyin1 <", value, "userpinyin1");
            return (Criteria) this;
        }

        public Criteria andUserpinyin1LessThanOrEqualTo(String value) {
            addCriterion("userpinyin1 <=", value, "userpinyin1");
            return (Criteria) this;
        }

        public Criteria andUserpinyin1Like(String value) {
            addCriterion("userpinyin1 like", value, "userpinyin1");
            return (Criteria) this;
        }

        public Criteria andUserpinyin1NotLike(String value) {
            addCriterion("userpinyin1 not like", value, "userpinyin1");
            return (Criteria) this;
        }

        public Criteria andUserpinyin1In(List<String> values) {
            addCriterion("userpinyin1 in", values, "userpinyin1");
            return (Criteria) this;
        }

        public Criteria andUserpinyin1NotIn(List<String> values) {
            addCriterion("userpinyin1 not in", values, "userpinyin1");
            return (Criteria) this;
        }

        public Criteria andUserpinyin1Between(String value1, String value2) {
            addCriterion("userpinyin1 between", value1, value2, "userpinyin1");
            return (Criteria) this;
        }

        public Criteria andUserpinyin1NotBetween(String value1, String value2) {
            addCriterion("userpinyin1 not between", value1, value2, "userpinyin1");
            return (Criteria) this;
        }

        public Criteria andUserschool1IsNull() {
            addCriterion("userschool1 is null");
            return (Criteria) this;
        }

        public Criteria andUserschool1IsNotNull() {
            addCriterion("userschool1 is not null");
            return (Criteria) this;
        }

        public Criteria andUserschool1EqualTo(String value) {
            addCriterion("userschool1 =", value, "userschool1");
            return (Criteria) this;
        }

        public Criteria andUserschool1NotEqualTo(String value) {
            addCriterion("userschool1 <>", value, "userschool1");
            return (Criteria) this;
        }

        public Criteria andUserschool1GreaterThan(String value) {
            addCriterion("userschool1 >", value, "userschool1");
            return (Criteria) this;
        }

        public Criteria andUserschool1GreaterThanOrEqualTo(String value) {
            addCriterion("userschool1 >=", value, "userschool1");
            return (Criteria) this;
        }

        public Criteria andUserschool1LessThan(String value) {
            addCriterion("userschool1 <", value, "userschool1");
            return (Criteria) this;
        }

        public Criteria andUserschool1LessThanOrEqualTo(String value) {
            addCriterion("userschool1 <=", value, "userschool1");
            return (Criteria) this;
        }

        public Criteria andUserschool1Like(String value) {
            addCriterion("userschool1 like", value, "userschool1");
            return (Criteria) this;
        }

        public Criteria andUserschool1NotLike(String value) {
            addCriterion("userschool1 not like", value, "userschool1");
            return (Criteria) this;
        }

        public Criteria andUserschool1In(List<String> values) {
            addCriterion("userschool1 in", values, "userschool1");
            return (Criteria) this;
        }

        public Criteria andUserschool1NotIn(List<String> values) {
            addCriterion("userschool1 not in", values, "userschool1");
            return (Criteria) this;
        }

        public Criteria andUserschool1Between(String value1, String value2) {
            addCriterion("userschool1 between", value1, value2, "userschool1");
            return (Criteria) this;
        }

        public Criteria andUserschool1NotBetween(String value1, String value2) {
            addCriterion("userschool1 not between", value1, value2, "userschool1");
            return (Criteria) this;
        }

        public Criteria andUserdepartment1IsNull() {
            addCriterion("userdepartment1 is null");
            return (Criteria) this;
        }

        public Criteria andUserdepartment1IsNotNull() {
            addCriterion("userdepartment1 is not null");
            return (Criteria) this;
        }

        public Criteria andUserdepartment1EqualTo(String value) {
            addCriterion("userdepartment1 =", value, "userdepartment1");
            return (Criteria) this;
        }

        public Criteria andUserdepartment1NotEqualTo(String value) {
            addCriterion("userdepartment1 <>", value, "userdepartment1");
            return (Criteria) this;
        }

        public Criteria andUserdepartment1GreaterThan(String value) {
            addCriterion("userdepartment1 >", value, "userdepartment1");
            return (Criteria) this;
        }

        public Criteria andUserdepartment1GreaterThanOrEqualTo(String value) {
            addCriterion("userdepartment1 >=", value, "userdepartment1");
            return (Criteria) this;
        }

        public Criteria andUserdepartment1LessThan(String value) {
            addCriterion("userdepartment1 <", value, "userdepartment1");
            return (Criteria) this;
        }

        public Criteria andUserdepartment1LessThanOrEqualTo(String value) {
            addCriterion("userdepartment1 <=", value, "userdepartment1");
            return (Criteria) this;
        }

        public Criteria andUserdepartment1Like(String value) {
            addCriterion("userdepartment1 like", value, "userdepartment1");
            return (Criteria) this;
        }

        public Criteria andUserdepartment1NotLike(String value) {
            addCriterion("userdepartment1 not like", value, "userdepartment1");
            return (Criteria) this;
        }

        public Criteria andUserdepartment1In(List<String> values) {
            addCriterion("userdepartment1 in", values, "userdepartment1");
            return (Criteria) this;
        }

        public Criteria andUserdepartment1NotIn(List<String> values) {
            addCriterion("userdepartment1 not in", values, "userdepartment1");
            return (Criteria) this;
        }

        public Criteria andUserdepartment1Between(String value1, String value2) {
            addCriterion("userdepartment1 between", value1, value2, "userdepartment1");
            return (Criteria) this;
        }

        public Criteria andUserdepartment1NotBetween(String value1, String value2) {
            addCriterion("userdepartment1 not between", value1, value2, "userdepartment1");
            return (Criteria) this;
        }

        public Criteria andUsermajor1IsNull() {
            addCriterion("usermajor1 is null");
            return (Criteria) this;
        }

        public Criteria andUsermajor1IsNotNull() {
            addCriterion("usermajor1 is not null");
            return (Criteria) this;
        }

        public Criteria andUsermajor1EqualTo(String value) {
            addCriterion("usermajor1 =", value, "usermajor1");
            return (Criteria) this;
        }

        public Criteria andUsermajor1NotEqualTo(String value) {
            addCriterion("usermajor1 <>", value, "usermajor1");
            return (Criteria) this;
        }

        public Criteria andUsermajor1GreaterThan(String value) {
            addCriterion("usermajor1 >", value, "usermajor1");
            return (Criteria) this;
        }

        public Criteria andUsermajor1GreaterThanOrEqualTo(String value) {
            addCriterion("usermajor1 >=", value, "usermajor1");
            return (Criteria) this;
        }

        public Criteria andUsermajor1LessThan(String value) {
            addCriterion("usermajor1 <", value, "usermajor1");
            return (Criteria) this;
        }

        public Criteria andUsermajor1LessThanOrEqualTo(String value) {
            addCriterion("usermajor1 <=", value, "usermajor1");
            return (Criteria) this;
        }

        public Criteria andUsermajor1Like(String value) {
            addCriterion("usermajor1 like", value, "usermajor1");
            return (Criteria) this;
        }

        public Criteria andUsermajor1NotLike(String value) {
            addCriterion("usermajor1 not like", value, "usermajor1");
            return (Criteria) this;
        }

        public Criteria andUsermajor1In(List<String> values) {
            addCriterion("usermajor1 in", values, "usermajor1");
            return (Criteria) this;
        }

        public Criteria andUsermajor1NotIn(List<String> values) {
            addCriterion("usermajor1 not in", values, "usermajor1");
            return (Criteria) this;
        }

        public Criteria andUsermajor1Between(String value1, String value2) {
            addCriterion("usermajor1 between", value1, value2, "usermajor1");
            return (Criteria) this;
        }

        public Criteria andUsermajor1NotBetween(String value1, String value2) {
            addCriterion("usermajor1 not between", value1, value2, "usermajor1");
            return (Criteria) this;
        }

        public Criteria andUsergrade1IsNull() {
            addCriterion("usergrade1 is null");
            return (Criteria) this;
        }

        public Criteria andUsergrade1IsNotNull() {
            addCriterion("usergrade1 is not null");
            return (Criteria) this;
        }

        public Criteria andUsergrade1EqualTo(String value) {
            addCriterion("usergrade1 =", value, "usergrade1");
            return (Criteria) this;
        }

        public Criteria andUsergrade1NotEqualTo(String value) {
            addCriterion("usergrade1 <>", value, "usergrade1");
            return (Criteria) this;
        }

        public Criteria andUsergrade1GreaterThan(String value) {
            addCriterion("usergrade1 >", value, "usergrade1");
            return (Criteria) this;
        }

        public Criteria andUsergrade1GreaterThanOrEqualTo(String value) {
            addCriterion("usergrade1 >=", value, "usergrade1");
            return (Criteria) this;
        }

        public Criteria andUsergrade1LessThan(String value) {
            addCriterion("usergrade1 <", value, "usergrade1");
            return (Criteria) this;
        }

        public Criteria andUsergrade1LessThanOrEqualTo(String value) {
            addCriterion("usergrade1 <=", value, "usergrade1");
            return (Criteria) this;
        }

        public Criteria andUsergrade1Like(String value) {
            addCriterion("usergrade1 like", value, "usergrade1");
            return (Criteria) this;
        }

        public Criteria andUsergrade1NotLike(String value) {
            addCriterion("usergrade1 not like", value, "usergrade1");
            return (Criteria) this;
        }

        public Criteria andUsergrade1In(List<String> values) {
            addCriterion("usergrade1 in", values, "usergrade1");
            return (Criteria) this;
        }

        public Criteria andUsergrade1NotIn(List<String> values) {
            addCriterion("usergrade1 not in", values, "usergrade1");
            return (Criteria) this;
        }

        public Criteria andUsergrade1Between(String value1, String value2) {
            addCriterion("usergrade1 between", value1, value2, "usergrade1");
            return (Criteria) this;
        }

        public Criteria andUsergrade1NotBetween(String value1, String value2) {
            addCriterion("usergrade1 not between", value1, value2, "usergrade1");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber1IsNull() {
            addCriterion("userstudentnumber1 is null");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber1IsNotNull() {
            addCriterion("userstudentnumber1 is not null");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber1EqualTo(String value) {
            addCriterion("userstudentnumber1 =", value, "userstudentnumber1");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber1NotEqualTo(String value) {
            addCriterion("userstudentnumber1 <>", value, "userstudentnumber1");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber1GreaterThan(String value) {
            addCriterion("userstudentnumber1 >", value, "userstudentnumber1");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber1GreaterThanOrEqualTo(String value) {
            addCriterion("userstudentnumber1 >=", value, "userstudentnumber1");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber1LessThan(String value) {
            addCriterion("userstudentnumber1 <", value, "userstudentnumber1");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber1LessThanOrEqualTo(String value) {
            addCriterion("userstudentnumber1 <=", value, "userstudentnumber1");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber1Like(String value) {
            addCriterion("userstudentnumber1 like", value, "userstudentnumber1");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber1NotLike(String value) {
            addCriterion("userstudentnumber1 not like", value, "userstudentnumber1");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber1In(List<String> values) {
            addCriterion("userstudentnumber1 in", values, "userstudentnumber1");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber1NotIn(List<String> values) {
            addCriterion("userstudentnumber1 not in", values, "userstudentnumber1");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber1Between(String value1, String value2) {
            addCriterion("userstudentnumber1 between", value1, value2, "userstudentnumber1");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber1NotBetween(String value1, String value2) {
            addCriterion("userstudentnumber1 not between", value1, value2, "userstudentnumber1");
            return (Criteria) this;
        }

        public Criteria andUsersex1IsNull() {
            addCriterion("usersex1 is null");
            return (Criteria) this;
        }

        public Criteria andUsersex1IsNotNull() {
            addCriterion("usersex1 is not null");
            return (Criteria) this;
        }

        public Criteria andUsersex1EqualTo(String value) {
            addCriterion("usersex1 =", value, "usersex1");
            return (Criteria) this;
        }

        public Criteria andUsersex1NotEqualTo(String value) {
            addCriterion("usersex1 <>", value, "usersex1");
            return (Criteria) this;
        }

        public Criteria andUsersex1GreaterThan(String value) {
            addCriterion("usersex1 >", value, "usersex1");
            return (Criteria) this;
        }

        public Criteria andUsersex1GreaterThanOrEqualTo(String value) {
            addCriterion("usersex1 >=", value, "usersex1");
            return (Criteria) this;
        }

        public Criteria andUsersex1LessThan(String value) {
            addCriterion("usersex1 <", value, "usersex1");
            return (Criteria) this;
        }

        public Criteria andUsersex1LessThanOrEqualTo(String value) {
            addCriterion("usersex1 <=", value, "usersex1");
            return (Criteria) this;
        }

        public Criteria andUsersex1Like(String value) {
            addCriterion("usersex1 like", value, "usersex1");
            return (Criteria) this;
        }

        public Criteria andUsersex1NotLike(String value) {
            addCriterion("usersex1 not like", value, "usersex1");
            return (Criteria) this;
        }

        public Criteria andUsersex1In(List<String> values) {
            addCriterion("usersex1 in", values, "usersex1");
            return (Criteria) this;
        }

        public Criteria andUsersex1NotIn(List<String> values) {
            addCriterion("usersex1 not in", values, "usersex1");
            return (Criteria) this;
        }

        public Criteria andUsersex1Between(String value1, String value2) {
            addCriterion("usersex1 between", value1, value2, "usersex1");
            return (Criteria) this;
        }

        public Criteria andUsersex1NotBetween(String value1, String value2) {
            addCriterion("usersex1 not between", value1, value2, "usersex1");
            return (Criteria) this;
        }

        public Criteria andUsertel1IsNull() {
            addCriterion("usertel1 is null");
            return (Criteria) this;
        }

        public Criteria andUsertel1IsNotNull() {
            addCriterion("usertel1 is not null");
            return (Criteria) this;
        }

        public Criteria andUsertel1EqualTo(String value) {
            addCriterion("usertel1 =", value, "usertel1");
            return (Criteria) this;
        }

        public Criteria andUsertel1NotEqualTo(String value) {
            addCriterion("usertel1 <>", value, "usertel1");
            return (Criteria) this;
        }

        public Criteria andUsertel1GreaterThan(String value) {
            addCriterion("usertel1 >", value, "usertel1");
            return (Criteria) this;
        }

        public Criteria andUsertel1GreaterThanOrEqualTo(String value) {
            addCriterion("usertel1 >=", value, "usertel1");
            return (Criteria) this;
        }

        public Criteria andUsertel1LessThan(String value) {
            addCriterion("usertel1 <", value, "usertel1");
            return (Criteria) this;
        }

        public Criteria andUsertel1LessThanOrEqualTo(String value) {
            addCriterion("usertel1 <=", value, "usertel1");
            return (Criteria) this;
        }

        public Criteria andUsertel1Like(String value) {
            addCriterion("usertel1 like", value, "usertel1");
            return (Criteria) this;
        }

        public Criteria andUsertel1NotLike(String value) {
            addCriterion("usertel1 not like", value, "usertel1");
            return (Criteria) this;
        }

        public Criteria andUsertel1In(List<String> values) {
            addCriterion("usertel1 in", values, "usertel1");
            return (Criteria) this;
        }

        public Criteria andUsertel1NotIn(List<String> values) {
            addCriterion("usertel1 not in", values, "usertel1");
            return (Criteria) this;
        }

        public Criteria andUsertel1Between(String value1, String value2) {
            addCriterion("usertel1 between", value1, value2, "usertel1");
            return (Criteria) this;
        }

        public Criteria andUsertel1NotBetween(String value1, String value2) {
            addCriterion("usertel1 not between", value1, value2, "usertel1");
            return (Criteria) this;
        }

        public Criteria andUserteacher1IsNull() {
            addCriterion("userteacher1 is null");
            return (Criteria) this;
        }

        public Criteria andUserteacher1IsNotNull() {
            addCriterion("userteacher1 is not null");
            return (Criteria) this;
        }

        public Criteria andUserteacher1EqualTo(String value) {
            addCriterion("userteacher1 =", value, "userteacher1");
            return (Criteria) this;
        }

        public Criteria andUserteacher1NotEqualTo(String value) {
            addCriterion("userteacher1 <>", value, "userteacher1");
            return (Criteria) this;
        }

        public Criteria andUserteacher1GreaterThan(String value) {
            addCriterion("userteacher1 >", value, "userteacher1");
            return (Criteria) this;
        }

        public Criteria andUserteacher1GreaterThanOrEqualTo(String value) {
            addCriterion("userteacher1 >=", value, "userteacher1");
            return (Criteria) this;
        }

        public Criteria andUserteacher1LessThan(String value) {
            addCriterion("userteacher1 <", value, "userteacher1");
            return (Criteria) this;
        }

        public Criteria andUserteacher1LessThanOrEqualTo(String value) {
            addCriterion("userteacher1 <=", value, "userteacher1");
            return (Criteria) this;
        }

        public Criteria andUserteacher1Like(String value) {
            addCriterion("userteacher1 like", value, "userteacher1");
            return (Criteria) this;
        }

        public Criteria andUserteacher1NotLike(String value) {
            addCriterion("userteacher1 not like", value, "userteacher1");
            return (Criteria) this;
        }

        public Criteria andUserteacher1In(List<String> values) {
            addCriterion("userteacher1 in", values, "userteacher1");
            return (Criteria) this;
        }

        public Criteria andUserteacher1NotIn(List<String> values) {
            addCriterion("userteacher1 not in", values, "userteacher1");
            return (Criteria) this;
        }

        public Criteria andUserteacher1Between(String value1, String value2) {
            addCriterion("userteacher1 between", value1, value2, "userteacher1");
            return (Criteria) this;
        }

        public Criteria andUserteacher1NotBetween(String value1, String value2) {
            addCriterion("userteacher1 not between", value1, value2, "userteacher1");
            return (Criteria) this;
        }

        public Criteria andUsertruename2IsNull() {
            addCriterion("usertruename2 is null");
            return (Criteria) this;
        }

        public Criteria andUsertruename2IsNotNull() {
            addCriterion("usertruename2 is not null");
            return (Criteria) this;
        }

        public Criteria andUsertruename2EqualTo(String value) {
            addCriterion("usertruename2 =", value, "usertruename2");
            return (Criteria) this;
        }

        public Criteria andUsertruename2NotEqualTo(String value) {
            addCriterion("usertruename2 <>", value, "usertruename2");
            return (Criteria) this;
        }

        public Criteria andUsertruename2GreaterThan(String value) {
            addCriterion("usertruename2 >", value, "usertruename2");
            return (Criteria) this;
        }

        public Criteria andUsertruename2GreaterThanOrEqualTo(String value) {
            addCriterion("usertruename2 >=", value, "usertruename2");
            return (Criteria) this;
        }

        public Criteria andUsertruename2LessThan(String value) {
            addCriterion("usertruename2 <", value, "usertruename2");
            return (Criteria) this;
        }

        public Criteria andUsertruename2LessThanOrEqualTo(String value) {
            addCriterion("usertruename2 <=", value, "usertruename2");
            return (Criteria) this;
        }

        public Criteria andUsertruename2Like(String value) {
            addCriterion("usertruename2 like", value, "usertruename2");
            return (Criteria) this;
        }

        public Criteria andUsertruename2NotLike(String value) {
            addCriterion("usertruename2 not like", value, "usertruename2");
            return (Criteria) this;
        }

        public Criteria andUsertruename2In(List<String> values) {
            addCriterion("usertruename2 in", values, "usertruename2");
            return (Criteria) this;
        }

        public Criteria andUsertruename2NotIn(List<String> values) {
            addCriterion("usertruename2 not in", values, "usertruename2");
            return (Criteria) this;
        }

        public Criteria andUsertruename2Between(String value1, String value2) {
            addCriterion("usertruename2 between", value1, value2, "usertruename2");
            return (Criteria) this;
        }

        public Criteria andUsertruename2NotBetween(String value1, String value2) {
            addCriterion("usertruename2 not between", value1, value2, "usertruename2");
            return (Criteria) this;
        }

        public Criteria andUserpinyin2IsNull() {
            addCriterion("userpinyin2 is null");
            return (Criteria) this;
        }

        public Criteria andUserpinyin2IsNotNull() {
            addCriterion("userpinyin2 is not null");
            return (Criteria) this;
        }

        public Criteria andUserpinyin2EqualTo(String value) {
            addCriterion("userpinyin2 =", value, "userpinyin2");
            return (Criteria) this;
        }

        public Criteria andUserpinyin2NotEqualTo(String value) {
            addCriterion("userpinyin2 <>", value, "userpinyin2");
            return (Criteria) this;
        }

        public Criteria andUserpinyin2GreaterThan(String value) {
            addCriterion("userpinyin2 >", value, "userpinyin2");
            return (Criteria) this;
        }

        public Criteria andUserpinyin2GreaterThanOrEqualTo(String value) {
            addCriterion("userpinyin2 >=", value, "userpinyin2");
            return (Criteria) this;
        }

        public Criteria andUserpinyin2LessThan(String value) {
            addCriterion("userpinyin2 <", value, "userpinyin2");
            return (Criteria) this;
        }

        public Criteria andUserpinyin2LessThanOrEqualTo(String value) {
            addCriterion("userpinyin2 <=", value, "userpinyin2");
            return (Criteria) this;
        }

        public Criteria andUserpinyin2Like(String value) {
            addCriterion("userpinyin2 like", value, "userpinyin2");
            return (Criteria) this;
        }

        public Criteria andUserpinyin2NotLike(String value) {
            addCriterion("userpinyin2 not like", value, "userpinyin2");
            return (Criteria) this;
        }

        public Criteria andUserpinyin2In(List<String> values) {
            addCriterion("userpinyin2 in", values, "userpinyin2");
            return (Criteria) this;
        }

        public Criteria andUserpinyin2NotIn(List<String> values) {
            addCriterion("userpinyin2 not in", values, "userpinyin2");
            return (Criteria) this;
        }

        public Criteria andUserpinyin2Between(String value1, String value2) {
            addCriterion("userpinyin2 between", value1, value2, "userpinyin2");
            return (Criteria) this;
        }

        public Criteria andUserpinyin2NotBetween(String value1, String value2) {
            addCriterion("userpinyin2 not between", value1, value2, "userpinyin2");
            return (Criteria) this;
        }

        public Criteria andUserschool2IsNull() {
            addCriterion("userschool2 is null");
            return (Criteria) this;
        }

        public Criteria andUserschool2IsNotNull() {
            addCriterion("userschool2 is not null");
            return (Criteria) this;
        }

        public Criteria andUserschool2EqualTo(String value) {
            addCriterion("userschool2 =", value, "userschool2");
            return (Criteria) this;
        }

        public Criteria andUserschool2NotEqualTo(String value) {
            addCriterion("userschool2 <>", value, "userschool2");
            return (Criteria) this;
        }

        public Criteria andUserschool2GreaterThan(String value) {
            addCriterion("userschool2 >", value, "userschool2");
            return (Criteria) this;
        }

        public Criteria andUserschool2GreaterThanOrEqualTo(String value) {
            addCriterion("userschool2 >=", value, "userschool2");
            return (Criteria) this;
        }

        public Criteria andUserschool2LessThan(String value) {
            addCriterion("userschool2 <", value, "userschool2");
            return (Criteria) this;
        }

        public Criteria andUserschool2LessThanOrEqualTo(String value) {
            addCriterion("userschool2 <=", value, "userschool2");
            return (Criteria) this;
        }

        public Criteria andUserschool2Like(String value) {
            addCriterion("userschool2 like", value, "userschool2");
            return (Criteria) this;
        }

        public Criteria andUserschool2NotLike(String value) {
            addCriterion("userschool2 not like", value, "userschool2");
            return (Criteria) this;
        }

        public Criteria andUserschool2In(List<String> values) {
            addCriterion("userschool2 in", values, "userschool2");
            return (Criteria) this;
        }

        public Criteria andUserschool2NotIn(List<String> values) {
            addCriterion("userschool2 not in", values, "userschool2");
            return (Criteria) this;
        }

        public Criteria andUserschool2Between(String value1, String value2) {
            addCriterion("userschool2 between", value1, value2, "userschool2");
            return (Criteria) this;
        }

        public Criteria andUserschool2NotBetween(String value1, String value2) {
            addCriterion("userschool2 not between", value1, value2, "userschool2");
            return (Criteria) this;
        }

        public Criteria andUserdepartment2IsNull() {
            addCriterion("userdepartment2 is null");
            return (Criteria) this;
        }

        public Criteria andUserdepartment2IsNotNull() {
            addCriterion("userdepartment2 is not null");
            return (Criteria) this;
        }

        public Criteria andUserdepartment2EqualTo(String value) {
            addCriterion("userdepartment2 =", value, "userdepartment2");
            return (Criteria) this;
        }

        public Criteria andUserdepartment2NotEqualTo(String value) {
            addCriterion("userdepartment2 <>", value, "userdepartment2");
            return (Criteria) this;
        }

        public Criteria andUserdepartment2GreaterThan(String value) {
            addCriterion("userdepartment2 >", value, "userdepartment2");
            return (Criteria) this;
        }

        public Criteria andUserdepartment2GreaterThanOrEqualTo(String value) {
            addCriterion("userdepartment2 >=", value, "userdepartment2");
            return (Criteria) this;
        }

        public Criteria andUserdepartment2LessThan(String value) {
            addCriterion("userdepartment2 <", value, "userdepartment2");
            return (Criteria) this;
        }

        public Criteria andUserdepartment2LessThanOrEqualTo(String value) {
            addCriterion("userdepartment2 <=", value, "userdepartment2");
            return (Criteria) this;
        }

        public Criteria andUserdepartment2Like(String value) {
            addCriterion("userdepartment2 like", value, "userdepartment2");
            return (Criteria) this;
        }

        public Criteria andUserdepartment2NotLike(String value) {
            addCriterion("userdepartment2 not like", value, "userdepartment2");
            return (Criteria) this;
        }

        public Criteria andUserdepartment2In(List<String> values) {
            addCriterion("userdepartment2 in", values, "userdepartment2");
            return (Criteria) this;
        }

        public Criteria andUserdepartment2NotIn(List<String> values) {
            addCriterion("userdepartment2 not in", values, "userdepartment2");
            return (Criteria) this;
        }

        public Criteria andUserdepartment2Between(String value1, String value2) {
            addCriterion("userdepartment2 between", value1, value2, "userdepartment2");
            return (Criteria) this;
        }

        public Criteria andUserdepartment2NotBetween(String value1, String value2) {
            addCriterion("userdepartment2 not between", value1, value2, "userdepartment2");
            return (Criteria) this;
        }

        public Criteria andUsermajor2IsNull() {
            addCriterion("usermajor2 is null");
            return (Criteria) this;
        }

        public Criteria andUsermajor2IsNotNull() {
            addCriterion("usermajor2 is not null");
            return (Criteria) this;
        }

        public Criteria andUsermajor2EqualTo(String value) {
            addCriterion("usermajor2 =", value, "usermajor2");
            return (Criteria) this;
        }

        public Criteria andUsermajor2NotEqualTo(String value) {
            addCriterion("usermajor2 <>", value, "usermajor2");
            return (Criteria) this;
        }

        public Criteria andUsermajor2GreaterThan(String value) {
            addCriterion("usermajor2 >", value, "usermajor2");
            return (Criteria) this;
        }

        public Criteria andUsermajor2GreaterThanOrEqualTo(String value) {
            addCriterion("usermajor2 >=", value, "usermajor2");
            return (Criteria) this;
        }

        public Criteria andUsermajor2LessThan(String value) {
            addCriterion("usermajor2 <", value, "usermajor2");
            return (Criteria) this;
        }

        public Criteria andUsermajor2LessThanOrEqualTo(String value) {
            addCriterion("usermajor2 <=", value, "usermajor2");
            return (Criteria) this;
        }

        public Criteria andUsermajor2Like(String value) {
            addCriterion("usermajor2 like", value, "usermajor2");
            return (Criteria) this;
        }

        public Criteria andUsermajor2NotLike(String value) {
            addCriterion("usermajor2 not like", value, "usermajor2");
            return (Criteria) this;
        }

        public Criteria andUsermajor2In(List<String> values) {
            addCriterion("usermajor2 in", values, "usermajor2");
            return (Criteria) this;
        }

        public Criteria andUsermajor2NotIn(List<String> values) {
            addCriterion("usermajor2 not in", values, "usermajor2");
            return (Criteria) this;
        }

        public Criteria andUsermajor2Between(String value1, String value2) {
            addCriterion("usermajor2 between", value1, value2, "usermajor2");
            return (Criteria) this;
        }

        public Criteria andUsermajor2NotBetween(String value1, String value2) {
            addCriterion("usermajor2 not between", value1, value2, "usermajor2");
            return (Criteria) this;
        }

        public Criteria andUsergrade2IsNull() {
            addCriterion("usergrade2 is null");
            return (Criteria) this;
        }

        public Criteria andUsergrade2IsNotNull() {
            addCriterion("usergrade2 is not null");
            return (Criteria) this;
        }

        public Criteria andUsergrade2EqualTo(String value) {
            addCriterion("usergrade2 =", value, "usergrade2");
            return (Criteria) this;
        }

        public Criteria andUsergrade2NotEqualTo(String value) {
            addCriterion("usergrade2 <>", value, "usergrade2");
            return (Criteria) this;
        }

        public Criteria andUsergrade2GreaterThan(String value) {
            addCriterion("usergrade2 >", value, "usergrade2");
            return (Criteria) this;
        }

        public Criteria andUsergrade2GreaterThanOrEqualTo(String value) {
            addCriterion("usergrade2 >=", value, "usergrade2");
            return (Criteria) this;
        }

        public Criteria andUsergrade2LessThan(String value) {
            addCriterion("usergrade2 <", value, "usergrade2");
            return (Criteria) this;
        }

        public Criteria andUsergrade2LessThanOrEqualTo(String value) {
            addCriterion("usergrade2 <=", value, "usergrade2");
            return (Criteria) this;
        }

        public Criteria andUsergrade2Like(String value) {
            addCriterion("usergrade2 like", value, "usergrade2");
            return (Criteria) this;
        }

        public Criteria andUsergrade2NotLike(String value) {
            addCriterion("usergrade2 not like", value, "usergrade2");
            return (Criteria) this;
        }

        public Criteria andUsergrade2In(List<String> values) {
            addCriterion("usergrade2 in", values, "usergrade2");
            return (Criteria) this;
        }

        public Criteria andUsergrade2NotIn(List<String> values) {
            addCriterion("usergrade2 not in", values, "usergrade2");
            return (Criteria) this;
        }

        public Criteria andUsergrade2Between(String value1, String value2) {
            addCriterion("usergrade2 between", value1, value2, "usergrade2");
            return (Criteria) this;
        }

        public Criteria andUsergrade2NotBetween(String value1, String value2) {
            addCriterion("usergrade2 not between", value1, value2, "usergrade2");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber2IsNull() {
            addCriterion("userstudentnumber2 is null");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber2IsNotNull() {
            addCriterion("userstudentnumber2 is not null");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber2EqualTo(String value) {
            addCriterion("userstudentnumber2 =", value, "userstudentnumber2");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber2NotEqualTo(String value) {
            addCriterion("userstudentnumber2 <>", value, "userstudentnumber2");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber2GreaterThan(String value) {
            addCriterion("userstudentnumber2 >", value, "userstudentnumber2");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber2GreaterThanOrEqualTo(String value) {
            addCriterion("userstudentnumber2 >=", value, "userstudentnumber2");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber2LessThan(String value) {
            addCriterion("userstudentnumber2 <", value, "userstudentnumber2");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber2LessThanOrEqualTo(String value) {
            addCriterion("userstudentnumber2 <=", value, "userstudentnumber2");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber2Like(String value) {
            addCriterion("userstudentnumber2 like", value, "userstudentnumber2");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber2NotLike(String value) {
            addCriterion("userstudentnumber2 not like", value, "userstudentnumber2");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber2In(List<String> values) {
            addCriterion("userstudentnumber2 in", values, "userstudentnumber2");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber2NotIn(List<String> values) {
            addCriterion("userstudentnumber2 not in", values, "userstudentnumber2");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber2Between(String value1, String value2) {
            addCriterion("userstudentnumber2 between", value1, value2, "userstudentnumber2");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber2NotBetween(String value1, String value2) {
            addCriterion("userstudentnumber2 not between", value1, value2, "userstudentnumber2");
            return (Criteria) this;
        }

        public Criteria andUsersex2IsNull() {
            addCriterion("usersex2 is null");
            return (Criteria) this;
        }

        public Criteria andUsersex2IsNotNull() {
            addCriterion("usersex2 is not null");
            return (Criteria) this;
        }

        public Criteria andUsersex2EqualTo(String value) {
            addCriterion("usersex2 =", value, "usersex2");
            return (Criteria) this;
        }

        public Criteria andUsersex2NotEqualTo(String value) {
            addCriterion("usersex2 <>", value, "usersex2");
            return (Criteria) this;
        }

        public Criteria andUsersex2GreaterThan(String value) {
            addCriterion("usersex2 >", value, "usersex2");
            return (Criteria) this;
        }

        public Criteria andUsersex2GreaterThanOrEqualTo(String value) {
            addCriterion("usersex2 >=", value, "usersex2");
            return (Criteria) this;
        }

        public Criteria andUsersex2LessThan(String value) {
            addCriterion("usersex2 <", value, "usersex2");
            return (Criteria) this;
        }

        public Criteria andUsersex2LessThanOrEqualTo(String value) {
            addCriterion("usersex2 <=", value, "usersex2");
            return (Criteria) this;
        }

        public Criteria andUsersex2Like(String value) {
            addCriterion("usersex2 like", value, "usersex2");
            return (Criteria) this;
        }

        public Criteria andUsersex2NotLike(String value) {
            addCriterion("usersex2 not like", value, "usersex2");
            return (Criteria) this;
        }

        public Criteria andUsersex2In(List<String> values) {
            addCriterion("usersex2 in", values, "usersex2");
            return (Criteria) this;
        }

        public Criteria andUsersex2NotIn(List<String> values) {
            addCriterion("usersex2 not in", values, "usersex2");
            return (Criteria) this;
        }

        public Criteria andUsersex2Between(String value1, String value2) {
            addCriterion("usersex2 between", value1, value2, "usersex2");
            return (Criteria) this;
        }

        public Criteria andUsersex2NotBetween(String value1, String value2) {
            addCriterion("usersex2 not between", value1, value2, "usersex2");
            return (Criteria) this;
        }

        public Criteria andUsertel2IsNull() {
            addCriterion("usertel2 is null");
            return (Criteria) this;
        }

        public Criteria andUsertel2IsNotNull() {
            addCriterion("usertel2 is not null");
            return (Criteria) this;
        }

        public Criteria andUsertel2EqualTo(String value) {
            addCriterion("usertel2 =", value, "usertel2");
            return (Criteria) this;
        }

        public Criteria andUsertel2NotEqualTo(String value) {
            addCriterion("usertel2 <>", value, "usertel2");
            return (Criteria) this;
        }

        public Criteria andUsertel2GreaterThan(String value) {
            addCriterion("usertel2 >", value, "usertel2");
            return (Criteria) this;
        }

        public Criteria andUsertel2GreaterThanOrEqualTo(String value) {
            addCriterion("usertel2 >=", value, "usertel2");
            return (Criteria) this;
        }

        public Criteria andUsertel2LessThan(String value) {
            addCriterion("usertel2 <", value, "usertel2");
            return (Criteria) this;
        }

        public Criteria andUsertel2LessThanOrEqualTo(String value) {
            addCriterion("usertel2 <=", value, "usertel2");
            return (Criteria) this;
        }

        public Criteria andUsertel2Like(String value) {
            addCriterion("usertel2 like", value, "usertel2");
            return (Criteria) this;
        }

        public Criteria andUsertel2NotLike(String value) {
            addCriterion("usertel2 not like", value, "usertel2");
            return (Criteria) this;
        }

        public Criteria andUsertel2In(List<String> values) {
            addCriterion("usertel2 in", values, "usertel2");
            return (Criteria) this;
        }

        public Criteria andUsertel2NotIn(List<String> values) {
            addCriterion("usertel2 not in", values, "usertel2");
            return (Criteria) this;
        }

        public Criteria andUsertel2Between(String value1, String value2) {
            addCriterion("usertel2 between", value1, value2, "usertel2");
            return (Criteria) this;
        }

        public Criteria andUsertel2NotBetween(String value1, String value2) {
            addCriterion("usertel2 not between", value1, value2, "usertel2");
            return (Criteria) this;
        }

        public Criteria andUserteacher2IsNull() {
            addCriterion("userteacher2 is null");
            return (Criteria) this;
        }

        public Criteria andUserteacher2IsNotNull() {
            addCriterion("userteacher2 is not null");
            return (Criteria) this;
        }

        public Criteria andUserteacher2EqualTo(String value) {
            addCriterion("userteacher2 =", value, "userteacher2");
            return (Criteria) this;
        }

        public Criteria andUserteacher2NotEqualTo(String value) {
            addCriterion("userteacher2 <>", value, "userteacher2");
            return (Criteria) this;
        }

        public Criteria andUserteacher2GreaterThan(String value) {
            addCriterion("userteacher2 >", value, "userteacher2");
            return (Criteria) this;
        }

        public Criteria andUserteacher2GreaterThanOrEqualTo(String value) {
            addCriterion("userteacher2 >=", value, "userteacher2");
            return (Criteria) this;
        }

        public Criteria andUserteacher2LessThan(String value) {
            addCriterion("userteacher2 <", value, "userteacher2");
            return (Criteria) this;
        }

        public Criteria andUserteacher2LessThanOrEqualTo(String value) {
            addCriterion("userteacher2 <=", value, "userteacher2");
            return (Criteria) this;
        }

        public Criteria andUserteacher2Like(String value) {
            addCriterion("userteacher2 like", value, "userteacher2");
            return (Criteria) this;
        }

        public Criteria andUserteacher2NotLike(String value) {
            addCriterion("userteacher2 not like", value, "userteacher2");
            return (Criteria) this;
        }

        public Criteria andUserteacher2In(List<String> values) {
            addCriterion("userteacher2 in", values, "userteacher2");
            return (Criteria) this;
        }

        public Criteria andUserteacher2NotIn(List<String> values) {
            addCriterion("userteacher2 not in", values, "userteacher2");
            return (Criteria) this;
        }

        public Criteria andUserteacher2Between(String value1, String value2) {
            addCriterion("userteacher2 between", value1, value2, "userteacher2");
            return (Criteria) this;
        }

        public Criteria andUserteacher2NotBetween(String value1, String value2) {
            addCriterion("userteacher2 not between", value1, value2, "userteacher2");
            return (Criteria) this;
        }

        public Criteria andUsertruename3IsNull() {
            addCriterion("usertruename3 is null");
            return (Criteria) this;
        }

        public Criteria andUsertruename3IsNotNull() {
            addCriterion("usertruename3 is not null");
            return (Criteria) this;
        }

        public Criteria andUsertruename3EqualTo(String value) {
            addCriterion("usertruename3 =", value, "usertruename3");
            return (Criteria) this;
        }

        public Criteria andUsertruename3NotEqualTo(String value) {
            addCriterion("usertruename3 <>", value, "usertruename3");
            return (Criteria) this;
        }

        public Criteria andUsertruename3GreaterThan(String value) {
            addCriterion("usertruename3 >", value, "usertruename3");
            return (Criteria) this;
        }

        public Criteria andUsertruename3GreaterThanOrEqualTo(String value) {
            addCriterion("usertruename3 >=", value, "usertruename3");
            return (Criteria) this;
        }

        public Criteria andUsertruename3LessThan(String value) {
            addCriterion("usertruename3 <", value, "usertruename3");
            return (Criteria) this;
        }

        public Criteria andUsertruename3LessThanOrEqualTo(String value) {
            addCriterion("usertruename3 <=", value, "usertruename3");
            return (Criteria) this;
        }

        public Criteria andUsertruename3Like(String value) {
            addCriterion("usertruename3 like", value, "usertruename3");
            return (Criteria) this;
        }

        public Criteria andUsertruename3NotLike(String value) {
            addCriterion("usertruename3 not like", value, "usertruename3");
            return (Criteria) this;
        }

        public Criteria andUsertruename3In(List<String> values) {
            addCriterion("usertruename3 in", values, "usertruename3");
            return (Criteria) this;
        }

        public Criteria andUsertruename3NotIn(List<String> values) {
            addCriterion("usertruename3 not in", values, "usertruename3");
            return (Criteria) this;
        }

        public Criteria andUsertruename3Between(String value1, String value2) {
            addCriterion("usertruename3 between", value1, value2, "usertruename3");
            return (Criteria) this;
        }

        public Criteria andUsertruename3NotBetween(String value1, String value2) {
            addCriterion("usertruename3 not between", value1, value2, "usertruename3");
            return (Criteria) this;
        }

        public Criteria andUserpinyin3IsNull() {
            addCriterion("userpinyin3 is null");
            return (Criteria) this;
        }

        public Criteria andUserpinyin3IsNotNull() {
            addCriterion("userpinyin3 is not null");
            return (Criteria) this;
        }

        public Criteria andUserpinyin3EqualTo(String value) {
            addCriterion("userpinyin3 =", value, "userpinyin3");
            return (Criteria) this;
        }

        public Criteria andUserpinyin3NotEqualTo(String value) {
            addCriterion("userpinyin3 <>", value, "userpinyin3");
            return (Criteria) this;
        }

        public Criteria andUserpinyin3GreaterThan(String value) {
            addCriterion("userpinyin3 >", value, "userpinyin3");
            return (Criteria) this;
        }

        public Criteria andUserpinyin3GreaterThanOrEqualTo(String value) {
            addCriterion("userpinyin3 >=", value, "userpinyin3");
            return (Criteria) this;
        }

        public Criteria andUserpinyin3LessThan(String value) {
            addCriterion("userpinyin3 <", value, "userpinyin3");
            return (Criteria) this;
        }

        public Criteria andUserpinyin3LessThanOrEqualTo(String value) {
            addCriterion("userpinyin3 <=", value, "userpinyin3");
            return (Criteria) this;
        }

        public Criteria andUserpinyin3Like(String value) {
            addCriterion("userpinyin3 like", value, "userpinyin3");
            return (Criteria) this;
        }

        public Criteria andUserpinyin3NotLike(String value) {
            addCriterion("userpinyin3 not like", value, "userpinyin3");
            return (Criteria) this;
        }

        public Criteria andUserpinyin3In(List<String> values) {
            addCriterion("userpinyin3 in", values, "userpinyin3");
            return (Criteria) this;
        }

        public Criteria andUserpinyin3NotIn(List<String> values) {
            addCriterion("userpinyin3 not in", values, "userpinyin3");
            return (Criteria) this;
        }

        public Criteria andUserpinyin3Between(String value1, String value2) {
            addCriterion("userpinyin3 between", value1, value2, "userpinyin3");
            return (Criteria) this;
        }

        public Criteria andUserpinyin3NotBetween(String value1, String value2) {
            addCriterion("userpinyin3 not between", value1, value2, "userpinyin3");
            return (Criteria) this;
        }

        public Criteria andUserschool3IsNull() {
            addCriterion("userschool3 is null");
            return (Criteria) this;
        }

        public Criteria andUserschool3IsNotNull() {
            addCriterion("userschool3 is not null");
            return (Criteria) this;
        }

        public Criteria andUserschool3EqualTo(String value) {
            addCriterion("userschool3 =", value, "userschool3");
            return (Criteria) this;
        }

        public Criteria andUserschool3NotEqualTo(String value) {
            addCriterion("userschool3 <>", value, "userschool3");
            return (Criteria) this;
        }

        public Criteria andUserschool3GreaterThan(String value) {
            addCriterion("userschool3 >", value, "userschool3");
            return (Criteria) this;
        }

        public Criteria andUserschool3GreaterThanOrEqualTo(String value) {
            addCriterion("userschool3 >=", value, "userschool3");
            return (Criteria) this;
        }

        public Criteria andUserschool3LessThan(String value) {
            addCriterion("userschool3 <", value, "userschool3");
            return (Criteria) this;
        }

        public Criteria andUserschool3LessThanOrEqualTo(String value) {
            addCriterion("userschool3 <=", value, "userschool3");
            return (Criteria) this;
        }

        public Criteria andUserschool3Like(String value) {
            addCriterion("userschool3 like", value, "userschool3");
            return (Criteria) this;
        }

        public Criteria andUserschool3NotLike(String value) {
            addCriterion("userschool3 not like", value, "userschool3");
            return (Criteria) this;
        }

        public Criteria andUserschool3In(List<String> values) {
            addCriterion("userschool3 in", values, "userschool3");
            return (Criteria) this;
        }

        public Criteria andUserschool3NotIn(List<String> values) {
            addCriterion("userschool3 not in", values, "userschool3");
            return (Criteria) this;
        }

        public Criteria andUserschool3Between(String value1, String value2) {
            addCriterion("userschool3 between", value1, value2, "userschool3");
            return (Criteria) this;
        }

        public Criteria andUserschool3NotBetween(String value1, String value2) {
            addCriterion("userschool3 not between", value1, value2, "userschool3");
            return (Criteria) this;
        }

        public Criteria andUserdepartment3IsNull() {
            addCriterion("userdepartment3 is null");
            return (Criteria) this;
        }

        public Criteria andUserdepartment3IsNotNull() {
            addCriterion("userdepartment3 is not null");
            return (Criteria) this;
        }

        public Criteria andUserdepartment3EqualTo(String value) {
            addCriterion("userdepartment3 =", value, "userdepartment3");
            return (Criteria) this;
        }

        public Criteria andUserdepartment3NotEqualTo(String value) {
            addCriterion("userdepartment3 <>", value, "userdepartment3");
            return (Criteria) this;
        }

        public Criteria andUserdepartment3GreaterThan(String value) {
            addCriterion("userdepartment3 >", value, "userdepartment3");
            return (Criteria) this;
        }

        public Criteria andUserdepartment3GreaterThanOrEqualTo(String value) {
            addCriterion("userdepartment3 >=", value, "userdepartment3");
            return (Criteria) this;
        }

        public Criteria andUserdepartment3LessThan(String value) {
            addCriterion("userdepartment3 <", value, "userdepartment3");
            return (Criteria) this;
        }

        public Criteria andUserdepartment3LessThanOrEqualTo(String value) {
            addCriterion("userdepartment3 <=", value, "userdepartment3");
            return (Criteria) this;
        }

        public Criteria andUserdepartment3Like(String value) {
            addCriterion("userdepartment3 like", value, "userdepartment3");
            return (Criteria) this;
        }

        public Criteria andUserdepartment3NotLike(String value) {
            addCriterion("userdepartment3 not like", value, "userdepartment3");
            return (Criteria) this;
        }

        public Criteria andUserdepartment3In(List<String> values) {
            addCriterion("userdepartment3 in", values, "userdepartment3");
            return (Criteria) this;
        }

        public Criteria andUserdepartment3NotIn(List<String> values) {
            addCriterion("userdepartment3 not in", values, "userdepartment3");
            return (Criteria) this;
        }

        public Criteria andUserdepartment3Between(String value1, String value2) {
            addCriterion("userdepartment3 between", value1, value2, "userdepartment3");
            return (Criteria) this;
        }

        public Criteria andUserdepartment3NotBetween(String value1, String value2) {
            addCriterion("userdepartment3 not between", value1, value2, "userdepartment3");
            return (Criteria) this;
        }

        public Criteria andUsermajor3IsNull() {
            addCriterion("usermajor3 is null");
            return (Criteria) this;
        }

        public Criteria andUsermajor3IsNotNull() {
            addCriterion("usermajor3 is not null");
            return (Criteria) this;
        }

        public Criteria andUsermajor3EqualTo(String value) {
            addCriterion("usermajor3 =", value, "usermajor3");
            return (Criteria) this;
        }

        public Criteria andUsermajor3NotEqualTo(String value) {
            addCriterion("usermajor3 <>", value, "usermajor3");
            return (Criteria) this;
        }

        public Criteria andUsermajor3GreaterThan(String value) {
            addCriterion("usermajor3 >", value, "usermajor3");
            return (Criteria) this;
        }

        public Criteria andUsermajor3GreaterThanOrEqualTo(String value) {
            addCriterion("usermajor3 >=", value, "usermajor3");
            return (Criteria) this;
        }

        public Criteria andUsermajor3LessThan(String value) {
            addCriterion("usermajor3 <", value, "usermajor3");
            return (Criteria) this;
        }

        public Criteria andUsermajor3LessThanOrEqualTo(String value) {
            addCriterion("usermajor3 <=", value, "usermajor3");
            return (Criteria) this;
        }

        public Criteria andUsermajor3Like(String value) {
            addCriterion("usermajor3 like", value, "usermajor3");
            return (Criteria) this;
        }

        public Criteria andUsermajor3NotLike(String value) {
            addCriterion("usermajor3 not like", value, "usermajor3");
            return (Criteria) this;
        }

        public Criteria andUsermajor3In(List<String> values) {
            addCriterion("usermajor3 in", values, "usermajor3");
            return (Criteria) this;
        }

        public Criteria andUsermajor3NotIn(List<String> values) {
            addCriterion("usermajor3 not in", values, "usermajor3");
            return (Criteria) this;
        }

        public Criteria andUsermajor3Between(String value1, String value2) {
            addCriterion("usermajor3 between", value1, value2, "usermajor3");
            return (Criteria) this;
        }

        public Criteria andUsermajor3NotBetween(String value1, String value2) {
            addCriterion("usermajor3 not between", value1, value2, "usermajor3");
            return (Criteria) this;
        }

        public Criteria andUsergrade3IsNull() {
            addCriterion("usergrade3 is null");
            return (Criteria) this;
        }

        public Criteria andUsergrade3IsNotNull() {
            addCriterion("usergrade3 is not null");
            return (Criteria) this;
        }

        public Criteria andUsergrade3EqualTo(String value) {
            addCriterion("usergrade3 =", value, "usergrade3");
            return (Criteria) this;
        }

        public Criteria andUsergrade3NotEqualTo(String value) {
            addCriterion("usergrade3 <>", value, "usergrade3");
            return (Criteria) this;
        }

        public Criteria andUsergrade3GreaterThan(String value) {
            addCriterion("usergrade3 >", value, "usergrade3");
            return (Criteria) this;
        }

        public Criteria andUsergrade3GreaterThanOrEqualTo(String value) {
            addCriterion("usergrade3 >=", value, "usergrade3");
            return (Criteria) this;
        }

        public Criteria andUsergrade3LessThan(String value) {
            addCriterion("usergrade3 <", value, "usergrade3");
            return (Criteria) this;
        }

        public Criteria andUsergrade3LessThanOrEqualTo(String value) {
            addCriterion("usergrade3 <=", value, "usergrade3");
            return (Criteria) this;
        }

        public Criteria andUsergrade3Like(String value) {
            addCriterion("usergrade3 like", value, "usergrade3");
            return (Criteria) this;
        }

        public Criteria andUsergrade3NotLike(String value) {
            addCriterion("usergrade3 not like", value, "usergrade3");
            return (Criteria) this;
        }

        public Criteria andUsergrade3In(List<String> values) {
            addCriterion("usergrade3 in", values, "usergrade3");
            return (Criteria) this;
        }

        public Criteria andUsergrade3NotIn(List<String> values) {
            addCriterion("usergrade3 not in", values, "usergrade3");
            return (Criteria) this;
        }

        public Criteria andUsergrade3Between(String value1, String value2) {
            addCriterion("usergrade3 between", value1, value2, "usergrade3");
            return (Criteria) this;
        }

        public Criteria andUsergrade3NotBetween(String value1, String value2) {
            addCriterion("usergrade3 not between", value1, value2, "usergrade3");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber3IsNull() {
            addCriterion("userstudentnumber3 is null");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber3IsNotNull() {
            addCriterion("userstudentnumber3 is not null");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber3EqualTo(String value) {
            addCriterion("userstudentnumber3 =", value, "userstudentnumber3");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber3NotEqualTo(String value) {
            addCriterion("userstudentnumber3 <>", value, "userstudentnumber3");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber3GreaterThan(String value) {
            addCriterion("userstudentnumber3 >", value, "userstudentnumber3");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber3GreaterThanOrEqualTo(String value) {
            addCriterion("userstudentnumber3 >=", value, "userstudentnumber3");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber3LessThan(String value) {
            addCriterion("userstudentnumber3 <", value, "userstudentnumber3");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber3LessThanOrEqualTo(String value) {
            addCriterion("userstudentnumber3 <=", value, "userstudentnumber3");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber3Like(String value) {
            addCriterion("userstudentnumber3 like", value, "userstudentnumber3");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber3NotLike(String value) {
            addCriterion("userstudentnumber3 not like", value, "userstudentnumber3");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber3In(List<String> values) {
            addCriterion("userstudentnumber3 in", values, "userstudentnumber3");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber3NotIn(List<String> values) {
            addCriterion("userstudentnumber3 not in", values, "userstudentnumber3");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber3Between(String value1, String value2) {
            addCriterion("userstudentnumber3 between", value1, value2, "userstudentnumber3");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumber3NotBetween(String value1, String value2) {
            addCriterion("userstudentnumber3 not between", value1, value2, "userstudentnumber3");
            return (Criteria) this;
        }

        public Criteria andUsersex3IsNull() {
            addCriterion("usersex3 is null");
            return (Criteria) this;
        }

        public Criteria andUsersex3IsNotNull() {
            addCriterion("usersex3 is not null");
            return (Criteria) this;
        }

        public Criteria andUsersex3EqualTo(String value) {
            addCriterion("usersex3 =", value, "usersex3");
            return (Criteria) this;
        }

        public Criteria andUsersex3NotEqualTo(String value) {
            addCriterion("usersex3 <>", value, "usersex3");
            return (Criteria) this;
        }

        public Criteria andUsersex3GreaterThan(String value) {
            addCriterion("usersex3 >", value, "usersex3");
            return (Criteria) this;
        }

        public Criteria andUsersex3GreaterThanOrEqualTo(String value) {
            addCriterion("usersex3 >=", value, "usersex3");
            return (Criteria) this;
        }

        public Criteria andUsersex3LessThan(String value) {
            addCriterion("usersex3 <", value, "usersex3");
            return (Criteria) this;
        }

        public Criteria andUsersex3LessThanOrEqualTo(String value) {
            addCriterion("usersex3 <=", value, "usersex3");
            return (Criteria) this;
        }

        public Criteria andUsersex3Like(String value) {
            addCriterion("usersex3 like", value, "usersex3");
            return (Criteria) this;
        }

        public Criteria andUsersex3NotLike(String value) {
            addCriterion("usersex3 not like", value, "usersex3");
            return (Criteria) this;
        }

        public Criteria andUsersex3In(List<String> values) {
            addCriterion("usersex3 in", values, "usersex3");
            return (Criteria) this;
        }

        public Criteria andUsersex3NotIn(List<String> values) {
            addCriterion("usersex3 not in", values, "usersex3");
            return (Criteria) this;
        }

        public Criteria andUsersex3Between(String value1, String value2) {
            addCriterion("usersex3 between", value1, value2, "usersex3");
            return (Criteria) this;
        }

        public Criteria andUsersex3NotBetween(String value1, String value2) {
            addCriterion("usersex3 not between", value1, value2, "usersex3");
            return (Criteria) this;
        }

        public Criteria andUsertel3IsNull() {
            addCriterion("usertel3 is null");
            return (Criteria) this;
        }

        public Criteria andUsertel3IsNotNull() {
            addCriterion("usertel3 is not null");
            return (Criteria) this;
        }

        public Criteria andUsertel3EqualTo(String value) {
            addCriterion("usertel3 =", value, "usertel3");
            return (Criteria) this;
        }

        public Criteria andUsertel3NotEqualTo(String value) {
            addCriterion("usertel3 <>", value, "usertel3");
            return (Criteria) this;
        }

        public Criteria andUsertel3GreaterThan(String value) {
            addCriterion("usertel3 >", value, "usertel3");
            return (Criteria) this;
        }

        public Criteria andUsertel3GreaterThanOrEqualTo(String value) {
            addCriterion("usertel3 >=", value, "usertel3");
            return (Criteria) this;
        }

        public Criteria andUsertel3LessThan(String value) {
            addCriterion("usertel3 <", value, "usertel3");
            return (Criteria) this;
        }

        public Criteria andUsertel3LessThanOrEqualTo(String value) {
            addCriterion("usertel3 <=", value, "usertel3");
            return (Criteria) this;
        }

        public Criteria andUsertel3Like(String value) {
            addCriterion("usertel3 like", value, "usertel3");
            return (Criteria) this;
        }

        public Criteria andUsertel3NotLike(String value) {
            addCriterion("usertel3 not like", value, "usertel3");
            return (Criteria) this;
        }

        public Criteria andUsertel3In(List<String> values) {
            addCriterion("usertel3 in", values, "usertel3");
            return (Criteria) this;
        }

        public Criteria andUsertel3NotIn(List<String> values) {
            addCriterion("usertel3 not in", values, "usertel3");
            return (Criteria) this;
        }

        public Criteria andUsertel3Between(String value1, String value2) {
            addCriterion("usertel3 between", value1, value2, "usertel3");
            return (Criteria) this;
        }

        public Criteria andUsertel3NotBetween(String value1, String value2) {
            addCriterion("usertel3 not between", value1, value2, "usertel3");
            return (Criteria) this;
        }

        public Criteria andUserteacher3IsNull() {
            addCriterion("userteacher3 is null");
            return (Criteria) this;
        }

        public Criteria andUserteacher3IsNotNull() {
            addCriterion("userteacher3 is not null");
            return (Criteria) this;
        }

        public Criteria andUserteacher3EqualTo(String value) {
            addCriterion("userteacher3 =", value, "userteacher3");
            return (Criteria) this;
        }

        public Criteria andUserteacher3NotEqualTo(String value) {
            addCriterion("userteacher3 <>", value, "userteacher3");
            return (Criteria) this;
        }

        public Criteria andUserteacher3GreaterThan(String value) {
            addCriterion("userteacher3 >", value, "userteacher3");
            return (Criteria) this;
        }

        public Criteria andUserteacher3GreaterThanOrEqualTo(String value) {
            addCriterion("userteacher3 >=", value, "userteacher3");
            return (Criteria) this;
        }

        public Criteria andUserteacher3LessThan(String value) {
            addCriterion("userteacher3 <", value, "userteacher3");
            return (Criteria) this;
        }

        public Criteria andUserteacher3LessThanOrEqualTo(String value) {
            addCriterion("userteacher3 <=", value, "userteacher3");
            return (Criteria) this;
        }

        public Criteria andUserteacher3Like(String value) {
            addCriterion("userteacher3 like", value, "userteacher3");
            return (Criteria) this;
        }

        public Criteria andUserteacher3NotLike(String value) {
            addCriterion("userteacher3 not like", value, "userteacher3");
            return (Criteria) this;
        }

        public Criteria andUserteacher3In(List<String> values) {
            addCriterion("userteacher3 in", values, "userteacher3");
            return (Criteria) this;
        }

        public Criteria andUserteacher3NotIn(List<String> values) {
            addCriterion("userteacher3 not in", values, "userteacher3");
            return (Criteria) this;
        }

        public Criteria andUserteacher3Between(String value1, String value2) {
            addCriterion("userteacher3 between", value1, value2, "userteacher3");
            return (Criteria) this;
        }

        public Criteria andUserteacher3NotBetween(String value1, String value2) {
            addCriterion("userteacher3 not between", value1, value2, "userteacher3");
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