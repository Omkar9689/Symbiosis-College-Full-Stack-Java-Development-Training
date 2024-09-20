package BookApplication;

public class BookDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b1=new Book("My Book on Java");
		BookReader readerA= new BookReader(b1);
		BookReader readerB = new BookReader(b1);
		
		Thread threadA = new  Thread(readerA,"Omkar");
		Thread threadB = new  Thread(readerB,"Mayur");
		
		threadA.start();
		threadB.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BookWrite writerA = new BookWrite(b1);
		//BookWrite writerB =  new BookWrite(b1);
				
		Thread threadA1 = new  Thread(writerA,"Apurva");
		//Thread threadB1 = new  Thread(writerB,"Trupti");
				
		threadA1.start();
		//threadB1.start();


	}

}
