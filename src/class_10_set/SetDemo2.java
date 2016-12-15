package class_10_set;


import java.util.HashSet;
import java.util.Iterator;




public class SetDemo2 {

	public static void main(String[] args) {
		
		HashSet<Student> students= new HashSet<>();
		Student s1 = new Student("maerhuan", 21, 60);
		Student s2 = new Student("wocao", 20, 60);
		Student s3 = new Student("ritian", 22, 60);
		Student s4 = new Student("anthony", 23, 60);
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		
		HashSet<Student> students2 = new HashSet<>();
		Student marlon = new Student("marlon",10,55); 
		Student xiaomao = new Student("xiaomao",40,78); 
		students2.add(marlon);
		students2.add(xiaomao);
		//将一个集合添加到另一集合中
		students.addAll(students2);
		
		//移除
		//students.remove(xiaomao);
		
		//移除全部
		//students.removeAll(students2);
		
		//全部清除
		//students.clear();
		
		//System.out.println(students.contains(xiaomao));
		
		//System.out.println(students.containsAll(students2));//判断包含另一个集合
		
		//retainAll方法用于从列表中移除未包含在指定collection中的所有元素。交集
		//相当于数组的length
//		System.out.println("清空之前===="+students.size());
//		students.clear();
		System.out.println("清空之后===="+students.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("=================lambda==================");
		//lambda表达的集合循环方式 2014不支持jdk1.8编译器
		//students.forEach((student)->print(student));
		
		 
		
		
		
		
		
		
		
		
		Object[] students3 = students.toArray();
		for (int i = 0; i < students3.length; i++) {
			Student student= (Student) students3[i];
			print(student);
		}
		
		System.out.println("======================forEach========================");
		for (Student student : students) {
			print(student);
		}
		
		
		
		System.out.println("============Iterator===========");
		//Iterator<Student> iterator = students.iterator();放在外面也行
		for (Iterator<Student> iterator = students.iterator();iterator.hasNext();) {
			Student student =  iterator.next();
			print(student);	
		}
		
		System.out.println("===============while+iterator=====迭代器===============");
		Iterator<Student> iterator = students.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			print(student);
		}
		
		
		
		
//		students.clear();
//		students2.clear();
		
	}
	
	public static void print(Student student){
		System.out.println(student.getUsername()+"=="+student.getAge()+"==="+student.getScore());
	}
}
