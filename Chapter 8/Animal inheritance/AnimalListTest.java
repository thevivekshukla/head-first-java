class AnimalList
{
	private Animal[] animals = new Animal[5];
	private int nextIndex = 0;

	public void add(Animal a)
	{
		if (nextIndex < animals.length)
		{
			animals[nextIndex] = a;
			System.out.println("Animal is added at "+ nextIndex);
			nextIndex++;
		}
	}
}



public class AnimalListTest
{
	public static void main(String[] args)
	{
		AnimalList list = new AnimalList();
		Dog d = new Dog();
		Cat c = new Cat();
		Wolf w = new Wolf();

		list.add(d);
		list.add(c);
		list.add(w);
	}
}