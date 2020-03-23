package P_200304_Sort;

import java.util.*;

public class K {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int [commands.length];
        int k=0;

        for(int i=0; i<commands.length;i++) {
            int[] command = new int[(commands[i][1]-commands[i][0])+1];
            for(int j=commands[i][0]-1;j<commands[i][1];j++) {
                command[k]=array[j];
                k++;
            }
            Arrays.sort(command);
            k=0;
            answer[i] = command[commands[i][2]-1];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        solution(array, commands);
    }
}
