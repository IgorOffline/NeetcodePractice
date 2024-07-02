package practice.igoroffline.neetjava.main;

public class BinarySearchTest {

    public int search(int[] nums, int target) {
        var bse = java.util.Arrays.binarySearch(nums, target);
        return bse < 0 ? -1 : bse;
    }
}
