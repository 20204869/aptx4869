package com.zyl.java.thread;

/**
 * @author 4869
 * ThreadLocal另一种使用场景：
 * 每个线程内需保存线程内的全局变量，这样线程在执行多个方法的时候，可在多个方法中获取这个线程内的全局变量，避免过度参数传递的问题
 *
 * 本类demo 是将学生信息存在为全局变量，这样不同的服务获取学生的不同信息时，将不用通过传入学生信息获取，而是不同的服务通过全局变量直接获取学生信息
 */
public class ThreadLocalTest04 {
    public static void main(String[] args) {
        init();
        new NameService().getName();
        new SexService().getSex();
        new ScoreService().getScore();
    }

    private static void init() {
        Student student = new Student();
        student.name = "Lemon";
        student.sex = "female";
        student.score = "100";
        ThreadLocalProcessor.studentThreadLocal.set(student);
    }
}

class ThreadLocalProcessor {
    public static ThreadLocal<Student> studentThreadLocal = new ThreadLocal<>();
}

class Student {
    /**
     * 姓名、性别、成绩
     */
    String name;
    String sex;
    String score;
}

//不同服务获取学生信息
class NameService {
    public void getName() {
        System.out.println(ThreadLocalProcessor.studentThreadLocal.get().name);
    }
}

class SexService {
    public void getSex() {
        System.out.println(ThreadLocalProcessor.studentThreadLocal.get().sex);
    }
}

class ScoreService {
    public void getScore() {
        System.out.println(ThreadLocalProcessor.studentThreadLocal.get().score);
    }
}
