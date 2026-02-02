package com.java.datastructure.stackSimple;

import java.util.Stack;

public class ParenthisisValid {

    /*
     * Let's say we have string that just has {,}, [,],(,).
     * Determine if the string is valid
     * Ex: Valid string:
     * 1. Same opening and closing braces.
     * 2. Open and closed in correct order
     * 3. Every closing bracket should have a correspoding opening brackert
     * 
     * Valid = (),(){}[]
     * inValid = ((})),(({))
     */
    public boolean isValidBF(String str) {
        StringBuilder sb = new StringBuilder(str);
        char[] arr = str.toCharArray();
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            char c = arr[i];
            int j = i + 1;
            boolean isMatch = false;
            for (j = i + 1; j < len; j++) {
                if ((c == '(' && arr[j] == ')') ||
                        (c == '[' && arr[j] == ']') ||
                        (c == '{' && arr[j] == '}')) {
                    isMatch = true;
                    break;
                }

            }
            if (isMatch) {
                arr[i] = '*';
                arr[j] = '*';
            } else {
                return false;
            }
        }
        for (int i = 0; i < len; i++) {
            if (arr[i] != '*') {
                return false;
            }
        }
        return true;

    }

    public boolean isValid(String str) {

        Stack<Character> stk = new Stack<>();
         char[] arr = str.toCharArray();
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if(arr[i] == '(' || arr[i] == '{' || arr[i] == '[') {
                stk.push(arr[i]);
            } else {
                if(stk.isEmpty()) {
                    return false;
                }
                char c = stk.pop();
                if( (c == '(' && arr[i] != ')') ||
                (c == '{' && arr[i] != '}') ||
                (c == '[' && arr[i] != ']')){
                return false;
            }
            }

        }
        return stk.isEmpty();
        
    }
}
