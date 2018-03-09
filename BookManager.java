package review.interfacee;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Collections;



public class BookManager implements IBookCommand {
	static ArrayList<ComputerBook> list=new ArrayList<ComputerBook>();
	int[] array=new int[20];
	
	@Override
	public void addBook(Book newBook) {
		if(list.size()==20) {
		System.out.println("List is full!");	
		}
		else {
			 int BookID;
			 String BookTitle;
			 double Price;
			 int Quantity;
			 String Author;
			 String PublisherName;
				
			Scanner sc=new Scanner(System.in);
// 			int i;
//			do {
			System.out.println("Enter book's ID:");
				BookID=Integer.parseInt(sc.nextLine());
//			for(i=0;i<list.size();i++) {
//					if(list.get(i).BookID == BookID) {
//						System.out.println("The book's ID existed!");
//				}
//				}
//			}	
//			while(list.get(i).BookID == BookID);
			System.out.println("Enter the book's tittle:");
			BookTitle=sc.nextLine();
			System.out.println("Enter the book's price:");
			Price=Double.parseDouble(sc.nextLine());
			System.out.println("Enter the book's quantity:");
			Quantity=Integer.parseInt(sc.nextLine());
			System.out.println("Enter the book's author:");
			Author=sc.nextLine();
			System.out.println("Enter the book's publisher:");
			PublisherName=sc.nextLine();
			ComputerBook cptBook=new ComputerBook(BookID, BookTitle, Price, Quantity, Author, PublisherName);
    		list.add(cptBook);
			System.out.println("New book has been added!");
			for(int i=0;i<list.size();i++) {
				list.get(i).PrintBook();
			}
			
			
		}
		
		
	}

	

	@Override
	public Book findBookByID(int bookID) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i).BookID == bookID) {
				return list.get(i);
			}
		}
		return null;
	}

	@Override
	public void updateBook(Book newBook) {
		
//		if(array==0) {System.out.println("Empty list!");
//		return;
//		}
		int code;
		int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the code of updated book: ");
		code=Integer.parseInt(sc.nextLine());
		for(int i=0;i<list.size();i++) {
			if(list.get(i).BookID == code) {
				String nBookTitle;
				 double nPrice;
				 int nQuantity;
				 String nAuthor;
				 String nPublisherName;
				 
				 System.out.println("Enter book's tittle: ");
				 nBookTitle=sc.nextLine();
				 System.out.println("Enter book's price: ");
				 nPrice=Double.parseDouble(sc.nextLine());
				 System.out.println("Enter book's quantity: ");
				 nQuantity=Integer.parseInt(sc.nextLine());
				 System.out.println("Enter book's author: ");
				 nAuthor=sc.nextLine();
				 System.out.println("Enter book's publisher: ");
				 nPublisherName=sc.nextLine();
				 list.get(i).setBookTitle(nBookTitle);
				 list.get(i).setPrice(nPrice);
				 list.get(i).setQuantity(nQuantity);
				 list.get(i).setAuthor(nAuthor);
				 list.get(i).setPublisherName(nPublisherName);
				 System.out.println("The book "+code+" was updated!");
				 list.get(i).PrintBook();
				 flag++;
		
				
			}
		}
		if(flag==0) {
			System.out.println("The book's ID hasn't existed!");
			

			
		}
		
		
		}
		
	public static void sortCompare()
	{
		Collections.sort(list, new ComputerBook().comp);
		System.out.println("desc price and then asc ID book");
		for(ComputerBook book: list) {
			book.PrintBook();
		}
	}
	}

//	public static Comparator comp=new Comparator() {
//		@Override
//		public int compare(Object o1, Object o2) {
//			ComputerBook cptB1 = (ComputerBook) o1;
//			ComputerBook cptB2 = (ComputerBook) o2;
//			double a=cptB1.Price - cptB2.Price;
//			if(a>0) return -1;
//			if(a==0) return cptB1.BookID.compareTo(cptB1.BookID);
//			return 1;
//		}
//
//		
//	};
	

