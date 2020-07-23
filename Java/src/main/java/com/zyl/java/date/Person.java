package com.zyl.java.date;

import java.io.Serializable;
import java.util.StringJoiner;

/**
 * @author 4869
 */
public class Person implements Serializable {

    private static final long serialVersionUID = -7363494335098590947L;

    private boolean isSuccess;

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
                .add("isSuccess=" + isSuccess)
                .toString();
    }
}
