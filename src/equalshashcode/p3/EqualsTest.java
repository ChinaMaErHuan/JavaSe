package equalshashcode.p3;
import java.util.HashSet;  
import java.util.LinkedList;  
import java.util.Set;  

  
  
public class EqualsTest {  
    public static void main(String[] args) {  
    	//覆盖了equals
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
        System.out.println(stu1.hashCode());
        System.out.println(stu2.hashCode());
//        stu1 == stu2 : false
//        		stu1.equals(stu2) : false
//        		list size:2
//        		set size:2
//        		775943
//        		775943

        //hashcode虽然相等了 但是equals不相等

    }  
  
}  