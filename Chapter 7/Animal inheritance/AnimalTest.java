public class AnimalTest
{
	public static void main(String[] args)
	{
		Animal[] animals = new Animal[6];

		animals[0] = new Lion();
		animals[1] = new Tiger();
		animals[2] = new Cat();
		animals[3] = new Hippo();
		animals[4] = new Wolf();
		animals[5] = new Dog();

		for (int i=0; i<animals.length; i++)
		{
			animals[i].roam();
			animals[i].eat();
			animals[i].makeNoise();
			animals[i].sleep();
		}
		//animals[5].lick();
		/*
		*the above call to method won't work as it is not defined in
		*animal class and because reference variable is of type
		*animal, it would work only if the reference variable 
		*would of type Dog or method signature would be present in
		*Animal class
		*/
	}
}