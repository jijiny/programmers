package Test;

import java.util.*;
import java.io.*;

public class Black {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String length = br.readLine();
        String input = br.readLine();

        int[] lengthArr = new int[2];

        String[] lengthArrS = length.split(" ");
        String[] inputArrS = input.split(" ");

        for(int i=0; i<lengthArrS.length; i++) {
            lengthArr[i] = Integer.parseInt(lengthArrS[i]);
//            System.out.println(lengthArr[i]);
        }
        int[] inputArr = new int[lengthArr[0]];

        for(int i=0; i<inputArrS.length; i++) {
            inputArr[i] = Integer.parseInt(inputArrS[i]);
//            System.out.println(inputArr[i]);
        }
        Arrays.sort(inputArr);

//        for(int k=0; k<inputArr.length; k++) {
//            System.out.print(inputArr[k] + " ");
//        }
//        System.out.println();
//        System.out.println();
        int cnt = 0;

        for(int i=0; i<inputArr.length; i += lengthArr[1]-1) {
//            System.out.println("i : "+i);
            if(i==lengthArr[0]-1) break;
            cnt++;
//            for(int j=i; j<i+lengthArr[1]-1; j++) {
//                if(j==lengthArr[0]-1) break;
////                System.out.println("j : "+j);
//                inputArr[j+1] = inputArr[j];
//            }
//            for(int k=0; k<inputArr.length; k++) {
//                System.out.print(inputArr[k]+" ");
//            }
////
//            System.out.println();
//            System.out.println();
        }
        System.out.println(cnt);
    }
}
