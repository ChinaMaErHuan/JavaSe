package class_28_monikuangjia.content.dao;

import class_28_monikuangjia.content.bean.Content;
import class_28_monikuangjia.core.BaseDao;

public class ContentDaoImpl extends BaseDao<Content> implements IContentDao {

	@Override
	public Content findContents(Integer pageNo, Integer pageSize, String keyword) {
//		return (Content)getSession().createQuery("from Content where title=?").setString(0,keyword).setFirstResult(pageNo).setMaxResult(pageSize).uniueResult();
		return null;
	}
	
	//为几个类定义一些特殊的方法。

	
}

