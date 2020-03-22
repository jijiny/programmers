package Danal;

public class Q1 {
    public int solution(int a, int b, int budget) {
        int answer = 0;
        int tot = 0;
        int big_price = 0;
        int small_price = 0;

        if(a > b) {
            big_price = a;
            small_price = b;
        } else {
            big_price = b;
            small_price = a;
        }

        tot = budget/big_price + 1;

        for(int i=0; i<tot; i++) {
            if((budget - (big_price * i)) % small_price == 0) answer++;
        }
        return answer;
    }
}
