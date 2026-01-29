package collection_samp;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
public class hash_map {
public static void main(String[] args) {
	HashMap<Integer,String>hm= new HashMap<Integer,String>();
	hm.put(1,"sun");
	hm.put(2,"moon");
	hm.put(3,"earth");
	hm.put(4,"stars");
	System.out.println(hm.get(1));
	
	Set sn=hm.entrySet();
	Iterator it=sn.iterator();	
	
	while (it.hasNext()) {
	System.out.println(it.next());
}
	System.out.println("second traverse method");
	for (Entry< Integer,String>entry: hm.entrySet()) {
	System.out.println(entry.getKey());
	System.out.println(entry.getValue());
}
}
}
	

