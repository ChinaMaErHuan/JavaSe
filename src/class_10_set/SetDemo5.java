package class_10_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Optional;
import java.util.PrimitiveIterator.OfInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import class_8_Array.IntegerComparator;

public class SetDemo5 {
	public static void main(String[] args) {
		// java8-提供对集合提供了一个Stream操作集合--Collection提供的
		HashSet<Integer> ageSet = new HashSet<>();
		ageSet.add(10);
		ageSet.add(20);
		ageSet.add(30);
		ageSet.add(40);
		ageSet.add(50);
		
		
		// max  快速的将集合转成流
		Optional<Integer> optional = ageSet.stream().max(
				new IntegerComparator(true));
		 System.out.println(optional.get());
		// min
		Optional<Integer> optional1 = ageSet.stream().min(
				new IntegerComparator(true));
		 System.out.println(optional1.get());

		 System.out.println(ageSet.stream().count());//计数器

		// Stream还可以过滤 迭代器

		// Stream<Integer> ageStream = ageSet.stream().filter(age->age>20);
		// Iterator<Integer> iterator = ageStream.iterator();
		// while(iterator.hasNext()){
		// System.out.println(iterator.next().intValue());
		// }
		// 下面的打印和上面是一样的
		// ageSet.stream().filter(age->age>20).forEach(new SetDemo5()::print);

		// Stream--- IntStream DoubleStream LongStream
		IntStream is = IntStream.builder().add(50).add(10).add(20).add(30)
				.build();
		// 求数组的平均值 最大值 最小 和 总数
		 System.out.println("找到任意元素:"+is.findAny().getAsInt());
		// System.out.println(is.findFirst().getAsInt());
		// System.out.println("找到intstream最大值:"+is.max().getAsInt());
		// System.out.println("找到intstream最小值:"+is.min().getAsInt());
		// System.out.println("找到intstream总和:"+is.sum());
		// System.out.println("找到intstream总数:"+is.count());
		// System.out.println("找到intstream平均数:"+is.average().getAsDouble());

		// IntStream nums =is.map(ele->ele+10);
		// nums.forEach(a->System.out.println(a));
		// IntStream nums = is.distinct();//去重
		// nums.forEach(a->System.out.println(a));
		// IntStream nums2=is.filter(num->num>20);//过滤
		// nums2.forEach(a->System.out.println(a));
		// System.out.println("返回任意一个元素:"+nums.findAny().getAsInt());

		// 循环获取流
		// OfInt int2 = is.iterator();
		// while (int2.hasNext()) {
		// Integer integer = (Integer) int2.next();
		// System.out.println(integer);
		// }

	}

	public void print(Integer age) {
		System.out.println(age);
	}
}
