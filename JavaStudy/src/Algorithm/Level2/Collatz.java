package Algorithm.Level2;

class Collatz {
	public int collatz(int num) {
		int cnt = 0;
		while (cnt<500) {
			cnt++;
			if (num % 2 == 0) {
				num = num / 2;
				if (num == 1) {
					return cnt;
				}
			} else {
				num = (num * 3) + 1;
			}
		}
		return -1;
	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		Collatz c = new Collatz();
		int ex = 6;
		System.out.println(c.collatz(ex));
	}
}