package com.java.datastructure.stackSimple.stackMedium;

import java.util.Stack;

public class Celebrety {
    /*
     * 
     * Given a square matrix mat[][] of size n x n, where mat[i][j] == 1 means
     * person i knows person j, and mat[i][j] == 0 means person i does not know
     * person j, find the celebrity person where,
     * 
     * A celebrity is defined as someone who:
     * 
     * Is known by everyone else
     * Does not know anyone (except themselves)
     * Return the index of the celebrity if one exists, otherwise return -1.
     * 
     * Input: mat[][] = [[1, 1, 0],
     * [0, 1, 0],
     * [0, 1, 1]]
     * Output: 1
     * Explanation: 0th and 2nd person both know 1. Therefore, 1 is the celebrity.
     * 
     * Input: mat[][] = [[1, 1],
     * [1, 1]]
     * Output: -1
     * Explanation: The two people at the party both know each other. None of them
     * is a celebrity.
     * 
     * Input: mat[][] = [[1]]
     * Output: 0
     */
    public int findCelebrityBF(int[][] mat) {
        int row = mat.length;
        int col = 0;
        if (row > 0) {
            col = mat[0].length;
        }
        // row wise interation
        for (int i = 0; i < row; i++) {
            // Check every element of the row
            boolean isCeleb = true;
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 1 && i != j) {
                    isCeleb = false;
                    break;
                }
            }

            if (isCeleb) {
                return i;
            }
        }
        return -1;
    }

    public int findCelebrityStack(int[][] mat) {
        int n = mat.length;
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < n;i++) {
            stk.push(i);
        }

        while(stk.size()> 1){
            int x = stk.pop();
            int y = stk.pop();

            // if x knows y, then x can not be celeb
            if(mat[x][y] == 1) {
                stk.push(y);
            } else {
                // if x doesn't know y then possiblilty of being celeb
                stk.push(x);
            }
        }

        int cel = stk.pop();
        for (int i = 0; i <n;i++) {
            if(i == cel) {
                continue;
            }
            if(mat[cel][i] == 1){
                return -1;
            }
        }
        return cel;
    }

}
