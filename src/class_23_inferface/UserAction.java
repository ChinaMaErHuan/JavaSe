package class_23_inferface;

import class_22_override.IBaseDao;

public class UserAction {
	public String saveUser(){
		IBaseDao userDaoImpl = new UserDaoImpl();
		userDaoImpl.save();
		return "index";
	}
	
	public String updateUser(){
		IBaseDao userDaoImpl = new UserDaoImpl();
		userDaoImpl.update();
		return "index";
	}
}
