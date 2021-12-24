package structural.composite;

public class Employee {
	private String name;
	private String position;
	public Employee(String name, String position) {
		this.setName(name);
		this.setPosition(position);
	}
	public void showInfo() {
		System.out.println("name:"+getName()+"\nposition:"+getPosition());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
}
