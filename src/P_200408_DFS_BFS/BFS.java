package P_200408_DFS_BFS;

import java.util.*;

public class BFS {
    public static void breadthFS(int[][] graph, int vertex) {
        Queue queue = new LinkedList();
        boolean[] visited = new boolean[graph.length];

        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }
        queue.add(vertex);

        while (!queue.isEmpty()) {
            int v = (int) queue.poll();

            if (visited[v] == false) {
                System.out.print(v + " ");
                visited[v] = true;
                for (int i = 0; i < graph[v].length; i++) {
                    if (graph[v][i] == 1) {
                        if (visited[i] == false) {
                            queue.add(i);
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] graph = {{0, 1, 1, 1, 0, 0, 0}, {1, 0, 0, 0, 1, 0, 0}, {1, 0, 0, 0, 1, 1, 0}, {1, 0, 0, 0, 0, 1, 0}, {0, 1, 1, 0, 0, 0, 1}, {0, 0, 1, 1, 0, 0, 1}, {0, 0, 0, 0, 1, 1, 0}};
        breadthFS(graph, 0);
    }

}
