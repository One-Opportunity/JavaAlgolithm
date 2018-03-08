package Algorithm.Level2;

import java.util.Arrays;

public class ReverseInt {
	public int reverseInt(int n){
		int[] arr = new int[String.valueOf(n).length()];
		String[] numSplit = String.valueOf(n).split("");
		int tmp = 0;
		String result = "";
		for (int i = 0; i < numSplit.length; i++) {
			arr[i] = Integer.valueOf(numSplit[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
			result += String.valueOf(arr[i]);
		}
		
		return Integer.valueOf(result);
	}
  
	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void  main(String[] args){
		ReverseInt ri = new ReverseInt();
		System.out.println(ri.reverseInt(118372));
	}
}