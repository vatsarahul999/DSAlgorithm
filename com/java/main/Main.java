package com.java.main;

//import com.java.datastructure.Stack;
import java.util.*;

import com.java.datastructure.stackSimple.ParenthisisValid;
import com.java.datastructure.stackSimple.stackMedium.Celebrety;
import com.java.datastructure.stackSimple.stackMedium.NextGreaterElement;

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
        int mat[][] = { { 1, 1, 0 },
                { 0, 1, 0 },
                { 0, 1, 1 } };
               int mat2[][] = {{1, 1},
      {1, 1}};
        Celebrety cel = new Celebrety();
        System.out.println(cel.findCelebrityBF(mat));
        System.out.println(cel.findCelebrityBF(mat2));
        System.out.println(cel.findCelebrityStack(mat));
        System.out.println(cel.findCelebrityStack(mat2));
        NextGreaterElement nextGreaterElement = new NextGreaterElement();
        int arr[] = {6, 8, 0, 1, 3};
        nextGreaterElement.printNextGreatestElementBF(arr);
        System.out.println("---------------------");
        nextGreaterElement.printNextGreatestElementStack1(arr);
    }
}
