package creational.factorybeermilk;

public class EmailDemo {

	public static void main(String[] args) {
		Email email = EmailFactory.createEmail(EMAILTYPE.HTML);
		email.info();

	}

}
