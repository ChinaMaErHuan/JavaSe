package equalshashcode.p2;
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
//        运行结果：
//        stu1 == stu2 : false
//        stu1.equals(stu2) : true
//        list size:2
//        set size:2
//
//	        结果分析：因为Student两个对象的age和name属性相等，而且又是通过覆盖equals方法来判断的，
//	        所示stu1.equals(stu2) 为true。注意以上几次测试list和set的size都是2
        
     // hashCode是jdk根据对象的地址或者字符串或者数字算出来的int类型的数值
        
        //因为判断对象是否相等 java先去判断hashcode 
        //如果hashcode不等 那么equals绝对不等 
        //equals相等 hashcode一定相等
        //hashcode相等 equals不一定相等
    }  
  
}  