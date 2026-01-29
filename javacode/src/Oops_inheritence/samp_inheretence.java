package Oops_inheritence;

public class samp_inheretence {
	int salary=40000;
}
class programmer extends samp_inheretence{
	int bonus=10000;
	public static void main(String[] args) {
		programmer p=new programmer();
		System.out.println("programmer salary is :"+ p.salary);
		System.out.println("bonus of programmer is:"+p.bonus);
	}
	
}
