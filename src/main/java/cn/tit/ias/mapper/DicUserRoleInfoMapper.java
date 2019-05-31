package cn.tit.ias.mapper;

import cn.tit.ias.entity.DicUserRoleInfo;
import cn.tit.ias.entity.DicUserRoleInfoExample;
import java.util.List;

public interface DicUserRoleInfoMapper {
    int deleteByPrimaryKey(Integer userRoleId);

    int insert(DicUserRoleInfo record);

    int insertSelective(DicUserRoleInfo record);

    List<DicUserRoleInfo> selectByExample(DicUserRoleInfoExample example);

    DicUserRoleInfo selectByPrimaryKey(Integer userRoleId);

    int updateByPrimaryKeySelective(DicUserRoleInfo record);

    int updateByPrimaryKey(DicUserRoleInfo record);
}