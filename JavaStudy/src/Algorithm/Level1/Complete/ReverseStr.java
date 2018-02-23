package Algorithm.Level1.Complete;

import java.util.Arrays;

public class ReverseStr {
	public String reverseStr(String str) {
		char[] c = str.toCharArray();
		char tmp;
		for (int i = 0; i < c.length; i++) {
			for (int j = i; j < c.length; j++) {

				if (c[i] < c[j]) {
					tmp = c[i];
					c[i] = c[j];
					c[j] = tmp;
				}
			}
		}

		return String.valueOf(c);
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		ReverseStr rs = new ReverseStr();
		System.out.println(rs.reverseStr("Zbcdefg"));
	}
}