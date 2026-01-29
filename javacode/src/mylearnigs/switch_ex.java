package mylearnigs;

public class switch_ex {
	public static void main(String[] args) {
		int age;
		age=20; 
		/* if we use if then it is structur if(age==21) {
			System.out.println("u can marry now");
		};
			if(age==60) {
				System.out.println("u can retire now");
		}*/
	switch(age) {
	case 18:
		System.out.println("u r major now");
		break;
	case 21:
		System.out.println("u can marry now");
		break;
	case 60:
		System.out.println("u can retire now");
		break;
		default:
			System.out.println("you r not in this critiria");
			 /* if the given age is not matches
 to any case then it goes to default case*/
}
	}
}