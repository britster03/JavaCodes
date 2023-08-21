package org.example;

public class validparentheses {
    public static void main(String[] args) {
        String s = "([{}])";
        int c1 = 0, c2 = 0, c3 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                c1++;
            } else if (s.charAt(i) == '[') {
                c2++;
            } else if (s.charAt(i) == '{') {
                c3++;
            } else if (s.charAt(i) == ')') {
                c1--;
            } else if (s.charAt(i) == ']') {
                c2--;
            } else if (s.charAt(i) == '}') {
                c3--;
            }
        }
        if (c1 == 0 && c2 == 0 && c3 == 0) {
            ;
            System.out.println("valid parentheses");
        } else {
            System.out.println("invalid parentheses");
        }
    }
}
