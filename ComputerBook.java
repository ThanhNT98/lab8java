package review.interfacee;

import java.util.Comparator;

public class ComputerBook extends Book{
	String Author;
	String PublisherName;
	
	
	public ComputerBook() {};
	public ComputerBook(int BookID, String BookTitle, double Price, int Quantity, String Author, String PublisherName) {
		super(BookID,BookTitle,Price,Quantity);
		this.Author = Author;
		this.PublisherName = PublisherName;
	}
	



	public String getAuthor() {
		return Author;
	}




	public void setAuthor(String author) {
		Author = author;
	}




	public String getPublisherName() {
		return PublisherName;
	}




	public void setPublisherName(String publisherName) {
		PublisherName = publisherName;
	}




	@Override

	public void PrintBook() {
		System.out.println("Book ID: "+getBookID());
		System.out.println("Book tittle: "+getBookTitle());
		System.out.println("Price: "+getPrice());
		System.out.println("Quantity: "+getQuantity());
		System.out.println("Author: "+getAuthor());
		System.out.println("Publisher name: "+getPublisherName());
		System.out.println("SubTotal: "+SubTotal());
		
	}
	public static Comparator comp =new Comparator() {
	@Override
	public int compare(Object o1, Object o2) {
		ComputerBook cptB1 = (ComputerBook) o1;
		ComputerBook cptB2 = (ComputerBook) o2;
		double a=cptB1.Price - cptB2.Price;
		if(a>0) return -1;
		if(a==0) return cptB1.BookID - cptB2.BookID;
		return 1;
	}

	
};

	
}
