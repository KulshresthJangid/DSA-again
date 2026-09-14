//88. Merge Sorted Array
public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {3, 4, 5, 0, 0, 0};
        int[] nums2 = {0, 1, 2};
        merge(nums1, 3, nums2, nums2.length);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] tempArr = new int[nums1.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<m && j<n) {
            if(nums1[i] <= nums2[j]) {
                tempArr[k] = nums1[i];
                i++;
            } else if (nums1[i] >= nums2[j]) {
                tempArr[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (j<n) {
            tempArr[k] = nums2[j];
            k++;
            j++;
        }

        while (i<m) {
            tempArr[k] = nums1[i];
            k++;
            i++;
        }

        System.arraycopy(tempArr, 0, nums1, 0, m + n);
    }
}