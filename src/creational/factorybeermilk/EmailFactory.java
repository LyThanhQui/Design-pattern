package creational.factorybeermilk;

public class EmailFactory {
  public static Email createEmail(EMAILTYPE type) {
	  Email email = null;
	  if (type == EMAILTYPE.HTML)
		  email = new HTMLEmail();
	  else if (type == EMAILTYPE.PLAINTEXT)
		  email = new PlainTextEmail();
	  return email;
		  
  }
}
