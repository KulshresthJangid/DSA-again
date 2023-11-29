public class FindTheSecondLargestNumberInArray {
    public static void main(String[] args) {
        long[] arr = { 4, 5, 32, 2, 2, 1, 2, 8, 10 };

        System.out.println(findSecondLargestNumber(arr));
    }

    public static long findSecondLargestNumber(long[] arr) {
        if (arr.length < 2) {
            return -1;
        }
        long max = Math.max(arr[0], arr[1]);
        long secondMax = Math.min(arr[0], arr[1]);
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
}
