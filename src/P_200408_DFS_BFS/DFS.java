package P_200408_DFS_BFS;

public class DFS {
    static int vertex;  // 정점의 개수
    static int startVertex; // 시작 정점
    static int[][] vertexMap;   // 인접 행렬 생성
    static int[] vertexVisit;   // 정점의 방문 여부를 가리키는 배열
    static int vt1, vt2;
    static int cnt=0;
    public static void dfs(int start) {
        if(start==8) {
            start = 1;
            cnt++;
            return;
        }
        vertexVisit[start] = 1;

        for(int i=1; i<=vertex; i++) {
            if(vertexMap[start][i]==1&&vertexVisit[i]==0){
                System.out.println(start+" -> "+i+"로 이동합니다");
                dfs(i);
            }
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) {
        vertex = 8;
        startVertex = 1;
        vertexMap = new int[vertex+1][vertex+1];    // 정점의 시작을 1로 하기 위해
        vertexVisit = new int[vertex+1];    // 정점의 시작을 1로해서

        vertexMap[1][2] = vertexMap[2][1] = 1;
        vertexMap[1][3] = vertexMap[3][1] = 1;
        vertexMap[2][4] = vertexMap[4][2] = 1;
        vertexMap[2][5] = vertexMap[5][2] = 1;
        vertexMap[3][6] = vertexMap[6][3] = 1;
        vertexMap[3][7] = vertexMap[7][3] = 1;
        vertexMap[4][8] = vertexMap[8][4] = 1;
        vertexMap[5][8] = vertexMap[8][5] = 1;
        vertexMap[6][8] = vertexMap[8][6] = 1;
        vertexMap[7][8] = vertexMap[8][7] = 1;

        dfs(startVertex);
    }
}
