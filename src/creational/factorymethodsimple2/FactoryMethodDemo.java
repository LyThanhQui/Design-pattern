package creational.factorymethodsimple2;

public class FactoryMethodDemo {

	public static void main(String[] args) {
		System.out.println("East Coast Customer:");
        BookStore bookstore = new BookStore(CustomerLocation.EastCoast);
        ShipBook(bookstore);

        System.out.println("Mid West Customer:");
        bookstore = new BookStore(CustomerLocation.MidWest);
        ShipBook(bookstore);

        System.out.println("West Coast Customer:");
        bookstore = new BookStore(CustomerLocation.WestCoast);
        ShipBook(bookstore);
    }

    private static void ShipBook(BookStore s)
    {
        IDistributor d = s.GetDistributor();
        d.ShipBook();
    }

}
