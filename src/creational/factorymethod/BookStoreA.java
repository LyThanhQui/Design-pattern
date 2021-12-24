package creational.factorymethod;

public class BookStoreA implements IBookStore {
	private CustomerLocation location;

    public BookStoreA(CustomerLocation location)
    {
        this.location = location;
    }

	@Override
	public IDistributor GetDistributor()
    {
        //internal logic on which distributor to return
        //*** logic can be changed without changing the client code  ****
        switch (location)
        {
            case EastCoast:
                return new EastCoastDistributor();
            case MidWest:
                return new MidWestDistributor();
            case WestCoast:
                return new WestCoastDistributor();
        }
        return null;
    }
}
