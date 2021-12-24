package structural.decorator4;

public class MilkIceCream extends IceCreamDecorator {

	public MilkIceCream(AbstractIceCream iceCream) {
		super(iceCream);
	}

	@Override
	public double price() {
		return iceCream.price() + 0.2;
	}

	public String toString() {
		return iceCream.toString() + "+ Milk ";
	}
}
