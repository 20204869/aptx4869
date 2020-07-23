package com.zyl.java.date;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;

/**
 * @author 4869
 */
public class PropertyNameTest01 {
    public static void main(String[] args) throws Exception{
        Person person = new Person();
        person.setSuccess(true);
        Gson gson = new Gson();
        System.out.println(gson.fromJson(JSON.toJSONString(person),Person.class));
/*
        //使用fastjson序列化person成字符串并输出
        System.out.println("Serializable Result With fastjson :" + JSON.toJSONString(person));

        //使用Gson序列化person成字符串并输出
        Gson gson =new Gson();
        System.out.println("Serializable Result With Gson :" +gson.toJson(person));

        //使用jackson序列化person成字符串并输出
        ObjectMapper om = new ObjectMapper();
        System.out.println("Serializable Result With jackson :" +om.writeValueAsString(person));*/
    }
}
