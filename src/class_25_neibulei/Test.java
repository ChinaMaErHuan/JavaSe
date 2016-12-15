package class_25_neibulei;

import java.util.ArrayList;
import java.util.List;

import class_25_neibulei.Outter3.Inner;

public class Test {
	public static void main(String[] args) {
		
		Outter3 outter3 = new Outter3();
		Outter3.username = "maerhuan";
		Outter3.message();
		outter3.age = 10;
		outter3.say();
		//outter3.test();//报错的原因是 外部类不能直接访问内部类的内容	
	
		Inner inner2 = new Outter3.Inner();
		inner2.username ="keke";
		inner2.test();
//		
		
		Outter5 outter5 = new Outter5();
//		IResultList r = new ResultListImpl();
//		List<String> list = outter5.list(r);
//		for (String string : list) {
//			System.out.println(string);
//		}
		
		
		//匿名内部类 想要使用外部类的属性的话 那个属性必须是final的
		List<String> list = outter5.list(new IResultList() {
			
			@Override
			public List<String> queryList() {
				List<String> list = new ArrayList<String>();
				list.add("maerhuan");
				list.add("mahuan");
				list.add("keke");
				list.add("haha");
				return list;
			}
		});
		for (String string : list) {
			System.out.println(string);
		}
		//List<String> list2= outter5.list(iResultList);
		
		

	}
}
