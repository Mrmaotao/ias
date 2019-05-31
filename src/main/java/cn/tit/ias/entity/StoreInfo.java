package cn.tit.ias.entity;

public class StoreInfo {
    private Integer storeNum;

    private String storeName;

    private String storeDoorNum;

    private String departNum;

    public Integer getStoreNum() {
        return storeNum;
    }

    public void setStoreNum(Integer storeNum) {
        this.storeNum = storeNum;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public String getStoreDoorNum() {
        return storeDoorNum;
    }

    public void setStoreDoorNum(String storeDoorNum) {
        this.storeDoorNum = storeDoorNum == null ? null : storeDoorNum.trim();
    }

    public String getDepartNum() {
        return departNum;
    }

    public void setDepartNum(String departNum) {
        this.departNum = departNum == null ? null : departNum.trim();
    }
}