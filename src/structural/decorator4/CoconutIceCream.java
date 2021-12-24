package structural.decorator4;

public class CoconutIceCream extends IceCreamDecorator {

	public CoconutIceCream(AbstractIceCream iceCream) {
		super(iceCream);
	}

	@Override
	public double price() {
		return iceCream.price() + 0.4;
	}

	public String toString() {
		return iceCream.toString() + "+ Coconut ";
	}
}
