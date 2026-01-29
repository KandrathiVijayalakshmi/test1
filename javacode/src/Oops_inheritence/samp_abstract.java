package Oops_inheritence;

 abstract class bank{
	 public abstract void myjob();
}
 class accountent extends bank {
	 public void myjob() {
		 System.out.println("my job is accountent.");
		 
	 }
 }
	 class maneger extends bank{
		 public void myjob() {
			 System.out.println("my job is maneger.");
			 
		 
	 }
 }
	 class directer extends bank{
		 public void myjob(){
			System.out.println("my job is directer.") ;
		 }
	 }
	public class samp_abstract{
		public static void main(String[] args) {
			maneger obj=new maneger();
			obj.myjob();
			accountent obj1=new accountent();
			obj1.myjob();
			directer obj2=new directer();
			obj2.myjob();
			
			
		}
	}


 