public class FindPositionOfAnElementInASortedARrayOfInfiniteNumbers {
    public static void main(String[] args) {
        int[] arr2 = { 5, 7, 7, 8, 8, 10 };
        System.out.println(ans(arr2, 8));
    }

    public static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return findPositionFromInfiniteArray(arr, target, start, end);
    }

    public static int findPositionFromInfiniteArray(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        return -1;
    }
}
