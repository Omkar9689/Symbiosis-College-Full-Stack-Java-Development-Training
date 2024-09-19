package ThreadsInJava;

public class ThreadAliveExample extends Thread {
	
	@Override
	public void run() {
		display();
		try {
			for(int i=0;i<11;i++) {
				
					Thread.sleep(500);
					System.out.println("Value : - "+i);
			}
		}
		 catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Thread Interrupted");
		}
		System.out.println("Thread Execution Ended");
		
	}
	void display() {
		System.out.println("Inside Display");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new ThreadAliveExample();
		t1.start();
		System.out.println("Thread Name :- "+t1.getName());
		System.out.println("Is alive :-  "+t1.isAlive());
		
	}
}
