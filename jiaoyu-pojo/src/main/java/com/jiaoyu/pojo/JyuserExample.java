package com.jiaoyu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JyuserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JyuserExample() {
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

        public Criteria andJyUsernameIsNull() {
            addCriterion("jy_username is null");
            return (Criteria) this;
        }

        public Criteria andJyUsernameIsNotNull() {
            addCriterion("jy_username is not null");
            return (Criteria) this;
        }

        public Criteria andJyUsernameEqualTo(String value) {
            addCriterion("jy_username =", value, "jyUsername");
            return (Criteria) this;
        }

        public Criteria andJyUsernameNotEqualTo(String value) {
            addCriterion("jy_username <>", value, "jyUsername");
            return (Criteria) this;
        }

        public Criteria andJyUsernameGreaterThan(String value) {
            addCriterion("jy_username >", value, "jyUsername");
            return (Criteria) this;
        }

        public Criteria andJyUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("jy_username >=", value, "jyUsername");
            return (Criteria) this;
        }

        public Criteria andJyUsernameLessThan(String value) {
            addCriterion("jy_username <", value, "jyUsername");
            return (Criteria) this;
        }

        public Criteria andJyUsernameLessThanOrEqualTo(String value) {
            addCriterion("jy_username <=", value, "jyUsername");
            return (Criteria) this;
        }

        public Criteria andJyUsernameLike(String value) {
            addCriterion("jy_username like", value, "jyUsername");
            return (Criteria) this;
        }

        public Criteria andJyUsernameNotLike(String value) {
            addCriterion("jy_username not like", value, "jyUsername");
            return (Criteria) this;
        }

        public Criteria andJyUsernameIn(List<String> values) {
            addCriterion("jy_username in", values, "jyUsername");
            return (Criteria) this;
        }

        public Criteria andJyUsernameNotIn(List<String> values) {
            addCriterion("jy_username not in", values, "jyUsername");
            return (Criteria) this;
        }

        public Criteria andJyUsernameBetween(String value1, String value2) {
            addCriterion("jy_username between", value1, value2, "jyUsername");
            return (Criteria) this;
        }

        public Criteria andJyUsernameNotBetween(String value1, String value2) {
            addCriterion("jy_username not between", value1, value2, "jyUsername");
            return (Criteria) this;
        }

        public Criteria andJyPasswordIsNull() {
            addCriterion("jy_password is null");
            return (Criteria) this;
        }

        public Criteria andJyPasswordIsNotNull() {
            addCriterion("jy_password is not null");
            return (Criteria) this;
        }

        public Criteria andJyPasswordEqualTo(String value) {
            addCriterion("jy_password =", value, "jyPassword");
            return (Criteria) this;
        }

        public Criteria andJyPasswordNotEqualTo(String value) {
            addCriterion("jy_password <>", value, "jyPassword");
            return (Criteria) this;
        }

        public Criteria andJyPasswordGreaterThan(String value) {
            addCriterion("jy_password >", value, "jyPassword");
            return (Criteria) this;
        }

        public Criteria andJyPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("jy_password >=", value, "jyPassword");
            return (Criteria) this;
        }

        public Criteria andJyPasswordLessThan(String value) {
            addCriterion("jy_password <", value, "jyPassword");
            return (Criteria) this;
        }

        public Criteria andJyPasswordLessThanOrEqualTo(String value) {
            addCriterion("jy_password <=", value, "jyPassword");
            return (Criteria) this;
        }

        public Criteria andJyPasswordLike(String value) {
            addCriterion("jy_password like", value, "jyPassword");
            return (Criteria) this;
        }

        public Criteria andJyPasswordNotLike(String value) {
            addCriterion("jy_password not like", value, "jyPassword");
            return (Criteria) this;
        }

        public Criteria andJyPasswordIn(List<String> values) {
            addCriterion("jy_password in", values, "jyPassword");
            return (Criteria) this;
        }

        public Criteria andJyPasswordNotIn(List<String> values) {
            addCriterion("jy_password not in", values, "jyPassword");
            return (Criteria) this;
        }

        public Criteria andJyPasswordBetween(String value1, String value2) {
            addCriterion("jy_password between", value1, value2, "jyPassword");
            return (Criteria) this;
        }

        public Criteria andJyPasswordNotBetween(String value1, String value2) {
            addCriterion("jy_password not between", value1, value2, "jyPassword");
            return (Criteria) this;
        }

        public Criteria andJyPhoneIsNull() {
            addCriterion("jy_phone is null");
            return (Criteria) this;
        }

        public Criteria andJyPhoneIsNotNull() {
            addCriterion("jy_phone is not null");
            return (Criteria) this;
        }

        public Criteria andJyPhoneEqualTo(String value) {
            addCriterion("jy_phone =", value, "jyPhone");
            return (Criteria) this;
        }

        public Criteria andJyPhoneNotEqualTo(String value) {
            addCriterion("jy_phone <>", value, "jyPhone");
            return (Criteria) this;
        }

        public Criteria andJyPhoneGreaterThan(String value) {
            addCriterion("jy_phone >", value, "jyPhone");
            return (Criteria) this;
        }

        public Criteria andJyPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("jy_phone >=", value, "jyPhone");
            return (Criteria) this;
        }

        public Criteria andJyPhoneLessThan(String value) {
            addCriterion("jy_phone <", value, "jyPhone");
            return (Criteria) this;
        }

        public Criteria andJyPhoneLessThanOrEqualTo(String value) {
            addCriterion("jy_phone <=", value, "jyPhone");
            return (Criteria) this;
        }

        public Criteria andJyPhoneLike(String value) {
            addCriterion("jy_phone like", value, "jyPhone");
            return (Criteria) this;
        }

        public Criteria andJyPhoneNotLike(String value) {
            addCriterion("jy_phone not like", value, "jyPhone");
            return (Criteria) this;
        }

        public Criteria andJyPhoneIn(List<String> values) {
            addCriterion("jy_phone in", values, "jyPhone");
            return (Criteria) this;
        }

        public Criteria andJyPhoneNotIn(List<String> values) {
            addCriterion("jy_phone not in", values, "jyPhone");
            return (Criteria) this;
        }

        public Criteria andJyPhoneBetween(String value1, String value2) {
            addCriterion("jy_phone between", value1, value2, "jyPhone");
            return (Criteria) this;
        }

        public Criteria andJyPhoneNotBetween(String value1, String value2) {
            addCriterion("jy_phone not between", value1, value2, "jyPhone");
            return (Criteria) this;
        }

        public Criteria andJyScoreIsNull() {
            addCriterion("jy_score is null");
            return (Criteria) this;
        }

        public Criteria andJyScoreIsNotNull() {
            addCriterion("jy_score is not null");
            return (Criteria) this;
        }

        public Criteria andJyScoreEqualTo(Integer value) {
            addCriterion("jy_score =", value, "jyScore");
            return (Criteria) this;
        }

        public Criteria andJyScoreNotEqualTo(Integer value) {
            addCriterion("jy_score <>", value, "jyScore");
            return (Criteria) this;
        }

        public Criteria andJyScoreGreaterThan(Integer value) {
            addCriterion("jy_score >", value, "jyScore");
            return (Criteria) this;
        }

        public Criteria andJyScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("jy_score >=", value, "jyScore");
            return (Criteria) this;
        }

        public Criteria andJyScoreLessThan(Integer value) {
            addCriterion("jy_score <", value, "jyScore");
            return (Criteria) this;
        }

        public Criteria andJyScoreLessThanOrEqualTo(Integer value) {
            addCriterion("jy_score <=", value, "jyScore");
            return (Criteria) this;
        }

        public Criteria andJyScoreIn(List<Integer> values) {
            addCriterion("jy_score in", values, "jyScore");
            return (Criteria) this;
        }

        public Criteria andJyScoreNotIn(List<Integer> values) {
            addCriterion("jy_score not in", values, "jyScore");
            return (Criteria) this;
        }

        public Criteria andJyScoreBetween(Integer value1, Integer value2) {
            addCriterion("jy_score between", value1, value2, "jyScore");
            return (Criteria) this;
        }

        public Criteria andJyScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("jy_score not between", value1, value2, "jyScore");
            return (Criteria) this;
        }

        public Criteria andJyHeadpicIsNull() {
            addCriterion("jy_headpic is null");
            return (Criteria) this;
        }

        public Criteria andJyHeadpicIsNotNull() {
            addCriterion("jy_headpic is not null");
            return (Criteria) this;
        }

        public Criteria andJyHeadpicEqualTo(String value) {
            addCriterion("jy_headpic =", value, "jyHeadpic");
            return (Criteria) this;
        }

        public Criteria andJyHeadpicNotEqualTo(String value) {
            addCriterion("jy_headpic <>", value, "jyHeadpic");
            return (Criteria) this;
        }

        public Criteria andJyHeadpicGreaterThan(String value) {
            addCriterion("jy_headpic >", value, "jyHeadpic");
            return (Criteria) this;
        }

        public Criteria andJyHeadpicGreaterThanOrEqualTo(String value) {
            addCriterion("jy_headpic >=", value, "jyHeadpic");
            return (Criteria) this;
        }

        public Criteria andJyHeadpicLessThan(String value) {
            addCriterion("jy_headpic <", value, "jyHeadpic");
            return (Criteria) this;
        }

        public Criteria andJyHeadpicLessThanOrEqualTo(String value) {
            addCriterion("jy_headpic <=", value, "jyHeadpic");
            return (Criteria) this;
        }

        public Criteria andJyHeadpicLike(String value) {
            addCriterion("jy_headpic like", value, "jyHeadpic");
            return (Criteria) this;
        }

        public Criteria andJyHeadpicNotLike(String value) {
            addCriterion("jy_headpic not like", value, "jyHeadpic");
            return (Criteria) this;
        }

        public Criteria andJyHeadpicIn(List<String> values) {
            addCriterion("jy_headpic in", values, "jyHeadpic");
            return (Criteria) this;
        }

        public Criteria andJyHeadpicNotIn(List<String> values) {
            addCriterion("jy_headpic not in", values, "jyHeadpic");
            return (Criteria) this;
        }

        public Criteria andJyHeadpicBetween(String value1, String value2) {
            addCriterion("jy_headpic between", value1, value2, "jyHeadpic");
            return (Criteria) this;
        }

        public Criteria andJyHeadpicNotBetween(String value1, String value2) {
            addCriterion("jy_headpic not between", value1, value2, "jyHeadpic");
            return (Criteria) this;
        }

        public Criteria andJyCreatedateIsNull() {
            addCriterion("jy_createdate is null");
            return (Criteria) this;
        }

        public Criteria andJyCreatedateIsNotNull() {
            addCriterion("jy_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andJyCreatedateEqualTo(Date value) {
            addCriterion("jy_createdate =", value, "jyCreatedate");
            return (Criteria) this;
        }

        public Criteria andJyCreatedateNotEqualTo(Date value) {
            addCriterion("jy_createdate <>", value, "jyCreatedate");
            return (Criteria) this;
        }

        public Criteria andJyCreatedateGreaterThan(Date value) {
            addCriterion("jy_createdate >", value, "jyCreatedate");
            return (Criteria) this;
        }

        public Criteria andJyCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("jy_createdate >=", value, "jyCreatedate");
            return (Criteria) this;
        }

        public Criteria andJyCreatedateLessThan(Date value) {
            addCriterion("jy_createdate <", value, "jyCreatedate");
            return (Criteria) this;
        }

        public Criteria andJyCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("jy_createdate <=", value, "jyCreatedate");
            return (Criteria) this;
        }

        public Criteria andJyCreatedateIn(List<Date> values) {
            addCriterion("jy_createdate in", values, "jyCreatedate");
            return (Criteria) this;
        }

        public Criteria andJyCreatedateNotIn(List<Date> values) {
            addCriterion("jy_createdate not in", values, "jyCreatedate");
            return (Criteria) this;
        }

        public Criteria andJyCreatedateBetween(Date value1, Date value2) {
            addCriterion("jy_createdate between", value1, value2, "jyCreatedate");
            return (Criteria) this;
        }

        public Criteria andJyCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("jy_createdate not between", value1, value2, "jyCreatedate");
            return (Criteria) this;
        }

        public Criteria andJyUpdateIsNull() {
            addCriterion("jy_update is null");
            return (Criteria) this;
        }

        public Criteria andJyUpdateIsNotNull() {
            addCriterion("jy_update is not null");
            return (Criteria) this;
        }

        public Criteria andJyUpdateEqualTo(Date value) {
            addCriterion("jy_update =", value, "jyUpdate");
            return (Criteria) this;
        }

        public Criteria andJyUpdateNotEqualTo(Date value) {
            addCriterion("jy_update <>", value, "jyUpdate");
            return (Criteria) this;
        }

        public Criteria andJyUpdateGreaterThan(Date value) {
            addCriterion("jy_update >", value, "jyUpdate");
            return (Criteria) this;
        }

        public Criteria andJyUpdateGreaterThanOrEqualTo(Date value) {
            addCriterion("jy_update >=", value, "jyUpdate");
            return (Criteria) this;
        }

        public Criteria andJyUpdateLessThan(Date value) {
            addCriterion("jy_update <", value, "jyUpdate");
            return (Criteria) this;
        }

        public Criteria andJyUpdateLessThanOrEqualTo(Date value) {
            addCriterion("jy_update <=", value, "jyUpdate");
            return (Criteria) this;
        }

        public Criteria andJyUpdateIn(List<Date> values) {
            addCriterion("jy_update in", values, "jyUpdate");
            return (Criteria) this;
        }

        public Criteria andJyUpdateNotIn(List<Date> values) {
            addCriterion("jy_update not in", values, "jyUpdate");
            return (Criteria) this;
        }

        public Criteria andJyUpdateBetween(Date value1, Date value2) {
            addCriterion("jy_update between", value1, value2, "jyUpdate");
            return (Criteria) this;
        }

        public Criteria andJyUpdateNotBetween(Date value1, Date value2) {
            addCriterion("jy_update not between", value1, value2, "jyUpdate");
            return (Criteria) this;
        }

        public Criteria andJyAnswer1IsNull() {
            addCriterion("jy_answer1 is null");
            return (Criteria) this;
        }

        public Criteria andJyAnswer1IsNotNull() {
            addCriterion("jy_answer1 is not null");
            return (Criteria) this;
        }

        public Criteria andJyAnswer1EqualTo(String value) {
            addCriterion("jy_answer1 =", value, "jyAnswer1");
            return (Criteria) this;
        }

        public Criteria andJyAnswer1NotEqualTo(String value) {
            addCriterion("jy_answer1 <>", value, "jyAnswer1");
            return (Criteria) this;
        }

        public Criteria andJyAnswer1GreaterThan(String value) {
            addCriterion("jy_answer1 >", value, "jyAnswer1");
            return (Criteria) this;
        }

        public Criteria andJyAnswer1GreaterThanOrEqualTo(String value) {
            addCriterion("jy_answer1 >=", value, "jyAnswer1");
            return (Criteria) this;
        }

        public Criteria andJyAnswer1LessThan(String value) {
            addCriterion("jy_answer1 <", value, "jyAnswer1");
            return (Criteria) this;
        }

        public Criteria andJyAnswer1LessThanOrEqualTo(String value) {
            addCriterion("jy_answer1 <=", value, "jyAnswer1");
            return (Criteria) this;
        }

        public Criteria andJyAnswer1Like(String value) {
            addCriterion("jy_answer1 like", value, "jyAnswer1");
            return (Criteria) this;
        }

        public Criteria andJyAnswer1NotLike(String value) {
            addCriterion("jy_answer1 not like", value, "jyAnswer1");
            return (Criteria) this;
        }

        public Criteria andJyAnswer1In(List<String> values) {
            addCriterion("jy_answer1 in", values, "jyAnswer1");
            return (Criteria) this;
        }

        public Criteria andJyAnswer1NotIn(List<String> values) {
            addCriterion("jy_answer1 not in", values, "jyAnswer1");
            return (Criteria) this;
        }

        public Criteria andJyAnswer1Between(String value1, String value2) {
            addCriterion("jy_answer1 between", value1, value2, "jyAnswer1");
            return (Criteria) this;
        }

        public Criteria andJyAnswer1NotBetween(String value1, String value2) {
            addCriterion("jy_answer1 not between", value1, value2, "jyAnswer1");
            return (Criteria) this;
        }

        public Criteria andJyAnswer2IsNull() {
            addCriterion("jy_answer2 is null");
            return (Criteria) this;
        }

        public Criteria andJyAnswer2IsNotNull() {
            addCriterion("jy_answer2 is not null");
            return (Criteria) this;
        }

        public Criteria andJyAnswer2EqualTo(String value) {
            addCriterion("jy_answer2 =", value, "jyAnswer2");
            return (Criteria) this;
        }

        public Criteria andJyAnswer2NotEqualTo(String value) {
            addCriterion("jy_answer2 <>", value, "jyAnswer2");
            return (Criteria) this;
        }

        public Criteria andJyAnswer2GreaterThan(String value) {
            addCriterion("jy_answer2 >", value, "jyAnswer2");
            return (Criteria) this;
        }

        public Criteria andJyAnswer2GreaterThanOrEqualTo(String value) {
            addCriterion("jy_answer2 >=", value, "jyAnswer2");
            return (Criteria) this;
        }

        public Criteria andJyAnswer2LessThan(String value) {
            addCriterion("jy_answer2 <", value, "jyAnswer2");
            return (Criteria) this;
        }

        public Criteria andJyAnswer2LessThanOrEqualTo(String value) {
            addCriterion("jy_answer2 <=", value, "jyAnswer2");
            return (Criteria) this;
        }

        public Criteria andJyAnswer2Like(String value) {
            addCriterion("jy_answer2 like", value, "jyAnswer2");
            return (Criteria) this;
        }

        public Criteria andJyAnswer2NotLike(String value) {
            addCriterion("jy_answer2 not like", value, "jyAnswer2");
            return (Criteria) this;
        }

        public Criteria andJyAnswer2In(List<String> values) {
            addCriterion("jy_answer2 in", values, "jyAnswer2");
            return (Criteria) this;
        }

        public Criteria andJyAnswer2NotIn(List<String> values) {
            addCriterion("jy_answer2 not in", values, "jyAnswer2");
            return (Criteria) this;
        }

        public Criteria andJyAnswer2Between(String value1, String value2) {
            addCriterion("jy_answer2 between", value1, value2, "jyAnswer2");
            return (Criteria) this;
        }

        public Criteria andJyAnswer2NotBetween(String value1, String value2) {
            addCriterion("jy_answer2 not between", value1, value2, "jyAnswer2");
            return (Criteria) this;
        }

        public Criteria andJyAnswer3IsNull() {
            addCriterion("jy_answer3 is null");
            return (Criteria) this;
        }

        public Criteria andJyAnswer3IsNotNull() {
            addCriterion("jy_answer3 is not null");
            return (Criteria) this;
        }

        public Criteria andJyAnswer3EqualTo(String value) {
            addCriterion("jy_answer3 =", value, "jyAnswer3");
            return (Criteria) this;
        }

        public Criteria andJyAnswer3NotEqualTo(String value) {
            addCriterion("jy_answer3 <>", value, "jyAnswer3");
            return (Criteria) this;
        }

        public Criteria andJyAnswer3GreaterThan(String value) {
            addCriterion("jy_answer3 >", value, "jyAnswer3");
            return (Criteria) this;
        }

        public Criteria andJyAnswer3GreaterThanOrEqualTo(String value) {
            addCriterion("jy_answer3 >=", value, "jyAnswer3");
            return (Criteria) this;
        }

        public Criteria andJyAnswer3LessThan(String value) {
            addCriterion("jy_answer3 <", value, "jyAnswer3");
            return (Criteria) this;
        }

        public Criteria andJyAnswer3LessThanOrEqualTo(String value) {
            addCriterion("jy_answer3 <=", value, "jyAnswer3");
            return (Criteria) this;
        }

        public Criteria andJyAnswer3Like(String value) {
            addCriterion("jy_answer3 like", value, "jyAnswer3");
            return (Criteria) this;
        }

        public Criteria andJyAnswer3NotLike(String value) {
            addCriterion("jy_answer3 not like", value, "jyAnswer3");
            return (Criteria) this;
        }

        public Criteria andJyAnswer3In(List<String> values) {
            addCriterion("jy_answer3 in", values, "jyAnswer3");
            return (Criteria) this;
        }

        public Criteria andJyAnswer3NotIn(List<String> values) {
            addCriterion("jy_answer3 not in", values, "jyAnswer3");
            return (Criteria) this;
        }

        public Criteria andJyAnswer3Between(String value1, String value2) {
            addCriterion("jy_answer3 between", value1, value2, "jyAnswer3");
            return (Criteria) this;
        }

        public Criteria andJyAnswer3NotBetween(String value1, String value2) {
            addCriterion("jy_answer3 not between", value1, value2, "jyAnswer3");
            return (Criteria) this;
        }

        public Criteria andJyAsk1IsNull() {
            addCriterion("jy_ask1 is null");
            return (Criteria) this;
        }

        public Criteria andJyAsk1IsNotNull() {
            addCriterion("jy_ask1 is not null");
            return (Criteria) this;
        }

        public Criteria andJyAsk1EqualTo(String value) {
            addCriterion("jy_ask1 =", value, "jyAsk1");
            return (Criteria) this;
        }

        public Criteria andJyAsk1NotEqualTo(String value) {
            addCriterion("jy_ask1 <>", value, "jyAsk1");
            return (Criteria) this;
        }

        public Criteria andJyAsk1GreaterThan(String value) {
            addCriterion("jy_ask1 >", value, "jyAsk1");
            return (Criteria) this;
        }

        public Criteria andJyAsk1GreaterThanOrEqualTo(String value) {
            addCriterion("jy_ask1 >=", value, "jyAsk1");
            return (Criteria) this;
        }

        public Criteria andJyAsk1LessThan(String value) {
            addCriterion("jy_ask1 <", value, "jyAsk1");
            return (Criteria) this;
        }

        public Criteria andJyAsk1LessThanOrEqualTo(String value) {
            addCriterion("jy_ask1 <=", value, "jyAsk1");
            return (Criteria) this;
        }

        public Criteria andJyAsk1Like(String value) {
            addCriterion("jy_ask1 like", value, "jyAsk1");
            return (Criteria) this;
        }

        public Criteria andJyAsk1NotLike(String value) {
            addCriterion("jy_ask1 not like", value, "jyAsk1");
            return (Criteria) this;
        }

        public Criteria andJyAsk1In(List<String> values) {
            addCriterion("jy_ask1 in", values, "jyAsk1");
            return (Criteria) this;
        }

        public Criteria andJyAsk1NotIn(List<String> values) {
            addCriterion("jy_ask1 not in", values, "jyAsk1");
            return (Criteria) this;
        }

        public Criteria andJyAsk1Between(String value1, String value2) {
            addCriterion("jy_ask1 between", value1, value2, "jyAsk1");
            return (Criteria) this;
        }

        public Criteria andJyAsk1NotBetween(String value1, String value2) {
            addCriterion("jy_ask1 not between", value1, value2, "jyAsk1");
            return (Criteria) this;
        }

        public Criteria andJyAsk2IsNull() {
            addCriterion("jy_ask2 is null");
            return (Criteria) this;
        }

        public Criteria andJyAsk2IsNotNull() {
            addCriterion("jy_ask2 is not null");
            return (Criteria) this;
        }

        public Criteria andJyAsk2EqualTo(String value) {
            addCriterion("jy_ask2 =", value, "jyAsk2");
            return (Criteria) this;
        }

        public Criteria andJyAsk2NotEqualTo(String value) {
            addCriterion("jy_ask2 <>", value, "jyAsk2");
            return (Criteria) this;
        }

        public Criteria andJyAsk2GreaterThan(String value) {
            addCriterion("jy_ask2 >", value, "jyAsk2");
            return (Criteria) this;
        }

        public Criteria andJyAsk2GreaterThanOrEqualTo(String value) {
            addCriterion("jy_ask2 >=", value, "jyAsk2");
            return (Criteria) this;
        }

        public Criteria andJyAsk2LessThan(String value) {
            addCriterion("jy_ask2 <", value, "jyAsk2");
            return (Criteria) this;
        }

        public Criteria andJyAsk2LessThanOrEqualTo(String value) {
            addCriterion("jy_ask2 <=", value, "jyAsk2");
            return (Criteria) this;
        }

        public Criteria andJyAsk2Like(String value) {
            addCriterion("jy_ask2 like", value, "jyAsk2");
            return (Criteria) this;
        }

        public Criteria andJyAsk2NotLike(String value) {
            addCriterion("jy_ask2 not like", value, "jyAsk2");
            return (Criteria) this;
        }

        public Criteria andJyAsk2In(List<String> values) {
            addCriterion("jy_ask2 in", values, "jyAsk2");
            return (Criteria) this;
        }

        public Criteria andJyAsk2NotIn(List<String> values) {
            addCriterion("jy_ask2 not in", values, "jyAsk2");
            return (Criteria) this;
        }

        public Criteria andJyAsk2Between(String value1, String value2) {
            addCriterion("jy_ask2 between", value1, value2, "jyAsk2");
            return (Criteria) this;
        }

        public Criteria andJyAsk2NotBetween(String value1, String value2) {
            addCriterion("jy_ask2 not between", value1, value2, "jyAsk2");
            return (Criteria) this;
        }

        public Criteria andJyAsk3IsNull() {
            addCriterion("jy_ask3 is null");
            return (Criteria) this;
        }

        public Criteria andJyAsk3IsNotNull() {
            addCriterion("jy_ask3 is not null");
            return (Criteria) this;
        }

        public Criteria andJyAsk3EqualTo(String value) {
            addCriterion("jy_ask3 =", value, "jyAsk3");
            return (Criteria) this;
        }

        public Criteria andJyAsk3NotEqualTo(String value) {
            addCriterion("jy_ask3 <>", value, "jyAsk3");
            return (Criteria) this;
        }

        public Criteria andJyAsk3GreaterThan(String value) {
            addCriterion("jy_ask3 >", value, "jyAsk3");
            return (Criteria) this;
        }

        public Criteria andJyAsk3GreaterThanOrEqualTo(String value) {
            addCriterion("jy_ask3 >=", value, "jyAsk3");
            return (Criteria) this;
        }

        public Criteria andJyAsk3LessThan(String value) {
            addCriterion("jy_ask3 <", value, "jyAsk3");
            return (Criteria) this;
        }

        public Criteria andJyAsk3LessThanOrEqualTo(String value) {
            addCriterion("jy_ask3 <=", value, "jyAsk3");
            return (Criteria) this;
        }

        public Criteria andJyAsk3Like(String value) {
            addCriterion("jy_ask3 like", value, "jyAsk3");
            return (Criteria) this;
        }

        public Criteria andJyAsk3NotLike(String value) {
            addCriterion("jy_ask3 not like", value, "jyAsk3");
            return (Criteria) this;
        }

        public Criteria andJyAsk3In(List<String> values) {
            addCriterion("jy_ask3 in", values, "jyAsk3");
            return (Criteria) this;
        }

        public Criteria andJyAsk3NotIn(List<String> values) {
            addCriterion("jy_ask3 not in", values, "jyAsk3");
            return (Criteria) this;
        }

        public Criteria andJyAsk3Between(String value1, String value2) {
            addCriterion("jy_ask3 between", value1, value2, "jyAsk3");
            return (Criteria) this;
        }

        public Criteria andJyAsk3NotBetween(String value1, String value2) {
            addCriterion("jy_ask3 not between", value1, value2, "jyAsk3");
            return (Criteria) this;
        }

        public Criteria andJyEmallIsNull() {
            addCriterion("jy_emall is null");
            return (Criteria) this;
        }

        public Criteria andJyEmallIsNotNull() {
            addCriterion("jy_emall is not null");
            return (Criteria) this;
        }

        public Criteria andJyEmallEqualTo(String value) {
            addCriterion("jy_emall =", value, "jyEmall");
            return (Criteria) this;
        }

        public Criteria andJyEmallNotEqualTo(String value) {
            addCriterion("jy_emall <>", value, "jyEmall");
            return (Criteria) this;
        }

        public Criteria andJyEmallGreaterThan(String value) {
            addCriterion("jy_emall >", value, "jyEmall");
            return (Criteria) this;
        }

        public Criteria andJyEmallGreaterThanOrEqualTo(String value) {
            addCriterion("jy_emall >=", value, "jyEmall");
            return (Criteria) this;
        }

        public Criteria andJyEmallLessThan(String value) {
            addCriterion("jy_emall <", value, "jyEmall");
            return (Criteria) this;
        }

        public Criteria andJyEmallLessThanOrEqualTo(String value) {
            addCriterion("jy_emall <=", value, "jyEmall");
            return (Criteria) this;
        }

        public Criteria andJyEmallLike(String value) {
            addCriterion("jy_emall like", value, "jyEmall");
            return (Criteria) this;
        }

        public Criteria andJyEmallNotLike(String value) {
            addCriterion("jy_emall not like", value, "jyEmall");
            return (Criteria) this;
        }

        public Criteria andJyEmallIn(List<String> values) {
            addCriterion("jy_emall in", values, "jyEmall");
            return (Criteria) this;
        }

        public Criteria andJyEmallNotIn(List<String> values) {
            addCriterion("jy_emall not in", values, "jyEmall");
            return (Criteria) this;
        }

        public Criteria andJyEmallBetween(String value1, String value2) {
            addCriterion("jy_emall between", value1, value2, "jyEmall");
            return (Criteria) this;
        }

        public Criteria andJyEmallNotBetween(String value1, String value2) {
            addCriterion("jy_emall not between", value1, value2, "jyEmall");
            return (Criteria) this;
        }

        public Criteria andJyLevelIsNull() {
            addCriterion("jy_level is null");
            return (Criteria) this;
        }

        public Criteria andJyLevelIsNotNull() {
            addCriterion("jy_level is not null");
            return (Criteria) this;
        }

        public Criteria andJyLevelEqualTo(Integer value) {
            addCriterion("jy_level =", value, "jyLevel");
            return (Criteria) this;
        }

        public Criteria andJyLevelNotEqualTo(Integer value) {
            addCriterion("jy_level <>", value, "jyLevel");
            return (Criteria) this;
        }

        public Criteria andJyLevelGreaterThan(Integer value) {
            addCriterion("jy_level >", value, "jyLevel");
            return (Criteria) this;
        }

        public Criteria andJyLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("jy_level >=", value, "jyLevel");
            return (Criteria) this;
        }

        public Criteria andJyLevelLessThan(Integer value) {
            addCriterion("jy_level <", value, "jyLevel");
            return (Criteria) this;
        }

        public Criteria andJyLevelLessThanOrEqualTo(Integer value) {
            addCriterion("jy_level <=", value, "jyLevel");
            return (Criteria) this;
        }

        public Criteria andJyLevelIn(List<Integer> values) {
            addCriterion("jy_level in", values, "jyLevel");
            return (Criteria) this;
        }

        public Criteria andJyLevelNotIn(List<Integer> values) {
            addCriterion("jy_level not in", values, "jyLevel");
            return (Criteria) this;
        }

        public Criteria andJyLevelBetween(Integer value1, Integer value2) {
            addCriterion("jy_level between", value1, value2, "jyLevel");
            return (Criteria) this;
        }

        public Criteria andJyLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("jy_level not between", value1, value2, "jyLevel");
            return (Criteria) this;
        }

        public Criteria andRoleIsNull() {
            addCriterion("role is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("role is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(Integer value) {
            addCriterion("role =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(Integer value) {
            addCriterion("role <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(Integer value) {
            addCriterion("role >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(Integer value) {
            addCriterion("role >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(Integer value) {
            addCriterion("role <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(Integer value) {
            addCriterion("role <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<Integer> values) {
            addCriterion("role in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<Integer> values) {
            addCriterion("role not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(Integer value1, Integer value2) {
            addCriterion("role between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(Integer value1, Integer value2) {
            addCriterion("role not between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
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