package stacksAndQueues.Q5;

import java.util.Stack;

/*
 Question: Sort the stack (min to max) using only ONE buffer stack and no other data structure.
 
  Algorithm:
  1. Pop the element in a temp variable and compare it to the top of the buffer stack.
  2. If value < buffer.peek(), transfer the elements to the s stack and then push the temp to buffer. Repeat.
 */

public class SortStack {

	public static void sort(Stack<Integer> s) {
		Stack<Integer> buffer = new Stack<>();
		while (!s.isEmpty()) {
			int temp = s.pop();
			while (!buffer.isEmpty() && temp < buffer.peek()) {
				s.push(buffer.pop());
			}
			buffer.push(temp);
		}

		// Copy elements back to original stack
		while (!buffer.isEmpty()) {
			s.push(buffer.pop());
		}
	}

	public static void print(Stack<Integer> s) {
		while (!s.isEmpty()) {
			System.out.print(s.pop() + " ");
		}
	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(5);
		stack.push(4);
		stack.push(1);
		stack.push(8);
		stack.push(9);

		sort(stack);

		print(stack);

	}

}
