## Ch 1. Arrays and Strings

1. Is Unique: **[[Brute force](https://github.com/pratham87/CtCI/blob/master/src/main/java/arraysAndStrings/Q1/FindUniqueCharacterStringUsing2Pointer.java)][[ASCII](https://github.com/pratham87/CtCI/blob/master/src/main/java/arraysAndStrings/Q1/FindUniqueCharacterStringUsingASCIIcode.java)]**
2. [Check Permutation](https://github.com/pratham87/CtCI/blob/master/src/main/java/arraysAndStrings/Q2/CheckPermutation.java)
3. [URLify](https://github.com/pratham87/CtCI/blob/master/src/main/java/arraysAndStrings/Q3/ReplaceSpaces.java)
4. [Palindrome Permutation](https://github.com/pratham87/CtCI/blob/master/src/main/java/arraysAndStrings/Q4/PalindromePermutation.java)
5. [One Away](https://github.com/pratham87/CtCI/blob/master/src/main/java/arraysAndStrings/Q5/OneEditAway.java)
6. String Compression
7. [Rotate Matrix](https://github.com/pratham87/Data-Structures-and-Java-Collections/blob/master/src/main/java/arrays/RotateMatrix.java)
8. [Zero Matrix](https://github.com/pratham87/Data-Structures-and-Java-Collections/blob/master/src/main/java/arrays/ZeroRowColumn.java)
9. String Rotation

## Ch 2. Linked Lists

1. Remove duplicates: **[[HashMap](https://github.com/pratham87/Data-Structures-and-Java-Collections/blob/master/src/main/java/linkedList/RemoveDuplicateNodesUsingHashMap.java)][[Brute force](https://github.com/pratham87/Data-Structures-and-Java-Collections/blob/master/src/main/java/linkedList/FindnthNodeFromTheEndUsingTwoPointer.java)]**
2. Return Kth to Last
3. Delete Middle Node
4. Partition
5. Sum Lists
6. Palindrome
7. Intersection
8. [Loop Detection](https://github.com/pratham87/Data-Structures-and-Java-Collections/blob/master/src/main/java/linkedList/DetectLoopInSinglyList.java)

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
