package Algorithm.Level1;

public class PrintTriangle {
	public String printTriangle(int num){
		String s = "";
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i+1; j++) {
				s +="*";
			}
			s += "\n";

		}
		return s;
		
	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		PrintTriangle pt = new PrintTriangle();
		System.out.println( pt.printTriangle(3) );
	}
}