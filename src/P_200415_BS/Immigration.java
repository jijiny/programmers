package P_200415_BS;

public class Immigration {
    public static long solution(int n, int[] times) {
        long answer = 0;
        long max = 0;
        long maxTime = 0;
        long minTime = 1;
        long midTime = 0;
        long cnt;

        for (int time : times) {
            max = Math.max(max, time);
        }
        maxTime = max * n;

        while (minTime <= maxTime) {
            midTime = (minTime + maxTime) / 2;
            System.out.println(minTime);
            System.out.println(midTime);
            System.out.println(maxTime);
            cnt = 0;
            for (int time : times) {
                cnt += midTime / time;
            }
            System.out.println(cnt);
            System.out.println();

            if (cnt >= n) {
                maxTime = midTime - 1;
                answer = midTime;
            } else {
                minTime = midTime + 1;
            }
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        int n = 6;
        int[] times = {7, 10};

        solution(n, times);
    }
}
