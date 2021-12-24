package creational.factorybeermilk;

public class demo {

	public static void main(String[] args) {
		VietnamFactory factory = new VietnamFactory();
		Beer b = factory.createBeer(BeerType.Red);
		b.info();
		
		Milk m = factory.createMilk(MilkType.Chocolate);
		m.info();
	}

}
