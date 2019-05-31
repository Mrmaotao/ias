package cn.tit.ias.mapper;

import cn.tit.ias.entity.AssetInfo;
import cn.tit.ias.entity.AssetInfoExample;
import java.util.List;

public interface AssetInfoMapper {
    int deleteByPrimaryKey(String assetNum);

    int insert(AssetInfo record);

    int insertSelective(AssetInfo record);

    List<AssetInfo> selectByExample(AssetInfoExample example);

    AssetInfo selectByPrimaryKey(String assetNum);

    int updateByPrimaryKeySelective(AssetInfo record);

    int updateByPrimaryKey(AssetInfo record);
}