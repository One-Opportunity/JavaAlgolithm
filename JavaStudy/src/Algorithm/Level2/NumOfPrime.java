package Algorithm.Level2;

import java.util.ArrayList;

class NumOfPrime {
	int numberOfPrime(int n) {
		int cnt = 0;
		// 함수를 완성하세요.
		for (int i = 3; i < n + 1; i++) {
			for (int j = 2; j < i; j++) {
				System.out.println(i + ", " +j);
				if(i%j == 0) {
					cnt++;
					break;
				} 
			}

		}
		return (n -1) - cnt;
	}

	public static void main(String[] args) {
		NumOfPrime prime = new NumOfPrime();
		System.out.println(prime.numberOfPrime(10));
	}

}