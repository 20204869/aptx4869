package org.example;

/**
 * @author 4869
 *
 * 获取数据除某一个数的个数
 */
public class GetNum {
    public static void main(String args[]) {
       /* for (int counter = 0; counter <= 15; counter++){
            System.out.printf("%d! = %d\n", counter,
                    factorial(counter));
        }*/
        System.out.println(factorial(3)*factorial(12) / (factorial(4)*factorial(4)*factorial(4)));

        System.out.println(factorial(15)/(factorial(5)*factorial(5)*factorial(5)));

        System.out.println(factorial(15));
    }
    public static long factorial(long number) {
        if (number <= 1)
            return 1;
        else
            return number * factorial(number - 1);
    }
}
