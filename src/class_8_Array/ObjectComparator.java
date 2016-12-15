package class_8_Array;

import java.util.Comparator;
import java.util.Date;
/**
 * 
 * 
 * ObjectComparator
 * 创建人:maerhuan 
 * 时间：2016年3月30日-下午1:24:31 
 * @version 1.0.0
 *
 */

public class ObjectComparator implements Comparator<Object> {
	
	private boolean mark = true;
	private double radix = 2;

	public ObjectComparator(boolean mark){
		this.mark = mark;
	}
	//重载
	public ObjectComparator(boolean mark,double radix){
		this.mark = mark;
		this.radix = radix;
		
	}
	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Integer){
			Integer a = (Integer) o1;
			Integer b = (Integer) o2;
			return mark?a-b:b-a;
		} else if(o1 instanceof Float){
			//因为Math.pow(x,y)这个函数是求x的y次方
			int a=(int) (Float.parseFloat(String.valueOf(o1))*Math.pow(10,radix));
			int b=(int) (Float.parseFloat(String.valueOf(o2))*Math.pow(10,radix));
			return mark?a-b:b-a;	
		}else if(o1 instanceof Double){
			int a = (int) (Double.parseDouble(String.valueOf(o1))*Math.pow(10, radix));
			int b = (int) (Double.parseDouble(String.valueOf(o2))*Math.pow(10, radix));	
			return mark?a-b:b-a;
		}else if(o1 instanceof Date){
			Date da = (Date) o1;
			Date db = (Date) o2;
			int a= (int) (da.getTime()/1000);
			int b= (int) (db.getTime()/1000);
			return mark?a-b:b-a;
		}
		return 0;
	}
//	public static void main(String[] args) {
//		System.out.println((int)(new Date().getTime()/1000));
//		System.out.println(new Date().getTime()/1000);
//		Float a = 5.0f;
//		int b=(int) (Float.parseFloat(String.valueOf(a))*Math.pow(10,2));
//		System.out.println(b);
//		
//	}
	
}
