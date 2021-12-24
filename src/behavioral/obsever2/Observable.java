package behavioral.obsever2;

public interface Observable {
	public void attach(Observer o);
    public void detach(Observer o);
    public void notifyUpdate(String msg);	
}
