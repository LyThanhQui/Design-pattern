package creational.singleton;

public class SafeSingletonDemo {

	private void gg() {
		SafeSingleton y =SafeSingleton.getInstance();
	}
	public static void main(String[] args) {
		
		SafeSingleton x = SafeSingleton.getInstance();
		x.data = 115;
		
		SafeSingleton y = SafeSingleton.getInstance();
		//System.out.print(y.data);
		y.data = 34;
		System.out.println(x);
		System.out.println(y);
	}

}
