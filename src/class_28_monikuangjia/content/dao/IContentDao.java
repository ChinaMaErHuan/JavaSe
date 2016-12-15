package class_28_monikuangjia.content.dao;

import class_28_monikuangjia.content.bean.Content;
import class_28_monikuangjia.core.IBaseDao;

public interface IContentDao extends IBaseDao<Content>{

	
	/**
	 * 
	 * 方法名：findContents<br/>
	 * 创建人：maerhuan <br/>
	 * 时间：2016年5月4日-上午12:17:26 <br/>
	 * 手机:1564545646464<br/>
	 * @param pageNo
	 * @param pageSize
	 * @param keyword
	 * @return Content<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public Content findContents(Integer pageNo,Integer pageSize,String keyword);
	
}
