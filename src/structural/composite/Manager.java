package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
	List<Employee> list;
	public Manager(String name, String position) {
		super(name, position);
		list = new ArrayList<Employee>();
	}
	public void addEmployee(Employee e) {
		list.add(e);
	}
	public void removeEmployee(Employee e) {
		if (list.contains(e)) {
			list.remove(e);
		}
	}
	public void showInfo() {
		for (Employee e:list) {
			System.out.println("name:"+e.getName()+"\nposition:"+e.getPosition());
		}
	}	
}
