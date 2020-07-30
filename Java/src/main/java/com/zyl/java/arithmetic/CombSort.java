package com.zyl.java.arithmetic;

import java.util.Arrays;

/**
 * @author 4869
 *
 * 梳排序 是冒泡排序的改进版
 */
public class CombSort {
    public static void main(String[] args) {
        int[] nums = {5, 3, 9, 12, 6, 1, 7, 2, 4, 11, 8, 10};
       combSort(nums);
    }

    /**
     * 梳排序
     * @param nums 待排序数组
     * @return 排好序的数组
     */
    private static int[] combSort(int[] nums) {
        float cofficient = 1.3f;    //步长系数（分组系数） = 1.3，大量试验获得的最佳值
        int groupNums = nums.length;
        boolean flag = false;

        while (groupNums >1 || flag) {
            groupNums = (int) ((groupNums / cofficient) > 1 ? (groupNums / cofficient) : 1);
            flag = false;
            for (int i = 0; i + groupNums < nums.length; i++) {
                if (nums[i] > nums[i + groupNums]) {
                    int temp = nums[i];
                    nums[i] = nums[i + groupNums];
                    nums[i + groupNums] = temp;
                    flag = true;
                }
            }
            System.out.println("groupNums = "+groupNums+"---"+Arrays.toString(nums));
        }
        return nums;
    }
}
