package Algorithm.Level1.Complete;

//스트링을숫자로
public class StrToInt {
    public int getStrToInt(String str) {
//    	if(Integer.valueOf(str) < 0)
    	
        return Integer.valueOf(str);
    }
    //아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String args[]) {
        StrToInt strToInt = new StrToInt();
        System.out.println(strToInt.getStrToInt("-1234"));
    }
}
