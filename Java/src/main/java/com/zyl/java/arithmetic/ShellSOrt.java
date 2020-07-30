package com.zyl.java.arithmetic;

import java.util.Arrays;

/**
 * @author 4869
 * 希尔排序 算法时间复杂度O（n*n）
 * 基本思想：先将整个待排序的记录序列分割成若干子序列分别进行直接插入排序，待整个序列中的记录“基本有序”时，再对全体记录进行依次直接插入排序
 */
public class ShellSOrt {

    public static void main(String[] args) {
        int[] array = {5, 3, 9, 12, 6, 1, 7, 2, 4, 11, 8, 10};
        shellSortTwo(array);

    }

    /**
     * 增序列3h+1
     * @param array
     */
    public static void shellSortOne(int[] array) {
        //将array[]按升序排列
        int N = array.length;
        int h = 1;
        while (h < N / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            //将数组变为h有序
            for (int i = h; i < N; i++) {
                //将array[i]插入到array[i-h]，array[i-2*h]，array[i-3h]...之中。
                for (int j = i; j >= h && array[j] < array[j - h]; j -= h) {
                    int tmp = array[j];
                    array[j] = array[j - h];
                    array[j - h] = tmp;
                }
            }
            System.out.println("第" + (h) + "次" + Arrays.toString(array));
            //使间隔逐步变小
            h = h / 3;
        }
    }

    /**
     * 增序列每次减半
     * @param array
     */
    public static void shellSortTwo(int[] array) {
        int N = array.length;
        for (int gap = N / 2; gap > 0; gap /= 2){
            for (int i = gap; i < N ; i++){
                insert(array,gap,i);
            }
        }
    }
    private static void insert(int[] array,int gap, int i){
        int tmp = array[i];
        int j;
        for (j = i-gap;j >=0 && tmp < array[j]; j-=gap){
            array[j+gap] = array[j];
        }
        array[j+gap] = tmp;
        System.out.println("第" + (gap) + "次" + Arrays.toString(array));
    }
}
