package class_12_list;

import java.util.Comparator;

public class StringComparator implements Comparator<String>{
	private boolean mark;
	
	public StringComparator(){
		
	}
	public StringComparator(boolean mark){
		this.mark = mark;
	}
	
	//根据字符串的首字母排序
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		int a = toolsUtils.MehPinyinUtil.getPinYinHeadChar(toolsUtils.StringUtils.MehStringUtil.getFirstChar(o1)).toLowerCase().charAt(0);
		int b = toolsUtils.MehPinyinUtil.getPinYinHeadChar(toolsUtils.StringUtils.MehStringUtil.getFirstChar(o2)).toLowerCase().charAt(0);
			if (a > b) {
				return mark?1:-1;
			} else if (a < b) {
				return mark?-1:1;
			} else {
				return 0;//相同时候不排序
			}
	}
	

}
