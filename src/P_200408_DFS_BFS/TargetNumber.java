package P_200408_DFS_BFS;

public class TargetNumber {
    static int answer = 0;

    public static int solution(int[] numbers, int target) {
        dfs(numbers,0,0,target);
        return answer;
    }

    public static void dfs(int[] numbers, int idx, int sum, int target) {
        if(idx==numbers.length) {
            System.out.println("if");
            if(sum==target) {
                answer++;
            }
        } else if(idx<numbers.length) {
            dfs(numbers, idx+1,sum+numbers[idx],target);
            dfs(numbers, idx+1,sum-numbers[idx],target);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;

        System.out.println(solution(numbers, target));
    }
}
