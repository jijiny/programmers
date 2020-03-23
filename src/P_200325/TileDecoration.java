package P_200325;
// 200323
public class TileDecoration {
    public static long solution(int N) {
        long answer = 0;
        long[] arr = new long[81];

        arr[0] = 1;
        arr[1] = 1;

        for(int i=2; i<=N; i++) {
            arr[i] = arr[i-2] + arr[i-1];
        }

        for(int i=0; i<=N; i++) {
            System.out.println(arr[i]);
        }

        answer = (arr[N-1]+arr[N])*2;
        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
//        int n = 5;
        int n = 6;
        solution(n);
    }
}
