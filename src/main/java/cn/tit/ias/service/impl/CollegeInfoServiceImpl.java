package cn.tit.ias.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tit.ias.entity.CollegeInfo;
import cn.tit.ias.mapper.CollegeInfoMapper;
import cn.tit.ias.service.CollegeInfoService;
@Service
public class CollegeInfoServiceImpl implements CollegeInfoService{

	@Autowired
	CollegeInfoMapper collegeInfoMapper;
	@Override
	public void insert(CollegeInfo collegeInfo) {
		collegeInfoMapper.insert(collegeInfo);
		System.out.println("插入成功");
	}

}
