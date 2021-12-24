package creational.abstractfactory;

public class WestCoastDistributor implements IDistributor {

	@Override
	public void ShipBook() {
		System.out.println("Book shipped by West Coast Distributor");
	}

}
