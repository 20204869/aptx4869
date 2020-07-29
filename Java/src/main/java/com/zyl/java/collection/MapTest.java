package com.zyl.java.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 4869
 * Map 功能测试
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put(null,1);
        map.put("test",2);

        System.out.println(map.get(null));
    }
}
