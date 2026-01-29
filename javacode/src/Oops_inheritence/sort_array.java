package Oops_inheritence;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class sort_array {
public static void main(String[] args) {
	List<String> names=new ArrayList<String>();
	names.add("krishna");
	names.add("shiva");
	names.add("govindha");
	names.add("durga ma");
	System.out.println("print unsorted list :" +names);
	
	Collections.sort(names);
	System.out.println("sorted list :" + names);
	
	Collections.sort(names,Collections.reverseOrder());
	System.out.println("reverse order list :" +names);
}

}
