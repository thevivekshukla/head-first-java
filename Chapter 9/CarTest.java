//demonstrating use of super()

abstract class Vehicle
{
	private int wheels;

	public Vehicle(int w)
	{
		setWheels(w);
	}

	private void setWheels(int w)
	{
		wheels = w;
	}

	public int getWheels()
	{
		return wheels;
	}
}


class Car extends Vehicle
{
	public Car(int w)
	{
		super(w);
	}
}


public class CarTest
{
	public static void main(String[] args)
	{
		Car c = new Car(4);
		System.out.println(c.getWheels());
	}
}