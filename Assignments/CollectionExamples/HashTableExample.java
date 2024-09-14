package CollectionExamples;

import java.util.*;

public class HashTableExample {

	public static void main(String[] args) {
		
		Hashtable<String, String> hashtable = new Hashtable<String, String>();
		hashtable.put("1","First");
		hashtable.put("2","Second");
		hashtable.put("3","Third");
		hashtable.put("4","Fourth");
		hashtable.put("5","Fifth");
		System.out.println("Size of HashTable : "+hashtable.size());
		System.out.println("Is HashTable Empty ? Ans :-"+hashtable.isEmpty());
		System.out.println("-------------Displaying Elements--------------");
		Enumeration value = hashtable.elements();
		while(value.hasMoreElements()) {
			System.out.println(value.nextElement());
		}
	}
}
