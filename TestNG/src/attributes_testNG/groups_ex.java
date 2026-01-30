package attributes_testNG;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class groups_ex {
  @Test(groups="run")
  public void f() {
	  System.out.println("web run case");
  }
  @Test(groups="run test case 1")
  public void f1() {
	  System.out.println("os run case 1");
  }

  @BeforeGroups("run")
  public void beforegroups(){
	  System.out.println("before groups");
	  
  }
  @AfterGroups("run")
  public void aftergroups() {
	  System.out.println("after groups");
  }
  
}
