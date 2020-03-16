package P_200311;

public class Permutation {
    public static void main(String[] args) {
        /* 순열 : n개 중에서 r개 선택 */
        int r = 2;
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;
        for(int i=0; i<n; i++) {
            System.out.println("1 첫번째 perm " + i);
            perm(arr, 0, n, i);
        }
    }

    public static void perm(int[] arr, int depth, int n, int r) {
        if(depth == r) {
            System.out.println("2 depth랑 r 같을 때");
            print(arr,r);
            return;
        }

        for(int i=depth; i<n; i++) {
            System.out.println("3 첫번째 swap");
            swap(arr, depth, i);
            System.out.println("4 두번째 perm");
            perm(arr, depth+1, n, r);
            System.out.println("5 두번째 swap");
            swap(arr, depth, i);
        }
    }

    public static void swap(int[] arr, int depth, int i) {
        System.out.println("6 swap 하기");
        int temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }

    public static void print(int[] arr, int r) {
        System.out.println("7 출력");
        for(int i=0; i<r; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println();
    }
}
