package com.java.datastructure.stackSimple.stackMedium;

import java.util.Stack;

public class NextGreaterElement {
    /*
     * Given an array arr[] of integers, determine the Next Greater Element (NGE)
     * for every element in the array, maintaining the order of appearance.
     * 
     * The Next Greater Element for an element x is defined as the first element to
     * the right of x in the array that is strictly greater than x.
     * If no such element exists for an element, its Next Greater Element is -1.
     * Examples:
     * 
     * Input: arr[] = [1, 3, 2, 4]
     * Output: [3, 4, 4, -1]
     * Explanation: The next larger element to 1 is 3, 3 is 4, 2 is 4 and for 4,
     * since it doesn't exist, it is -1.
     * 
     * Input: arr[] = [6, 8, 0, 1, 3]
     * Output: [8, -1, 1, 3, -1]
     */

    public void printNextGreatestElementBF(int arr[]) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            boolean isMax = false;
            int j = i + 1;
            for (j = i + 1; j < len; j++) {
                if (arr[i] < arr[j]) {
                    isMax = true;
                    break;
                }

            }
            if (isMax) {
                System.out.println(arr[i] + " -> " + arr[j]);
            } else {
                System.out.println(arr[i] + " -> -1");
            }
        }

    }

    public void printNextGreatestElementStack1(int arr[]) {
        int len = arr.length;
        Stack<Integer> stk = new Stack<>();
        int [] ret = new int [len];
        for (int i = 0; i < len; i++) {
            while (!stk.isEmpty() && arr[i] > arr[stk.peek()]) {
              //  System.out.println(stk.pop() + " -> " + arr[i]);
              ret[stk.pop()] = arr[i];

            }
            stk.push(i);
        }
        while (!stk.isEmpty()) {
            // System.out.println(stk.pop() + " -> -1 ");
           ret[stk.pop()]=-1 ;
        }
        for (int i =0 ; i< len;i++) {
            System.out.println(arr[i]+" -> "+ret[i]);
        }
    }
}
