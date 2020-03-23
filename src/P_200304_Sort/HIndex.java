package P_200304_Sort;

import java.util.*;

public class HIndex {
    public static int solution(int[] citations) {
        int answer = 0;
        int hIndex = 0;

        Arrays.sort(citations);

        for (int i=0; i<citations.length; i++) {
            System.out.println(citations[i]);
            hIndex = citations[i];
            if(hIndex >= citations.length-i) {
                answer = hIndex;
                break;
            }
        }

        System.out.println(answer);
        System.out.println("맘낭물뮤ㅐ;ㄻ");
        return answer;
    }

    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};

        solution(citations);
    }
}
