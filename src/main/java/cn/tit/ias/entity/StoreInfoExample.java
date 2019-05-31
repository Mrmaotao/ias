package cn.tit.ias.entity;

import java.util.ArrayList;
import java.util.List;

public class StoreInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreInfoExample() {
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

        public Criteria andStoreNumIsNull() {
            addCriterion("storeNum is null");
            return (Criteria) this;
        }

        public Criteria andStoreNumIsNotNull() {
            addCriterion("storeNum is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNumEqualTo(Integer value) {
            addCriterion("storeNum =", value, "storeNum");
            return (Criteria) this;
        }

        public Criteria andStoreNumNotEqualTo(Integer value) {
            addCriterion("storeNum <>", value, "storeNum");
            return (Criteria) this;
        }

        public Criteria andStoreNumGreaterThan(Integer value) {
            addCriterion("storeNum >", value, "storeNum");
            return (Criteria) this;
        }

        public Criteria andStoreNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("storeNum >=", value, "storeNum");
            return (Criteria) this;
        }

        public Criteria andStoreNumLessThan(Integer value) {
            addCriterion("storeNum <", value, "storeNum");
            return (Criteria) this;
        }

        public Criteria andStoreNumLessThanOrEqualTo(Integer value) {
            addCriterion("storeNum <=", value, "storeNum");
            return (Criteria) this;
        }

        public Criteria andStoreNumIn(List<Integer> values) {
            addCriterion("storeNum in", values, "storeNum");
            return (Criteria) this;
        }

        public Criteria andStoreNumNotIn(List<Integer> values) {
            addCriterion("storeNum not in", values, "storeNum");
            return (Criteria) this;
        }

        public Criteria andStoreNumBetween(Integer value1, Integer value2) {
            addCriterion("storeNum between", value1, value2, "storeNum");
            return (Criteria) this;
        }

        public Criteria andStoreNumNotBetween(Integer value1, Integer value2) {
            addCriterion("storeNum not between", value1, value2, "storeNum");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNull() {
            addCriterion("storeName is null");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNotNull() {
            addCriterion("storeName is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNameEqualTo(String value) {
            addCriterion("storeName =", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotEqualTo(String value) {
            addCriterion("storeName <>", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThan(String value) {
            addCriterion("storeName >", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("storeName >=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThan(String value) {
            addCriterion("storeName <", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThanOrEqualTo(String value) {
            addCriterion("storeName <=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLike(String value) {
            addCriterion("storeName like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotLike(String value) {
            addCriterion("storeName not like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameIn(List<String> values) {
            addCriterion("storeName in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotIn(List<String> values) {
            addCriterion("storeName not in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameBetween(String value1, String value2) {
            addCriterion("storeName between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotBetween(String value1, String value2) {
            addCriterion("storeName not between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreDoorNumIsNull() {
            addCriterion("storeDoorNum is null");
            return (Criteria) this;
        }

        public Criteria andStoreDoorNumIsNotNull() {
            addCriterion("storeDoorNum is not null");
            return (Criteria) this;
        }

        public Criteria andStoreDoorNumEqualTo(String value) {
            addCriterion("storeDoorNum =", value, "storeDoorNum");
            return (Criteria) this;
        }

        public Criteria andStoreDoorNumNotEqualTo(String value) {
            addCriterion("storeDoorNum <>", value, "storeDoorNum");
            return (Criteria) this;
        }

        public Criteria andStoreDoorNumGreaterThan(String value) {
            addCriterion("storeDoorNum >", value, "storeDoorNum");
            return (Criteria) this;
        }

        public Criteria andStoreDoorNumGreaterThanOrEqualTo(String value) {
            addCriterion("storeDoorNum >=", value, "storeDoorNum");
            return (Criteria) this;
        }

        public Criteria andStoreDoorNumLessThan(String value) {
            addCriterion("storeDoorNum <", value, "storeDoorNum");
            return (Criteria) this;
        }

        public Criteria andStoreDoorNumLessThanOrEqualTo(String value) {
            addCriterion("storeDoorNum <=", value, "storeDoorNum");
            return (Criteria) this;
        }

        public Criteria andStoreDoorNumLike(String value) {
            addCriterion("storeDoorNum like", value, "storeDoorNum");
            return (Criteria) this;
        }

        public Criteria andStoreDoorNumNotLike(String value) {
            addCriterion("storeDoorNum not like", value, "storeDoorNum");
            return (Criteria) this;
        }

        public Criteria andStoreDoorNumIn(List<String> values) {
            addCriterion("storeDoorNum in", values, "storeDoorNum");
            return (Criteria) this;
        }

        public Criteria andStoreDoorNumNotIn(List<String> values) {
            addCriterion("storeDoorNum not in", values, "storeDoorNum");
            return (Criteria) this;
        }

        public Criteria andStoreDoorNumBetween(String value1, String value2) {
            addCriterion("storeDoorNum between", value1, value2, "storeDoorNum");
            return (Criteria) this;
        }

        public Criteria andStoreDoorNumNotBetween(String value1, String value2) {
            addCriterion("storeDoorNum not between", value1, value2, "storeDoorNum");
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