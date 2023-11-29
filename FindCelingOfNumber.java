public class FindCelingOfNumber {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int[] arr2 = { 2, 8, 12, 14, 18, 24, 30 };
        System.out.println(findCelingOfNumber(arr, 15));
        System.out.println(findCelingOfNumber(arr2, 15));
        System.out.println(findCelingOfNumber(arr2, 3));
        System.out.println(findCelingOfNumber(arr2, 25));
        System.out.println(findCelingOfNumber(arr2, 10));
    }

    public static int findCelingOfNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        return arr[end + 1];
    }
}
