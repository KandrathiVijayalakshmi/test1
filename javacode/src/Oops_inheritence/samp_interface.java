package Oops_inheritence;

interface  accessable{
	void access();
	default void access1() {
		System.out.println("hello");
	}
}
public class samp_interface implements accessable{
	public void access() {
		System.out.println("welcome");
	}

	public static void main(String[] args) {
		samp_interface obj=new samp_interface();
		obj.access1();
		obj.access();
	
	}
}
	

