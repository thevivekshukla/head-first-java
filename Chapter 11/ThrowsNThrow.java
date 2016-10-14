//not compilable, just for understanding what throws and throw does


//this method tells the world (by declaring) that it throws a BadException
public void takeRisk() throws BadException
{
	if (abandonAllHope)
	{
		//create new exception object and throw it
		throw new BadException();
	}
}



public void crossFingers()
{
	try
	{
		anObject.takeRisk();
	}
	catch(BadException ex)
	{
		System.out.println("Aargh");
		ex.printStackTrace();
		/*
		if you can't recover from the exception, at least get a stack
		trace using the printStackTrace() method that all exception
		inherit
		*/
	}
}