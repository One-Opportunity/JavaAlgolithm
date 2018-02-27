package Algorithm.Level2;

import java.util.Arrays;

class TryHelloWorld {
	public int getMinSum(int[] A, int[] B) {
		int tmpA = 0;
		int tmpB = 0;
		int sum = 0;

		for (int i = 0; i < A.length; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if (A[i] > A[j]) {
					tmpA = A[j];
					A[j] = A[i];
					A[i] = tmpA;
				} else {
					tmpA = A[i];
				}
				if (B[i] > B[j]) {
					tmpB = B[i];

				} else {
					tmpB = B[j];
					B[j] = B[i];
					B[i] = tmpB;
				}
			}
		}
		
		for (int i = 0; i < A.length; i++) {
			sum += A[i] * B[i];
		}

		return sum;
	}

	public static void main(String[] args) {
		TryHelloWorld test = new TryHelloWorld();
		int[] A = { 1, 2 };
		int[] B = { 3, 4 };
		System.out.println(test.getMinSum(A, B));
	}
}