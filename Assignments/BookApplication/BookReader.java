package BookApplication;

class BookReader implements Runnable{
	
	Book book;
	 
	public BookReader(Book book) {
		this.book = book;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(book) {
			System.out.println("Reading the book....."+Thread.currentThread().getName());
			try {
				book.wait();
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Book Reading over......"+Thread.currentThread().getName());
		}
	}
}