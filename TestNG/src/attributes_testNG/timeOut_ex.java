package attributes_testNG;

import org.testng.annotations.Test;

public class timeOut_ex {
  @Test
  public void f() {
	  System.out.println("first test");
  }
  @Test(timeOut=200)
  public void f1() throws InterruptedException{
	  Thread.sleep(500);
	  System.out.println("second test");
  }
  @Test
  public void f2() {
	  System.out.println("third test");
  }
}
