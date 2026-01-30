package Assert_pkg;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_ex {
  @Test
  public void f() {
	 // String exceptedmeaning="123";
	  //String actualmeaning="A=321";
  
  Assert.assertEquals("123","321");
  Assert.assertTrue(5>2,"error");
  Assert.fail("test is fail");
}
}
