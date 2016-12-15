package class_11_Set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
//		TreeSet<String> strings = new TreeSet<>();
//		strings.add("a");
//		strings.add("s");
//		strings.add("sda");
//		strings.add("s");
//		strings.add("fd");
//		strings.add("dg");
//		strings.add("gf");
//		for (String string : strings) {
//			System.out.println(string);
//		}
		
//		TreeSet<String> ssSet = new TreeSet<>();
//		ssSet.add("Java");
//		ssSet.add("JavaScript");
//		ssSet.add("我爱你");
//		ssSet.add("马二欢");
//		ssSet.add("HTML");
//		ssSet.add("CSS");
//		for (String string : ssSet) {
//			System.out.println(string);
//		}
		
		
		TreeSet<String> sSet2 = new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
//				if(o1.length()<o2.length()){
//					return 1;
//				}else{
//					return -1;
//				}
				//比较hashCode
				System.out.println(o1+"=="+o1.hashCode()+"<======>"+o2+"=="+o2.hashCode());				
				if(o2.hashCode()>o1.hashCode()){
					return -1;//降序
				}else{
					return 1;//升序
				}
			}	
		}) ;
		sSet2.add("Java");
		sSet2.add("Stringargs");
		sSet2.add("啥的aswdsadasdasda");
		for (String string : sSet2) {
			System.out.println(string);
		}
		
		//还可以根据首字母对应的ascii值排序
		
		
	}
}
