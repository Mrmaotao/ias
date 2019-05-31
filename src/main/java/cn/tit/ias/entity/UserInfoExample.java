package cn.tit.ias.entity;

import java.util.ArrayList;
import java.util.List;

public class UserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
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

        public Criteria andUserCountIsNull() {
            addCriterion("userCount is null");
            return (Criteria) this;
        }

        public Criteria andUserCountIsNotNull() {
            addCriterion("userCount is not null");
            return (Criteria) this;
        }

        public Criteria andUserCountEqualTo(String value) {
            addCriterion("userCount =", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountNotEqualTo(String value) {
            addCriterion("userCount <>", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountGreaterThan(String value) {
            addCriterion("userCount >", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountGreaterThanOrEqualTo(String value) {
            addCriterion("userCount >=", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountLessThan(String value) {
            addCriterion("userCount <", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountLessThanOrEqualTo(String value) {
            addCriterion("userCount <=", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountLike(String value) {
            addCriterion("userCount like", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountNotLike(String value) {
            addCriterion("userCount not like", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountIn(List<String> values) {
            addCriterion("userCount in", values, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountNotIn(List<String> values) {
            addCriterion("userCount not in", values, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountBetween(String value1, String value2) {
            addCriterion("userCount between", value1, value2, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountNotBetween(String value1, String value2) {
            addCriterion("userCount not between", value1, value2, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserPasswardIsNull() {
            addCriterion("userPassward is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswardIsNotNull() {
            addCriterion("userPassward is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswardEqualTo(String value) {
            addCriterion("userPassward =", value, "userPassward");
            return (Criteria) this;
        }

        public Criteria andUserPasswardNotEqualTo(String value) {
            addCriterion("userPassward <>", value, "userPassward");
            return (Criteria) this;
        }

        public Criteria andUserPasswardGreaterThan(String value) {
            addCriterion("userPassward >", value, "userPassward");
            return (Criteria) this;
        }

        public Criteria andUserPasswardGreaterThanOrEqualTo(String value) {
            addCriterion("userPassward >=", value, "userPassward");
            return (Criteria) this;
        }

        public Criteria andUserPasswardLessThan(String value) {
            addCriterion("userPassward <", value, "userPassward");
            return (Criteria) this;
        }

        public Criteria andUserPasswardLessThanOrEqualTo(String value) {
            addCriterion("userPassward <=", value, "userPassward");
            return (Criteria) this;
        }

        public Criteria andUserPasswardLike(String value) {
            addCriterion("userPassward like", value, "userPassward");
            return (Criteria) this;
        }

        public Criteria andUserPasswardNotLike(String value) {
            addCriterion("userPassward not like", value, "userPassward");
            return (Criteria) this;
        }

        public Criteria andUserPasswardIn(List<String> values) {
            addCriterion("userPassward in", values, "userPassward");
            return (Criteria) this;
        }

        public Criteria andUserPasswardNotIn(List<String> values) {
            addCriterion("userPassward not in", values, "userPassward");
            return (Criteria) this;
        }

        public Criteria andUserPasswardBetween(String value1, String value2) {
            addCriterion("userPassward between", value1, value2, "userPassward");
            return (Criteria) this;
        }

        public Criteria andUserPasswardNotBetween(String value1, String value2) {
            addCriterion("userPassward not between", value1, value2, "userPassward");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("userName =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("userName <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("userName >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("userName <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("userName like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("userName not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("userName in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("userName not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdIsNull() {
            addCriterion("userRoleId is null");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdIsNotNull() {
            addCriterion("userRoleId is not null");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdEqualTo(Integer value) {
            addCriterion("userRoleId =", value, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdNotEqualTo(Integer value) {
            addCriterion("userRoleId <>", value, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdGreaterThan(Integer value) {
            addCriterion("userRoleId >", value, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("userRoleId >=", value, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdLessThan(Integer value) {
            addCriterion("userRoleId <", value, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("userRoleId <=", value, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdIn(List<Integer> values) {
            addCriterion("userRoleId in", values, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdNotIn(List<Integer> values) {
            addCriterion("userRoleId not in", values, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("userRoleId between", value1, value2, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("userRoleId not between", value1, value2, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andDepartNumIsNull() {
            addCriterion("departNum is null");
            return (Criteria) this;
        }

        public Criteria andDepartNumIsNotNull() {
            addCriterion("departNum is not null");
            return (Criteria) this;
        }

        public Criteria andDepartNumEqualTo(String value) {
            addCriterion("departNum =", value, "departNum");
            return (Criteria) this;
        }

        public Criteria andDepartNumNotEqualTo(String value) {
            addCriterion("departNum <>", value, "departNum");
            return (Criteria) this;
        }

        public Criteria andDepartNumGreaterThan(String value) {
            addCriterion("departNum >", value, "departNum");
            return (Criteria) this;
        }

        public Criteria andDepartNumGreaterThanOrEqualTo(String value) {
            addCriterion("departNum >=", value, "departNum");
            return (Criteria) this;
        }

        public Criteria andDepartNumLessThan(String value) {
            addCriterion("departNum <", value, "departNum");
            return (Criteria) this;
        }

        public Criteria andDepartNumLessThanOrEqualTo(String value) {
            addCriterion("departNum <=", value, "departNum");
            return (Criteria) this;
        }

        public Criteria andDepartNumLike(String value) {
            addCriterion("departNum like", value, "departNum");
            return (Criteria) this;
        }

        public Criteria andDepartNumNotLike(String value) {
            addCriterion("departNum not like", value, "departNum");
            return (Criteria) this;
        }

        public Criteria andDepartNumIn(List<String> values) {
            addCriterion("departNum in", values, "departNum");
            return (Criteria) this;
        }

        public Criteria andDepartNumNotIn(List<String> values) {
            addCriterion("departNum not in", values, "departNum");
            return (Criteria) this;
        }

        public Criteria andDepartNumBetween(String value1, String value2) {
            addCriterion("departNum between", value1, value2, "departNum");
            return (Criteria) this;
        }

        public Criteria andDepartNumNotBetween(String value1, String value2) {
            addCriterion("departNum not between", value1, value2, "departNum");
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