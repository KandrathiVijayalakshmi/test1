package javacode;

public class Samp_recursion {
	public int factorial(int n) {
		if(n<=1) {
			return 1;
			
		}
		return n* factorial(n-1);
	}
	public static void main(String[] args) {
		int num= 3;
		Samp_recursion obj= new Samp_recursion();
		System.out.println("factorial of "+ num +"is: "+ obj.factorial(num));
		
		
	}

}
