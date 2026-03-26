// 4. Median of two sorted arrays

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int s = m+n;
        int d = s%2;
        int l = s/2;
        double median = 0;
        int[] mergedArray = mergeArrays(nums1, nums2);
        
        if (d==0) {
            double sum = mergedArray[l] + mergedArray[l-1]; 
            double ans = sum/2;
            return ans;
        } else {
            return mergedArray[l];
        }
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2){
        int i = 0;  
        int j = 0;  
        int k = 0;
        int[] arr = new int[arr1.length + arr2.length];
         
        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] > arr2[j]) {
                arr[k] = arr2[j];
                j++;
            } else {
                arr[k] = arr1[i];
                i++;
            }
            k++;
        }

        while(i<arr1.length) {
            arr[k] = arr1[i];
            k++;
            i++;
        }

        while(j<arr2.length) {
            arr[k]=arr2[j];
            k++;
            j++;
        }
        return arr;
    }
}
