package creational.abstractfactorybeermilk;

public class FactoryMaker {
  static AbstractFactory getFactory(String type ) {
	  if (type.equals("VN"))
		  return new VietnamFactory();
	  else
		  return null;
  }
}
