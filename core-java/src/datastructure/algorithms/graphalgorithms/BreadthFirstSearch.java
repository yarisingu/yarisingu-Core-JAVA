package datastructure.algorithms.graphalgorithms;

import java.util.*;

public class BreadthFirstSearch {
    private int vertices; // Number of vertices
    private List<List<Integer>> adjacencyList; // Adjacency list representation of the graph

    public BreadthFirstSearch(int v) {
        vertices = v;
        adjacencyList = new ArrayList<>(v);
        for (int i = 0; i < v; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        adjacencyList.get(u).add(v);
    }

    public void bfs(int startVertex) {
        boolean[] visited = new boolean[vertices];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");

            List<Integer> neighbors = adjacencyList.get(currentVertex);
            for (int neighbor : neighbors) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {

        // we can use hear scanner class for dynamic inputs
        BreadthFirstSearch bfs = new BreadthFirstSearch(6);

        bfs.addEdge(0, 1);
        bfs.addEdge(0, 2);
        bfs.addEdge(1, 3);
        bfs.addEdge(2, 4);
        bfs.addEdge(2, 5);

        System.out.println("BFS traversal starting from vertex 0:");
        bfs.bfs(0);
    }
}
