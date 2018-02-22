package Algorithm;

import java.util.Arrays;

//최대공약수, 최소공배수 
class TryHelloWorld {
    public int[] gcdlcm(int a, int b) {
        int[] answer = new int[2];
        
        return answer;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        TryHelloWorld c = new TryHelloWorld();
        System.out.println(Arrays.toString(c.gcdlcm(3, 12))); // 3, 12
        System.out.println(Arrays.toString(c.gcdlcm(7, 27))); // 1, 189
        System.out.println(Arrays.toString(c.gcdlcm(40, 60))); // 20, 120
    }
}
