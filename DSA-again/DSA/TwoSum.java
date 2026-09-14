
// 1. Two sums

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = new int[2];
        int[] num = { 3, 2, 4 };
        int target = 6;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                int sum = num[i] + num[j];
                if (i != j && sum == target) {
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
        }

        // System.out.println(arr);

        int[] second = twoSumSingleLoop(num, target);
        System.out.println(second[0] + second[1]);

    }

    public static int[] twoSumNaiveApproach(int[] num, int target) {

        int[] arr = new int[2];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                int sum = num[i] + num[j];
                if(i!=j && sum == target) {
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
        }
        return arr;

    }

    public static int[] twoSumSingleLoop(int[] num, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < num.length; i++) {
            int s = target - num[i];
            if (map.containsKey(s)) {
                return new int[] {map.get(s), i};
            }
            map.put(num[i], i);
        }
        
        return new int[2];

    }


}
