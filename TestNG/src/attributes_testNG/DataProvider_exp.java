package attributes_testNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProvider_exp {

  @DataProvider(name="vijju")
  public Object[][] dataProviderMethod() {
	  
    return new Object[][] {{1,"Sandy"},
      { "1. nani" },
      { "2. shiva"}
      };
    }
  
@Test(dataProvider = "vijju")
public void testMethod(String data) {
System.out.println("data is:" +data);	
	
}
}

