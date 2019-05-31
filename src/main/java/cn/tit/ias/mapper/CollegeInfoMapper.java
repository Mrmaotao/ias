package cn.tit.ias.mapper;

import cn.tit.ias.entity.CollegeInfo;
import cn.tit.ias.entity.CollegeInfoExample;
import java.util.List;

public interface CollegeInfoMapper {
    int deleteByPrimaryKey(Integer collegeNum);

    int insert(CollegeInfo record);

    int insertSelective(CollegeInfo record);

    List<CollegeInfo> selectByExample(CollegeInfoExample example);

    CollegeInfo selectByPrimaryKey(Integer collegeNum);

    int updateByPrimaryKeySelective(CollegeInfo record);

    int updateByPrimaryKey(CollegeInfo record);
}