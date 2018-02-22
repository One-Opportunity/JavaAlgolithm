package Study.Chapter7;

public class CarExample {
	public static void main(String[] args) {
		Car2 car = new Car2();
		
		for(int i = 1; i <= 8; i++) {
			int problenLocation = car.run();
			
			if (problenLocation == car.FRONT_LEFT_TIRE || problenLocation == car.FRONT_RIGHT_TIRE) {
				System.out.println(car.tires[problenLocation].location + "금호타이어로 교체");
				car.tires[problenLocation] = new KumhoTire(car.tires[problenLocation].location, 1888888);
				
			} else if (problenLocation == car.BACK_LEFT_TIRE || problenLocation == car.BACK_RIGHT_TIRE) {
				System.out.println(car.tires[problenLocation].location  + "한국타이어로 교체");
				car.tires[problenLocation] = new HankookTire(car.tires[problenLocation].location, 13333);
				
			}
			System.out.println("------------------------------");
		}
	}
}

