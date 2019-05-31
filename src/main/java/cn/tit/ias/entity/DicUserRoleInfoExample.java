package cn.tit.ias.entity;

import java.util.ArrayList;
import java.util.List;

public class DicUserRoleInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DicUserRoleInfoExample() {
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

        public Criteria andUserRoleNameIsNull() {
            addCriterion("userRoleName is null");
            return (Criteria) this;
        }

        public Criteria andUserRoleNameIsNotNull() {
            addCriterion("userRoleName is not null");
            return (Criteria) this;
        }

        public Criteria andUserRoleNameEqualTo(String value) {
            addCriterion("userRoleName =", value, "userRoleName");
            return (Criteria) this;
        }

        public Criteria andUserRoleNameNotEqualTo(String value) {
            addCriterion("userRoleName <>", value, "userRoleName");
            return (Criteria) this;
        }

        public Criteria andUserRoleNameGreaterThan(String value) {
            addCriterion("userRoleName >", value, "userRoleName");
            return (Criteria) this;
        }

        public Criteria andUserRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("userRoleName >=", value, "userRoleName");
            return (Criteria) this;
        }

        public Criteria andUserRoleNameLessThan(String value) {
            addCriterion("userRoleName <", value, "userRoleName");
            return (Criteria) this;
        }

        public Criteria andUserRoleNameLessThanOrEqualTo(String value) {
            addCriterion("userRoleName <=", value, "userRoleName");
            return (Criteria) this;
        }

        public Criteria andUserRoleNameLike(String value) {
            addCriterion("userRoleName like", value, "userRoleName");
            return (Criteria) this;
        }

        public Criteria andUserRoleNameNotLike(String value) {
            addCriterion("userRoleName not like", value, "userRoleName");
            return (Criteria) this;
        }

        public Criteria andUserRoleNameIn(List<String> values) {
            addCriterion("userRoleName in", values, "userRoleName");
            return (Criteria) this;
        }

        public Criteria andUserRoleNameNotIn(List<String> values) {
            addCriterion("userRoleName not in", values, "userRoleName");
            return (Criteria) this;
        }

        public Criteria andUserRoleNameBetween(String value1, String value2) {
            addCriterion("userRoleName between", value1, value2, "userRoleName");
            return (Criteria) this;
        }

        public Criteria andUserRoleNameNotBetween(String value1, String value2) {
            addCriterion("userRoleName not between", value1, value2, "userRoleName");
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