package Leetcode.zap.todo;

import java.util.Arrays;

public class LC31_NextPermutation {
    public static void main(String[] args) {
        LC31_NextPermutation lc31 = new LC31_NextPermutation();
        lc31.nextPermutation(new int[]{1,2,3});
        lc31.nextPermutation(new int[]{1,1,5});
        lc31.nextPermutation(new int[]{3,2,1});

    }
    public void nextPermutation(int[] nums) {


        int i = nums.length - 2;

        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }

        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        else
            reverse(nums, i + 1);


        System.out.println(Arrays.toString(nums));

    }

    private void reverse(int[] nums, int start) {

        int left = start;
        int right = nums.length - 1;

        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }

    }


    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
