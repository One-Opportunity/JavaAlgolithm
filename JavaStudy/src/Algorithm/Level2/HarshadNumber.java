package Algorithm.Level2;

public class HarshadNumber {
	public boolean isHarshad(int num) {
		String strNum = String.valueOf(num);
		int tmp = 0;
		for (int i = 0; i < strNum.length(); i++) {
			tmp += Integer.valueOf(String.valueOf(strNum.charAt(i)));

		}
		if (num % tmp == 0) {
			return true;
		} else {
			return false;
		}
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		HarshadNumber sn = new HarshadNumber();
		System.out.println(sn.isHarshad(18));
	}
}