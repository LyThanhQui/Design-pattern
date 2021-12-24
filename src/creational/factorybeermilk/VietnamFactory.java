package creational.factorybeermilk;

public class VietnamFactory {

	public Beer createBeer(BeerType type) {
		Beer b = null;
		if (type == BeerType.Black)
			b = new Beer_VNBlack();
		else if (type == BeerType.Red)
			b = new Beer_VNRed();
		return b;
	}

	public Milk createMilk(MilkType type) {
		Milk b = null;
		if (type == MilkType.Chocolate)
			b = new Milk_VNChocolate();
		else if (type == MilkType.Orange)
			b = new Milk_VNOrange();
		return b;
	}
}
