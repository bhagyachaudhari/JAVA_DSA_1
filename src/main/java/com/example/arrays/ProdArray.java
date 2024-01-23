package com.example.arrays;

public class ProdArray {
    public int[] solve(int[] A) { //1,2,3,4,5

        int N = A.length;
        int[] leftPrefixProd = new int[N];
        int[] rightPrefixProd = new int[N];

        leftPrefixProd[0] = A[0];
        for(int i = 1; i < N; i++){
            leftPrefixProd[i] = leftPrefixProd[i-1] * A[i];
        }

        rightPrefixProd[N-1] = A[N-1];
        for(int i = N-2; i > 0; i--){
            rightPrefixProd[i] = rightPrefixProd[i+1] * A[i];
        }

        for(int i = 0; i < N; i++){
            if(i == 0)
                A[i] = rightPrefixProd[i+1];
            else if(i == N-1)
                A[i] = leftPrefixProd[i-1];
            else
                A[i] = leftPrefixProd[i-1] * rightPrefixProd[i+1];
        }
        return A;
    }
}

