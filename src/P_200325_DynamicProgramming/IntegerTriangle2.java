package P_200325_DynamicProgramming;
// 현석 코드
public class IntegerTriangle2 {
    private static int[][] triangles = null;

    public static int solution(int[][] triangle) {

        int answer = 0;
        triangles = triangle;

        answer = recursion(triangle.length - 1, 0);
        System.out.println(answer);

        return answer;
    }

    public static int recursion(int i, int j) {

        //탈출조건
        if (i == 0) return triangles[i][j];

        if (triangles[i][j] > triangles[i][j + 1]) triangles[i - 1][j] += triangles[i][j];
        else triangles[i - 1][j] += triangles[i][j + 1];

        j += 1;

        if (j + 1 > triangles[i].length - 1) {
            i -= 1;
            j = 0;
        }

        return recursion(i, j);

    }


    public static void main(String[] args) {
        int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        solution(triangle);
    }
}
