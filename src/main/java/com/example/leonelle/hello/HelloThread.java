package com.example.leonelle.hello;

/**
 * Created by student on 2016-10-07.
 */
public class HelloThread extends Thread {
    @Override
    public void run() {
        System.out.println(this + " Hello!");
    }
}
