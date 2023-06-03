package com.javatechie.jwt.api.practice;

public class RemoveSpace {
    public static  void main() {

        removeWhiteSpaces("how are you");
    }
    public static String removeWhiteSpaces(String input) {
        StringBuilder output = new StringBuilder();

        char[] charArray = input.toCharArray();

        for (char c : charArray) {
            if (!Character.isWhitespace(c))
                output.append(c);
        }

        return output.toString();
    }
}
