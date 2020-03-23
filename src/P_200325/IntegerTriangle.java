package P_200325;

public class IntegerTriangle {
    public static int solution(int[][] triangle) {
        int answer = 0;
        answer = recAdd(0,0,triangle);
        System.out.println(answer);
        return answer;
    }

    public static int recAdd(int depth, int index, int[][] triangle) {
        if(depth>=triangle.length) {
            return 0;
        }
        return triangle[depth][index] +
                Math.max(recAdd(depth + 1, index, triangle), recAdd(depth + 1, index + 1, triangle));
    }

    public static void main(String[] args) {
        int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};

        solution(triangle);
    }
}
