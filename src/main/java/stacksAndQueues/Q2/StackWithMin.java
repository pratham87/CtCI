package stacksAndQueues.Q2;

/*
 Time Complexity: O(1) 
 Space Complexity: O(n) 
 
 Algorithm:

 1. Create object (NodeWithMin) that stores the min data
 2. Create stack accepting the NodeWithMin objects
 3. Use peek() to look up the min data in stack  
 
*/

import java.util.Stack;

public class StackWithMin extends Stack<NodeWithMin> {

	private static final long serialVersionUID = 1L;

	public void push(int value) {
		int min;

		if (this.isEmpty()) {
			min = value;
		} else {
			min = Math.min(peek().min, value);
		}

		super.push(new NodeWithMin(value, min));
	}

	public static void main(String[] args) {
		StackWithMin s = new StackWithMin();
		s.push(11);
		s.push(12);
		s.push(1);
		s.push(14);
		s.push(2);

		System.out.println("Min is: " + s.peek().min);

	}

}
