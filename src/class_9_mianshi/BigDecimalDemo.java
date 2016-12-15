package class_9_mianshi;

import java.math.BigDecimal;




/**
 * 
 * 
 * BigDecimalDemo 创建人:maerhuan 时间：2016年4月2日-下午2:29:22
 * 
 * @version 1.0.0
 * 
 */
public class BigDecimalDemo {
	public static void main(String[] args) {
		// 1--100之和
		// int result = 0;
		// for(int i =0;i<=100;i++){
		//
		// result = result + i;
		// }
		// System.out.println(result);
		// 循环计算1+1/2!...+1/20!
//		double sum = 0,n=0;
//		float m = 1.0f;
//		for (int i = 1; i <=20; i++) {
//			m = m*i;
//			n = 1/m;
//			sum = sum+n;
//		}
//		System.out.println(sum);
			
		double result = 0;
		int i=1;
		while(i<=20){
			int j=1;
			double num=1;
			while (j<=i) {
				num*=j;
				j++;
				
			}
			result+=(1/num);
			i++;
		}
		System.out.println(result);
		BigDecimal sum2 = new BigDecimal(result);
		System.out.println(sum2);
		
		BigDecimal sum = new BigDecimal(0.0);                            //和
	    BigDecimal factorial = new BigDecimal(1.0);                        //阶乘项的计算结果
        int c = 1;                                                        //循环增量
        while(c<=20){                                                    
            sum = sum.add(factorial);                                    //累加各项阶乘的和
            ++c;                                                        //i加1
            factorial = factorial.multiply(new BigDecimal(1.0/c));        //计算阶乘项
        }
        System.out.println("1+1/2!+1/3···1/20!的计算结果等于：\n"+sum);//输出计算结果
        
        BigDecimal bigDecimal = new BigDecimal(1.0/3);
        System.out.println(bigDecimal);
        System.out.println(bigDecimal.floatValue());
        System.out.println(bigDecimal.doubleValue());

	}
}
