package CollectionExamples;

import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArrayListExample {
	
	private int id;
	private String name,city;

	

	public ArrayListExample(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	@Override
	public String toString() {
		return "ArrayListExample Id : " + id + ", Name : " + name + ", City : " + city;
	}


	public static void method1() {
		ArrayList a1 = new ArrayList();
		
		a1.add("Omkar");
		a1.add('a');
		a1.add(124);
		a1.add(3.14);
		
		System.out.println("First :"+a1.getFirst());
		System.out.println("Last : "+a1.getLast());
		System.out.println("Size : "+a1.size());
		System.out.println("Removing Last : "+a1.removeLast());
		System.out.println("Size : "+a1.size());
		a1.addFirst("Mr. ");
		System.out.println("Adding and Getting First : "+a1.getFirst());
		System.out.println("Contains : "+a1.contains("Omkar"));
		System.out.println(a1);
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		System.out.println("Printing using For-Each Loop");
		for(Object o:a1) {
			System.out.println(o);
		}
	}
	
	public static void method2() {
		ArrayList<String> a2 = new ArrayList<String>();
		
		a2.add("Omkar");
		a2.add("Mayur");
		a2.add("Arjun");
		a2.add("Farhann");
		
		
		System.out.println("First :"+a2.getFirst());
		System.out.println("Last : "+a2.getLast());
		System.out.println("Size : "+a2.size());
		System.out.println("Removing Last : "+a2.removeLast());
		System.out.println("Size : "+a2.size());
		a2.addFirst("Mr. ");
		System.out.println("Adding and Getting First : "+a2.getFirst());
		System.out.println("Contains : "+a2.contains("Joker"));
		System.out.println(a2);
		
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		System.out.println("Printing using Iterator");
		Iterator i = a2.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		System.out.println("Printing using ListIterator");
		ListIterator li = a2.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		System.out.println("Printing using ListIterator (Reverse)");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}
	
	public static void method3(ArrayListExample ex) {
		ArrayList<ArrayListExample> a3 = new ArrayList<ArrayListExample>();
		a3.add(ex);
		System.out.println(a3);

	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		System.out.println("Generic Collection Example");
		method2();
		System.out.println("---------------------------");
		
		System.out.println("No-Generic Collection Example");
		method1();
		System.out.println("---------------------------");

		System.out.println("Adding object in ArrayList");
		
		ArrayListExample ex1 = new ArrayListExample(201,"Omkar","Nashik");
		ArrayListExample ex2 = new ArrayListExample(202,"Mayur","Pune");
		ArrayListExample ex3 = new ArrayListExample(203,"Arjun","Lahore");
		method3(ex1);
		method3(ex2);
		method3(ex3);
	}
}
