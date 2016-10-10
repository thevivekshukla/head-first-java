import java.util.ArrayList;

public class ObjectReferenceTest
{
	public static void main(String[] args)
	{
		ArrayList<Dog> myDogArrayList = new ArrayList<Dog>();
		Dog aDog = new Dog();
		myDogArrayList.add(aDog);
		Dog d = myDogArrayList.get(0);

		ArrayList<Object> myDogArrayList2 = new ArrayList<Object>();
		Dog aDog2 = new Dog();
		myDogArrayList2.add(aDog2);

		//Dog d2 = myDogArrayList2.get(0);

		/*
		*the above statement won't work bcoz, the object returned
		*is of object reference type. By using type cast we can
		*again make it of Dog type.
		*/

		Object o = myDogArrayList2.get(0);

		if (o instanceof Dog)
		{
			Dog d2 = (Dog) o;	//now it works :D
		}

	}
}