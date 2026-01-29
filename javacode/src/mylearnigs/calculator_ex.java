package mylearnigs;
import java.util.Scanner;

public class calculator_ex {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		double x ,y,z;
		System.out.println("enter number");
		x=obj.nextDouble();
		y=obj.nextDouble();
		z = x+y;
		System.out.println("additon =" +z);
		// we can give ("addition of x,y= "+z)
		z=x-y;
		System.out.println(z);//we can do more calsulation same as this way
		
	}

}
