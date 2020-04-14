package P_200415_BS;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;

        while (end >= start) {
            if (arr[mid] == target) {
                // find target in arr
                return mid;
            } else if (arr[mid] <= target) {
                // target is exist in right of arr[mid]
                start = mid + 1;
            } else {
                // target id exisdt in left of arr[mid]
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        // can't find data in arr
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,6,8,9,7,3};
        int target = 5;
        binarySearch(arr,target);
    }
}
