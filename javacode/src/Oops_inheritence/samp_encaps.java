package Oops_inheritence;

class women {
	private String name;
	public String getname(){
		return name;
	}
	public void setname(String newname) {
		this.name=newname;
		
	}
}
	public class samp_encaps{
		public static void main(String [] args) {
			women obj=new women();
			obj.setname("vijju");
			String myname = obj.getname();
			System.out.println(myname);
		}
	
	
}

