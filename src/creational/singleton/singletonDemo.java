package creational.singleton;

public class singletonDemo {

	public static void main(String[] args) {
		Robot r = Robot.INSTANCE;
		r.data = 4;
		
		Robot x = Robot.INSTANCE;
		x.data = 15;
		
		System.out.println(r.data);
		
		x.hello();
	}

}
