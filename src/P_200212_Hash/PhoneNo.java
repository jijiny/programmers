package P_200212_Hash;

public class PhoneNo {
    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        for(int i=0; i<phone_book.length; i++) {
            for(int j=i+1; j<phone_book.length; j++) {
                if(phone_book[i].startsWith(phone_book[j])) {
                    return false;
                }
                if(phone_book[j].startsWith(phone_book[i])) {
                    return false;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] phone = {"119","97674223","1195524421"};
//        String[] phone = {"123","456","789"};
//        String[] phone = {"12","123","1235","567","88"};

        solution(phone);
    }
}
