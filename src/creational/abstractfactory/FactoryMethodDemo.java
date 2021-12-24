package creational.abstractfactory;

public class FactoryMethodDemo {

	public static void main(String[] args) {
		System.out.println("East Coast Customer:");
        IBookStore bookstore = new BookStoreA(CustomerLocation.EastCoast);
        ShipBook(bookstore);
        Advertise(bookstore);
        
        System.out.println("\nMid West Customer:");
        bookstore = new BookStoreA(CustomerLocation.MidWest);
        ShipBook(bookstore);
        Advertise(bookstore);

        System.out.println("\nWest Coast Customer:");
        bookstore = new BookStoreA(CustomerLocation.WestCoast);
        ShipBook(bookstore);
        Advertise(bookstore);
    }

    private static void ShipBook(IBookStore s)
    {
        IDistributor d = s.GetDistributor();
        d.ShipBook();
    }
    
    private static void Advertise(IBookStore s)
    {
    	IAdvertiser a = s.GetAdvertiser();
        a.Advertise();
    }

}
