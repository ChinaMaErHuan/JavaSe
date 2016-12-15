package class_8_Array;

import java.util.Comparator;

/**
 * 
 * 
 * IntegerComparator
 * 创建人:maerhuan 
 * 时间：2016年3月30日-上午1:22:27 
 * @version 1.0.0
 *
 */
public class IntegerComparator implements Comparator<Integer>{
	private boolean mark = true;
	//构造函数 省略代码  构造函数的名字必须和类的名字一样
	public  IntegerComparator(boolean mark) {
		this.mark = mark;
	}
	@Override
	public int compare(Integer o1, Integer o2) {
		return mark?o1-o2:o2-o1;
	}
	
}
