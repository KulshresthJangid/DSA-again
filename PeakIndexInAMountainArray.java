public class PeakIndexInAMountainArray {
    public static void main(String[] args) {
        int[] arr = { 24, 69, 100, 99, 79, 78, 67, 36, 26, 19 };
        System.out.println(findPeakArrayInMountainArray(arr));
    }

    public static int findPeakArrayInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                return mid;
            } else if (arr[mid] < arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                end = mid;
            } else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                start = mid;
            }
        }
        return -1;
    }
}
