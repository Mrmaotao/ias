package cn.tit.ias.mapper;

import cn.tit.ias.entity.UserInfo;
import cn.tit.ias.entity.UserInfoExample;
import java.util.List;

public interface UserInfoMapper {
    int deleteByPrimaryKey(String userCount);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    List<UserInfo> selectByExample(UserInfoExample example);

    UserInfo selectByPrimaryKey(String userCount);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}