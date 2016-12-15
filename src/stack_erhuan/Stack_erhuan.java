package stack_erhuan;



/**
 * 
 * 
 * Stack_erhuan
 * ������:maerhuan 
 * ʱ�䣺2016��4��23��-����4:37:06 
 * @version 1.0.0
 *
 */
public class Stack_erhuan {
	/*
	 * 1����ջ pop
	 * 2����ջ push
	 * 3: ��ȡջ����Ԫ�� peek()
	 * 4: ջ���ж� isEmpty
	 * 5: ջ�Ƿ����� isFull
	 * 
	 * */
	Object [] stacks;
	int size;//��С
	int top;//λ��
	int len;
	Stack_erhuan(int size) {
		this.size = size;
		this.stacks = new Object[this.size];//ʵ������
		this.top = -1;
	}
	//��ȡջ��Ԫ��
	public Object peek() {
		return this.stacks[top];
	}
	// ��ȡ����
	public int size(){
		return this.len;
	}
	//�ж��Ƿ�Ϊ��
	public boolean isEmpty(){
		return size()==0;	
	}
	// ���ջ
	public void clear(){
		this.size=0;
		this.top=-1;
		this.len=0;
		this.stacks=new Object[this.size];
	}
	//ջ�Ƿ�����
	public boolean isFull(){
		return top==size-1;
	}
	// ��ջ�Ĺ���
	public void push(Object val){
		len++;
		stacks[++this.top]=val;
	}
	// ��ջ����
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
		System.out.println("��ջ֮ǰ��"+stack.size());
		System.out.println(stack.pop());
		System.out.println("��ջ֮��"+stack.size());
		System.out.println(stack.peek());
		
		
		
		
	}
}
