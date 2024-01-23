package com.example.arrays;

public class CountElements {

    public int solve(int[] A) {
        int maxNumberCount = 1;
        int maxNumber = A[0];
        for(int i=0; i<A.length-1; i++){
            int temp = 0;
            if(A[i] < A[i+1]){
                temp = A[i+1];
                A[i+1] = A[i];
                A[i] = temp;

                if(A[i] > maxNumber){
                    temp = A[0];
                    A[0] = A[i];
                    A[i] = temp;
                    maxNumberCount = 1;
                }
                else if(A[i] == maxNumber){
                    maxNumberCount++;
                }
                maxNumber = A[0];
            }

        }
        return (A.length - maxNumberCount);
    }
}


/*

Q1. Count of elements
Solved
feature icon
Get your doubts resolved blazing fast with Chat GPT Help
Check Chat GPT
feature icon
Using hints is now penalty free
Use Hint
Problem Description
Given an array A of N integers.
Count the number of elements that have at least 1 elements greater than itself.


Problem Constraints
1 <= N <= 105
1 <= A[i] <= 109


Input Format
First and only argument is an array of integers A.


Output Format
Return the count of elements.


Example Input
Input 1:
A = [3, 1, 2]
Input 2:
A = [5, 5, 3]


Example Output
Output 1:
2
Output 2:
1

* */
