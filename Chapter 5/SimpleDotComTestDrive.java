public class SimpleDotComTestDrive
{
	public static void main(String[] args)
	{
		int numOfGuesses = 0;

		GameHelper helper = new GameHelper();

		SimpleDotCom theDotCom = new SimpleDotCom();
		int randomNum = (int) (Math.random() * 5);

		int[] locations = {randomNum, randomNum+1, randomNum+2};
		theDotCom.setLocationCells(locations);
		boolean isAlive = true;

		while (isAlive == true)
		{
			String guess = helper.getUserInput("enter a number");
			String result = theDotCom.checkYourself(guess);
			numOfGuesses++;

			if (result.equals("kill"))
			{
				isAlive = false;
				System.out.println("You took "+ numOfGuesses +" guesses");
			}
		}

	}//close main
}//close class


class SimpleDotCom
{
	int[] locationCells;
	int numOfHits = 0;

	public void setLocationCells(int[] locs)
	{
		locationCells = locs;
	}

	public String checkYourself(String stringGuess)
	{
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		for (int cell : locationCells)
		{
			if (guess == cell)
			{
				result = "hit";
				numOfHits++;
				break;
			}
		}

		if (numOfHits == locationCells.length)
		{
			result = "kill";
		}

		System.out.println(result);
		return result;
	}
	
}