package behavioral.obsever2;

public class Student implements Observer{
    String name;
    public Student(String name) {
    	this.name = name;
    }
	@Override
	public void getMessage(String msg) {
		System.out.println("Student:" + name + ":" + msg);
		
	}

}
