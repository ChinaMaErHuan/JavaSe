package class_17_methods_static_final;
public class TestClass {  
      
    /** 
     * 区别两次new静态与非静态代码块执行情况 
     */  
    public static void main(String[] args) {  
        PuTong c1 = new PuTong();  
        c1.test();  
          
        PuTong c2 = new PuTong();  
        c2.test();  
    }  
}  
  
/* 
运行输出结果是： 
静态代码块！-->非静态代码块！-->默认构造方法！-->普通方法中的代码块！ 
非静态代码块！-->默认构造方法！-->普通方法中的代码块！ 
java中，在使用new操作符创建一个类的实例对象的时候，开始分配空间并将成员变量初始化为默认的数值，注意这里并不是指将变量初始化为在变量定义处的初始值，而是给整形赋值0，给字符串赋值null 这一点于C++不同，（student.name = null , student.age = 0 ）
 
然后在进入类的构造函数。
在构造函数里面，首先要检查是否有this或者super调用，this调用是完成本类本身的构造函数之间的调用，super调用是完成对父类的调用。二者只能出现一个，并且只能作为构造函数的第一句出现。在调用this和super的时候实现程序的跳转，转而执行被调用的this构造函数或者super构造函数。
在this和super执行完毕，程序转而执行在类定义的时候进行的变量初始化工作。
这个执行完毕，才是构造函数中剩下的代码的执行。
*/  