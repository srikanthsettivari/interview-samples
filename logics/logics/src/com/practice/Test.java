package com.practice;

public class Test extends  Thread{
    public void run()
    {
        System.out.println("My thread is in running state.");
    }
    public static  void main(String args[]) {
        Test t = new Test();
        t.run();
    }
}
