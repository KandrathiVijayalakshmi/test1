package attributes_testNG;
import org.testng.annotations.Test;

public class perameter_ex {
  @Test
  Parameters("vijju")
  public void f() {
	  System.out.println("user name");
  }
}
