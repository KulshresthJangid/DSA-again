public class PeakIndexInAMountainArray {
    public static void main(String[] args) {
        int[] arr = { 24, 69, 100, 99, 79, 78, 67, 36, 26, 19 };
        System.out.println(findTheElementInMountainArray(arr, 19));
    }

    public static int findTheElementInMountainArray(int[] arr, int target) {
        int peakIndex = kunalSolution(arr);
        int foundInAsc = binarySearch(arr, peakIndex, target, true);
        int foundInDsc = binarySearch(arr, peakIndex, target, false);
        if (foundInAsc == -1) {
            return foundInDsc;
        }
        return foundInAsc;
    }

    public static int binarySearch(int[] arr, int index, int target, boolean arrAsc) {
        if (arrAsc) {
            int start = 0;
            int end = index;
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
        } else {
            int start = index;
            int end = arr.length - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] > target) {
                    start = mid + 1;
                } else if (arr[mid] < target) {
                    end = mid - 1;
                }
            }
            return -1;
        }
    }

    public static int findPeakArrayInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                return mid;
            } else if (arr[mid] < arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                end = mid - 1;
            } else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int kunalSolution(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;

    }
}
