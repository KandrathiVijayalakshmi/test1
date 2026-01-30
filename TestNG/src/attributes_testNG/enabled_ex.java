package attributes_testNG;

import org.testng.annotations.Test;

public class enabled_ex {
  @Test(enabled=true)
  public void f() {
	  System.out.println("earth revolvs");
  }
}
