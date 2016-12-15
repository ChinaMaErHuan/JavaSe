package class_16_public;

import java.util.Date;

import org.apache.commons.io.filefilter.FalseFileFilter;

/**
 * 
 * 
 * Book 创建人:maerhuan 时间：2016年5月8日-下午4:26:14
 * 
 * @version 1.0.0
 * 
 */
public class Book {
	private Integer id;// 主键
	private String name;// 书名
	private Float price;// 价格
	private String publish;// 出版社
	private String author;// 作者
	private String img;// 封面图
	private String description;// 描述
	private Integer type;// 1当当自营 2原创 3 4 5 6 7 8 9
	private Integer categoryId;// 书籍分类
	private Integer buyNum; // 购买数
	private Integer collNum;// 收藏数
	private Integer hitNum;// 点击数
	private Integer commentNum;// 评论数
	private Integer status;// 0未发布 1发布
	private Integer isDelete;// 0未删除1删除
	private Date createTime;// 记录书籍添加的时间
	private Date updateTime;// 更新时间

	public Book() {
		super();
	}

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

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public Integer getBuyNum() {
		return buyNum;
	}

	public void setBuyNum(Integer buyNum) {
		this.buyNum = buyNum;
	}

	public Integer getCollNum() {
		return collNum;
	}

	public void setCollNum(Integer collNum) {
		this.collNum = collNum;
	}

	public Integer getHitNum() {
		return hitNum;
	}

	public void setHitNum(Integer hitNum) {
		this.hitNum = hitNum;
	}

	public Integer getCommentNum() {
		return commentNum;
	}

	public void setCommentNum(Integer commentNum) {
		this.commentNum = commentNum;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public static void main(String[] args) {
		boolean b = true?false:true == true?false:true;
		//boolean b = true?false:true?false:true;
		//boolean b = true?false:true
		System.out.println(b);
	}
}
