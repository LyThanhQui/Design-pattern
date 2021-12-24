package structural.composite;

public class Demo {

	public static void main(String[] args) {
		Employee dev1 = new Developer("Tom", "java developer");
		Employee dev2 = new Developer("Jolie", ".NET developer");
		
		Manager m1 = new Manager("Nick", "Dev manager");
		m1.addEmployee(dev1);
		m1.addEmployee(dev2);
		
		Director d1 = new Director("Mary", "Dev director");
		d1.addEmployee(dev1);
		d1.addEmployee(m1);
		d1.showInfo();
	}

}
