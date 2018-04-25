package com.lijiankun24.hotfixpractice;

/**
 * BugClass.java
 * <p>
 * Created by lijiankun on 18/3/28.
 */

public class BugClass {

    public String getMsg() {
//        String msg = null;
        String msg = "test";
        return String.valueOf(msg.length());
    }
}
