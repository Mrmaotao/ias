package cn.tit.ias.mapper;

import cn.tit.ias.entity.DepartInfo;
import cn.tit.ias.entity.DepartInfoExample;
import java.util.List;

public interface DepartInfoMapper {
    int deleteByPrimaryKey(String departNum);

    int insert(DepartInfo record);

    int insertSelective(DepartInfo record);

    List<DepartInfo> selectByExample(DepartInfoExample example);

    DepartInfo selectByPrimaryKey(String departNum);

    int updateByPrimaryKeySelective(DepartInfo record);

    int updateByPrimaryKey(DepartInfo record);
}