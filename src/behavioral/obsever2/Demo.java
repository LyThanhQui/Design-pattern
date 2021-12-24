package behavioral.obsever2;
/*
 * In a class management program, teacher needs to send messages to all students
 * We can use Observer pattern to implement it.
 * 1. Create Observer interface
 * 2. Create Student class implements the Observer interface
 * 3. Create Observable interface
 * 4. Create Teacher class implements the Observable interface
 * 5. Create a demo program.
 */
public class Demo {

	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		Student student1 = new Student("John");
		Student student2 = new Student("Mary");
		teacher.attach(student1);
		teacher.attach(student2);
		teacher.attach(new Student("Tom"));
		teacher.notifyUpdate("hello");
		//teacher.detach(student2);
		//teacher.notifyUpdate("goodbye");

	}

}
