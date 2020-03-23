package P_200212_Hash;

import java.util.*;

public class Clothes {
    public static int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> c = new HashMap<String, Integer> ();

        for(int i=0; i<clothes.length; i++) {
            if(c.containsKey(clothes[i][1])){
                c.put(clothes[i][1], c.get(clothes[i][1])+1);
            } else {
                c.put(clothes[i][1], 1);
            }
        }

        for(String name : c.keySet()){
            answer *= c.get(name)+1;
        }

        answer -= 1;
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"},{"green_turban", "headgear"}};
//        String[][] clothes = {{"crow_mask", "face"},{"blue_sunglasses", "face"},{"smoky_makeup", "face"}};
        solution(clothes);
    }
}
