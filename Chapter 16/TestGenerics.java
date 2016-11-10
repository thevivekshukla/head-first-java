import java.util.*;

public class TestGenerics
{
	public static void main(String[] args)
	{
		new TestGenerics().go();
	}

	public void go()
	{
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog());
		animals.add(new Cat());
		animals.add(new Dog());
		takeAnimals(animals);

		ArrayList<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog());
		dogs.add(new Dog());
		takeAnimals(dogs);
	}

	// public void takeAnimals(ArrayList<? extends Animal> animals)
	// {
	// 	for (Animal a : animals)
	// 		a.eat();
	// }

	// OR
	public <T extends Animal> void takeAnimals(ArrayList<T> animals)
	{
		for (Animal a : animals)
			a.eat();
	}
}


class Animal
{
	public void eat()
	{
		System.out.println("eating........");
	}
}


class Dog extends Animal
{

}


class Cat extends Animal
{

}