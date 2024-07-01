package practice.igoroffline.neetjava.main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTest {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[] {};
    }

    @Test
    void twoSum1() {
        Assertions.assertArrayEquals(new int[]{0, 1}, twoSum(new int[]{3, 4, 5, 6}, 7));
    }

    @Test
    void twoSum2() {
        Assertions.assertArrayEquals(new int[]{0, 2}, twoSum(new int[]{4, 5, 6}, 10));
    }

    @Test
    void twoSum3() {
        Assertions.assertArrayEquals(new int[]{0, 1}, twoSum(new int[]{5, 5}, 10));
    }

    @Test
    void twoSum4() {
        Assertions.assertArrayEquals(new int[]{1, 2}, twoSum(new int[]{2, 5, 5, 11}, 10));
    }

    @Test
    void twoSum5() {
        Assertions.assertArrayEquals(new int[]{0, 3}, twoSum(new int[]{0, 4, 3, 0}, 0));
    }
}
