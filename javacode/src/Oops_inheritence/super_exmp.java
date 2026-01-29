package Oops_inheritence;
 class school {

	  int year =1990;
  public school(int year) {
	this.year=year;
}
public void displaydetails() {
	System.out.println("year:" +year);
}
	
}
//child class
class rooms extends school{
	
	   int numberofrooms;
	public rooms(int year,int numberofrooms) {
		super(year);
		//calling parent class
		this.numberofrooms=numberofrooms;
		
	}
	public void displaydetails() {
		super.displaydetails();//calling parent class method
		System.out.println("number of rooms:" +numberofrooms);
	}

public class super_exmp{
public static void  main (String[] args) {
	rooms obj=new rooms("1990,12");
	obj.displaydetails();
}
}
}
	
	

	
	 
		
