package Danal;

import java.util.*;
/*
public class Solution {

   public static int solution(int[] prices) {
      int answer = 0;

      Arrays.sort(prices);
        answer = prices[prices.length-1] - prices[0];

      return answer;
   }
}
* */
public class Q3 {
    public static void main(String[] args) {
//        int[] prices = {3,2,4,8,7};
        int[] prices = {5,4,3,2,1};
//        int[] prices = {1,1,2,1,2};
        solution(prices);
    }

    public static int solution(int[] prices) {
        int answer = 0;
        int max = 0;
        int max_index = 0;
        int min = 1000001;
        int min_index = 0;

        for(int i=0; i<prices.length; i++) {
            if(max < prices[i]) {
                max = prices[i];
                max_index = i;
            }

            if(min > prices[i]) {
                min = prices[i];
                min_index = i;
            }
        }

        if(min_index < max_index){
            answer = max - min;
        } else if(min_index == max_index) {
            answer = 0;
        } else {
            int new_min = 1000001;
            int new_max = 0;

            for(int i=0; i<max_index+1; i++) {
                if(new_min > prices[i]) {
                    min = prices[i];
                    min_index = i;
                }
            }

            for(int i=min_index; i<prices.length; i++) {
                if(new_max < prices[i]) max = prices[i];
            }

            answer = max - min;
        }

        System.out.println(answer);
        if(answer <= 0) {
            System.out.println(0);
            return 0;
        }
        return max;
    }
}
