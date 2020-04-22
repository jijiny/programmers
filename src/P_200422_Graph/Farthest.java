package P_200422_Graph;

import java.util.*;

public class Farthest {
    public static int solution(int n, int[][] edge) {
        int answer = 0;

        // 1 : 그래프 그리기
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

        for(int i=0; i<edge.length;i++) {
            graph.add(new ArrayList<Integer>());
        }

        for(int i=0; i<edge.length;i++) {
            graph.get(edge[i][0]).add(edge[i][1]);
            graph.get(edge[i][1]).add(edge[i][0]);
        }

        // 2 : BFS를 통해 인접한 노드 탐색
        Queue<Integer> q = new LinkedList<Integer>();
        boolean[] visit = new boolean[n+1];
        int[] count = new int[n+1];

        for(int i=0; i<visit.length;i++){
            visit[i] = false;
        }

        q.add(1);
        visit[0] = visit[1] = true;

        while(!q.isEmpty()) {
            int v = q.poll();
            System.out.println(v);
            for(int i: graph.get(v)) {
                if(visit[i] == false) {
                    count[i] = count[v]+1;
                    visit[i] = true;
                    q.add(i);
                }
            }
        }
        System.out.println(Arrays.toString(count));

        // 3 : 간선 갯수의 최대를 구하고 카운트
        int max = 0;
        for(int i=0; i<count.length;i++) {
            if(max < count[i]) {
                max = count[i];
                answer = 1;
            } else if(max==count[i]) {
                answer++;
            }
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        int n = 6;
        int[][] vertex = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};

        solution(n, vertex);
    }
}
