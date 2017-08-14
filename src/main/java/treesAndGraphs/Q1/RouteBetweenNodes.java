package treesAndGraphs.Q1;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 Question: Find if there is a path between two vertices in a directed graph
 
  Algorithm: Use BFS algorithm to traverse and find the path. 
 */

public class RouteBetweenNodes {

	private int vertices;
	private List<Integer> adj[];

	@SuppressWarnings("unchecked")
	RouteBetweenNodes(int v) {
		vertices = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i) {
			adj[i] = new LinkedList<>();
		}
	}

	void addEdge(int v, int w) {
		adj[v].add(w);
	}

	public boolean checkRoute(int start, int end) {
		boolean visited[] = new boolean[vertices];

		Queue<Integer> queue = new LinkedList<Integer>();

		visited[start] = true;
		queue.add(start);

		while (queue.size() != 0) {
			start = queue.poll();

			for (int i : adj[start]) {
				if (i == end) {
					return true;
				} else if (!visited[i]) {
					visited[i] = true;
					queue.add(i);
				}
			}

		}
		return false;
	}

	public static void main(String[] args) {
		RouteBetweenNodes g = new RouteBetweenNodes(4);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		int start = 1;
		int end = 3;
		if (g.checkRoute(start, end)) {
			System.out.println("There is a path from " + start + " to " + end);
		} else {
			System.out.println("There is no path from " + start + " to " + end);
		}
	}
}
