package ThreadsInJava;

class ThreadA extends Thread{
	@Override
	public void run() {
		System.out.println("This is Thread A");
		System.out.println("I in thread A");
		for(int i=0;i<11;i++) {
			try {
				Thread.sleep(500);
				System.out.println("I Of A = "+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("Thread A Finished");

	}
}

class ThreadB extends Thread{
	@Override
	public void run() {
		System.out.println("This is Thread B");
		System.out.println("I in Thread B");
		for(int i=0;i<11;i++) {
			try {
				Thread.sleep(500);
				System.out.println("I Of B = "+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("Thread B Finished");
	}
}


public class ThreadExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadA tA =new ThreadA();
		ThreadB tB =new ThreadB();
		
		tA.start();
		
		tA.yield();
		
		try {
			tA.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		tA.yield();

		tB.start();
		
		try {
			tB.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
