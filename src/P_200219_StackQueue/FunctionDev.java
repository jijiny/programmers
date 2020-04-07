package P_200219_StackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class FunctionDev {
    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer;
        int[] tmp = new int[100];
        int day = 0;
        int cnt = 1;
        int first = 0;
        int idx = 0;

        Queue<Integer> progress = new LinkedList<>();

        while (true) {
            for (int i = 0; i < progresses.length; i++) {
                day = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
//                System.out.println(day);
                progress.add(day);
            }
//            cnt = 0;
            while (true) {
                first = progress.poll();
                if (progress.isEmpty()) {
                    tmp[idx] = cnt + 1;
                    break;
                } else if (first >= progress.peek()) {
                    progress.poll();
                    cnt++;
                    if (first < progress.peek()) {
                        tmp[idx] = cnt;
                        idx++;
                        cnt = 0;
                    }
                }
            }

            break;
        }
        System.out.println("sdasdas " + idx);
        answer = new int[idx + 1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = tmp[i];
            System.out.println(answer[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
//        int[] progresses = {93, 30, 55};
        int[] progresses = {93, 93, 93, 92};
//        int[] speeds = {1, 30, 5};
        int[] speeds = {1, 1, 1, 1};
        solution(progresses, speeds);
    }
}
