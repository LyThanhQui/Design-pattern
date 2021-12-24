/*
 * Assume that we manage an Ice-cream shop. There are many types 
 * of ice cream that combine from ingredients such as orange, strawberry, 
 * coconut, milk, chocolate, cocoa and so on. This combination causes us to create 
 * hundreds of Java classes.
  
 * Decorator pattern help us solve this issue. 
 * We don't have to create too many Java classes 
 * but it is possible to create many types of ice-cream objects at runtime
 
 Steps to implementation
 1. Create an abstract class named AbstractIceCream
 2. Create a concrete IceCream class. We will create many types 
    of ice-cream objects from this class 
 3. Create an IceCreamDecorator. This is an abstract class that 
    provide a flexible alternative to sub-classing for 
    extending functionality.
 4. Create a MilkIceCream class that extends IceCreamDecorator
 5. Create a ChocolateIceCream class that extends IceCreamDecorator
 6. Create a CoconutIceCream class that extends IceCreamDecorator
 7. Combination of 4 classes: 
    IceCream, MilkIceCream, ChocolateIceCream, CoconutIceCream
    We can create many type of ice-creams such as
     IceCreamWithMilk,IceCreamWithChocolate,IceCreamWithChocolateAndCoconut,
     IceCreamWithCoconut, IceCreamWithMilkAndCoconut, 
     IceCreamWithMilkAndChocolate, .....
--->We only need 4 classes to create so many types of ice-cream objects     
 */

package structural.decorator4;

public class Demo {

	public static void main(String[] args) {
		AbstractIceCream icream = new IceCream();
		icream = new CoconutIceCream(icream);
		System.out.println(icream.price());
		System.out.println(icream);
		/*		
		icream = new MilkIceCream(icream);
		icream = new ChocolateIceCream(icream);
		icream = new CoconutIceCream(icream);
		System.out.println(icream.price());
		System.out.println(icream);*/
		

	}

}
