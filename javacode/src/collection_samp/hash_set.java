package collection_samp;
import java.util.HashSet;
import java.util.Iterator;
public class hash_set {
	public static void main(String[] args) {
		HashSet<String>name=new HashSet<String>();
		name.add("vijju");
		name.add("nani");
		name.add("krish");
		name.add("shiva");
		System.out.println(name);
		System.out.println(name.remove("vijju"));
		System.out.println(name.size());
		{

//traverse the elements by for loop
	for (String out : name) {
		System.out.println(out);
	}
	// traverse the elements by iterator
	Iterator<String> i1= name.iterator();
	while (i1.hasNext())
		System.out.println(i1.next());
	//lambda
	name.forEach(i -> System.out.println(i));
		}

	}
}
