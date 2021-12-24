package behavioral.obsever2;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements Observable{
	List<Observer> observers = new ArrayList<Observer>();
	@Override
	public void attach(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void detach(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyUpdate(String msg) {
		for (Observer o: observers) {
			o.getMessage(msg);
		}
		
	}

}
