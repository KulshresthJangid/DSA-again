public class MergeSortedArrays88 {
    public static void main(String[] args) {
        int[] nums1 = {
            1,
            2,
            3,
            0,
            0,
            0
        };
        int[] nums2 = {
            2,
            5,
            6
        };
        int m = 3;
        int n = 3;
        bruteForceMerge(nums1, m, nums2, n);
    }
    public static void bruteForceMerge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] ans = new int[m + n];
        int[] temp1 = new int[nums1.length];
        for (int a: nums1) {
            temp1[i] = a;
            i++;
        }
        i = 0;
        while (i < m && j < n) {
            if (temp1[i] <= nums2[j]) {
                nums1[k] = temp1[i];
                i++;
            } else {
                nums1[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < m) {
            System.out.println("Got here3");
            nums1[k] = temp1[i];
            i++;
            k++;
        }
        while (j < n) {
            System.out.println("Got here");
            nums1[k] = nums2[j];
            j++;
            k++;
        }
    }
}           