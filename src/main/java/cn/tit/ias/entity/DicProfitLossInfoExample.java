package cn.tit.ias.entity;

import java.util.ArrayList;
import java.util.List;

public class DicProfitLossInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DicProfitLossInfoExample() {
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

        public Criteria andDicProfitLossNumIsNull() {
            addCriterion("dicProfitLossNum is null");
            return (Criteria) this;
        }

        public Criteria andDicProfitLossNumIsNotNull() {
            addCriterion("dicProfitLossNum is not null");
            return (Criteria) this;
        }

        public Criteria andDicProfitLossNumEqualTo(Integer value) {
            addCriterion("dicProfitLossNum =", value, "dicProfitLossNum");
            return (Criteria) this;
        }

        public Criteria andDicProfitLossNumNotEqualTo(Integer value) {
            addCriterion("dicProfitLossNum <>", value, "dicProfitLossNum");
            return (Criteria) this;
        }

        public Criteria andDicProfitLossNumGreaterThan(Integer value) {
            addCriterion("dicProfitLossNum >", value, "dicProfitLossNum");
            return (Criteria) this;
        }

        public Criteria andDicProfitLossNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("dicProfitLossNum >=", value, "dicProfitLossNum");
            return (Criteria) this;
        }

        public Criteria andDicProfitLossNumLessThan(Integer value) {
            addCriterion("dicProfitLossNum <", value, "dicProfitLossNum");
            return (Criteria) this;
        }

        public Criteria andDicProfitLossNumLessThanOrEqualTo(Integer value) {
            addCriterion("dicProfitLossNum <=", value, "dicProfitLossNum");
            return (Criteria) this;
        }

        public Criteria andDicProfitLossNumIn(List<Integer> values) {
            addCriterion("dicProfitLossNum in", values, "dicProfitLossNum");
            return (Criteria) this;
        }

        public Criteria andDicProfitLossNumNotIn(List<Integer> values) {
            addCriterion("dicProfitLossNum not in", values, "dicProfitLossNum");
            return (Criteria) this;
        }

        public Criteria andDicProfitLossNumBetween(Integer value1, Integer value2) {
            addCriterion("dicProfitLossNum between", value1, value2, "dicProfitLossNum");
            return (Criteria) this;
        }

        public Criteria andDicProfitLossNumNotBetween(Integer value1, Integer value2) {
            addCriterion("dicProfitLossNum not between", value1, value2, "dicProfitLossNum");
            return (Criteria) this;
        }

        public Criteria andDicProfitLossNameIsNull() {
            addCriterion("dicProfitLossName is null");
            return (Criteria) this;
        }

        public Criteria andDicProfitLossNameIsNotNull() {
            addCriterion("dicProfitLossName is not null");
            return (Criteria) this;
        }

        public Criteria andDicProfitLossNameEqualTo(String value) {
            addCriterion("dicProfitLossName =", value, "dicProfitLossName");
            return (Criteria) this;
        }

        public Criteria andDicProfitLossNameNotEqualTo(String value) {
            addCriterion("dicProfitLossName <>", value, "dicProfitLossName");
            return (Criteria) this;
        }

        public Criteria andDicProfitLossNameGreaterThan(String value) {
            addCriterion("dicProfitLossName >", value, "dicProfitLossName");
            return (Criteria) this;
        }

        public Criteria andDicProfitLossNameGreaterThanOrEqualTo(String value) {
            addCriterion("dicProfitLossName >=", value, "dicProfitLossName");
            return (Criteria) this;
        }

        public Criteria andDicProfitLossNameLessThan(String value) {
            addCriterion("dicProfitLossName <", value, "dicProfitLossName");
            return (Criteria) this;
        }

        public Criteria andDicProfitLossNameLessThanOrEqualTo(String value) {
            addCriterion("dicProfitLossName <=", value, "dicProfitLossName");
            return (Criteria) this;
        }

        public Criteria andDicProfitLossNameLike(String value) {
            addCriterion("dicProfitLossName like", value, "dicProfitLossName");
            return (Criteria) this;
        }

        public Criteria andDicProfitLossNameNotLike(String value) {
            addCriterion("dicProfitLossName not like", value, "dicProfitLossName");
            return (Criteria) this;
        }

        public Criteria andDicProfitLossNameIn(List<String> values) {
            addCriterion("dicProfitLossName in", values, "dicProfitLossName");
            return (Criteria) this;
        }

        public Criteria andDicProfitLossNameNotIn(List<String> values) {
            addCriterion("dicProfitLossName not in", values, "dicProfitLossName");
            return (Criteria) this;
        }

        public Criteria andDicProfitLossNameBetween(String value1, String value2) {
            addCriterion("dicProfitLossName between", value1, value2, "dicProfitLossName");
            return (Criteria) this;
        }

        public Criteria andDicProfitLossNameNotBetween(String value1, String value2) {
            addCriterion("dicProfitLossName not between", value1, value2, "dicProfitLossName");
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