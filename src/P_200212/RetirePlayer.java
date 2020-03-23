package P_200212;

import java.util.*;

public class RetirePlayer {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> part = new HashMap<String, Integer>();

        for(String name : completion) {
            part.put(name, part.getOrDefault(name, 0) +1);
        }

        for(String name : participant) {
            part.put(name, part.getOrDefault(name, 0) -1);
        }

        for(String name : part.keySet()) {
            if(part.get(name) < 0) {
                answer = name;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden","kiki"};
//        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
//        String[] completion = {"josipa", "filipa", "marina", "nikola"};
//        String[] participant = {"mislav", "stanko", "mislav", "ana"};
//        String[] completion = {"stanko", "ana", "mislav"};
        solution(participant, completion);
    }
}
