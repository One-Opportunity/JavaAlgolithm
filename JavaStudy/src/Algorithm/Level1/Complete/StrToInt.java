package Algorithm.Level1.Complete;

//��Ʈ�������ڷ�
public class StrToInt {
    public int getStrToInt(String str) {
//    	if(Integer.valueOf(str) < 0)
    	
        return Integer.valueOf(str);
    }
    //�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void main(String args[]) {
        StrToInt strToInt = new StrToInt();
        System.out.println(strToInt.getStrToInt("-1234"));
    }
}
