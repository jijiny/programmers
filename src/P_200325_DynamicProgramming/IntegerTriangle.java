package P_200325_DynamicProgramming;

// https://web2eye.tistory.com/163

public class IntegerTriangle {

//    public static int solution(int[][] triangle) {
//        int answer = 0;
//        answer = recAdd(0,0,triangle);
//        System.out.println(answer);
//        return answer;
//    }
//    public static int recAdd(int depth, int index, int[][] triangle) {
//        if(depth>=triangle.length) {
//            return 0;
//        }
//        return triangle[depth][index] +
//                Math.max(recAdd(depth + 1, index, triangle), recAdd(depth + 1, index + 1, triangle));
//    }

    public static int solution(int[][] triangle) {
        int answer = 0;
        int[][] copy = new int[triangle.length][triangle.length];

        copy[0][0] = triangle[0][0];    // 제일 꼭대기
        for(int i=1; i<triangle.length; i++) {
            copy[i][0] = triangle[i][0] + copy[i-1][0];     // 제일 왼쪽
            copy[i][i] = triangle[i][i] + copy[i-1][i-1];   // 제일 오른쪽
        }

        for(int i=2;i<triangle.length;i++) {
            for(int j=1;j<i;j++) {
                copy[i][j] = Math.max(copy[i-1][j], copy[i-1][j-1]) + triangle[i][j];
            }
        }

        for(int i=0; i<triangle.length; i++) {
            if(answer<copy[triangle.length-1][i]) {
                answer = copy[triangle.length-1][i];
            }
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        solution(triangle);
    }
}
