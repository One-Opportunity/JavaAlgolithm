package Algorithm.Level1;

import java.util.Arrays;

public class Divisible {
	public int[] divisible(int[] array, int divisor) {
		//ret�� array�� ���Ե� ������, divisor�� ������ �������� ���ڸ� ������� ��������.
    int x = 0;
    int y = 0;
    for (int i = 0; i < array.length; i++) {
        if (array[i] % divisor == 0) {
          x++;
        }
      }
    
    int[] ret = new int[x];
    for (int i = 0; i < array.length; i++) {
      if (array[i] % divisor == 0) {
      	ret[y] = array[i];
        y++;
      }
    }
    
		return ret;
	}
	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		Divisible div = new Divisible();
		int[] array = {5, 9, 7, 10};
		System.out.println( Arrays.toString( div.divisible(array, 5) ));
	}
}