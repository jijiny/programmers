package P_200318_Greedy;

public class Stick {
    public static int solution(String name) {
        int answer = 0;
        char[] nameChar = name.toCharArray();

        for (int i = 0; i < nameChar.length; i++) {
//            if ('Z' - nameChar[i] + 1 > nameChar[i] - 'A') {
//                System.out.println("거꾸로 : " + (nameChar[i] - 'A'));
//                answer += nameChar[i] - 'A';
//            } else if ('Z' - nameChar[i] + 1 < nameChar[i] - 'A') {
//                System.out.println("위로 : " + ('Z' - nameChar[i] + 1));
//                answer += 'Z' - nameChar[i] + 1;
//            } else {
//                System.out.println("같음 : " + ('Z' - nameChar[i] + 1));
//                answer += 'Z' - nameChar[i] + 1;
//            }

            int cnt = Math.min(nameChar[i]-'A', 'Z'-nameChar[i]+1);
            answer += cnt;
        }

        int min = name.length() - 1;
        System.out.println("1 : "+min);
        if (name.contains("A")) {
            int moveCnt = 1;    // 뒤 부터 움직이므로 +1
            // 뒤부터 세는 경우는, A가 아닌게 나올 때 까지 움직임
            for (int i = 1; i < name.length(); i++) {
                if (nameChar[i] != 'A') {
                    moveCnt = name.length() - i;
                    break;
                }
            }
            System.out.println("뒤부터 : "+moveCnt);
            if (min > moveCnt) min = moveCnt;
            System.out.println("2 : "+min);

            int i = 0;
            while (i < nameChar.length) {
                int endIndex = 0;
                if (nameChar[i] == 'A') {
                    endIndex = i + 1;
                    // 연속된 A의 인덱스의 끝 구하기
                    while (endIndex < nameChar.length && nameChar[endIndex] == 'A') {
                        endIndex++;
                    }
                    // 마지막 A가 끝까지
                    if (endIndex == nameChar .length) {
                        moveCnt = i - 1;
                    } else {
                        // ???
                        moveCnt = 1 + (i - 1) * 2 + nameChar.length - 1 - endIndex;
                    }
//                    if (min > moveCnt) min = moveCnt;
//                    System.out.println("3 : "+min);
                    i = endIndex + 1;
                } else {
                    i++;
                }
            }
            System.out.println("돌아와서 : "+ moveCnt);
            if (min > moveCnt) min = moveCnt;
            System.out.println("4 : "+min);
        }
        System.out.println(min);
        System.out.println(answer+min);

        return answer+min;
    }

    public static void main(String[] args) {
        String name = "JEROEN";
//        String name = "JAZ";
//        String name = "AABAZ";
//        String name = "AABAAAAAAABBB";
//        String name = "BAZZAAZ";
//        String name = "AABAB";
        solution(name);
    }
}
