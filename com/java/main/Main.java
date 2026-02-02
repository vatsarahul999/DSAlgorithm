package com.java.main;

//import com.java.datastructure.Stack;
import java.util.*;

import com.java.datastructure.stackSimple.ParenthisisValid;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(10);
        System.out.println(stack.peek().toString());
        System.out.println(stack.pop().toString());
        System.out.println(stack.pop().toString());
        ParenthisisValid obj = new ParenthisisValid();
        System.out.println(Boolean.toString(obj.isValid("(){}{}")));
        System.out.println(Boolean.toString(obj.isValid("(}")));

    }
}
