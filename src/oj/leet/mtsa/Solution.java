package oj.leet.mtsa;

import java.util.Arrays;

import static java.lang.Math.min;

/**
 * Created by hfeng on 13-12-31.
 */
public class Solution {
    private int findNth(int A[], int B[], int k){
        if (A.length > B.length) {
            return findNth(B, A, k);
        }
        if (A.length == 0) {
            return B[k - 1];
        }
        if (B.length == 0) {
            return A[k - 1];
        }
        if (k == 1) {
            return Math.min(A[0], B[0]);
        }
        int partA = Math.min(k/2, A.length);
        int partB = k - partA;

        if (A[partA - 1] < B[partB - 1]) {
            return findNth(Arrays.copyOfRange(A, partA, A.length), B, k - partA);
        } else {
            return findNth(A, Arrays.copyOfRange(B, partB, B.length), k - partB);
        }
    }

    public double findMedianSortedArrays(int A[], int B[]) {
        int lenSum = A.length + B.length;
        if (lenSum % 2 == 1) {
            return findNth(A, B, lenSum / 2 + 1);
        } else {
            return (findNth(A, B, lenSum / 2) + findNth(A, B, lenSum / 2 + 1)) / 2.0;
        }
    }
}
