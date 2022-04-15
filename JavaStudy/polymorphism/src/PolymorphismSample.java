//ポリモーフィズム

public class PolymorphismSample {

	public static void main(String[] args) {
		Vehicle[] vehicles = {new Car(), new AirPlane(), new Bicycle(), new Vehicle()};
		
		for(Vehicle v : vehicles) {
			v.introduce();
		}
	}
}

class Vehicle{
	public void introduce() {
		System.out.println("これは乗り物です");
	}
}

class Car extends Vehicle{
	@Override
	public void introduce() {
		System.out.println("この乗り物は車です");
	}
}

class AirPlane extends Vehicle{
	@Override
	public void introduce() {
		System.out.println("この乗り物は飛行機です");
	}
}

class Bicycle extends Vehicle{
	@Override
	public void introduce() {
		System.out.println("この乗り物は自転車です");
	}
}
