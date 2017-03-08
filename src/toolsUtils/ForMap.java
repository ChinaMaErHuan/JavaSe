/**
 * tzdesk系统平台
 * JavaSe
 * toolsUtils
 * ForMap.java
 * 创建人:maerhuan 
 * 时间：2017年3月8日-下午4:35:55 
 * 2017潭州教育公司-版权所有
 */
package toolsUtils;

import java.util.HashMap;
import java.util.Map;

public class ForMap {
		public static void main(String[] args) {
			Map<String, Object> map = new HashMap<String, Object>();
			// keys
			// Set<String> keys= map.keySet();
			// for (Object object : keys) {
			// System.out.println(object);
			// }

			// values
			// Collection<Object> objects= map.values();
			// for (Object object : objects) {
			// System.out.println(object);
			// }

			// map也可以循环的 entrySet()
			for (Map.Entry<String, Object> entry : map.entrySet()) {
				System.out.println(entry.getKey() + "=====" + entry.getValue());
			}

			// 迭代器循环
			// Set<String> keySet = map.keySet();
			// java.util.Iterator<String> iterator = keySet.iterator();
			// while (iterator.hasNext()) {
			// String key = iterator.next();
			// System.out.println(key+"===="+map.get(key));
			//
			// }
		}
}
