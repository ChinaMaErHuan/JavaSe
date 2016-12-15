package class_28_monikuangjia.user.dao;

import class_28_monikuangjia.core.IBaseDao;
import class_28_monikuangjia.user.bean.User;

public interface IUserDao extends IBaseDao<User>{

	
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
	public User getUserByUserName(String username,String password);
	

}
