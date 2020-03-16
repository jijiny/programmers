package P_200318;

public class Stick {
    public static int solution(String name) {
        int answer = 0;
        int min = 65;
        int max = 91;
        char[] nameChar = name.toCharArray();

        for(int i=0; i<nameChar.length; i++) {
//            if('Z'-nameChar[i] > nameChar[i]-'A') {
//                System.out.println("거꾸로 : "+(nameChar[i] - 'A'));
//                answer += nameChar[i]-'A';
//            } else if('Z'-nameChar[i] < nameChar[i]-'A') {
//                System.out.println("위로 : "+('Z' - nameChar[i]));
//                answer += 'Z'-nameChar[i];
//            } else {
//                System.out.println("같음 : " + ('Z' - nameChar[i]));
//                answer += 'Z' - nameChar[i] +1;
//            }

            int cnt = Math.min(nameChar[i]-'A', 'Z'-nameChar[i]);
            answer += cnt;
        }
        for(int i=0; i<nameChar.length; i++) {

        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
//        String name = "JEROEN";
        String name = "JAN";
//        String name = "AABAZ";
//        String name = "BAZZAAZ";
//        String name = "AZZAAZ";
        solution(name);
    }
}
