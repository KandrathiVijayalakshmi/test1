package collection_samp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class sort_ex {
public static void main(String[] args) {

	
	List<String> fruits=new ArrayList<String>();
	fruits.add("mango");
	fruits.add("apple");
	fruits.add("panasa");
	System.out.println("unsorted list " + fruits);	
	
	//printing after sorting
	Collections.sort(fruits);
	System.out.println("after sorting " + fruits);
	
	//sorting in descending order
	Collections.sort(fruits, Collections.reverseOrder());
	System.out.println("printing in reverse order" + fruits );
	


}
}
