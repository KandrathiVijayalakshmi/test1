package attributes_testNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class  mylistener implements ITestListener {
 
  public void onTestFailure(ITestResult result) {
	  System.out.println("failed --error msg");
	  System.out.println(result.getName());
	  System.out.println(result.getStatus());
 }
  public void onTestSucces(ITestResult result) {
	  System.out.println("----test case pas----s");
  }
}
