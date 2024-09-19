package ThreadsInJava;

public class ThreadExample2 extends Thread{
	
	
	String uName;
	
	public ThreadExample2() {super();}
	
	public ThreadExample2(String uName) {
		super(uName);
	}

	@Override
	public void run() {
		for(int i=0;i<11;i++) {
			try {
				Thread.sleep(500);
				System.out.println("I = "+getName()+":- "+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExample2 m1 = new ThreadExample2();
		m1.start();
		System.out.println("Thread 1 Default Name :- "+m1.getName());		
		m1.setName("Chlid 1");
		System.out.println("Thread 1 Updated Name :- "+m1.getName());
		System.out.println("Thread 1 Priority:- "+m1.getPriority()); 
		m1.setPriority(2);
		System.out.println("Thread 1 Priority:- "+m1.getPriority());
		System.out.println("Thread 1 Active Count:- "+m1.activeCount());
		System.out.println("-----------------------------------");
		
		ThreadExample2 m2 = new ThreadExample2("Child 2");
		m2.start();
		System.out.println("Thread 2 Name:- "+m2.getName());
		System.out.println("Thread 2 Priority:- "+m2.getPriority());
		m2.setPriority(6);
		System.out.println("Thread 2 Priority:- "+m2.getPriority());
		System.out.println("Thread 2 Active Count:- "+m2.activeCount());
		System.out.println("-----------------------------------");
		
		for(int i=0;i<11;i++) {
			try {
				Thread.sleep(500);
				System.out.println("Main I:- "+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
