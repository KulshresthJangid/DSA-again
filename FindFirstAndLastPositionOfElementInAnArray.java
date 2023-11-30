public class FindFirstAndLastPositionOfElementInAnArray {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 8, 9, 9, 10 };
        int[] arr2 = { 5, 7, 7, 8, 8, 10 };
        System.out.println(search(arr2, 8));
    }

    public static int[] search(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = searchIndex(nums, target, false);
        ans[1] = searchIndex(nums, target, true);
        System.out.println("element 0 " + ans[0]);
        System.out.println("element 1 " + ans[1]);
        return ans;
    }

    public static int searchIndex(int[] arr, int target, boolean findStartIndex) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        return ans;
    }
}