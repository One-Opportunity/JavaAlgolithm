package Algorithm.Level1;

public class EvenOrOdd {
    String evenOrOdd(int num) {
        String result = "";
      	if (num % 2 == 0) {
        	return "Even";	
        } else {
        	return "Odd";
        }
        
    }

    public static void main(String[] args) {
        String str = "1 2 3 4";
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        //�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
        System.out.println("��� : " + evenOrOdd.evenOrOdd(3));
        System.out.println("��� : " + evenOrOdd.evenOrOdd(2));
    }
}