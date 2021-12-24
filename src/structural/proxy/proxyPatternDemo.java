package structural.proxy;

public class proxyPatternDemo {

	public static void main(String[] args) {
		ICar c = new Car();
		c.MoveCar();
		
		/*ICar car = new ProxyCar(new Driver(16));
        car.MoveCar();

        car = new ProxyCar(new Driver(25));
        car.MoveCar();*/
	}

}
