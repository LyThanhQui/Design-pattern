package structural.proxy;

class Driver
{
    private int age;

    public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Driver(int age)
    {
        this.age = age;
    }
}