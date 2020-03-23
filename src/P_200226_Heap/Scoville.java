package P_200226_Heap;

import java.util.*;

public class Scoville {
    public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> sQueue = new PriorityQueue();

        for (int sco : scoville) {
            sQueue.add(sco);
        }

        while (!sQueue.isEmpty()) {
            if (sQueue.peek() >= K) {
                break;
            } else if (sQueue.size() == 1) {
                return -1;
            }
            int min1 = sQueue.poll();
            int min2 = sQueue.poll();

            int result = min1 + (min2 * 2);

            sQueue.offer(result);
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] scovile = {1, 2, 3, 9, 10, 12};
        int K = 7;
        solution(scovile, K);
    }
}
