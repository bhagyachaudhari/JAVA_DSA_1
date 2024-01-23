package com.example.arrays;

public class SecondLargest {

    public int solve(int[] A) { // 10,10,9,8,1

        int N = A.length;
        if(N == 1)
            return -1;

        int max = 0;
        int secondMax = 0;
        if(A[0] > A[1]){
            max = A[0];
            secondMax = A[1];
        }else{
            max = A[1];  //10
            secondMax = A[0]; //10
        }

        for(int i = 2; i < N; i++){
            if(A[i] > max){
                secondMax = max;
                max = A[i];
            }

            if((max == secondMax) || (A[i] < max && A[i] > secondMax)){
                secondMax = A[i];
            }
        }
        return (max == secondMax) ? -1 : secondMax;
    }
}
