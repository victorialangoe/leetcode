package medium;
// from https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array

public class FindFirstAndLastElement {
    public int[] searchRange(int[] nums, int target) {
        int startPos = 0;
        int[] array = new int[2];
        array[0] = -1;
        array[1] = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (startPos == 0) {
                    startPos = i+1;
                    array[0] = i;
                }
                array[1] = i;
            }
        }



        return array;
    }
}
