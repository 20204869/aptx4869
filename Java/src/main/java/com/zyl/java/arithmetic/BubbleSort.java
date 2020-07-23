package com.zyl.java.arithmetic;

import java.util.Arrays;

/**
 * @author 4869
 * <p>
 * 冒泡排序:比较并交换相邻元素
 */
public class BubbleSort {
    public static void main(String[] args) {
        Integer[] array_one = {1,25,5,3,6,7};
        Integer[] array_two = {1,25,5,3,6,7};
        System.out.println("方法一："+Arrays.deepToString(array_sort_one(array_one)));
        System.out.println("方法二："+Arrays.deepToString(array_sort_two(array_two)));
    }

    /**
     * 冒泡排序方法一
     * @param array
     * @return
     */
    public static Integer[] array_sort_one(Integer[] array) {
        if (array.length < 1) {
            return null;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
            System.out.println("第【"+(i+1)+"]次冒泡  "+ Arrays.deepToString(array));
        }
        return array;
    }

    /**
     * 冒泡排序方法二
     * @param array
     * @return
     */
    public static Integer[] array_sort_two(Integer[] array){
        if (array.length < 1){
            return null;
        }
        //标识是否有元素进行交换，没有元素进行交换则说明序列有序
        boolean flag = false;

        for (int i = 0; i < array.length; i++) {
            flag = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;

                    flag = true;
                }
            }
            System.out.println("第【"+(i+1)+"]次冒泡  " + Arrays.deepToString(array));
            if (!flag){
                break;
            }
        }
        return array;
    }
}
