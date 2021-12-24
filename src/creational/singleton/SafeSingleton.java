package creational.singleton;

public class SafeSingleton {
	private static SafeSingleton instance =null;
	private SafeSingleton() {
		
	}
	public int data;
    public static SafeSingleton getInstance() {
        if (instance == null) {
            synchronized (SafeSingleton .class) {
                if (instance == null) {
                    instance = new SafeSingleton();
                }
            }
        }
        return instance;
    }
	
}
