package Oops_inheritence;

public class overloading_ex {

public void add(int i,int j){
	System.out.println(i+j);
}
public void add(int i, float j) {
	System.out.println(i+j);
}
	public void add(float i,float j) {
		System.out.println(i+j);
	}
	public static void main(String[] args) {
		overloading_ex obj= new overloading_ex();
		obj.add(3,5);
	obj.add(2,3.5f);
	obj.add(2.4f,5.7f);
		
		
		
	}
}