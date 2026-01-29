package mylearnigs;
import java.util.*;

public class elseif_scanner {
public static void main(String[] args) {
	Scanner userinput=new Scanner(System.in);
	int age;
	System.out.println("enter user age : ");
	age=userinput.nextInt();
	if(age<18) 
		System.out.println("u r minor");
	else if(age >=18 && age<=40){
		System.out.println("u r young");
	}
else {
		System.out.println("u r old");
	}
}	
	
}

