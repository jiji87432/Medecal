package com.lhfeiyu.service;

import java.util.Map;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhfeiyu.dao.DataHospitalNurseMapper;
import com.lhfeiyu.po.DataHospitalNurse;

/**
* <strong> 描&nbsp;&nbsp;&nbsp;&nbsp;述：</strong> 业务层：通用-DataHospitalNurse <p>
* <strong> 作&nbsp;&nbsp;&nbsp;&nbsp;者：</strong> 虞荣华 <p>
* <strong> 编写时间：</strong>2016年3月20日22:22:22<p>
* <strong> 公&nbsp;&nbsp;&nbsp;&nbsp;司：</strong> 成都蓝海飞鱼科技有限公司 <p>
* <strong> 版&nbsp;&nbsp;&nbsp;&nbsp;本：</strong> 2.0 <p>
 */
@Service
public class DataHospitalNurseService extends CommonService<DataHospitalNurse> {

	@Autowired
	DataHospitalNurseMapper dataHospitalNursemapper;
	
	public DataHospitalNurse selectService(Map<String, Object> paramMap) {
		return super.selectByCondition(paramMap);
	}
	
	public List<DataHospitalNurse> selectListService(Map<String, Object> paramMap) {
		return super.selectListByCondition(paramMap);
	}
	
	public int updateService(DataHospitalNurse dataHospitalNurse) {
		return super.updateByPrimaryKeySelective(dataHospitalNurse);
	}
	
	public int insertService(DataHospitalNurse dataHospitalNurse) {
		return super.insertSelective(dataHospitalNurse);
	}
	
	public int updateDeleteService(Integer id, String updatedBy) {
		return super.updateDeletedNowById(id, updatedBy);
	}
	
	public int deleteService(Integer id) {
		return super.deleteByPrimaryKey(id);
	}

}