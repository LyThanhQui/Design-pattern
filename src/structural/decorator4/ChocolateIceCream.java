package structural.decorator4;

public class ChocolateIceCream extends IceCreamDecorator {

	public ChocolateIceCream(AbstractIceCream iceCream) {
		super(iceCream);
	}

	@Override
	public double price() {
		return iceCream.price() + 0.3;
	}

	public String toString() {
		return iceCream.toString() + "+ Chocolate ";
	}
}
