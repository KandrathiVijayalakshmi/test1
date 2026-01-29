package Oops_inheritence;
interface integermath{
	int operation(int a, int b);

}
public class calculator_lambda{
	public int operateBinary(int a,int b, integermath op) {
		return op.operation(a,b);
	}
	public static void main(String[] args) {
		calculator_lambda myapp=new calculator_lambda();
		integermath addition=(a,b) -> a+b;
		integermath subtraction=(a,b) -> a-b;
		System.out.println("21+27 =" + myapp.operateBinary(21,27,addition));
		System.out.println("21-27 =" + myapp.operateBinary(21,27,subtraction));
	}
}
