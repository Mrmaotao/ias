package cn.tit.ias.entity;

public class DicProfitLossInfo {
    private Integer dicProfitLossNum;

    private String dicProfitLossName;

    public Integer getDicProfitLossNum() {
        return dicProfitLossNum;
    }

    public void setDicProfitLossNum(Integer dicProfitLossNum) {
        this.dicProfitLossNum = dicProfitLossNum;
    }

    public String getDicProfitLossName() {
        return dicProfitLossName;
    }

    public void setDicProfitLossName(String dicProfitLossName) {
        this.dicProfitLossName = dicProfitLossName == null ? null : dicProfitLossName.trim();
    }
}