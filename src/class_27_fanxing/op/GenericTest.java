package class_27_fanxing.op;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
	/**
	 *这个类的存在就是为了证明没有泛型的存在的坏处 有的时候错误没提示
	 * 代码运行的时候胡出现错误 这增加了代码的隐患
	 * java.lang.ClassCastException 数据类型转换错误
	 * 
	 */

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("qqyumidi");
        list.add("corn");
        list.add(100);

        for (int i = 0; i < list.size(); i++) {
            String name = (String) list.get(i); // 1
            System.out.println("name:" + name);
        }
    }
}