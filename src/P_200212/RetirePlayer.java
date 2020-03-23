package P_200212;

import java.util.*;

public class RetirePlayer {
    public String solution(String[] participant, String[] completion) {
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
}
