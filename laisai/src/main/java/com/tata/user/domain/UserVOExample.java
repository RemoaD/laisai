package com.tata.user.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserVOExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public UserVOExample() {
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

        public Criteria andUsermailIsNull() {
            addCriterion("usermail is null");
            return (Criteria) this;
        }

        public Criteria andUsermailIsNotNull() {
            addCriterion("usermail is not null");
            return (Criteria) this;
        }

        public Criteria andUsermailEqualTo(String value) {
            addCriterion("usermail =", value, "usermail");
            return (Criteria) this;
        }

        public Criteria andUsermailNotEqualTo(String value) {
            addCriterion("usermail <>", value, "usermail");
            return (Criteria) this;
        }

        public Criteria andUsermailGreaterThan(String value) {
            addCriterion("usermail >", value, "usermail");
            return (Criteria) this;
        }

        public Criteria andUsermailGreaterThanOrEqualTo(String value) {
            addCriterion("usermail >=", value, "usermail");
            return (Criteria) this;
        }

        public Criteria andUsermailLessThan(String value) {
            addCriterion("usermail <", value, "usermail");
            return (Criteria) this;
        }

        public Criteria andUsermailLessThanOrEqualTo(String value) {
            addCriterion("usermail <=", value, "usermail");
            return (Criteria) this;
        }

        public Criteria andUsermailLike(String value) {
            addCriterion("usermail like", value, "usermail");
            return (Criteria) this;
        }

        public Criteria andUsermailNotLike(String value) {
            addCriterion("usermail not like", value, "usermail");
            return (Criteria) this;
        }

        public Criteria andUsermailIn(List<String> values) {
            addCriterion("usermail in", values, "usermail");
            return (Criteria) this;
        }

        public Criteria andUsermailNotIn(List<String> values) {
            addCriterion("usermail not in", values, "usermail");
            return (Criteria) this;
        }

        public Criteria andUsermailBetween(String value1, String value2) {
            addCriterion("usermail between", value1, value2, "usermail");
            return (Criteria) this;
        }

        public Criteria andUsermailNotBetween(String value1, String value2) {
            addCriterion("usermail not between", value1, value2, "usermail");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIsNull() {
            addCriterion("userpassword is null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIsNotNull() {
            addCriterion("userpassword is not null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordEqualTo(String value) {
            addCriterion("userpassword =", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotEqualTo(String value) {
            addCriterion("userpassword <>", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThan(String value) {
            addCriterion("userpassword >", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("userpassword >=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThan(String value) {
            addCriterion("userpassword <", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThanOrEqualTo(String value) {
            addCriterion("userpassword <=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLike(String value) {
            addCriterion("userpassword like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotLike(String value) {
            addCriterion("userpassword not like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIn(List<String> values) {
            addCriterion("userpassword in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotIn(List<String> values) {
            addCriterion("userpassword not in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordBetween(String value1, String value2) {
            addCriterion("userpassword between", value1, value2, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotBetween(String value1, String value2) {
            addCriterion("userpassword not between", value1, value2, "userpassword");
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

        public Criteria andUserheadimgIsNull() {
            addCriterion("userheadimg is null");
            return (Criteria) this;
        }

        public Criteria andUserheadimgIsNotNull() {
            addCriterion("userheadimg is not null");
            return (Criteria) this;
        }

        public Criteria andUserheadimgEqualTo(String value) {
            addCriterion("userheadimg =", value, "userheadimg");
            return (Criteria) this;
        }

        public Criteria andUserheadimgNotEqualTo(String value) {
            addCriterion("userheadimg <>", value, "userheadimg");
            return (Criteria) this;
        }

        public Criteria andUserheadimgGreaterThan(String value) {
            addCriterion("userheadimg >", value, "userheadimg");
            return (Criteria) this;
        }

        public Criteria andUserheadimgGreaterThanOrEqualTo(String value) {
            addCriterion("userheadimg >=", value, "userheadimg");
            return (Criteria) this;
        }

        public Criteria andUserheadimgLessThan(String value) {
            addCriterion("userheadimg <", value, "userheadimg");
            return (Criteria) this;
        }

        public Criteria andUserheadimgLessThanOrEqualTo(String value) {
            addCriterion("userheadimg <=", value, "userheadimg");
            return (Criteria) this;
        }

        public Criteria andUserheadimgLike(String value) {
            addCriterion("userheadimg like", value, "userheadimg");
            return (Criteria) this;
        }

        public Criteria andUserheadimgNotLike(String value) {
            addCriterion("userheadimg not like", value, "userheadimg");
            return (Criteria) this;
        }

        public Criteria andUserheadimgIn(List<String> values) {
            addCriterion("userheadimg in", values, "userheadimg");
            return (Criteria) this;
        }

        public Criteria andUserheadimgNotIn(List<String> values) {
            addCriterion("userheadimg not in", values, "userheadimg");
            return (Criteria) this;
        }

        public Criteria andUserheadimgBetween(String value1, String value2) {
            addCriterion("userheadimg between", value1, value2, "userheadimg");
            return (Criteria) this;
        }

        public Criteria andUserheadimgNotBetween(String value1, String value2) {
            addCriterion("userheadimg not between", value1, value2, "userheadimg");
            return (Criteria) this;
        }

        public Criteria andUserpropertyIsNull() {
            addCriterion("userproperty is null");
            return (Criteria) this;
        }

        public Criteria andUserpropertyIsNotNull() {
            addCriterion("userproperty is not null");
            return (Criteria) this;
        }

        public Criteria andUserpropertyEqualTo(String value) {
            addCriterion("userproperty =", value, "userproperty");
            return (Criteria) this;
        }

        public Criteria andUserpropertyNotEqualTo(String value) {
            addCriterion("userproperty <>", value, "userproperty");
            return (Criteria) this;
        }

        public Criteria andUserpropertyGreaterThan(String value) {
            addCriterion("userproperty >", value, "userproperty");
            return (Criteria) this;
        }

        public Criteria andUserpropertyGreaterThanOrEqualTo(String value) {
            addCriterion("userproperty >=", value, "userproperty");
            return (Criteria) this;
        }

        public Criteria andUserpropertyLessThan(String value) {
            addCriterion("userproperty <", value, "userproperty");
            return (Criteria) this;
        }

        public Criteria andUserpropertyLessThanOrEqualTo(String value) {
            addCriterion("userproperty <=", value, "userproperty");
            return (Criteria) this;
        }

        public Criteria andUserpropertyLike(String value) {
            addCriterion("userproperty like", value, "userproperty");
            return (Criteria) this;
        }

        public Criteria andUserpropertyNotLike(String value) {
            addCriterion("userproperty not like", value, "userproperty");
            return (Criteria) this;
        }

        public Criteria andUserpropertyIn(List<String> values) {
            addCriterion("userproperty in", values, "userproperty");
            return (Criteria) this;
        }

        public Criteria andUserpropertyNotIn(List<String> values) {
            addCriterion("userproperty not in", values, "userproperty");
            return (Criteria) this;
        }

        public Criteria andUserpropertyBetween(String value1, String value2) {
            addCriterion("userproperty between", value1, value2, "userproperty");
            return (Criteria) this;
        }

        public Criteria andUserpropertyNotBetween(String value1, String value2) {
            addCriterion("userproperty not between", value1, value2, "userproperty");
            return (Criteria) this;
        }

        public Criteria andUserintroduceIsNull() {
            addCriterion("userintroduce is null");
            return (Criteria) this;
        }

        public Criteria andUserintroduceIsNotNull() {
            addCriterion("userintroduce is not null");
            return (Criteria) this;
        }

        public Criteria andUserintroduceEqualTo(String value) {
            addCriterion("userintroduce =", value, "userintroduce");
            return (Criteria) this;
        }

        public Criteria andUserintroduceNotEqualTo(String value) {
            addCriterion("userintroduce <>", value, "userintroduce");
            return (Criteria) this;
        }

        public Criteria andUserintroduceGreaterThan(String value) {
            addCriterion("userintroduce >", value, "userintroduce");
            return (Criteria) this;
        }

        public Criteria andUserintroduceGreaterThanOrEqualTo(String value) {
            addCriterion("userintroduce >=", value, "userintroduce");
            return (Criteria) this;
        }

        public Criteria andUserintroduceLessThan(String value) {
            addCriterion("userintroduce <", value, "userintroduce");
            return (Criteria) this;
        }

        public Criteria andUserintroduceLessThanOrEqualTo(String value) {
            addCriterion("userintroduce <=", value, "userintroduce");
            return (Criteria) this;
        }

        public Criteria andUserintroduceLike(String value) {
            addCriterion("userintroduce like", value, "userintroduce");
            return (Criteria) this;
        }

        public Criteria andUserintroduceNotLike(String value) {
            addCriterion("userintroduce not like", value, "userintroduce");
            return (Criteria) this;
        }

        public Criteria andUserintroduceIn(List<String> values) {
            addCriterion("userintroduce in", values, "userintroduce");
            return (Criteria) this;
        }

        public Criteria andUserintroduceNotIn(List<String> values) {
            addCriterion("userintroduce not in", values, "userintroduce");
            return (Criteria) this;
        }

        public Criteria andUserintroduceBetween(String value1, String value2) {
            addCriterion("userintroduce between", value1, value2, "userintroduce");
            return (Criteria) this;
        }

        public Criteria andUserintroduceNotBetween(String value1, String value2) {
            addCriterion("userintroduce not between", value1, value2, "userintroduce");
            return (Criteria) this;
        }

        public Criteria andUserisinIsNull() {
            addCriterion("userisin is null");
            return (Criteria) this;
        }

        public Criteria andUserisinIsNotNull() {
            addCriterion("userisin is not null");
            return (Criteria) this;
        }

        public Criteria andUserisinEqualTo(Integer value) {
            addCriterion("userisin =", value, "userisin");
            return (Criteria) this;
        }

        public Criteria andUserisinNotEqualTo(Integer value) {
            addCriterion("userisin <>", value, "userisin");
            return (Criteria) this;
        }

        public Criteria andUserisinGreaterThan(Integer value) {
            addCriterion("userisin >", value, "userisin");
            return (Criteria) this;
        }

        public Criteria andUserisinGreaterThanOrEqualTo(Integer value) {
            addCriterion("userisin >=", value, "userisin");
            return (Criteria) this;
        }

        public Criteria andUserisinLessThan(Integer value) {
            addCriterion("userisin <", value, "userisin");
            return (Criteria) this;
        }

        public Criteria andUserisinLessThanOrEqualTo(Integer value) {
            addCriterion("userisin <=", value, "userisin");
            return (Criteria) this;
        }

        public Criteria andUserisinIn(List<Integer> values) {
            addCriterion("userisin in", values, "userisin");
            return (Criteria) this;
        }

        public Criteria andUserisinNotIn(List<Integer> values) {
            addCriterion("userisin not in", values, "userisin");
            return (Criteria) this;
        }

        public Criteria andUserisinBetween(Integer value1, Integer value2) {
            addCriterion("userisin between", value1, value2, "userisin");
            return (Criteria) this;
        }

        public Criteria andUserisinNotBetween(Integer value1, Integer value2) {
            addCriterion("userisin not between", value1, value2, "userisin");
            return (Criteria) this;
        }

        public Criteria andUserprizeIsNull() {
            addCriterion("userprize is null");
            return (Criteria) this;
        }

        public Criteria andUserprizeIsNotNull() {
            addCriterion("userprize is not null");
            return (Criteria) this;
        }

        public Criteria andUserprizeEqualTo(String value) {
            addCriterion("userprize =", value, "userprize");
            return (Criteria) this;
        }

        public Criteria andUserprizeNotEqualTo(String value) {
            addCriterion("userprize <>", value, "userprize");
            return (Criteria) this;
        }

        public Criteria andUserprizeGreaterThan(String value) {
            addCriterion("userprize >", value, "userprize");
            return (Criteria) this;
        }

        public Criteria andUserprizeGreaterThanOrEqualTo(String value) {
            addCriterion("userprize >=", value, "userprize");
            return (Criteria) this;
        }

        public Criteria andUserprizeLessThan(String value) {
            addCriterion("userprize <", value, "userprize");
            return (Criteria) this;
        }

        public Criteria andUserprizeLessThanOrEqualTo(String value) {
            addCriterion("userprize <=", value, "userprize");
            return (Criteria) this;
        }

        public Criteria andUserprizeLike(String value) {
            addCriterion("userprize like", value, "userprize");
            return (Criteria) this;
        }

        public Criteria andUserprizeNotLike(String value) {
            addCriterion("userprize not like", value, "userprize");
            return (Criteria) this;
        }

        public Criteria andUserprizeIn(List<String> values) {
            addCriterion("userprize in", values, "userprize");
            return (Criteria) this;
        }

        public Criteria andUserprizeNotIn(List<String> values) {
            addCriterion("userprize not in", values, "userprize");
            return (Criteria) this;
        }

        public Criteria andUserprizeBetween(String value1, String value2) {
            addCriterion("userprize between", value1, value2, "userprize");
            return (Criteria) this;
        }

        public Criteria andUserprizeNotBetween(String value1, String value2) {
            addCriterion("userprize not between", value1, value2, "userprize");
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