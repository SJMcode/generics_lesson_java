package generics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class App {

	/**
	 * container class -> generics <i1 , i2> -done
	 * Iterator
	 * genric type in class after class name - done
	 * generic type in methord just before return type
	 * union function -> with Set library, HashSet, addAll in java with the use of generics
	 */
	public static void main(String[] args) {
		
		Container<Integer, String> container = new Container<>(100, "Safir");
		Container<Integer, String> container2 = new Container<>(101, "John");
		Container<Integer, String> container3 = new Container<>(102, "Rameez");
		
		int item1 = container.getItem1();
		String item2 = container.getItem2();
		int item3 = container2.getItem1();
		String item4 = container2.getItem2();
		int item5 = container3.getItem1();
		String item6 = container3.getItem2();
		System.out.println(item1+" "+item2+"\n"+item3+" "+item4+"\n"+item5+" "+item6);
		
		
		Set<String> myset1 = new LinkedHashSet<>();
		myset1.add(item2);
		myset1.add(item4);
		myset1.add(item6);
		myset1.add("Doha");
		Set<String> myset2 = new HashSet<>();
		
		myset2.add("India");
		myset2.add("Delhi");
		myset2.add("Europe");
		myset2.add("USA");
		myset2.add("Delhi");
		
		Set<String> result = union(myset1, myset2);
		
		Iterator<String> iter = result.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	
	public static<E> Set<E> union(Set<E> set1, Set<E> set2) {
		
		Set<E> result = new LinkedHashSet<E>(set1);
		result.addAll(set2);
		return result;
		
		
	}

}
