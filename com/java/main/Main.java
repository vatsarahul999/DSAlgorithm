package com.java.main;

//import com.java.datastructure.Stack;
import java.util.*;

//import com.java.datastructure.Queue;
import com.java.datastructure.queue.Node;
import com.java.datastructure.stackSimple.ParenthisisValid;
import com.java.datastructure.stackSimple.stackMedium.Celebrety;
import com.java.datastructure.stackSimple.stackMedium.NextGreaterElement;

public class Main {

    public static void main(String[] args) {
    //     System.out.println("Hello World!");

    //     Stack<Integer> stack = new Stack<>();
    //     stack.push(1);
    //     stack.push(10);
    //     System.out.println(stack.peek().toString());
    //     System.out.println(stack.pop().toString());
    //     System.out.println(stack.pop().toString());
    //     ParenthisisValid obj = new ParenthisisValid();
    //     System.out.println(Boolean.toString(obj.isValid("(){}{}")));
    //     System.out.println(Boolean.toString(obj.isValid("(}")));
    //     int mat[][] = { { 1, 1, 0 },
    //             { 0, 1, 0 },
    //             { 0, 1, 1 } };
    //            int mat2[][] = {{1, 1},
    //   {1, 1}};
    //     Celebrety cel = new Celebrety();
    //     System.out.println(cel.findCelebrityBF(mat));
    //     System.out.println(cel.findCelebrityBF(mat2));
    //     System.out.println(cel.findCelebrityStack(mat));
    //     System.out.println(cel.findCelebrityStack(mat2));
    //     NextGreaterElement nextGreaterElement = new NextGreaterElement();
        // int arr[] = {6, 8, 0, 1, 3};
        // nextGreaterElement.printNextGreatestElementBF(arr);
        // System.out.println("---------------------");
        // nextGreaterElement.printNextGreatestElementStack1(arr);
        // Queue<Integer> myQueue = new Queue<>();
        // myQueue.enqueue(10);
        // myQueue.enqueue(20);
        // myQueue.enqueue(30);
        // while(!myQueue.isEmpty()) {
        //     System.out.println(myQueue.dequeue());
        // }
        Node root = new Node(1);
        Node l = new Node(12);
        root.left = l;
         Node r = new Node(7);
         root.right = r;
          Node ll = new Node(20);
        Node lr = new Node(4);
        l.left = ll;
        l.right =lr;
        Node rl = new Node(2);
        r.left = rl;
        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        while(!nodeQueue.isEmpty()) {

            Node cur = nodeQueue.poll();
            System.out.println(cur.data);
            Node left = cur.left;
            Node right = cur.right;
            if(right != null) {
                nodeQueue.add(right);
            }
            if(left != null) {
                nodeQueue.add(left);
            }
        }
    }
}
