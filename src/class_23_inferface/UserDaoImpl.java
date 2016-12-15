package class_23_inferface;

import class_22_override.IBaseDao;

public class UserDaoImpl implements IBaseDao{

	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void find() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		IBaseDao iBaseDao = new UserDaoImpl();
	}
}
