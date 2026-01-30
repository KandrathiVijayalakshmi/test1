package Assert_pkg;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class soft_assert {
	@Test
	public void f() {
	SoftAssert st=new SoftAssert();
	st.assertEquals(10,20);
	st.assertTrue(5<3,"error");
	st.fail("it is fail");
	st.assertAll();
	}	
}
