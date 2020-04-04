package P_200408_DFS_BFS;

public class Network {
    static int[] visited;

    public static int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new int[n];

        for(int i=0;i<n;i++) {
            if(visited[i]==0) {
                answer++;
                dfs(i, computers);
            }
        }
        System.out.println(answer);
        return answer;
    }

    public static void dfs(int start, int[][] computers) {
        visited[start] = 1;

        for(int i=0; i<computers.length;i++) {
            if(computers[start][i]==1 && visited[i]==0) {
                dfs(i, computers);
            }
        }
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
//        int[][] computers = {{1,1,0},{1,1,1},{0,1,1}};
        solution(n, computers);
    }
}
