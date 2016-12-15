package class_16_public;

import java.util.Date;



public class BookTest {
	public static void main(String[] args) {
		Book book = new Book();
		book.setId(1);
		
		book.setName("HTML5权威指南");
		book.setAuthor("马二欢");
		book.setPrice(87.5f);
		book.setPublish("keke出版社");
		book.setDescription("JavaScript权威指南（第6版）（"
				+ "淘宝前端团队倾情翻译！经典权威的JavaScript犀牛书！"
				+ "第6版特别涵盖了HTML5和ECMAScript5！） "
				+ "经典权威的JavaScript工具书本书是程序员学习核心JavaScript语言"
				+ "和由Web浏览器定义的JavaScript API的指南和综合参考手册。"
				+ "第6版涵盖HTML5和ECMAScript5相关阅读>>>"
				+ "编写高质量代码：改善C程序代码的125个建议JavaScript编程精解（原书第2版）"
				+ "Effective Python：编写高质量Python代码的59个有效方法"
				+ "ffective Ruby：改善Ruby程序");
		book.setType(1);
		book.setCategoryId(1);
		book.setBuyNum(1);
		book.setCollNum(1);
		book.setStatus(0);
		book.setIsDelete(0);
		book.setCreateTime(new Date());
		book.setImg("22722790-1_b_1.jpg");
		
		Book book2=new Book();
		book2.setId(2);
		book2.setName("Java权威指南（第6版");
		book2.setAuthor("dsfg");
		
		Book book3=new Book();
		book3.setId(2);
		book3.setName("Jquery权威指南（第6版");
		book3.setAuthor("sad");
		
		System.out.println(book.getAuthor());
		System.out.println(book.getDescription());
		System.out.println(book2.getAuthor());
		System.out.println(book3.getAuthor());
		
	}
}
