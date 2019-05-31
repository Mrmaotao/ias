package service;

import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.tit.ias.entity.CollegeInfo;
import cn.tit.ias.service.CollegeInfoService;
/**
 * 
 *  
 * @Description:Test CollegeInfoServiceImpl   
 * @author: maotao 
 * @date:   2019年5月28日 下午9:18:27       
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestCollegeInfoServiceImpl {
	@Resource
	CollegeInfoService service;
	@Test
	public void insert() {
		CollegeInfo c = new CollegeInfo();
		c.setCollegeName("太原工业学院西区");
		c.setCollegeNum(1002);
		
		service.insert(c);
	}

}
