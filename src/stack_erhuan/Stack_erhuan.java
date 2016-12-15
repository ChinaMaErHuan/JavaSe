package stack_erhuan;



/**
 * 
 * 
 * Stack_erhuan
 * 创建人:maerhuan 
 * 时间：2016年4月23日-下午4:37:06 
 * @version 1.0.0
 *
 */
public class Stack_erhuan {
	/*
	 * 1：出栈 pop
	 * 2：入栈 push
	 * 3: 获取栈顶的元素 peek()
	 * 4: 栈空判断 isEmpty
	 * 5: 栈是否已满 isFull
	 * 
	 * */
	Object [] stacks;
	int size;//大小
	int top;//位置
	int len;
	Stack_erhuan(int size) {
		this.size = size;
		this.stacks = new Object[this.size];//实例化了
		this.top = -1;
	}
	//获取栈顶元素
	public Object peek() {
		return this.stacks[top];
	}
	// 获取长度
	public int size(){
		return this.len;
	}
	//判断是否为空
	public boolean isEmpty(){
		return size()==0;	
	}
	// 清空栈
	public void clear(){
		this.size=0;
		this.top=-1;
		this.len=0;
		this.stacks=new Object[this.size];
	}
	//栈是否已满
	public boolean isFull(){
		return top==size-1;
	}
	// 入栈的过程
	public void push(Object val){
		len++;
		stacks[++this.top]=val;
	}
	// 出栈过程
	public Object pop(){
		len--;
		return stacks[this.top--];
	}
	public static void main(String[] args) {
		Stack_erhuan stack = new Stack_erhuan(10);
		System.out.println(stack.isEmpty());
		System.out.println(stack.isFull());
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		stack.push(10);
		System.out.println(stack.isFull());
		System.out.println("出栈之前："+stack.size());
		System.out.println(stack.pop());
		System.out.println("出栈之后："+stack.size());
		System.out.println(stack.peek());
		
		
		
		
	}
}
