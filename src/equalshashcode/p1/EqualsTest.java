package equalshashcode.p1;
import java.util.HashSet;  
import java.util.LinkedList;  
import java.util.Set;  
  
  
public class EqualsTest {  
    public static void main(String[] args) {  
    	//没有覆盖equals方法之前
        LinkedList<Student> list = new LinkedList<Student>();  
        Set<Student> set = new HashSet<Student>();  
        Student stu1  = new Student(3,"张三");  
        Student stu2  = new Student(3,"张三");  
        System.out.println("stu1 == stu2 : "+(stu1 == stu2));  
        System.out.println("stu1.equals(stu2) : "+stu1.equals(stu2));  
        list.add(stu1);  
        list.add(stu2);  
        System.out.println("list size:"+ list.size());  
          
        set.add(stu1);  
        set.add(stu2);  
        System.out.println("set size:"+ set.size());  
        //测试结果如下：
//        stu1 == stu2 : false 内存地址是不一样的
//        stu1.equals(stu2) : false  内存地址是不一样的
//        list size:2
//        set size:2  不会去重复元素的
    }  
  
}  