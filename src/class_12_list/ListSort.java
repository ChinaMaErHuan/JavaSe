package class_12_list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListSort {
	public static void main(String[] args) {
		List<String> roomsList = new ArrayList<>();
		roomsList.add("异步");//0
		roomsList.add("eden");//1
		roomsList.add("努力");//2
		roomsList.add("阿飞");//3
		roomsList.add("简单就是美");//4
		
		roomsList.add("阿飞");//5
		roomsList.add("大帅");//6
		roomsList.add("jamie");//7
		roomsList.add("任");//8
		roomsList.add("Boolean");//9
		roomsList.add("小布丁");//10
		roomsList.add("蚂蚁");//11
		roomsList.add("阿飞");//12
		
		
//		roomsList.sort(new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				// TODO Auto-generated method stub
//				
//				if(o1.hashCode()>o2.hashCode()){
//					return 1;
//				}else if (o1.hashCode()<o2.hashCode()) {
//					return -1;
//				}else{
//					return 0;
//				}
//				
//			}
//		});
		
		
		roomsList.sort(new StringComparator(true));
		for (String string : roomsList) {
			System.out.println(string);
		}
		
	}
}
