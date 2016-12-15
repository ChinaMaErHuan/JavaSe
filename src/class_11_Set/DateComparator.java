package class_11_Set;

import java.util.Comparator;
import java.util.Date;

/**
 * 
 * 
 * DateComparator
 * 创建人:maerhuan 
 * 时间：2016年4月13日-下午12:48:37 
 * @version 1.0.0
 *
 */
public class DateComparator implements Comparator<Date>{
	private boolean flag;
	public DateComparator(){
		flag = true;	
	}
	
	public DateComparator(boolean flag){
		this.flag = flag;	
	}

	@Override
	public int compare(Date o1, Date o2) {
		// TODO Auto-generated method stub
		if(this.flag){
			if(o1.before(o2)){
				return 1;
			}else{
				return -1;
			}	
		}else {
			if(o1.after(o2)){//晚于
				return 1;
			}else{
				return -1;
			}
		}
	}
}
