package creational.factorymethodsimple2;

public class BookStore{
	private CustomerLocation location;

    public BookStore(CustomerLocation location)
    {
        this.location = location;
    }

	public IDistributor GetDistributor()
    {
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
