package com.lhfeiyu.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhfeiyu.dao.DrugstoreMapper;
import com.lhfeiyu.po.Drugstore;

/**
* <strong> 描&nbsp;&nbsp;&nbsp;&nbsp;述：</strong> 业务层：通用-Drugstore <p>
* <strong> 作&nbsp;&nbsp;&nbsp;&nbsp;者：</strong> 虞荣华 <p>
* <strong> 编写时间：</strong>2016年3月20日22:22:22<p>
* <strong> 公&nbsp;&nbsp;&nbsp;&nbsp;司：</strong> 成都蓝海飞鱼科技有限公司 <p>
* <strong> 版&nbsp;&nbsp;&nbsp;&nbsp;本：</strong> 2.0 <p>
 */
@Service
public class DrugstoreService extends CommonService<Drugstore> {

	@Autowired
	DrugstoreMapper drugstoremapper;
	
	public Drugstore selectService(Map<String, Object> map) {
		return super.selectByCondition(map);
	}
	
	public List<Drugstore> selectListService(Map<String, Object> map) {
		return super.selectListByCondition(map);
	}
	
	public int updateService(Drugstore drugstore) {
		return super.updateByPrimaryKeySelective(drugstore);
	}
	
	public int insertService(Drugstore drugstore) {
		return super.insertSelective(drugstore);
	}
	
	public int deleteService(Integer id) {
		return super.deleteByPrimaryKey(id);
	}

}