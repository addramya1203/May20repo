import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class CustomListener extends TestListenerAdapter{
	//onTestFailuer,onTestSuccess,OnTestSkipped are  methods of TestListernerAdapter class
	//overide accordingly 
	public void onTestFailure(ITestResult tr) {
		System.out.println("Test Failed"+tr.getName());
	}
	
	public void onTestSuccess(ITestResult tr) {
		
      System.out.println("Test Passed"+tr.getName());
	}
	public void OnTestSkipped(ITestResult tr) {
		System.out.println("Test skipped"+tr.getName());
		
	}

}
