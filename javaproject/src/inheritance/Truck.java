package inheritance;

public class Truck implements Vehicle{

	@Override
	public void run() {
		System.out.println("트럭이 달립니다.");
	}
	void load() {
		System.out.println("물건을 적재합니다.");
	}
}
