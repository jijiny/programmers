package P_200318;

public class Stick {
    public static int solution(String name) {
        int answer = 0;
        char[] nameChar = name.toCharArray();

        for(int i=0; i<nameChar.length; i++) {
//            if('Z'-nameChar[i] +1 > nameChar[i]-'A') {
//                System.out.println("거꾸로 : "+(nameChar[i] - 'A'));
//                answer += nameChar[i]-'A';
//            } else if('Z'-nameChar[i] +1 < nameChar[i]-'A') {
//                System.out.println("위로 : "+('Z' - nameChar[i] +1));
//                answer += 'Z'-nameChar[i] +1;
//            } else {
//                System.out.println("같음 : " + ('Z' - nameChar[i] +1));
//                answer += 'Z' - nameChar[i] +1;
//            }

            int cnt = Math.min(nameChar[i]-'A', 'Z'-nameChar[i]+1);
            answer += cnt;
        }
        for(int i=0; i<nameChar.length; i++) {
            if(nameChar[i] == 'A') {
                answer += name.length()-2;
                break;
            } else if(i==nameChar.length-1 ) {
                answer += name.length()-1;
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
//        String name = "JEROEN";
        String name = "JAZ";
//        String name = "AABAZ";
//        String name = "BAZZAAZ";
//        String name = "AZZAAZ";
        solution(name);
    }
}
