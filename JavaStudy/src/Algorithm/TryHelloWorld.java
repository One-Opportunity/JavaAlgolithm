package Algorithm;

import java.util.Arrays;

//최대공약수, 최소공배수 
class TryHelloWorld {
    public int[] gcdlcm(int a, int b) {
        int[] answer = new int[2];
        String str = "";
        int big = a > b ? a : b;
        for (int i = 1; i < big + 1; i++) {
			if(a%i == 0 && b%i == 0) {
				answer[0] = i;
				
			}
		}
        
        while(true) {
        	if(big%a == 0 && big%b == 0) {
        		answer[1] = big;
        		break;
        	}else {
        		big++;	
        	}
        	
        }
        return answer;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        TryHelloWorld c = new TryHelloWorld();
        System.out.println(Arrays.toString(c.gcdlcm(3, 12)));

    }
}
