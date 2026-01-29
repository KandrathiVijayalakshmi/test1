package Oops_inheritence;

class parent{
	 public void showparent() {
		System.out.println("parent method");
		
	}
}

class child extends parent{
	public void showchild() {
		System.out.println("child mathod");
		
	}
}
public class parentchild{
	public static void main(String[] args) {
	child c=new child();
	c.showparent();
	c.showchild();
	
}
}