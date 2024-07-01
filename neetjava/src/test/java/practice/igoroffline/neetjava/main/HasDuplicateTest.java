package practice.igoroffline.neetjava.main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HasDuplicateTest {

    public boolean hasDuplicate(int[] nums) {
        java.util.Set<Integer> set = new java.util.HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }

    @Test
    void hasDuplicate1() {
        var nums = new int[] { 1, 2, 3, 3};
        Assertions.assertTrue(hasDuplicate(nums));
    }

    @Test
    void hasDuplicate2() {
        var nums = new int[] { 1, 2, 3, 4};
        Assertions.assertFalse(hasDuplicate(nums));
    }
}
