package com.javatechie.jwt.api.practice.java8;

import java.math.BigInteger;

public class TestMine {
    public static void main(String args[]) {
        BigInteger a =  new BigInteger("1542368795632467");
        BigInteger b = new BigInteger("0500000001452000017");
       for(long i=0;i<10;i++) {
           System.out.println(a.add(BigInteger.valueOf(i)));
          // System.out.println(b.add(BigInteger.valueOf(i)));
       }


    }
}
