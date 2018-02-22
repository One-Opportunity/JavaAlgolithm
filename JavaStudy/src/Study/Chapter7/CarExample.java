package Study.Chapter7;

public class CarExample {
	public static void main(String[] args) {
		Car2 car = new Car2();
		
		for(int i = 1; i <= 8; i++) {
			int problenLocation = car.run();
			
			if (problenLocation == 1 || problenLocation == 2) {
				System.out.println(car.tires[problenLocation-1].location + car.tires[problenLocation-1].company + "로 교체");
				car.tires[problenLocation-1] = new KumhoTire(car.tires[problenLocation-1].location, 1888888, car.tires[problenLocation-1].company);
				
			} else if (problenLocation == 3 || problenLocation == 4) {
				System.out.println(car.tires[problenLocation-1].location + car.tires[problenLocation-1].company + "로 교체");
				car.tires[problenLocation-1] = new HankookTire(car.tires[problenLocation-1].location, 13333, car.tires[problenLocation-1].company);
				
			}
			System.out.println("------------------------------");
		}
	}
}

