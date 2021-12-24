package structural.decorator4;

public abstract class IceCreamDecorator extends AbstractIceCream {
    protected AbstractIceCream iceCream;
    public IceCreamDecorator(AbstractIceCream iceCream) {
    	this.iceCream = iceCream;
    }
	@Override
	public abstract double price();

}
