package cn.tit.ias.entity;

public class CollegeInfo {
    private Integer collegeNum;

    private String collegeName;

    public Integer getCollegeNum() {
        return collegeNum;
    }

    public void setCollegeNum(Integer collegeNum) {
        this.collegeNum = collegeNum;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName == null ? null : collegeName.trim();
    }
}