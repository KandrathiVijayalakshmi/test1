package javacode;

public class instancevariable {
	String v="vijju";
	int a=80,b=100;
	public void m1() {
		System.out.println("name :" +v);
		System.out.println("marks :" +a);
	}
	public void m2() {
		System.out.println("name :" +v);
		System.out.println("marks :" +b);
		
	}
 public static void main(String args[]) {
	 instancevariable obj=new instancevariable();
	 obj.m1();
	 obj.m2();
	 }
}
