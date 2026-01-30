package attributes_testNG;

import org.testng.annotations.Test;

public class description_ex {
  @Test(description="earth is round")
  public void f() {
	  System.out.println("print earth is round");
  }
}
