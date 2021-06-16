package lab;

public class MyArray {

	public static void main(String[] args) {
		MyStack sai=new MyStack(5);
		sai.push(5);
		sai.push(2);
		sai.push(7);
		sai.push(3);
		sai.push(9);
		for(int x:sai.arr) {
			System.out.println(x);
		}
		sai.pop();
		sai.pop();
		sai.pop();
		sai.pop();
	}

}


class MyStack{
	
	int arr[];
	int top=-1;
	int cap;
	MyStack(int size){
		arr=new int[size];
		cap=size;
	}
	
	boolean isFull() {
		return top==cap-1;
	}
	boolean isEmpty() {
		return top==-1;
	}
	void push(int data) {
		if(isFull()) {
			System.out.println("Stack full zaala");
		}
		arr[++top]=data;
	}
	void pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}
		System.out.println("poped element "+arr[top]);
		top--;
	}
}

