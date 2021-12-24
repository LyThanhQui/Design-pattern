package creational.abstractfactorybeermilk;

public class demo {
    static AbstractFactory setup() {
    	return FactoryMaker.getFactory("VN");
    }
	public static void main(String[] args) {
		AbstractFactory factory = setup();
		Beer b = factory.createBeer(BeerType.Black);
		b.info();
		
		Milk m = factory.createMilk(MilkType.Orange);
		m.info();
	}

}
