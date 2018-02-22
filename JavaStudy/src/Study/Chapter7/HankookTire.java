package Study.Chapter7;

public class HankookTire extends Tire {
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	public HankookTire(String location, int maxRotation, String company) {
		super(location, maxRotation, "�ѱ�Ÿ�̾�");
	}
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire ���� : " + (maxRotation - accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire ��ũ ***");
			return false;
		}
	}
}
