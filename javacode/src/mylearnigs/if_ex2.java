package mylearnigs;

public class if_ex2 {
	public static void main(String[] args) {
		int telugu,hindi;
		telugu=55;
		hindi=20;
		if(telugu > 55 || hindi > 15) {/*here || means "OR"
		means any one condition has to be true to pass*/
			System.out.println("pass");
			
		}else {
			System.out.println("fail");
		}
	}

}
