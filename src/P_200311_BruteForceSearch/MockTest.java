package P_200311_BruteForceSearch;

import java.util.*;

public class MockTest {
    public static int[] solution(int[] answers) {
        int[] answer;
        int[] s1 = {1,2,3,4,5};
        int[] s2 = {2,1,2,3,2,4,2,5};
        int[] s3 = {3,3,1,1,2,2,4,4,5,5};
        int j1 = 0;
        int j2 = 0;
        int j3 = 0;
        int max = 0;

        List answerList = new ArrayList();

        Map<Integer, Integer> check = new HashMap<>();
        check.put(1,0);
        check.put(2,0);
        check.put(3,0);

        for(int i=0; i<answers.length; i++) {
            if(answers[i]==s1[j1]) {
                check.put(1, check.getOrDefault(1,0)+1);
            }
            if(answers[i]==s2[j2]) {
                check.put(2, check.getOrDefault(2,0)+1);
            }
            if(answers[i]==s3[j3]) {
                check.put(3, check.getOrDefault(3,0)+1);
            }
            j1++;
            j2++;
            j3++;
            if(j1 == s1.length) j1=0;
            if(j2 == s2.length) j2=0;
            if(j3 == s3.length) j3=0;
        }
        System.out.println(check);

        for(int a : check.values()) {
            if(a > max) {
                max = a;
            }
        }


        for(int a : check.keySet()) {
            if(check.get(a)==max) {
                answerList.add(a);
            }
        }

        answer = new int[answerList.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = (int) answerList.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
//        int[] answers = {1,2,3,4,5};
        int[] answers = {1,3,2,4,2};
        solution(answers);
    }
}
