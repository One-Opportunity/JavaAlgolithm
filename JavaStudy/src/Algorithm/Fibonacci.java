package Algorithm;

import java.util.ArrayList;

// �Ǻ���ġ ���� F(0) = 0, F(1) = 1�� ��, 2 �̻��� n�� ���Ͽ� F(n) = F(n-1) + F(n-2) �� ����Ǵ� ��ȭ���Դϴ�.
// 2 �̻��� n�� �ԷµǾ��� ��, fibonacci �Լ��� �����Ͽ� n��° �Ǻ���ġ ���� ��ȯ�� �ּ���. 
// ���� ��� n = 3�̶�� 2�� ��ȯ���ָ� �˴ϴ�.

class Fibonacci {
	public long fibonacci(int num) {
		if(num == 1 ) {
			return 1;
		} else if (num == 2) {
			return 1;
		} else 
			return fibonacci(num-1) + fibonacci(num-2);
	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		Fibonacci c = new Fibonacci();
		int testCase = 1;
		System.out.println(c.fibonacci(testCase));
	}
}
