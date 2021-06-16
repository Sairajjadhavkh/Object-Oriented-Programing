package lab;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<Integer> myStack = new Stack<Integer>();
		for (int i = 0; i < 10; i++) {
			myStack.push(i + 1);
		}
		
		//myStack.forEach((i)->System.out.println(i));
		///////////POPING ELEMENTS////////
		//pop method removes the lastly added element from the stack and returns it. 
		
		/*myStack.forEach((sai)-> {
			System.out.println(sai);
		});*/
		
		//peek will give the last element added to the stack but will not remove it. 
	//	System.out.println(myStack.peek());
		//FOR READING THE ELEMENTS:
		//System.out.println(myStack);
		
		for (int i = 0; i < myStack.size(); i++) {
			System.out.println(myStack.get(i));
		}
		for (int i = 0; i < myStack.capacity(); i++) {
			
			System.out.println(myStack.pop());
		}
	}
}