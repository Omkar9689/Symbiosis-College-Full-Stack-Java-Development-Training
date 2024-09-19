package ThreadsInJava;

public class ThreadExample1 extends Thread {
	

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		
		
		  Thread t =new Thread(); 
		  System.out.println("Method 1 System Defined Name:- "+t.getName());
		  t.setName("My Thread 1");
		  System.out.println("Method 1 Updated Name :- "+t.getName());
		  System.out.println("Method 1 Priority:- "+t.getPriority()); t.setPriority(2);
		  System.out.println("Method 1 Priority:- "+t.getPriority());
		  System.out.println("Method 1 Active Count:- "+t.activeCount());
		  
		  System.out.println("-------------------------------------------");
		  
		  Thread t2 =new Thread(); 
		  System.out.println("Method 2 System Defined Name:- "+t2.getName());
		  t2.setName("My Thread 2");
		  System.out.println("Method 2 Updated Name :- "+t2.getName());
		  System.out.println("Method 2 Priority:- "+t2.getPriority());
		  t2.setPriority(7);
		  System.out.println("Method 2 Priority:- "+t2.getPriority());
		  System.out.println("Method 2 Active Count:- "+t2.activeCount());
		 
		
	}

}
