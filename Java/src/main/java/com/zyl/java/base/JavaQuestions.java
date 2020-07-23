package com.zyl.java.base;

/**
 * @author 4869
 * 验证Java中的问题
 */
public class JavaQuestions {

    public static void main(String[] args) {
        valueOverflow();

        Integer integer1 = 3;
        Integer integer2 = 3;

        if (integer1 == integer2){
            System.out.println("integer1 == integer2");
        }else {
            System.out.println("integer1 != integer2");
        }

        Integer integer3 = 300;
        Integer integer4 = 300;

        if (integer3 == integer4){
            System.out.println("integer3 == integer4");
        }else {
            System.out.println("integer3 != integer4");
        }
    }

    /**
     * 数据溢出
     * byte：byte用1个字节来存储，范围为-128(-2^7)到127(2^7-1)，在变量初始化的时候，byte类型的默认值为0。
     * short：short用2个字节存储，范围为-32,768 (-2^15)到32,767 (2^15-1)，在变量初始化的时候，short类型的默认值为0，一般情况下，因为Java本身转型的原因，可以直接写为0。
     * int：int用4个字节存储，范围为-2,147,483,648 (-2^31)到2,147,483,647 (2^31-1)，在变量初始化的时候，int类型的默认值为0。
     * long：long用8个字节存储，范围为-9,223,372,036,854,775,808 (-2^63)到9,223,372,036, 854,775,807 (2^63-1)，在变量初始化的时候，long类型的默认值为0L或0l，也可直接写为0。
     */
    public static void valueOverflow(){
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        int addResult = a+b;
        System.out.println("a = "+ a +",b = " + b + " ,a+b = " + addResult);
    }
}
