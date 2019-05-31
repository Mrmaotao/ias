package cn.tit.ias.entity;

import java.util.ArrayList;
import java.util.List;

public class AssetInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssetInfoExample() {
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

        public Criteria andAssetNumIsNull() {
            addCriterion("assetNum is null");
            return (Criteria) this;
        }

        public Criteria andAssetNumIsNotNull() {
            addCriterion("assetNum is not null");
            return (Criteria) this;
        }

        public Criteria andAssetNumEqualTo(String value) {
            addCriterion("assetNum =", value, "assetNum");
            return (Criteria) this;
        }

        public Criteria andAssetNumNotEqualTo(String value) {
            addCriterion("assetNum <>", value, "assetNum");
            return (Criteria) this;
        }

        public Criteria andAssetNumGreaterThan(String value) {
            addCriterion("assetNum >", value, "assetNum");
            return (Criteria) this;
        }

        public Criteria andAssetNumGreaterThanOrEqualTo(String value) {
            addCriterion("assetNum >=", value, "assetNum");
            return (Criteria) this;
        }

        public Criteria andAssetNumLessThan(String value) {
            addCriterion("assetNum <", value, "assetNum");
            return (Criteria) this;
        }

        public Criteria andAssetNumLessThanOrEqualTo(String value) {
            addCriterion("assetNum <=", value, "assetNum");
            return (Criteria) this;
        }

        public Criteria andAssetNumLike(String value) {
            addCriterion("assetNum like", value, "assetNum");
            return (Criteria) this;
        }

        public Criteria andAssetNumNotLike(String value) {
            addCriterion("assetNum not like", value, "assetNum");
            return (Criteria) this;
        }

        public Criteria andAssetNumIn(List<String> values) {
            addCriterion("assetNum in", values, "assetNum");
            return (Criteria) this;
        }

        public Criteria andAssetNumNotIn(List<String> values) {
            addCriterion("assetNum not in", values, "assetNum");
            return (Criteria) this;
        }

        public Criteria andAssetNumBetween(String value1, String value2) {
            addCriterion("assetNum between", value1, value2, "assetNum");
            return (Criteria) this;
        }

        public Criteria andAssetNumNotBetween(String value1, String value2) {
            addCriterion("assetNum not between", value1, value2, "assetNum");
            return (Criteria) this;
        }

        public Criteria andAssetNameIsNull() {
            addCriterion("assetName is null");
            return (Criteria) this;
        }

        public Criteria andAssetNameIsNotNull() {
            addCriterion("assetName is not null");
            return (Criteria) this;
        }

        public Criteria andAssetNameEqualTo(String value) {
            addCriterion("assetName =", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameNotEqualTo(String value) {
            addCriterion("assetName <>", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameGreaterThan(String value) {
            addCriterion("assetName >", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameGreaterThanOrEqualTo(String value) {
            addCriterion("assetName >=", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameLessThan(String value) {
            addCriterion("assetName <", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameLessThanOrEqualTo(String value) {
            addCriterion("assetName <=", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameLike(String value) {
            addCriterion("assetName like", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameNotLike(String value) {
            addCriterion("assetName not like", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameIn(List<String> values) {
            addCriterion("assetName in", values, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameNotIn(List<String> values) {
            addCriterion("assetName not in", values, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameBetween(String value1, String value2) {
            addCriterion("assetName between", value1, value2, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameNotBetween(String value1, String value2) {
            addCriterion("assetName not between", value1, value2, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetModelIsNull() {
            addCriterion("assetModel is null");
            return (Criteria) this;
        }

        public Criteria andAssetModelIsNotNull() {
            addCriterion("assetModel is not null");
            return (Criteria) this;
        }

        public Criteria andAssetModelEqualTo(String value) {
            addCriterion("assetModel =", value, "assetModel");
            return (Criteria) this;
        }

        public Criteria andAssetModelNotEqualTo(String value) {
            addCriterion("assetModel <>", value, "assetModel");
            return (Criteria) this;
        }

        public Criteria andAssetModelGreaterThan(String value) {
            addCriterion("assetModel >", value, "assetModel");
            return (Criteria) this;
        }

        public Criteria andAssetModelGreaterThanOrEqualTo(String value) {
            addCriterion("assetModel >=", value, "assetModel");
            return (Criteria) this;
        }

        public Criteria andAssetModelLessThan(String value) {
            addCriterion("assetModel <", value, "assetModel");
            return (Criteria) this;
        }

        public Criteria andAssetModelLessThanOrEqualTo(String value) {
            addCriterion("assetModel <=", value, "assetModel");
            return (Criteria) this;
        }

        public Criteria andAssetModelLike(String value) {
            addCriterion("assetModel like", value, "assetModel");
            return (Criteria) this;
        }

        public Criteria andAssetModelNotLike(String value) {
            addCriterion("assetModel not like", value, "assetModel");
            return (Criteria) this;
        }

        public Criteria andAssetModelIn(List<String> values) {
            addCriterion("assetModel in", values, "assetModel");
            return (Criteria) this;
        }

        public Criteria andAssetModelNotIn(List<String> values) {
            addCriterion("assetModel not in", values, "assetModel");
            return (Criteria) this;
        }

        public Criteria andAssetModelBetween(String value1, String value2) {
            addCriterion("assetModel between", value1, value2, "assetModel");
            return (Criteria) this;
        }

        public Criteria andAssetModelNotBetween(String value1, String value2) {
            addCriterion("assetModel not between", value1, value2, "assetModel");
            return (Criteria) this;
        }

        public Criteria andAssetPriceIsNull() {
            addCriterion("assetPrice is null");
            return (Criteria) this;
        }

        public Criteria andAssetPriceIsNotNull() {
            addCriterion("assetPrice is not null");
            return (Criteria) this;
        }

        public Criteria andAssetPriceEqualTo(Float value) {
            addCriterion("assetPrice =", value, "assetPrice");
            return (Criteria) this;
        }

        public Criteria andAssetPriceNotEqualTo(Float value) {
            addCriterion("assetPrice <>", value, "assetPrice");
            return (Criteria) this;
        }

        public Criteria andAssetPriceGreaterThan(Float value) {
            addCriterion("assetPrice >", value, "assetPrice");
            return (Criteria) this;
        }

        public Criteria andAssetPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("assetPrice >=", value, "assetPrice");
            return (Criteria) this;
        }

        public Criteria andAssetPriceLessThan(Float value) {
            addCriterion("assetPrice <", value, "assetPrice");
            return (Criteria) this;
        }

        public Criteria andAssetPriceLessThanOrEqualTo(Float value) {
            addCriterion("assetPrice <=", value, "assetPrice");
            return (Criteria) this;
        }

        public Criteria andAssetPriceIn(List<Float> values) {
            addCriterion("assetPrice in", values, "assetPrice");
            return (Criteria) this;
        }

        public Criteria andAssetPriceNotIn(List<Float> values) {
            addCriterion("assetPrice not in", values, "assetPrice");
            return (Criteria) this;
        }

        public Criteria andAssetPriceBetween(Float value1, Float value2) {
            addCriterion("assetPrice between", value1, value2, "assetPrice");
            return (Criteria) this;
        }

        public Criteria andAssetPriceNotBetween(Float value1, Float value2) {
            addCriterion("assetPrice not between", value1, value2, "assetPrice");
            return (Criteria) this;
        }

        public Criteria andAssetFactoryIsNull() {
            addCriterion("assetFactory is null");
            return (Criteria) this;
        }

        public Criteria andAssetFactoryIsNotNull() {
            addCriterion("assetFactory is not null");
            return (Criteria) this;
        }

        public Criteria andAssetFactoryEqualTo(String value) {
            addCriterion("assetFactory =", value, "assetFactory");
            return (Criteria) this;
        }

        public Criteria andAssetFactoryNotEqualTo(String value) {
            addCriterion("assetFactory <>", value, "assetFactory");
            return (Criteria) this;
        }

        public Criteria andAssetFactoryGreaterThan(String value) {
            addCriterion("assetFactory >", value, "assetFactory");
            return (Criteria) this;
        }

        public Criteria andAssetFactoryGreaterThanOrEqualTo(String value) {
            addCriterion("assetFactory >=", value, "assetFactory");
            return (Criteria) this;
        }

        public Criteria andAssetFactoryLessThan(String value) {
            addCriterion("assetFactory <", value, "assetFactory");
            return (Criteria) this;
        }

        public Criteria andAssetFactoryLessThanOrEqualTo(String value) {
            addCriterion("assetFactory <=", value, "assetFactory");
            return (Criteria) this;
        }

        public Criteria andAssetFactoryLike(String value) {
            addCriterion("assetFactory like", value, "assetFactory");
            return (Criteria) this;
        }

        public Criteria andAssetFactoryNotLike(String value) {
            addCriterion("assetFactory not like", value, "assetFactory");
            return (Criteria) this;
        }

        public Criteria andAssetFactoryIn(List<String> values) {
            addCriterion("assetFactory in", values, "assetFactory");
            return (Criteria) this;
        }

        public Criteria andAssetFactoryNotIn(List<String> values) {
            addCriterion("assetFactory not in", values, "assetFactory");
            return (Criteria) this;
        }

        public Criteria andAssetFactoryBetween(String value1, String value2) {
            addCriterion("assetFactory between", value1, value2, "assetFactory");
            return (Criteria) this;
        }

        public Criteria andAssetFactoryNotBetween(String value1, String value2) {
            addCriterion("assetFactory not between", value1, value2, "assetFactory");
            return (Criteria) this;
        }

        public Criteria andAssetDocumentNumIsNull() {
            addCriterion("assetDocumentNum is null");
            return (Criteria) this;
        }

        public Criteria andAssetDocumentNumIsNotNull() {
            addCriterion("assetDocumentNum is not null");
            return (Criteria) this;
        }

        public Criteria andAssetDocumentNumEqualTo(String value) {
            addCriterion("assetDocumentNum =", value, "assetDocumentNum");
            return (Criteria) this;
        }

        public Criteria andAssetDocumentNumNotEqualTo(String value) {
            addCriterion("assetDocumentNum <>", value, "assetDocumentNum");
            return (Criteria) this;
        }

        public Criteria andAssetDocumentNumGreaterThan(String value) {
            addCriterion("assetDocumentNum >", value, "assetDocumentNum");
            return (Criteria) this;
        }

        public Criteria andAssetDocumentNumGreaterThanOrEqualTo(String value) {
            addCriterion("assetDocumentNum >=", value, "assetDocumentNum");
            return (Criteria) this;
        }

        public Criteria andAssetDocumentNumLessThan(String value) {
            addCriterion("assetDocumentNum <", value, "assetDocumentNum");
            return (Criteria) this;
        }

        public Criteria andAssetDocumentNumLessThanOrEqualTo(String value) {
            addCriterion("assetDocumentNum <=", value, "assetDocumentNum");
            return (Criteria) this;
        }

        public Criteria andAssetDocumentNumLike(String value) {
            addCriterion("assetDocumentNum like", value, "assetDocumentNum");
            return (Criteria) this;
        }

        public Criteria andAssetDocumentNumNotLike(String value) {
            addCriterion("assetDocumentNum not like", value, "assetDocumentNum");
            return (Criteria) this;
        }

        public Criteria andAssetDocumentNumIn(List<String> values) {
            addCriterion("assetDocumentNum in", values, "assetDocumentNum");
            return (Criteria) this;
        }

        public Criteria andAssetDocumentNumNotIn(List<String> values) {
            addCriterion("assetDocumentNum not in", values, "assetDocumentNum");
            return (Criteria) this;
        }

        public Criteria andAssetDocumentNumBetween(String value1, String value2) {
            addCriterion("assetDocumentNum between", value1, value2, "assetDocumentNum");
            return (Criteria) this;
        }

        public Criteria andAssetDocumentNumNotBetween(String value1, String value2) {
            addCriterion("assetDocumentNum not between", value1, value2, "assetDocumentNum");
            return (Criteria) this;
        }

        public Criteria andAssetBuyDateIsNull() {
            addCriterion("assetBuyDate is null");
            return (Criteria) this;
        }

        public Criteria andAssetBuyDateIsNotNull() {
            addCriterion("assetBuyDate is not null");
            return (Criteria) this;
        }

        public Criteria andAssetBuyDateEqualTo(String value) {
            addCriterion("assetBuyDate =", value, "assetBuyDate");
            return (Criteria) this;
        }

        public Criteria andAssetBuyDateNotEqualTo(String value) {
            addCriterion("assetBuyDate <>", value, "assetBuyDate");
            return (Criteria) this;
        }

        public Criteria andAssetBuyDateGreaterThan(String value) {
            addCriterion("assetBuyDate >", value, "assetBuyDate");
            return (Criteria) this;
        }

        public Criteria andAssetBuyDateGreaterThanOrEqualTo(String value) {
            addCriterion("assetBuyDate >=", value, "assetBuyDate");
            return (Criteria) this;
        }

        public Criteria andAssetBuyDateLessThan(String value) {
            addCriterion("assetBuyDate <", value, "assetBuyDate");
            return (Criteria) this;
        }

        public Criteria andAssetBuyDateLessThanOrEqualTo(String value) {
            addCriterion("assetBuyDate <=", value, "assetBuyDate");
            return (Criteria) this;
        }

        public Criteria andAssetBuyDateLike(String value) {
            addCriterion("assetBuyDate like", value, "assetBuyDate");
            return (Criteria) this;
        }

        public Criteria andAssetBuyDateNotLike(String value) {
            addCriterion("assetBuyDate not like", value, "assetBuyDate");
            return (Criteria) this;
        }

        public Criteria andAssetBuyDateIn(List<String> values) {
            addCriterion("assetBuyDate in", values, "assetBuyDate");
            return (Criteria) this;
        }

        public Criteria andAssetBuyDateNotIn(List<String> values) {
            addCriterion("assetBuyDate not in", values, "assetBuyDate");
            return (Criteria) this;
        }

        public Criteria andAssetBuyDateBetween(String value1, String value2) {
            addCriterion("assetBuyDate between", value1, value2, "assetBuyDate");
            return (Criteria) this;
        }

        public Criteria andAssetBuyDateNotBetween(String value1, String value2) {
            addCriterion("assetBuyDate not between", value1, value2, "assetBuyDate");
            return (Criteria) this;
        }

        public Criteria andAssetTakePeopleIsNull() {
            addCriterion("assetTakePeople is null");
            return (Criteria) this;
        }

        public Criteria andAssetTakePeopleIsNotNull() {
            addCriterion("assetTakePeople is not null");
            return (Criteria) this;
        }

        public Criteria andAssetTakePeopleEqualTo(String value) {
            addCriterion("assetTakePeople =", value, "assetTakePeople");
            return (Criteria) this;
        }

        public Criteria andAssetTakePeopleNotEqualTo(String value) {
            addCriterion("assetTakePeople <>", value, "assetTakePeople");
            return (Criteria) this;
        }

        public Criteria andAssetTakePeopleGreaterThan(String value) {
            addCriterion("assetTakePeople >", value, "assetTakePeople");
            return (Criteria) this;
        }

        public Criteria andAssetTakePeopleGreaterThanOrEqualTo(String value) {
            addCriterion("assetTakePeople >=", value, "assetTakePeople");
            return (Criteria) this;
        }

        public Criteria andAssetTakePeopleLessThan(String value) {
            addCriterion("assetTakePeople <", value, "assetTakePeople");
            return (Criteria) this;
        }

        public Criteria andAssetTakePeopleLessThanOrEqualTo(String value) {
            addCriterion("assetTakePeople <=", value, "assetTakePeople");
            return (Criteria) this;
        }

        public Criteria andAssetTakePeopleLike(String value) {
            addCriterion("assetTakePeople like", value, "assetTakePeople");
            return (Criteria) this;
        }

        public Criteria andAssetTakePeopleNotLike(String value) {
            addCriterion("assetTakePeople not like", value, "assetTakePeople");
            return (Criteria) this;
        }

        public Criteria andAssetTakePeopleIn(List<String> values) {
            addCriterion("assetTakePeople in", values, "assetTakePeople");
            return (Criteria) this;
        }

        public Criteria andAssetTakePeopleNotIn(List<String> values) {
            addCriterion("assetTakePeople not in", values, "assetTakePeople");
            return (Criteria) this;
        }

        public Criteria andAssetTakePeopleBetween(String value1, String value2) {
            addCriterion("assetTakePeople between", value1, value2, "assetTakePeople");
            return (Criteria) this;
        }

        public Criteria andAssetTakePeopleNotBetween(String value1, String value2) {
            addCriterion("assetTakePeople not between", value1, value2, "assetTakePeople");
            return (Criteria) this;
        }

        public Criteria andAssetRemrkIsNull() {
            addCriterion("assetRemrk is null");
            return (Criteria) this;
        }

        public Criteria andAssetRemrkIsNotNull() {
            addCriterion("assetRemrk is not null");
            return (Criteria) this;
        }

        public Criteria andAssetRemrkEqualTo(String value) {
            addCriterion("assetRemrk =", value, "assetRemrk");
            return (Criteria) this;
        }

        public Criteria andAssetRemrkNotEqualTo(String value) {
            addCriterion("assetRemrk <>", value, "assetRemrk");
            return (Criteria) this;
        }

        public Criteria andAssetRemrkGreaterThan(String value) {
            addCriterion("assetRemrk >", value, "assetRemrk");
            return (Criteria) this;
        }

        public Criteria andAssetRemrkGreaterThanOrEqualTo(String value) {
            addCriterion("assetRemrk >=", value, "assetRemrk");
            return (Criteria) this;
        }

        public Criteria andAssetRemrkLessThan(String value) {
            addCriterion("assetRemrk <", value, "assetRemrk");
            return (Criteria) this;
        }

        public Criteria andAssetRemrkLessThanOrEqualTo(String value) {
            addCriterion("assetRemrk <=", value, "assetRemrk");
            return (Criteria) this;
        }

        public Criteria andAssetRemrkLike(String value) {
            addCriterion("assetRemrk like", value, "assetRemrk");
            return (Criteria) this;
        }

        public Criteria andAssetRemrkNotLike(String value) {
            addCriterion("assetRemrk not like", value, "assetRemrk");
            return (Criteria) this;
        }

        public Criteria andAssetRemrkIn(List<String> values) {
            addCriterion("assetRemrk in", values, "assetRemrk");
            return (Criteria) this;
        }

        public Criteria andAssetRemrkNotIn(List<String> values) {
            addCriterion("assetRemrk not in", values, "assetRemrk");
            return (Criteria) this;
        }

        public Criteria andAssetRemrkBetween(String value1, String value2) {
            addCriterion("assetRemrk between", value1, value2, "assetRemrk");
            return (Criteria) this;
        }

        public Criteria andAssetRemrkNotBetween(String value1, String value2) {
            addCriterion("assetRemrk not between", value1, value2, "assetRemrk");
            return (Criteria) this;
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