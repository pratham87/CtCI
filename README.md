# Questions:

## Ch 1. Arrays and Strings

1. [Implement an algorithm to determine if a string has all unique characters. What if you can not use additional data structures?](https://github.com/pratham87/CtCI/tree/master/src/main/java/arraysAndStrings/Q1) 

2. Write code to reverse a C-Style String. (C-String means that “abcd” is represented as  ve characters, including the null character.)

3. [Design an algorithm and write code to remove the duplicate characters in a string without using any additional bu er. NOTE: One or two additional variables are  ne. An extra copy of the array is not. FOLLOW UP: Write the test cases for this method.](https://github.com/pratham87/CtCI/tree/master/src/main/java/arraysAndStrings/Q3)

4. [Write a method to decide if two strings are anagrams or not](https://github.com/pratham87/CtCI/tree/master/src/main/java/arraysAndStrings/Q4)    

5. [Write a method to replace all spaces in a string with ‘%20’](https://github.com/pratham87/CtCI/tree/master/src/main/java/arraysAndStrings/Q5)

## Ch 2. Linked Lists

1. [Write code to remove duplicates from an unsorted linked list. FOLLOW UP: How would you solve this problem if a temporary buffer is not allowed?](https://github.com/pratham87/CtCI/tree/master/src/main/java/linkedLists/Q1)

2. Implement an algorithm to  nd the nth to last element of a singly linked list.

3. [Implement an algorithm to delete a node in the middle of a single linked list, given only access to that node. EXAMPLE Input: the node ‘c’ from the linked list a->b->c->d->e Result: nothing is returned, but the new linked list looks like a->b->d->e](https://github.com/pratham87/CtCI/tree/master/src/main/java/linkedLists/Q3)

4. You have two numbers represented by a linked list, where each node contains a single digit. The digits are stored in reverse order, such that the 1’s digit is at the head of the list. Write a function that adds the two numbers and returns the sum as a linked list. EXAMPLE Input: (3 -> 1 -> 5) + (5 -> 9 -> 2), Output: 8 -> 0 -> 8

5. Given a circular linked list, implement an algorithm which returns node at the begin- ning of the loop. DEFINITION: Circular linked list: A (corrupt) linked list in which a node’s next pointer points to an earlier node, so as to make a loop in the linked list. EXAMPLE input: A -> B -> C -> D -> E -> C [the same C as earlier], output: C

## Ch 3. Stacks and Queues

1. Describe how you could use a single array to implement three stacks.

2. [How would you design a stack which, in addition to push and pop, also has a function min which returns the minimum element? Push, pop and min should all operate in O(1) time.](https://github.com/pratham87/CtCI/tree/master/src/main/java/stacksAndQueues/Q2)

3. Implement a MyQueue class which implements a queue using two stacks.

4. Write a program to sort a stack in ascending order. You should not make any assump- tions about how the stack is implemented. The following are the only functions that should be used to write this program: push | pop | peek | isEmpty.

## Ch 4. Trees and Graphs

1. Implement a function to check if a tree is balanced. For the purposes of this question, a balanced tree is de ned to be a tree such that no two leaf nodes di er in distance from the root by more than one.

2. Given a directed graph, design an algorithm to  nd out whether there is a route between two nodes.

3. [Given a sorted (increasing order) array, write an algorithm to create a binary tree with minimal height.](https://github.com/pratham87/CtCI/tree/master/src/main/java/treesAndGraphs/Q3)

4. Given a binary search tree, design an algorithm which creates a linked list of all the nodes at each depth (i.e., if you have a tree with depth D, you’ll have D linked lists).

5. Write an algorithm to  nd the ‘next’ node (i.e., in-order successor) of a given node in a binary search tree where each node has a link to its parent.

6. Design an algorithm and write code to  nd the  rst common ancestor of two nodes in a binary tree. Avoid storing additional nodes in a data structure. NOTE: This is not necessarily a binary search tree.

7. You have two very large binary trees: T1, with millions of nodes, and T2, with hun- dreds of nodes. Create an algorithm to decide if T2 is a subtree of T1.

8. You are given a binary tree in which each node contains a value. Design an algorithm to print all paths which sum up to that value. Note that it can be any path in the tree - it does not have to start at the root.

## Ch 5. Bit Manipulation

1. You are given two 32-bit numbers, N and M, and two bit positions, i and j. Write a method to set all bits between i and j in N equal to M (e.g., M becomes a substring of N located at i and starting at j). EXAMPLE: Input: N = 10000000000, M = 10101, i = 2, j = 6, Output: N = 10001010100

2. Given a (decimal - e.g. 3.72) number that is passed in as a string, print the binary rep- resentation. If the number can not be represented accurately in binary, print “ERROR”

3. Given an integer, print the next smallest and next largest number that have the same number of 1 bits in their binary representation.

4. Explain what the following code does: ((n & (n-1)) == 0).

5. Write a function to determine the number of bits required to convert integer A to integer B. Input: 31, 14 Output: 2

6. Write a program to swap odd and even bits in an integer with as few instructions as possible (e.g., bit 0 and bit 1 are swapped, bit 2 and bit 3 are swapped, etc).

7. An array A[1...n] contains all the integers from 0 to n except for one number which is missing. In this problem, we cannot access an entire integer in A with a single opera- tion. The elements of A are represented in binary, and the only operation we can use to access them is “fetch the jth bit of A[i]”, which takes constant time. Write code to  nd the missing integer. Can you do it in O(n) time?
