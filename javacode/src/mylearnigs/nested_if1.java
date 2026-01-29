package mylearnigs;

public class nested_if1 {
	public static void main(String[] args) {
		int telugu=60, hindi=18;
		if(telugu>35) {
			if(hindi>=18) {
				System.out.println("pass");
				
			}else {
				System.out.println("fail in hindi");
			}
			}else {
				System.out.println("fail");
			}
		}
	}


