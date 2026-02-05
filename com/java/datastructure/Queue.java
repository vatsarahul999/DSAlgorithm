package com.java.datastructure;

public class Queue<Integer> {
    public static final int MAX_SIZE = 100;
    int []arr;
    int front;
    int rear;
    int size;
    public Queue() {
        arr = new int[MAX_SIZE];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == MAX_SIZE;
    }

    public void enqueue(int val) {
        if(this.isFull()) {
            throw new RuntimeException("Queue is Full");
        }
        rear = (rear + 1) % MAX_SIZE;
        arr[rear] = val;
        size++;
    }

    public int dequeue () {
        if(isEmpty()) {
             throw new RuntimeException("Queue is Empty");
        }
        int val = arr[front];
        arr[front] = -1;
        front = (front + 1) % MAX_SIZE;
        size--;
        return val;
    }

    public int peek() {
        if(isEmpty()) {
             throw new RuntimeException("Queue is Empty");
        }
        return arr[front];
    }

}
