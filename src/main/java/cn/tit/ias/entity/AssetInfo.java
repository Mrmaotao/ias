package cn.tit.ias.entity;

public class AssetInfo {
    private String assetNum;

    private String assetName;

    private String assetModel;

    private Float assetPrice;

    private String assetFactory;

    private String assetDocumentNum;

    private String assetBuyDate;

    private String assetTakePeople;

    private String assetRemrk;

    private Integer storeNum;

    private Integer dicProfitLossNum;

    private String departNum;

    public String getAssetNum() {
        return assetNum;
    }

    public void setAssetNum(String assetNum) {
        this.assetNum = assetNum == null ? null : assetNum.trim();
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName == null ? null : assetName.trim();
    }

    public String getAssetModel() {
        return assetModel;
    }

    public void setAssetModel(String assetModel) {
        this.assetModel = assetModel == null ? null : assetModel.trim();
    }

    public Float getAssetPrice() {
        return assetPrice;
    }

    public void setAssetPrice(Float assetPrice) {
        this.assetPrice = assetPrice;
    }

    public String getAssetFactory() {
        return assetFactory;
    }

    public void setAssetFactory(String assetFactory) {
        this.assetFactory = assetFactory == null ? null : assetFactory.trim();
    }

    public String getAssetDocumentNum() {
        return assetDocumentNum;
    }

    public void setAssetDocumentNum(String assetDocumentNum) {
        this.assetDocumentNum = assetDocumentNum == null ? null : assetDocumentNum.trim();
    }

    public String getAssetBuyDate() {
        return assetBuyDate;
    }

    public void setAssetBuyDate(String assetBuyDate) {
        this.assetBuyDate = assetBuyDate == null ? null : assetBuyDate.trim();
    }

    public String getAssetTakePeople() {
        return assetTakePeople;
    }

    public void setAssetTakePeople(String assetTakePeople) {
        this.assetTakePeople = assetTakePeople == null ? null : assetTakePeople.trim();
    }

    public String getAssetRemrk() {
        return assetRemrk;
    }

    public void setAssetRemrk(String assetRemrk) {
        this.assetRemrk = assetRemrk == null ? null : assetRemrk.trim();
    }

    public Integer getStoreNum() {
        return storeNum;
    }

    public void setStoreNum(Integer storeNum) {
        this.storeNum = storeNum;
    }

    public Integer getDicProfitLossNum() {
        return dicProfitLossNum;
    }

    public void setDicProfitLossNum(Integer dicProfitLossNum) {
        this.dicProfitLossNum = dicProfitLossNum;
    }

    public String getDepartNum() {
        return departNum;
    }

    public void setDepartNum(String departNum) {
        this.departNum = departNum == null ? null : departNum.trim();
    }
}