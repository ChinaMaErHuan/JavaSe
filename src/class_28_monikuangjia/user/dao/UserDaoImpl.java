package class_28_monikuangjia.user.dao;

import class_28_monikuangjia.core.BaseDao;
import class_28_monikuangjia.core.IBaseDaoOther;
import class_28_monikuangjia.user.bean.User;


public class UserDaoImpl extends BaseDao<User> implements IUserDao,IBaseDaoOther<User> {

	@Override
	public User getUserByUserName(String username, String password) {
		return null;
	}

	@Override
	public void screct() {
		
	}
	
	
}
