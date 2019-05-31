package cn.tit.ias.entity;

public class DepartInfo {
    private String departNum;

    private String departName;

    private String departRemark;

    private Integer collegeNum;

    public String getDepartNum() {
        return departNum;
    }

    public void setDepartNum(String departNum) {
        this.departNum = departNum == null ? null : departNum.trim();
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName == null ? null : departName.trim();
    }

    public String getDepartRemark() {
        return departRemark;
    }

    public void setDepartRemark(String departRemark) {
        this.departRemark = departRemark == null ? null : departRemark.trim();
    }

    public Integer getCollegeNum() {
        return collegeNum;
    }

    public void setCollegeNum(Integer collegeNum) {
        this.collegeNum = collegeNum;
    }
}