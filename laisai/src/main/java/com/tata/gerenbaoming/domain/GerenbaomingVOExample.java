package com.tata.gerenbaoming.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GerenbaomingVOExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public GerenbaomingVOExample() {
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

        public Criteria andGerenbaomingidIsNull() {
            addCriterion("gerenbaomingid is null");
            return (Criteria) this;
        }

        public Criteria andGerenbaomingidIsNotNull() {
            addCriterion("gerenbaomingid is not null");
            return (Criteria) this;
        }

        public Criteria andGerenbaomingidEqualTo(Integer value) {
            addCriterion("gerenbaomingid =", value, "gerenbaomingid");
            return (Criteria) this;
        }

        public Criteria andGerenbaomingidNotEqualTo(Integer value) {
            addCriterion("gerenbaomingid <>", value, "gerenbaomingid");
            return (Criteria) this;
        }

        public Criteria andGerenbaomingidGreaterThan(Integer value) {
            addCriterion("gerenbaomingid >", value, "gerenbaomingid");
            return (Criteria) this;
        }

        public Criteria andGerenbaomingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gerenbaomingid >=", value, "gerenbaomingid");
            return (Criteria) this;
        }

        public Criteria andGerenbaomingidLessThan(Integer value) {
            addCriterion("gerenbaomingid <", value, "gerenbaomingid");
            return (Criteria) this;
        }

        public Criteria andGerenbaomingidLessThanOrEqualTo(Integer value) {
            addCriterion("gerenbaomingid <=", value, "gerenbaomingid");
            return (Criteria) this;
        }

        public Criteria andGerenbaomingidIn(List<Integer> values) {
            addCriterion("gerenbaomingid in", values, "gerenbaomingid");
            return (Criteria) this;
        }

        public Criteria andGerenbaomingidNotIn(List<Integer> values) {
            addCriterion("gerenbaomingid not in", values, "gerenbaomingid");
            return (Criteria) this;
        }

        public Criteria andGerenbaomingidBetween(Integer value1, Integer value2) {
            addCriterion("gerenbaomingid between", value1, value2, "gerenbaomingid");
            return (Criteria) this;
        }

        public Criteria andGerenbaomingidNotBetween(Integer value1, Integer value2) {
            addCriterion("gerenbaomingid not between", value1, value2, "gerenbaomingid");
            return (Criteria) this;
        }

        public Criteria andUsertruenameIsNull() {
            addCriterion("usertruename is null");
            return (Criteria) this;
        }

        public Criteria andUsertruenameIsNotNull() {
            addCriterion("usertruename is not null");
            return (Criteria) this;
        }

        public Criteria andUsertruenameEqualTo(String value) {
            addCriterion("usertruename =", value, "usertruename");
            return (Criteria) this;
        }

        public Criteria andUsertruenameNotEqualTo(String value) {
            addCriterion("usertruename <>", value, "usertruename");
            return (Criteria) this;
        }

        public Criteria andUsertruenameGreaterThan(String value) {
            addCriterion("usertruename >", value, "usertruename");
            return (Criteria) this;
        }

        public Criteria andUsertruenameGreaterThanOrEqualTo(String value) {
            addCriterion("usertruename >=", value, "usertruename");
            return (Criteria) this;
        }

        public Criteria andUsertruenameLessThan(String value) {
            addCriterion("usertruename <", value, "usertruename");
            return (Criteria) this;
        }

        public Criteria andUsertruenameLessThanOrEqualTo(String value) {
            addCriterion("usertruename <=", value, "usertruename");
            return (Criteria) this;
        }

        public Criteria andUsertruenameLike(String value) {
            addCriterion("usertruename like", value, "usertruename");
            return (Criteria) this;
        }

        public Criteria andUsertruenameNotLike(String value) {
            addCriterion("usertruename not like", value, "usertruename");
            return (Criteria) this;
        }

        public Criteria andUsertruenameIn(List<String> values) {
            addCriterion("usertruename in", values, "usertruename");
            return (Criteria) this;
        }

        public Criteria andUsertruenameNotIn(List<String> values) {
            addCriterion("usertruename not in", values, "usertruename");
            return (Criteria) this;
        }

        public Criteria andUsertruenameBetween(String value1, String value2) {
            addCriterion("usertruename between", value1, value2, "usertruename");
            return (Criteria) this;
        }

        public Criteria andUsertruenameNotBetween(String value1, String value2) {
            addCriterion("usertruename not between", value1, value2, "usertruename");
            return (Criteria) this;
        }

        public Criteria andUserpinyinIsNull() {
            addCriterion("userpinyin is null");
            return (Criteria) this;
        }

        public Criteria andUserpinyinIsNotNull() {
            addCriterion("userpinyin is not null");
            return (Criteria) this;
        }

        public Criteria andUserpinyinEqualTo(String value) {
            addCriterion("userpinyin =", value, "userpinyin");
            return (Criteria) this;
        }

        public Criteria andUserpinyinNotEqualTo(String value) {
            addCriterion("userpinyin <>", value, "userpinyin");
            return (Criteria) this;
        }

        public Criteria andUserpinyinGreaterThan(String value) {
            addCriterion("userpinyin >", value, "userpinyin");
            return (Criteria) this;
        }

        public Criteria andUserpinyinGreaterThanOrEqualTo(String value) {
            addCriterion("userpinyin >=", value, "userpinyin");
            return (Criteria) this;
        }

        public Criteria andUserpinyinLessThan(String value) {
            addCriterion("userpinyin <", value, "userpinyin");
            return (Criteria) this;
        }

        public Criteria andUserpinyinLessThanOrEqualTo(String value) {
            addCriterion("userpinyin <=", value, "userpinyin");
            return (Criteria) this;
        }

        public Criteria andUserpinyinLike(String value) {
            addCriterion("userpinyin like", value, "userpinyin");
            return (Criteria) this;
        }

        public Criteria andUserpinyinNotLike(String value) {
            addCriterion("userpinyin not like", value, "userpinyin");
            return (Criteria) this;
        }

        public Criteria andUserpinyinIn(List<String> values) {
            addCriterion("userpinyin in", values, "userpinyin");
            return (Criteria) this;
        }

        public Criteria andUserpinyinNotIn(List<String> values) {
            addCriterion("userpinyin not in", values, "userpinyin");
            return (Criteria) this;
        }

        public Criteria andUserpinyinBetween(String value1, String value2) {
            addCriterion("userpinyin between", value1, value2, "userpinyin");
            return (Criteria) this;
        }

        public Criteria andUserpinyinNotBetween(String value1, String value2) {
            addCriterion("userpinyin not between", value1, value2, "userpinyin");
            return (Criteria) this;
        }

        public Criteria andUserschoolIsNull() {
            addCriterion("userschool is null");
            return (Criteria) this;
        }

        public Criteria andUserschoolIsNotNull() {
            addCriterion("userschool is not null");
            return (Criteria) this;
        }

        public Criteria andUserschoolEqualTo(String value) {
            addCriterion("userschool =", value, "userschool");
            return (Criteria) this;
        }

        public Criteria andUserschoolNotEqualTo(String value) {
            addCriterion("userschool <>", value, "userschool");
            return (Criteria) this;
        }

        public Criteria andUserschoolGreaterThan(String value) {
            addCriterion("userschool >", value, "userschool");
            return (Criteria) this;
        }

        public Criteria andUserschoolGreaterThanOrEqualTo(String value) {
            addCriterion("userschool >=", value, "userschool");
            return (Criteria) this;
        }

        public Criteria andUserschoolLessThan(String value) {
            addCriterion("userschool <", value, "userschool");
            return (Criteria) this;
        }

        public Criteria andUserschoolLessThanOrEqualTo(String value) {
            addCriterion("userschool <=", value, "userschool");
            return (Criteria) this;
        }

        public Criteria andUserschoolLike(String value) {
            addCriterion("userschool like", value, "userschool");
            return (Criteria) this;
        }

        public Criteria andUserschoolNotLike(String value) {
            addCriterion("userschool not like", value, "userschool");
            return (Criteria) this;
        }

        public Criteria andUserschoolIn(List<String> values) {
            addCriterion("userschool in", values, "userschool");
            return (Criteria) this;
        }

        public Criteria andUserschoolNotIn(List<String> values) {
            addCriterion("userschool not in", values, "userschool");
            return (Criteria) this;
        }

        public Criteria andUserschoolBetween(String value1, String value2) {
            addCriterion("userschool between", value1, value2, "userschool");
            return (Criteria) this;
        }

        public Criteria andUserschoolNotBetween(String value1, String value2) {
            addCriterion("userschool not between", value1, value2, "userschool");
            return (Criteria) this;
        }

        public Criteria andUserdepartmentIsNull() {
            addCriterion("userdepartment is null");
            return (Criteria) this;
        }

        public Criteria andUserdepartmentIsNotNull() {
            addCriterion("userdepartment is not null");
            return (Criteria) this;
        }

        public Criteria andUserdepartmentEqualTo(String value) {
            addCriterion("userdepartment =", value, "userdepartment");
            return (Criteria) this;
        }

        public Criteria andUserdepartmentNotEqualTo(String value) {
            addCriterion("userdepartment <>", value, "userdepartment");
            return (Criteria) this;
        }

        public Criteria andUserdepartmentGreaterThan(String value) {
            addCriterion("userdepartment >", value, "userdepartment");
            return (Criteria) this;
        }

        public Criteria andUserdepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("userdepartment >=", value, "userdepartment");
            return (Criteria) this;
        }

        public Criteria andUserdepartmentLessThan(String value) {
            addCriterion("userdepartment <", value, "userdepartment");
            return (Criteria) this;
        }

        public Criteria andUserdepartmentLessThanOrEqualTo(String value) {
            addCriterion("userdepartment <=", value, "userdepartment");
            return (Criteria) this;
        }

        public Criteria andUserdepartmentLike(String value) {
            addCriterion("userdepartment like", value, "userdepartment");
            return (Criteria) this;
        }

        public Criteria andUserdepartmentNotLike(String value) {
            addCriterion("userdepartment not like", value, "userdepartment");
            return (Criteria) this;
        }

        public Criteria andUserdepartmentIn(List<String> values) {
            addCriterion("userdepartment in", values, "userdepartment");
            return (Criteria) this;
        }

        public Criteria andUserdepartmentNotIn(List<String> values) {
            addCriterion("userdepartment not in", values, "userdepartment");
            return (Criteria) this;
        }

        public Criteria andUserdepartmentBetween(String value1, String value2) {
            addCriterion("userdepartment between", value1, value2, "userdepartment");
            return (Criteria) this;
        }

        public Criteria andUserdepartmentNotBetween(String value1, String value2) {
            addCriterion("userdepartment not between", value1, value2, "userdepartment");
            return (Criteria) this;
        }

        public Criteria andUsermajorIsNull() {
            addCriterion("usermajor is null");
            return (Criteria) this;
        }

        public Criteria andUsermajorIsNotNull() {
            addCriterion("usermajor is not null");
            return (Criteria) this;
        }

        public Criteria andUsermajorEqualTo(String value) {
            addCriterion("usermajor =", value, "usermajor");
            return (Criteria) this;
        }

        public Criteria andUsermajorNotEqualTo(String value) {
            addCriterion("usermajor <>", value, "usermajor");
            return (Criteria) this;
        }

        public Criteria andUsermajorGreaterThan(String value) {
            addCriterion("usermajor >", value, "usermajor");
            return (Criteria) this;
        }

        public Criteria andUsermajorGreaterThanOrEqualTo(String value) {
            addCriterion("usermajor >=", value, "usermajor");
            return (Criteria) this;
        }

        public Criteria andUsermajorLessThan(String value) {
            addCriterion("usermajor <", value, "usermajor");
            return (Criteria) this;
        }

        public Criteria andUsermajorLessThanOrEqualTo(String value) {
            addCriterion("usermajor <=", value, "usermajor");
            return (Criteria) this;
        }

        public Criteria andUsermajorLike(String value) {
            addCriterion("usermajor like", value, "usermajor");
            return (Criteria) this;
        }

        public Criteria andUsermajorNotLike(String value) {
            addCriterion("usermajor not like", value, "usermajor");
            return (Criteria) this;
        }

        public Criteria andUsermajorIn(List<String> values) {
            addCriterion("usermajor in", values, "usermajor");
            return (Criteria) this;
        }

        public Criteria andUsermajorNotIn(List<String> values) {
            addCriterion("usermajor not in", values, "usermajor");
            return (Criteria) this;
        }

        public Criteria andUsermajorBetween(String value1, String value2) {
            addCriterion("usermajor between", value1, value2, "usermajor");
            return (Criteria) this;
        }

        public Criteria andUsermajorNotBetween(String value1, String value2) {
            addCriterion("usermajor not between", value1, value2, "usermajor");
            return (Criteria) this;
        }

        public Criteria andUsergradeIsNull() {
            addCriterion("usergrade is null");
            return (Criteria) this;
        }

        public Criteria andUsergradeIsNotNull() {
            addCriterion("usergrade is not null");
            return (Criteria) this;
        }

        public Criteria andUsergradeEqualTo(String value) {
            addCriterion("usergrade =", value, "usergrade");
            return (Criteria) this;
        }

        public Criteria andUsergradeNotEqualTo(String value) {
            addCriterion("usergrade <>", value, "usergrade");
            return (Criteria) this;
        }

        public Criteria andUsergradeGreaterThan(String value) {
            addCriterion("usergrade >", value, "usergrade");
            return (Criteria) this;
        }

        public Criteria andUsergradeGreaterThanOrEqualTo(String value) {
            addCriterion("usergrade >=", value, "usergrade");
            return (Criteria) this;
        }

        public Criteria andUsergradeLessThan(String value) {
            addCriterion("usergrade <", value, "usergrade");
            return (Criteria) this;
        }

        public Criteria andUsergradeLessThanOrEqualTo(String value) {
            addCriterion("usergrade <=", value, "usergrade");
            return (Criteria) this;
        }

        public Criteria andUsergradeLike(String value) {
            addCriterion("usergrade like", value, "usergrade");
            return (Criteria) this;
        }

        public Criteria andUsergradeNotLike(String value) {
            addCriterion("usergrade not like", value, "usergrade");
            return (Criteria) this;
        }

        public Criteria andUsergradeIn(List<String> values) {
            addCriterion("usergrade in", values, "usergrade");
            return (Criteria) this;
        }

        public Criteria andUsergradeNotIn(List<String> values) {
            addCriterion("usergrade not in", values, "usergrade");
            return (Criteria) this;
        }

        public Criteria andUsergradeBetween(String value1, String value2) {
            addCriterion("usergrade between", value1, value2, "usergrade");
            return (Criteria) this;
        }

        public Criteria andUsergradeNotBetween(String value1, String value2) {
            addCriterion("usergrade not between", value1, value2, "usergrade");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumberIsNull() {
            addCriterion("userstudentnumber is null");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumberIsNotNull() {
            addCriterion("userstudentnumber is not null");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumberEqualTo(String value) {
            addCriterion("userstudentnumber =", value, "userstudentnumber");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumberNotEqualTo(String value) {
            addCriterion("userstudentnumber <>", value, "userstudentnumber");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumberGreaterThan(String value) {
            addCriterion("userstudentnumber >", value, "userstudentnumber");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumberGreaterThanOrEqualTo(String value) {
            addCriterion("userstudentnumber >=", value, "userstudentnumber");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumberLessThan(String value) {
            addCriterion("userstudentnumber <", value, "userstudentnumber");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumberLessThanOrEqualTo(String value) {
            addCriterion("userstudentnumber <=", value, "userstudentnumber");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumberLike(String value) {
            addCriterion("userstudentnumber like", value, "userstudentnumber");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumberNotLike(String value) {
            addCriterion("userstudentnumber not like", value, "userstudentnumber");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumberIn(List<String> values) {
            addCriterion("userstudentnumber in", values, "userstudentnumber");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumberNotIn(List<String> values) {
            addCriterion("userstudentnumber not in", values, "userstudentnumber");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumberBetween(String value1, String value2) {
            addCriterion("userstudentnumber between", value1, value2, "userstudentnumber");
            return (Criteria) this;
        }

        public Criteria andUserstudentnumberNotBetween(String value1, String value2) {
            addCriterion("userstudentnumber not between", value1, value2, "userstudentnumber");
            return (Criteria) this;
        }

        public Criteria andUsersexIsNull() {
            addCriterion("usersex is null");
            return (Criteria) this;
        }

        public Criteria andUsersexIsNotNull() {
            addCriterion("usersex is not null");
            return (Criteria) this;
        }

        public Criteria andUsersexEqualTo(String value) {
            addCriterion("usersex =", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotEqualTo(String value) {
            addCriterion("usersex <>", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexGreaterThan(String value) {
            addCriterion("usersex >", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexGreaterThanOrEqualTo(String value) {
            addCriterion("usersex >=", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLessThan(String value) {
            addCriterion("usersex <", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLessThanOrEqualTo(String value) {
            addCriterion("usersex <=", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLike(String value) {
            addCriterion("usersex like", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotLike(String value) {
            addCriterion("usersex not like", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexIn(List<String> values) {
            addCriterion("usersex in", values, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotIn(List<String> values) {
            addCriterion("usersex not in", values, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexBetween(String value1, String value2) {
            addCriterion("usersex between", value1, value2, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotBetween(String value1, String value2) {
            addCriterion("usersex not between", value1, value2, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsertelIsNull() {
            addCriterion("usertel is null");
            return (Criteria) this;
        }

        public Criteria andUsertelIsNotNull() {
            addCriterion("usertel is not null");
            return (Criteria) this;
        }

        public Criteria andUsertelEqualTo(String value) {
            addCriterion("usertel =", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelNotEqualTo(String value) {
            addCriterion("usertel <>", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelGreaterThan(String value) {
            addCriterion("usertel >", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelGreaterThanOrEqualTo(String value) {
            addCriterion("usertel >=", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelLessThan(String value) {
            addCriterion("usertel <", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelLessThanOrEqualTo(String value) {
            addCriterion("usertel <=", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelLike(String value) {
            addCriterion("usertel like", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelNotLike(String value) {
            addCriterion("usertel not like", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelIn(List<String> values) {
            addCriterion("usertel in", values, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelNotIn(List<String> values) {
            addCriterion("usertel not in", values, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelBetween(String value1, String value2) {
            addCriterion("usertel between", value1, value2, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelNotBetween(String value1, String value2) {
            addCriterion("usertel not between", value1, value2, "usertel");
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