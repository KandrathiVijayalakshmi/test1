package mylearnigs;
import java.util.*;
public class while_user_input {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int x=0;
		System.out.println("enter user input");
		int y=input.nextInt();
		
		while(x<y) {
			x++;
			System.out.println(x +" iam a TCSer ");
		}
	}

}
