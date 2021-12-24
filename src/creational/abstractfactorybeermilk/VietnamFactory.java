package creational.abstractfactorybeermilk;

public class VietnamFactory extends AbstractFactory {

	@Override
	public Beer createBeer(BeerType type) {
		Beer b = null;
		if (type == BeerType.Black)
			b = new Beer_VNBlack();
		else if (type == BeerType.Red)
			b = new Beer_VNRed();
		return b;
	}

	@Override
	public Milk createMilk(MilkType type) {
		Milk b = null;
		if (type == MilkType.Chocolate)
			b = new Milk_VNChocolate();
		else if (type == MilkType.Orange)
			b = new Milk_VNOrange();
		return b;
	}
}
