package class_8_lizi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * 
 * Test
 * 创建人:maerhuan 
 * 时间：2016年3月31日-下午2:26:25 
 * @version 1.0.0
 *
 */
public class Test {
	public static void main(String[] args) {
		Student mahuan = new Student();
		mahuan.setName("mahuan");
		mahuan.setAge(22);
		mahuan.setId(001);
		mahuan.setScore(99.0f);
		
		Student hanhong = new Student();
		hanhong.setName("hangong");
		hanhong.setAge(21);
		hanhong.setId(003);
		hanhong.setScore(98.0f);
		
		Student erhuan = new Student();
		erhuan.setName("mahuan");
		erhuan.setAge(23);
		erhuan.setId(002);
		erhuan.setScore(100.0f);
		//集合里面又能装数组又能装对象
//		List<Integer> listname = Arrays.asList() 括号里面装的是数组
		List<Student> students = new ArrayList<>();
		students.add(mahuan);
		students.add(erhuan);
		students.add(hanhong);
		Collections.sort(students);
		//Collections.sort(students,new StudentComparator(false));
		for (Student student : students) {
			System.out.println(student.getId()+"=="+student.getAge()+"=="+student.getName());
		}
	}
}
