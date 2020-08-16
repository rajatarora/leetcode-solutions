package co.rajat.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Breadth-First graph traversal
 */
public class DirectedGraph {

    private final int vertices;
    private final ArrayList<ArrayList<Integer>> adjacencyList;

    public DirectedGraph(int vertices) {
        this.vertices = vertices;
        this.adjacencyList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int from, int to) {
        adjacencyList.get(from).add(to);
    }

    public List<Integer> bfs(int start) {
        boolean[] visited = new boolean[vertices];
        LinkedList<Integer> queue = new LinkedList<>();
        List<Integer> traversal = new ArrayList<>();
        queue.add(start);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            visited[vertex] = true;
            traversal.add(vertex);
            for (int neighbour : adjacencyList.get(vertex)) {
                if(!visited[neighbour]) {
                    queue.add(neighbour);
                }
            }
        }
        return traversal;
    }

    public void dfs() {

    }

}
