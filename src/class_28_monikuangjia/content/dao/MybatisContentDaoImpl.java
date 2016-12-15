package class_28_monikuangjia.content.dao;

import class_28_monikuangjia.content.bean.Content;
import class_28_monikuangjia.core.MybatisBaseDao;

public class MybatisContentDaoImpl extends MybatisBaseDao<Content> implements IContentDao {

	@Override
	public Content findContents(Integer pageNo, Integer pageSize, String keyword) {
//		return (Content)getSession().createQuery("from Content where title=?").setString(0,keyword).setFirstResult(pageNo).setMaxResult(pageSize).uniueResult();
		return null;
	}
	

	
}
