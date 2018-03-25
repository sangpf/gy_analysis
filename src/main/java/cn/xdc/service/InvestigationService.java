package cn.xdc.service;

import cn.xdc.bean.Investigation;
import cn.xdc.bean.query.InvestigationQuery;
import cn.xdc.bean.vo.InvestigationVo;

import java.util.List;

/**
 *
 * @author sang
 *
 */
public interface InvestigationService {
	//查询集合
	public List<InvestigationVo> getInvestigationList(InvestigationQuery entityQuery);

	//根据id 查询
	public Investigation getInvestigationByKey(Integer id);
}
