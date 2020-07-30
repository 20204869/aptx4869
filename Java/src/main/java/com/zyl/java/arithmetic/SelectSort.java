package com.zyl.java.arithmetic;

import java.util.Arrays;

/**
 * @author 4869
 * 选择排序算法时间复杂度O(n*n)
 * 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置。
 * 再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
 * 重复第二步，直到所有元素均排序完毕。
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr={2,7,5,3,6,1,4};
        SelectSort(arr);
    }

    public static void SelectSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        //数组比较次数n-1
        for (int i = 0; i < arr.length - 1; i++) {
            //保存当前最小元素的位置
            int index = i;
            //遍历待排序数组元素(i之后的元素)
            for (int j = i + 1; j < arr.length; j++) {
                //如果已排序中  较大元素  大于   待排序元素中的  最小元素 则更换元素对应索引
                if (arr[index] > arr[j]) {
                    index = j;
                }
            }
            if (i != index){
                //置换位置
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
            System.out.println("第"+(i+1)+"次："+Arrays.toString(arr));
        }
    }
}
