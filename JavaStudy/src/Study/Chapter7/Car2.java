package Study.Chapter7;

public class Car2 {
	public final static int FRONT_LEFT_TIRE = 0;
	public final static int FRONT_RIGHT_TIRE = 1;
	public final static int BACK_LEFT_TIRE = 2;
	public final static int BACK_RIGHT_TIRE = 3;
	Tire[] tires = { new Tire("�տ���", 6), new Tire("�տ�����", 2), new Tire("�ڿ���", 3), new Tire("�ڿ�����", 4)}; 
	
	
	int run() {
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		for (int i = 0; i < tires.length; i++) {
			if(tires[i].roll() == false) {
				stop();
				return i;
			}
		}
		return 9;
	}
	
	void stop() {
		System.out.println("[�ڵ����� ����ϴ�.]");
	}
}
