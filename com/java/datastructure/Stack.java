package com.java.datastructure;

public class Stack <T>{
    public static int MAX_ELEMENT_IN_STACK = 100;
    private T [] arr;
    private int top;

    public Stack() {
        arr =(T[]) new Object[MAX_ELEMENT_IN_STACK];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(T val) {
        if (top == MAX_ELEMENT_IN_STACK) {
            throw new RuntimeException("The stack is full! ");
        }
        top ++;
        arr[top] = val; 
    }

    public T pop() {
        if(isEmpty()) {
            throw new RuntimeException("The stack is empty!");
        }
        T val = arr[top];
        arr[top] = null;
        top --;
        return val;
    }

    public T peek() {
         if(isEmpty()) {
            throw new RuntimeException("The stack is empty!");
        }
        return arr[top];
    }


    
}