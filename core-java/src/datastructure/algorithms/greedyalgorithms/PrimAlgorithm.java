package datastructure.algorithms.greedyalgorithms;

import java.util.*;

public class PrimAlgorithm {
    private static int vertices;
    private static int[][] graph;

    public static void main(String[] args) {
        vertices = 5; // Number of vertices in the graph

        graph = new int[][]{
            {0, 2, 0, 6, 0},
            {2, 0, 3, 8, 5},
            {0, 3, 0, 0, 7},
            {6, 8, 0, 0, 9},
            {0, 5, 7, 9, 0}
        };

        findMinimumSpanningTree();
    }

    private static void findMinimumSpanningTree() {
        boolean[] visited = new boolean[vertices];
        int[] parent = new int[vertices];
        int[] key = new int[vertices];

        Arrays.fill(key, Integer.MAX_VALUE);

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.offer(new Pair(0, 0));
        key[0] = 0;

        while (!pq.isEmpty()) {
            int u = pq.poll().vertex;
            visited[u] = true;

            for (int v = 0; v < vertices; v++) {
                if (graph[u][v] != 0 && !visited[v] && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                    pq.offer(new Pair(v, key[v]));
                }
            }
        }

        printMinimumSpanningTree(parent);
    }

    private static void printMinimumSpanningTree(int[] parent) {
        System.out.println("Edges in the Minimum Spanning Tree:");
        for (int i = 1; i < vertices; i++) {
            System.out.println(parent[i] + " - " + i);
        }
    }

    static class Pair implements Comparable<Pair> {
        int vertex;
        int key;

        Pair(int vertex, int key) {
            this.vertex = vertex;
            this.key = key;
        }

        public int compareTo(Pair other) {
            return Integer.compare(this.key, other.key);
        }
    }
}

