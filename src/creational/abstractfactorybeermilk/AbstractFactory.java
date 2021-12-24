package creational.abstractfactorybeermilk;

public abstract class AbstractFactory {
	public abstract Beer createBeer(BeerType type);
	public abstract Milk createMilk(MilkType type);
}
