package class_13_map;

import java.util.ArrayList;
import java.util.Comparator;

import java.util.List;

/**
 * 
 * 
 * ListDemo 创建人:maerhuan 时间：2016年4月22日-下午5:55:45
 * 
 * @version 1.0.0
 * 
 */
public class ListDemo {
	public static void main(String[] args) {
		class_13_map.Student keke = new Student();
		keke.setAge(25);
		keke.setUsername("keke");
		keke.setiDcard("200");
		keke.setTelephone("123456789");

		class_13_map.Student maerhuan = new Student();
		maerhuan.setAge(22);
		maerhuan.setUsername("maerhuan");
		maerhuan.setiDcard("0059");
		maerhuan.setTelephone("123456789");

		List<Student> students = new ArrayList<Student>();

		students.add(keke);
		students.add(maerhuan);

		// 排序
		students.sort(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				if (o1.getAge() > o2.getAge()) {
					return -1;
				} else if (o1.getAge() < o2.getAge()) {
					return 1;
				} else {
					return 0;
				}
			}
		});

		for (Student student : students) {
			System.out.println(student.getUsername() + "===" 
					+ "来yy6359听课");
		}

	}
}
