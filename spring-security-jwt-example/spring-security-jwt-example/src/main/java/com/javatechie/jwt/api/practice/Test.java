package com.javatechie.jwt.api.practice;
import java.util.List;
import java.util.ArrayList;

class Test {

    public static void main(String args[]) {
        String s = "abc";

        List<String> permutations = new ArrayList<>();

        permutations.add(String.valueOf(s.charAt(0)));

        for(int i =1; i < s.length(); i++) {
            char c = s.charAt(i);
            int size = permutations.size();
            for(int j = 0; i < size; j++){
                String s1 = permutations.remove(0);
                for(int k = 0; k < s1.length(); k++) {
                    permutations.add(s1.substring(0, k) + c + s1.substring(k));
                }
            }

        }
        for(String str: permutations) {
            System.out.println(str);
        }

    }
}