package cn.tit.ias.mapper;

import cn.tit.ias.entity.DicProfitLossInfo;
import cn.tit.ias.entity.DicProfitLossInfoExample;
import java.util.List;

public interface DicProfitLossInfoMapper {
    int deleteByPrimaryKey(Integer dicProfitLossNum);

    int insert(DicProfitLossInfo record);

    int insertSelective(DicProfitLossInfo record);

    List<DicProfitLossInfo> selectByExample(DicProfitLossInfoExample example);

    DicProfitLossInfo selectByPrimaryKey(Integer dicProfitLossNum);

    int updateByPrimaryKeySelective(DicProfitLossInfo record);

    int updateByPrimaryKey(DicProfitLossInfo record);
}