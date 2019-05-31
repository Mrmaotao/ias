package cn.tit.ias.mapper;

import cn.tit.ias.entity.StoreInfo;
import cn.tit.ias.entity.StoreInfoExample;
import java.util.List;

public interface StoreInfoMapper {
    int deleteByPrimaryKey(Integer storeNum);

    int insert(StoreInfo record);

    int insertSelective(StoreInfo record);

    List<StoreInfo> selectByExample(StoreInfoExample example);

    StoreInfo selectByPrimaryKey(Integer storeNum);

    int updateByPrimaryKeySelective(StoreInfo record);

    int updateByPrimaryKey(StoreInfo record);
}