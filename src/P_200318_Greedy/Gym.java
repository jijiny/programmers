package P_200318_Greedy;

import java.util.*;

public class Gym {
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        Map<Integer, Integer> reserveMap = new HashMap<>();

        for(int i=1; i<=n; i++) {
            reserveMap.put(i, 1);
        }

        for(int res : reserve) {
            reserveMap.put(res, reserveMap.getOrDefault(res,1)+1);
        }

        for(int lo : lost) {
            reserveMap.put(lo, reserveMap.getOrDefault(lo,1)-1);
        }

        for(int student : reserveMap.keySet()) {
            if(reserveMap.get(student) == 0) {
                if(student == 1) {
                    if(reserveMap.get(student+1) > 1) {
                        reserveMap.put(student,1);
                        reserveMap.put(student+1,1);
                    }
                } else if (student == n) {
                    if(reserveMap.get(student-1) > 1) {
                        reserveMap.put(student,1);
                        reserveMap.put(student-1,1);
                    }
                } else {
                    if(reserveMap.get(student-1) > 1) {
                        reserveMap.put(student,1);
                        reserveMap.put(student-1,1);
                    } else if(reserveMap.get(student+1) > 1) {
                        reserveMap.put(student,1);
                        reserveMap.put(student+1,1);
                    }
                }
            }
        }

        for(int clothes : reserveMap.keySet()) {
            if(reserveMap.get(clothes) >= 1) {
                answer++;
            }
        }
        System.out.println(reserveMap);
        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
//        int n = 5;
//        int[] lost = {2,4};
//        int[] reserve = {1,3,5};
//        int n = 5;
//        int[] lost = {2,4};
//        int[] reserve = {3};
        int n = 3;
        int[] lost = {3};
        int[] reserve = {1};
        solution(n, lost, reserve);
    }
}
