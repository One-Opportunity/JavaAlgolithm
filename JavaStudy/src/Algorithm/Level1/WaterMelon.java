package Algorithm.Level1;

public class WaterMelon {
	public String watermelon(int n){
		String s = "";
		for (int i = 1; i < n+1; i++) {
			if(i%2 == 1) {
				s += "��";
			}else {
				s += "��";
			}
		}
		return s;
	}

	// ������ ���� �׽�Ʈ�ڵ��Դϴ�.
	public static void  main(String[] args){
		WaterMelon wm = new WaterMelon();
		System.out.println("n�� 3�� ���: " + wm.watermelon(3));
		System.out.println("n�� 4�� ���: " + wm.watermelon(4));
	}
}