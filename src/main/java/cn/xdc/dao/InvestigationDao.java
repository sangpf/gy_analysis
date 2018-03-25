package cn.xdc.dao;

import cn.xdc.bean.Investigation;
import cn.xdc.bean.query.InvestigationQuery;
import cn.xdc.bean.vo.InvestigationVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *
 * @author sang
 *
 */
@Mapper
public interface InvestigationDao {
	//查询集合
	public List<InvestigationVo> getInvestigationList(InvestigationQuery entityQuery);

	//根据 id查询
	public Investigation getInvestigationByKey(Integer id);
}
