package class_10_set;


import java.util.HashSet;

/**
 * 
 * 
 * SetDemo
 * 创建人:maerhuan 
 * 时间：2016年4月8日-下午6:14:42 
 * @version 1.0.0
 *
 */
public class SetDemo {
	public static void main(String[] args) {
		HashSet<Student> studentSet = new HashSet<>();
		
		Student maerhuan = new Student("maerhuan",22,100);
		Student mahuan = new Student("mahuan",26,99);
		Student hanhong = new Student("hanhong",25,88);
		Student hanhong2 = new Student("hanhong2",25,88);
		
		studentSet.add(maerhuan);//调用add的时候会调用hashcode和equals方法 
		studentSet.add(mahuan);
		studentSet.add(hanhong);
		studentSet.add(hanhong2);
		

		
		
		
		/**
		 * set没有索引不是数组实现的 所以是无序的
		 * 
		 * 总结在未来开发过程中，只要牵涉元素的过滤和去重---都想到set---HashSet
		 * 
		 * hashcode和equals方法和list没关系的
		 */
		
		for (Student student : studentSet) {
			System.out.println(student.getUsername()+"===="+student.getAge()+"===="+student.getScore());
		}
		
		
	}
}
