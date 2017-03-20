package stacksAndQueues.Q2;

import java.util.Stack;

/*
 Time Complexity: O(1) 
 Space Complexity: O(n) 
 
 Algorithm:

 1. Use buffer, extra stack to keep the min data
 
 */

public class StackWithMin2 extends Stack<Integer> {

	private static final long serialVersionUID = 1L;

	Stack<Integer> s2;

	public StackWithMin2() {
		s2 = new Stack<Integer>();
	}

	public void push(int value) {
		if (value <= min()) {
			s2.push(value);
		}

		super.push(value);
	}

	public Integer pop() {
		int value = super.pop();
		if (value == min()) {
			s2.pop();
		}
		return value;
	}

	public int min() {
		if (s2.isEmpty()) {
			return Integer.MAX_VALUE;
		} else {
			return s2.peek();
		}
	}

	public static void main(String[] args) {
		StackWithMin2 s = new StackWithMin2();
		s.push(11);
		s.push(12);
		s.push(13);
		s.push(2);

		System.out.println("Min is: " + s.min());

	}

}
