package P_200318;

public class Stick {
    public static int solution(String name) {
        int answer = 0;
        int min = 65;
        int max = 91;
        char[] nameChar = name.toCharArray();
        int[] nameInt = new int[nameChar.length];

        for(int i=0; i<nameInt.length; i++) {
            nameInt[i] = (int) nameChar[i];
        }
        for(int i=0; i<nameInt.length; i++) {
            if(max-nameInt[i] > nameInt[i]-min) {
                System.out.println("거꾸로 : "+(nameInt[i] - min));
                answer += nameInt[i]-min;
            } else if(max-nameInt[i] < nameInt[i]-min) {
                System.out.println("위로 : "+(max - nameInt[i]));
                answer += max-nameInt[i];
            } else {
                System.out.println("같음 : " + (max - nameInt[i]));
                answer += max - nameInt[i];
            }
        }
        for(int i=0; i<nameChar.length; i++) {
            if(nameChar[i] == 'A') {
                answer += name.length()-2;
                break;
            } else if(i==nameChar.length-1) {
                answer += name.length()-1;
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
//        String name = "JAZ";
//        String name = "JEROEN";
        String name = "JAN";
        solution(name);
    }
}
