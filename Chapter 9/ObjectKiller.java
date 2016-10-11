//3 ways to kill a object or make it eligible for garbage collection

class Bike
{
	int speed;
}


//first, when reference variable to out of scope

class StackRef
{
	public void foof()
	{
		barf();
	}

	public void barf()
	{
		Bike b = new Bike();
	}
}



//second, when reference is assigned to new object

class ReRef
{
	Bike b = new Bike();

	public void go()
	{
		b = new Bike();
	}
}



//third, when reference is set to null

class RefNull
{
	Bike b = new Bike();

	public void go()
	{
		b = null;
	}
}