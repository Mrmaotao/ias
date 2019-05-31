package cn.tit.ias.entity;

import java.util.ArrayList;
import java.util.List;

public class DepartInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepartInfoExample() {
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

        public Criteria andDepartNameIsNull() {
            addCriterion("departName is null");
            return (Criteria) this;
        }

        public Criteria andDepartNameIsNotNull() {
            addCriterion("departName is not null");
            return (Criteria) this;
        }

        public Criteria andDepartNameEqualTo(String value) {
            addCriterion("departName =", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotEqualTo(String value) {
            addCriterion("departName <>", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameGreaterThan(String value) {
            addCriterion("departName >", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameGreaterThanOrEqualTo(String value) {
            addCriterion("departName >=", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameLessThan(String value) {
            addCriterion("departName <", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameLessThanOrEqualTo(String value) {
            addCriterion("departName <=", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameLike(String value) {
            addCriterion("departName like", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotLike(String value) {
            addCriterion("departName not like", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameIn(List<String> values) {
            addCriterion("departName in", values, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotIn(List<String> values) {
            addCriterion("departName not in", values, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameBetween(String value1, String value2) {
            addCriterion("departName between", value1, value2, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotBetween(String value1, String value2) {
            addCriterion("departName not between", value1, value2, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartRemarkIsNull() {
            addCriterion("departRemark is null");
            return (Criteria) this;
        }

        public Criteria andDepartRemarkIsNotNull() {
            addCriterion("departRemark is not null");
            return (Criteria) this;
        }

        public Criteria andDepartRemarkEqualTo(String value) {
            addCriterion("departRemark =", value, "departRemark");
            return (Criteria) this;
        }

        public Criteria andDepartRemarkNotEqualTo(String value) {
            addCriterion("departRemark <>", value, "departRemark");
            return (Criteria) this;
        }

        public Criteria andDepartRemarkGreaterThan(String value) {
            addCriterion("departRemark >", value, "departRemark");
            return (Criteria) this;
        }

        public Criteria andDepartRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("departRemark >=", value, "departRemark");
            return (Criteria) this;
        }

        public Criteria andDepartRemarkLessThan(String value) {
            addCriterion("departRemark <", value, "departRemark");
            return (Criteria) this;
        }

        public Criteria andDepartRemarkLessThanOrEqualTo(String value) {
            addCriterion("departRemark <=", value, "departRemark");
            return (Criteria) this;
        }

        public Criteria andDepartRemarkLike(String value) {
            addCriterion("departRemark like", value, "departRemark");
            return (Criteria) this;
        }

        public Criteria andDepartRemarkNotLike(String value) {
            addCriterion("departRemark not like", value, "departRemark");
            return (Criteria) this;
        }

        public Criteria andDepartRemarkIn(List<String> values) {
            addCriterion("departRemark in", values, "departRemark");
            return (Criteria) this;
        }

        public Criteria andDepartRemarkNotIn(List<String> values) {
            addCriterion("departRemark not in", values, "departRemark");
            return (Criteria) this;
        }

        public Criteria andDepartRemarkBetween(String value1, String value2) {
            addCriterion("departRemark between", value1, value2, "departRemark");
            return (Criteria) this;
        }

        public Criteria andDepartRemarkNotBetween(String value1, String value2) {
            addCriterion("departRemark not between", value1, value2, "departRemark");
            return (Criteria) this;
        }

        public Criteria andCollegeNumIsNull() {
            addCriterion("collegeNum is null");
            return (Criteria) this;
        }

        public Criteria andCollegeNumIsNotNull() {
            addCriterion("collegeNum is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeNumEqualTo(Integer value) {
            addCriterion("collegeNum =", value, "collegeNum");
            return (Criteria) this;
        }

        public Criteria andCollegeNumNotEqualTo(Integer value) {
            addCriterion("collegeNum <>", value, "collegeNum");
            return (Criteria) this;
        }

        public Criteria andCollegeNumGreaterThan(Integer value) {
            addCriterion("collegeNum >", value, "collegeNum");
            return (Criteria) this;
        }

        public Criteria andCollegeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("collegeNum >=", value, "collegeNum");
            return (Criteria) this;
        }

        public Criteria andCollegeNumLessThan(Integer value) {
            addCriterion("collegeNum <", value, "collegeNum");
            return (Criteria) this;
        }

        public Criteria andCollegeNumLessThanOrEqualTo(Integer value) {
            addCriterion("collegeNum <=", value, "collegeNum");
            return (Criteria) this;
        }

        public Criteria andCollegeNumIn(List<Integer> values) {
            addCriterion("collegeNum in", values, "collegeNum");
            return (Criteria) this;
        }

        public Criteria andCollegeNumNotIn(List<Integer> values) {
            addCriterion("collegeNum not in", values, "collegeNum");
            return (Criteria) this;
        }

        public Criteria andCollegeNumBetween(Integer value1, Integer value2) {
            addCriterion("collegeNum between", value1, value2, "collegeNum");
            return (Criteria) this;
        }

        public Criteria andCollegeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("collegeNum not between", value1, value2, "collegeNum");
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