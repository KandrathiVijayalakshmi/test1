package attributes_testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class priority_ex {
  @Test(priority=2)
  public void f() {
	  System.out.println("vijju");
  }
  @Test(priority=1)
  public void f1() {
	  System.out.println("krishna");
  }
  @Test
  public void f3() {
	  System.out.println("nani");
  }
  
}
