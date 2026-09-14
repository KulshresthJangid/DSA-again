
import java.util.Iterator;
import java.util.TreeSet;

public class RemoveDuplicatesFromSortedArray26 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 5};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int a : nums) {
            if (set.contains(a)) {
                continue;
            } else {
                set.add(a);
            }
        }

        Iterator setIterator = set.iterator();
        for (int i = 0; i < set.size(); i++) {
            nums[i] = (int) setIterator.next();
        }
        return set.size();
    }
}
