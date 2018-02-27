package Algorithm.Level1;

public class GetMinMaxString {
	public String getMinMaxString(String str) {
		String[] sp = str.split(" ");
		int min = 0;
		int max = 0;
		for (int i = 0; i < sp.length; i++) {
			if (max < Integer.valueOf(sp[i])) {
				max = Integer.valueOf(sp[i]);
			}
		}
		min = max;
		for (int i = 0; i < sp.length; i++) {
			if (min > Integer.valueOf(sp[i])) {
				min = Integer.valueOf(sp[i]);
			}
		}
		return max + " " + min;
	}

	public static void main(String[] args) {
		String str = "1 2 3 4";
		GetMinMaxString minMax = new GetMinMaxString();
		// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
		System.out.println("�ִ밪�� �ּҰ���?" + minMax.getMinMaxString(str));
	}
}