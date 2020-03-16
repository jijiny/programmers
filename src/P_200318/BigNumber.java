package P_200318;

import java.util.*;

public class BigNumber {
    public static String solution(String number, int k) {
        String answer = "";
        char[] num = number.toCharArray();
        char max = '0';
        int index = -1;
        StringBuilder an = new StringBuilder();

        for(int i=0; i<num.length-k; i++) {
            max = '0';
            for(int j=index+1; j<=i+k; j++) {
                if(max < num[j]) {
                    max = num[j];
                    index = j;
                }
            }
            an.append(max);
        }
        System.out.println(an);
        answer = an.toString();
        return answer;
    }

    public static void main(String[] args) {
//        String number = "1924";
//        int k = 2;
//        String number = "1231234";
//        int k = 3;
        String number = "94177252841";
        int k = 4;
        solution(number, k);
    }
}
