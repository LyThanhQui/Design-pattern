package structural.proxy;

class ProxyCar implements ICar
{
    private Driver driver;
    private ICar realCar;

    public ProxyCar(Driver driver)
    {
        this.driver = driver;
        realCar = new Car();
    }

    public void MoveCar()
    {
        if (driver.getAge() <= 16)
            System.out.println("Sorry the driver is too young to drive");
        else
            realCar.MoveCar();
    }
}
