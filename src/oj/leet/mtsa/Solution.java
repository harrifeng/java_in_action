package oj.leet.mtsa;

import java.util.Arrays;

public class Solution {

    public int findKthSortedArrays(int[] A, int[] B, int k) {
        if (A.length > B.length) {
            return findKthSortedArrays(B, A, k);
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
        int partA = Math.min(k / 2, A.length);
        int partB = k - partA;
        if (A[partA - 1] < B[partB - 1]) {
            return findKthSortedArrays(Arrays.copyOfRange(A, partA, A.length), B, k - partA);
        } else {
            return findKthSortedArrays(A, Arrays.copyOfRange(B, partB, B.length), k - partB);
        }
    }

    public double findMedianSortedArrays(int A[], int B[]) {
        int sum = A.length + B.length;
        if (sum % 2 == 0) {
            return (findKthSortedArrays(A, B, sum / 2) +
                    findKthSortedArrays(A, B, sum / 2 + 1)) / 2.0;
        } else {
            return findKthSortedArrays(A, B, sum / 2 + 1);
        }
    }
}
