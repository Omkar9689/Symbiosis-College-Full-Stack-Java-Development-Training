package ThreadsInJava;

public class ThreadUsingRunnable implements Runnable {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<11;i++) {
			try {
				Thread.sleep(500);
				System.out.println("I :- "+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadUsingRunnable robj = new ThreadUsingRunnable();
		Thread t=new Thread(robj);
		t.start();

	}

}
