class StaticInitializer
{
	final static int x;
	static {
		x = 42;
	}
}


/*
*A static initializer is a block of code that runs when a
*class is loaded, before any other code can use the class,
*so it's a great place to initialize a static final variable.
*/