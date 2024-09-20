package ThreadsInJava;

class numbers{
	synchronized
	void display(int i){
		System.out.print(i);
	}
}

class EvenThread extends Thread{
	numbers n = new numbers();
	public void run() {
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println("\nEven :- ");
				n.display(i);
			}
		}
	}
}

class OddThread extends Thread{
	
	numbers n = new numbers();
	public void run() {
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				System.out.println("\nOdd :- ");
				n.display(i);
			}
		}
	}
}

public class MultiThreadingExample {
	
	static void synchronised(Thread t1,Thread t2) {
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new EvenThread();
		Thread t2 = new OddThread();
		t1.start();
		t2.start();
	}
}
