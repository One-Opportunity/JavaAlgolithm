package Study.Chapter7;

public class Tire {
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	public String company;
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
//	public Tire(String location, int maxRotation, String company) {
//		this.location = location;
//		this.maxRotation = maxRotation;
//		this.company = company;
//	}
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire ���� : " + (maxRotation - accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + " Tire ��ũ *** ");
			return false;
		}
	}
}
