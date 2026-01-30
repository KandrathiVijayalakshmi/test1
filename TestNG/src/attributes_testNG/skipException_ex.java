package attributes_testNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class skipException_ex {
	boolean flag = true;
	@Test
	public void f() {
		if(flag)
			throw new SkipException("custem error: ") ;
			System.out.println("hello");
		}
	}

