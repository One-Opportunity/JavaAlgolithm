package Study.Chapter7;

public class Car2 {
	public final static int FRONT_LEFT_TIRE = 0;
	public final static int FRONT_RIGHT_TIRE = 1;
	public final static int BACK_LEFT_TIRE = 2;
	public final static int BACK_RIGHT_TIRE = 3;
	Tire[] tires = { new Tire("앞왼쪽", 6), new Tire("앞오른쪽", 2), new Tire("뒤왼쪽", 3), new Tire("뒤오른쪽", 4)}; 
	
	
	int run() {
		System.out.println("[자동차가 달립니다.]");
		for (int i = 0; i < tires.length; i++) {
			if(tires[i].roll() == false) {
				stop();
				return i;
			}
		}
		return 9;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
