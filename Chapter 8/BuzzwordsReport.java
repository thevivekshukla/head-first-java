abstract class Report
{
	void runReport()
	{
		System.out.println("run report");
	}

	void printReport() {}
}



class BuzzwordsReport extends Report
{
	void runReport()
	{
		super.runReport();
		System.out.println("cont...");
	}
}