package collection_samp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Array_List {
public static void main(String[] args) {
 String[] s=new String[10];
		List l=new ArrayList();
		l.add("hello");
		List <Integer>l1=new ArrayList<Integer>();
		l1.add(100);
		l1.add(20);
		System.out.println(l1.get(0));
		for(int i=0;i<l1.size();i++);
		{
			System.out.println(l1.get(1));
		}
		for(Integer n :l1) {
			System.out.println(n);
			List l2=new ArrayList();
			l.add("hii");
			List <Integer>l3=new ArrayList<Integer>();
			l3.add(20);
			l3.add(30);
			System.out.println(l3.get(0));
			for(int i=0;i<l3.size();i++);
			{
				System.out.println(l3.get(3));
			}
			for(Integer m:l3) {
				System.out.println(n);
}
		}
}
}
