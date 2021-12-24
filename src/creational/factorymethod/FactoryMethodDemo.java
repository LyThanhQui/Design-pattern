package creational.factorymethod;

public class FactoryMethodDemo {

	public static void main(String[] args) {
		System.out.println("East Coast Customer:");
        IBookStore bookstore = new BookStoreA(CustomerLocation.EastCoast);
        ShipBook(bookstore);

        System.out.println("Mid West Customer:");
        bookstore = new BookStoreA(CustomerLocation.MidWest);
        ShipBook(bookstore);

        System.out.println("West Coast Customer:");
        bookstore = new BookStoreA(CustomerLocation.WestCoast);
        ShipBook(bookstore);
    }

    private static void ShipBook(IBookStore s)
    {
        IDistributor d = s.GetDistributor();
        d.ShipBook();
    }

}
