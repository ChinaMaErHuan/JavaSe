package class_8_lizi;



/**
 * 
 * 
 * Student 创建人:maerhuan 时间：2016年3月31日-下午2:08:35
 * 
 * @version 1.0.0
 * 
 */
public class Student implements Comparable<Student>{
	private Integer id;
	private String name;
	private Integer age;
	private Float score;
	//private Integer integer = 0;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Float getScore() {
		return score;
	}
	public void setScore(Float score) {
		this.score = score;
	}
	@Override
	public int compareTo(Student o) {
		//integer = name.compareTo(o.getName());
		//if(integer==0){
			return this.getAge() - o.getAge();//名字一样就比较年龄
		//}
		//else {
			//return this.getId() - o.getId();//名字不一样就比较Id
		//}
	}
}

