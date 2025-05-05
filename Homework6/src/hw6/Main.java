package hw6;
import java.util.*;

class Book{
	String title;
	String author;
	String isbn;
	Boolean isAvailable;
	
	public Book(String t, String a, String bn, Boolean isa){
		title = t;
		author = a;
		isbn = bn;
		isAvailable = isa;
	}

	public String GetTitle(){
		return title;
	}

	public String GetAuthor(){
		return author;
	}

	public String Getisbn(){
		return isbn;
	}

	public Boolean GetAvailable(){
		return isAvailable;
	}

	public  void SetAvailable(Boolean Avl){
		isAvailable = Avl;
	}	
}

class Library {
	ArrayList<Book> book;

	/*
	public void addBook(Book book){
		book.add(book);
	}

	public void removeBook(String isbn){
		book.remove(isbn);
	}

	public displayAllBooks(){
	
	}

	public String SearchByTitle(String title){
		return book.
	}

	public String searchByAuthor(String author){
		return 
	}

	public String checkOutBook(String isbn){

	}

	public String returnBook(String isbn){

	}*/

}


public class Main {

	public static void main(String[] args) {
				
		/* Add your Menu Here
		 * 1. Add Book
		   2. Remove Book
		   3. Display All Books
		   4. Search by Title
		   5. Search by Author
		   6. Check Out Book
		   7. Return Book
		   8. Exit

		 */
		int menu = 0;
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("please pick a choice from this list:\n1. to add a book\n2. to remove a book");
			System.out.println("3. to display all books\n4. to search by title\n 5. to search by author");
			System.out.println("6. to check out a book\n7. to return a book\n8. to exit");
			menu = scan.nextInt();
			if menu 
		}while(menu != 8);

		
	}

}
