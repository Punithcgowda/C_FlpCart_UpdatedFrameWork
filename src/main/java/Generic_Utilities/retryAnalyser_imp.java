package Generic_Utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public  class retryAnalyser_imp implements IRetryAnalyzer 
{
	int count=1;
	int iteration =4;

	public boolean retry(ITestResult result) 
	{
		if(count <iteration)
		{
			count++;
			return true;
		}
		return false;
	}

}
