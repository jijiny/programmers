package Danal;

import java.util.*;

public class Q2 {
        public static String[] solution(String[] teamIDs, String[] additional) {
            String[] answer;

            Queue queue1 = new LinkedList();
            Queue queue2 = new LinkedList();

            for(int i=0; i<teamIDs.length; i++) {
                queue1.add(teamIDs[i]);
            }

            for(int i=0; i<additional.length; i++) {
                if(!queue1.contains(additional[i]) && !queue2.contains(additional[i])) {
                    queue2.add(additional[i]);
                }
            }

            answer = new String[queue2.size()];
            for(int i=0; i<answer.length; i++) {
                answer[i] = (String) queue2.poll();
            }
            for(int i=0; i<answer.length; i++) {
                System.out.println(answer[i]);
            }

            return answer;
    }
    public static void main(String[] args) {
        String[] teamIDs = {"world","prog"};
//        String[] teamIDs = {"abc","hq","xyz"};
        String[] additional = {"hello","world","code","hello","try","code"};
//        String[] additional = {"hq","abc","pp","xy","pp","hq"};
        solution(teamIDs, additional);
    }
}
