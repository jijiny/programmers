package P_200415_BS;

import java.util.*;

public class Budget {
    public static int solution(int[] budgets, int M) {
        int answer = 0;
        long totalRequest = 0;
        int mid;

        Arrays.sort(budgets);

        int min = 0;
//        int min = budgets[0]; // 최저 예산이 (총 예산/도시의 수)보다 클 경우 계산 불가
        int max = budgets[budgets.length-1];

        for (int budget : budgets) {
            totalRequest += budget;
        }

        if (totalRequest <= M) {
            return max;
        } else {
            while (true) {
                if(min > max) {
                    break;
                }

                totalRequest = 0;
                mid = (max + min) / 2;

                for (int i = 0; i < budgets.length; i++) {
                    if (budgets[i] < mid) {
                        totalRequest += budgets[i];
                    } else {
                        totalRequest += mid;
                    }
                }

                if(totalRequest > M) {
                    max = mid -1;
                } else {
                    min = mid +1;
                    answer = Math.max(answer,mid);
                }
            }
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] budgets = {120, 110, 140, 150};
//        int[] budgets = {120, 120, 120, 110};
        int m = 485;

        solution(budgets, m);
    }
}
