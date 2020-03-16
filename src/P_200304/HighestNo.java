package P_200304;

import java.util.*;

public class HighestNo {
    public static String solution(int[] numbers) {
        String answer = "";
        String[] noString = new String[numbers.length];

        for(int i=0; i<numbers.length;i++) {
            noString[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(noString, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        for(int i=0; i<noString.length;i++) {
            answer += noString[i];
        }
        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
//		int[] number = {6, 10, 2};
        int[] number = {3, 30, 34, 5, 9};
        solution(number);
    }
}
