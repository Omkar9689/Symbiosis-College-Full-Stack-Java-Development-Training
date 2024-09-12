package CollectionExamples;

import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

class Book{
	private String bookName;

	public Book(String bookName) {
		super();
		this.bookName = bookName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return "Book Name : " + bookName;
	}
}

class Author{
	
	Book book;
	String authorName;
	
	public Author(Book book, String authorName) {
		this.book = book;
		this.authorName = authorName;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	@Override
	public String toString() {
		return book + ", Author : " + authorName;
	}	
}


public class BookRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Author aut1=new Author(new Book("Wings Of Fire"), "A.P.J. Abdul Kalam");
		Author aut2=new Author(new Book("The white tiger"), "Arvind Adiga");
		Author aut3=new Author(new Book("The inheritance of loss"), "Kiran Desai");
		Author aut4=new Author(new Book("The Hidden Hindu"), "Akshat Gupta");

		List<Author> list = new ArrayList<Author>();
		list.add(aut1);
		list.add(aut2);
		list.add(aut3);
		list.add(aut4);
		
		System.out.println("Printing List");
		ListIterator<Author> li =list.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		System.out.println("\nPrinting List(Reverse Order)");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
	}

}
