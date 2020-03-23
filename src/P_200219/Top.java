package P_200219;

import java.util.*;

public class Top {
    public static int[] solution(int[] heights) {
        int[] answer = new int[heights.length];

        Stack<Integer> tower = new Stack<Integer>();
        Stack<Integer> pop = new Stack<Integer>();

        for(int i=0; i<heights.length; i++) {
            tower.add(heights[i]);
        }

        int popCnt = 0;
        for(int i=heights.length-1; i>=0;i--) {
            int top = tower.pop();
            while(!tower.isEmpty()) {
                if(top < tower.peek()) {
                    answer[i] = i-popCnt;
                    break;
                } else if(top > tower.peek()) {
                    pop.push(tower.pop());
                    popCnt++;
                } else {
                    answer[i] = 0;
                    break;
                }
            }

            if(popCnt>0) {
                for(int j=0;j<popCnt;j++) {
                    tower.push(pop.pop());
                }
                popCnt = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] heights = {6,9,5,7,4};
//        int[] heights = {3,9,9,3,5,7,2};
//        int[] heights = {1,5,3,6,7,6,5};
        solution(heights);

    }
}
