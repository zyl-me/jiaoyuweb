package com.jiaoyu.pojo;

import java.util.ArrayList;
import java.util.List;

public class SecondmenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SecondmenuExample() {
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

        public Criteria andSmIdIsNull() {
            addCriterion("sm_id is null");
            return (Criteria) this;
        }

        public Criteria andSmIdIsNotNull() {
            addCriterion("sm_id is not null");
            return (Criteria) this;
        }

        public Criteria andSmIdEqualTo(Integer value) {
            addCriterion("sm_id =", value, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdNotEqualTo(Integer value) {
            addCriterion("sm_id <>", value, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdGreaterThan(Integer value) {
            addCriterion("sm_id >", value, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sm_id >=", value, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdLessThan(Integer value) {
            addCriterion("sm_id <", value, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdLessThanOrEqualTo(Integer value) {
            addCriterion("sm_id <=", value, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdIn(List<Integer> values) {
            addCriterion("sm_id in", values, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdNotIn(List<Integer> values) {
            addCriterion("sm_id not in", values, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdBetween(Integer value1, Integer value2) {
            addCriterion("sm_id between", value1, value2, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sm_id not between", value1, value2, "smId");
            return (Criteria) this;
        }

        public Criteria andSmNameIsNull() {
            addCriterion("sm_name is null");
            return (Criteria) this;
        }

        public Criteria andSmNameIsNotNull() {
            addCriterion("sm_name is not null");
            return (Criteria) this;
        }

        public Criteria andSmNameEqualTo(String value) {
            addCriterion("sm_name =", value, "smName");
            return (Criteria) this;
        }

        public Criteria andSmNameNotEqualTo(String value) {
            addCriterion("sm_name <>", value, "smName");
            return (Criteria) this;
        }

        public Criteria andSmNameGreaterThan(String value) {
            addCriterion("sm_name >", value, "smName");
            return (Criteria) this;
        }

        public Criteria andSmNameGreaterThanOrEqualTo(String value) {
            addCriterion("sm_name >=", value, "smName");
            return (Criteria) this;
        }

        public Criteria andSmNameLessThan(String value) {
            addCriterion("sm_name <", value, "smName");
            return (Criteria) this;
        }

        public Criteria andSmNameLessThanOrEqualTo(String value) {
            addCriterion("sm_name <=", value, "smName");
            return (Criteria) this;
        }

        public Criteria andSmNameLike(String value) {
            addCriterion("sm_name like", value, "smName");
            return (Criteria) this;
        }

        public Criteria andSmNameNotLike(String value) {
            addCriterion("sm_name not like", value, "smName");
            return (Criteria) this;
        }

        public Criteria andSmNameIn(List<String> values) {
            addCriterion("sm_name in", values, "smName");
            return (Criteria) this;
        }

        public Criteria andSmNameNotIn(List<String> values) {
            addCriterion("sm_name not in", values, "smName");
            return (Criteria) this;
        }

        public Criteria andSmNameBetween(String value1, String value2) {
            addCriterion("sm_name between", value1, value2, "smName");
            return (Criteria) this;
        }

        public Criteria andSmNameNotBetween(String value1, String value2) {
            addCriterion("sm_name not between", value1, value2, "smName");
            return (Criteria) this;
        }

        public Criteria andSmUrlIsNull() {
            addCriterion("sm_url is null");
            return (Criteria) this;
        }

        public Criteria andSmUrlIsNotNull() {
            addCriterion("sm_url is not null");
            return (Criteria) this;
        }

        public Criteria andSmUrlEqualTo(String value) {
            addCriterion("sm_url =", value, "smUrl");
            return (Criteria) this;
        }

        public Criteria andSmUrlNotEqualTo(String value) {
            addCriterion("sm_url <>", value, "smUrl");
            return (Criteria) this;
        }

        public Criteria andSmUrlGreaterThan(String value) {
            addCriterion("sm_url >", value, "smUrl");
            return (Criteria) this;
        }

        public Criteria andSmUrlGreaterThanOrEqualTo(String value) {
            addCriterion("sm_url >=", value, "smUrl");
            return (Criteria) this;
        }

        public Criteria andSmUrlLessThan(String value) {
            addCriterion("sm_url <", value, "smUrl");
            return (Criteria) this;
        }

        public Criteria andSmUrlLessThanOrEqualTo(String value) {
            addCriterion("sm_url <=", value, "smUrl");
            return (Criteria) this;
        }

        public Criteria andSmUrlLike(String value) {
            addCriterion("sm_url like", value, "smUrl");
            return (Criteria) this;
        }

        public Criteria andSmUrlNotLike(String value) {
            addCriterion("sm_url not like", value, "smUrl");
            return (Criteria) this;
        }

        public Criteria andSmUrlIn(List<String> values) {
            addCriterion("sm_url in", values, "smUrl");
            return (Criteria) this;
        }

        public Criteria andSmUrlNotIn(List<String> values) {
            addCriterion("sm_url not in", values, "smUrl");
            return (Criteria) this;
        }

        public Criteria andSmUrlBetween(String value1, String value2) {
            addCriterion("sm_url between", value1, value2, "smUrl");
            return (Criteria) this;
        }

        public Criteria andSmUrlNotBetween(String value1, String value2) {
            addCriterion("sm_url not between", value1, value2, "smUrl");
            return (Criteria) this;
        }

        public Criteria andSmFatherIdIsNull() {
            addCriterion("sm_father_id is null");
            return (Criteria) this;
        }

        public Criteria andSmFatherIdIsNotNull() {
            addCriterion("sm_father_id is not null");
            return (Criteria) this;
        }

        public Criteria andSmFatherIdEqualTo(Integer id) {
            addCriterion("sm_father_id =", id, "smFatherId");
            return (Criteria) this;
        }

        public Criteria andSmFatherIdNotEqualTo(Integer value) {
            addCriterion("sm_father_id <>", value, "smFatherId");
            return (Criteria) this;
        }

        public Criteria andSmFatherIdGreaterThan(Integer value) {
            addCriterion("sm_father_id >", value, "smFatherId");
            return (Criteria) this;
        }

        public Criteria andSmFatherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sm_father_id >=", value, "smFatherId");
            return (Criteria) this;
        }

        public Criteria andSmFatherIdLessThan(Integer value) {
            addCriterion("sm_father_id <", value, "smFatherId");
            return (Criteria) this;
        }

        public Criteria andSmFatherIdLessThanOrEqualTo(Integer value) {
            addCriterion("sm_father_id <=", value, "smFatherId");
            return (Criteria) this;
        }

        public Criteria andSmFatherIdIn(List<Integer> values) {
            addCriterion("sm_father_id in", values, "smFatherId");
            return (Criteria) this;
        }

        public Criteria andSmFatherIdNotIn(List<Integer> values) {
            addCriterion("sm_father_id not in", values, "smFatherId");
            return (Criteria) this;
        }

        public Criteria andSmFatherIdBetween(Integer value1, Integer value2) {
            addCriterion("sm_father_id between", value1, value2, "smFatherId");
            return (Criteria) this;
        }

        public Criteria andSmFatherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sm_father_id not between", value1, value2, "smFatherId");
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