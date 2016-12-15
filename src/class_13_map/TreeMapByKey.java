package class_13_map;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapByKey {
	public static void main(String[] args) {
		Map<String, Object> map = new TreeMap<String, Object>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				String aString = o1.toLowerCase();
				String bString = o2.toLowerCase();
				return aString.compareTo(bString);
			}
			
		});
		map.put("b", "aaa");
		map.put("d", "bbb");
		map.put("c", "ccc");
		map.put("e", "ddd");
		map.put("a", "eee");
		
		// 迭代器循环
		 Set<String> keySet = map.keySet();
		 java.util.Iterator<String> iterator = keySet.iterator();
		 while (iterator.hasNext()) {
		 String key = iterator.next();
		 System.out.println(key+"===="+map.get(key));
		
		 }
		
	}

}
