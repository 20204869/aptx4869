package com.zyl.java.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 4869
 *
 * java集合中 ArrayList解析
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Exception in thread "main" java.lang.ClassCastException: java.util.ArrayList$SubList cannot be cast to java.util.ArrayList
        // 原因： ：subList 返回的是ArrayList的内部类SubList，并不是 ArrayList而是ArrayList 的一个视图，对于SubList子列表的所有操作最终会反映到原列表上。
       // ArrayList<Integer> subList = (ArrayList<Integer>) list.subList(1,3);

        List sublist = list.subList(1,3);
        System.out.println(sublist.size());

    }
}
