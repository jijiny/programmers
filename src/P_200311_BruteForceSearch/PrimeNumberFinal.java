package P_200311_BruteForceSearch;

import java.util.HashSet;
import java.util.Set;

public class PrimeNumberFinal {
    public static int solution(String numbers) {
        int answer = 0;
        Set<Integer> primeNo = new HashSet<>();

        int[] number = new int[numbers.length()];
        int n = number.length;

        for(int i=0; i<numbers.length(); i++) {
            number[i] = Integer.parseInt(numbers.substring(i,i+1));
        }

//        for(int i=0; i<=numbers.length(); i++){ /*0이면 비어있어서 NumberFormatException*/
        for(int i=1; i<=numbers.length(); i++){
            perm(number, 0, n, i, primeNo);
        }

        answer = primeNo.size();
        System.out.println(answer);

        return answer;
    }

    public static void perm(int[] arr, int depth, int n, int r, Set primeNo) {
        if(depth == r) {
            print(arr, r, primeNo);
            return;
        }

        for(int i=depth; i<n; i++) {
            swap(arr, depth, i);
            perm(arr, depth+1, n, r, primeNo);
            swap(arr, depth, i);
        }
    }

    public static void swap(int[] arr, int depth, int i) {
        int temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }

    public static void print(int[] arr, int r, Set primeNo) {
        StringBuilder num = new StringBuilder();
        int count = 0;

        for(int i=0; i<r; i++) {
            num.append(arr[i]);
        }
        int no = Integer.parseInt(num.toString());
        for(int i=2; i<no; i++) {
            if(no%i==0) {
                count++;
                break;
            }
        }
        if(count==0 && no != 0 && no != 1) {
            primeNo.add(no);
        }
    }

    public static void main(String[] args) {
        String number = "17";
//        String number = "011";
        solution(number);
    }
}
