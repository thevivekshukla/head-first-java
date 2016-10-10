public class VetTest
{
	public static void main(String[] args)
	{
		Vet v = new Vet();
		Dog d = new Dog();
		Cat c = new Cat();

		v.giveShot(d);
		v.giveShot(c);
	}
}