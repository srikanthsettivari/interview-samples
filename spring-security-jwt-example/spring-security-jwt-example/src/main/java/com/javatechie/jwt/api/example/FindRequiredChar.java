package com.javatechie.jwt.api.example;

import java.util.HashSet;

public class FindRequiredChar {
    public static void main(String args[]) {
        String str= "where is java coder";
      System.out.println(findCharector(str));
      RunnableExample r = new RunnableExample();
      r.run();
    }
    public static char findCharector(String str) {

        HashSet h = new HashSet();
        for (int i=0; i<=str.length()-1; i++)
        {
            char c = str.charAt(i);

            // If element is already in hash set, update x
            // and then break
            if (h.contains(c))
                return c;

            else // Else add element to hash set
                h.add(c);
        }

        return '\0';
    }
}
