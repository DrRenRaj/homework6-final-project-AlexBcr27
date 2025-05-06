package hw6;
import java.util.*;

class Book{
	public String title;
	public String author;
	public String isbn;
	public Boolean isAvailable;
	
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
	public String toString(){
		return( "Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Available: " + isAvailable);
	}
}

class Library {
	ArrayList<Book> books = new ArrayList<>();

	
	public void addBook(Book b){
		books.add(b);
	}

	public void removeBook(String bn){
		for( int i = 0; i< books.size();i++){
			if( books.get(i).isbn.equals(bn)){
				books.remove(i);
			}
		}
	}

	public void displayAllBooks(){
		for(int i = 0; i < books.size(); i++){
			System.out.println(books.get(i));
		}
	}

	public Book SearchByTitle(String title){
		for(int i = 0; i < books.size(); i++){
			if(books.get(i).title.equalsIgnoreCase(title)){
				return books.get(i);
			}
		}
		return null;
	}

	public Book searchByAuthor(String author){
		for(int i = 0; i < books.size(); i++){
			if(books.get(i).author.equalsIgnoreCase(author)){
				return books.get(i);
			}
		}
		return null;
	}

	public boolean checkOutBook(String isbn){
		for(int i = 0; i < books.size(); i++){
			if(books.get(i).isbn.equals(isbn)){
				books.get(i).SetAvailable(false);
				return true;
				}
			}
			return false;
	}


	public boolean returnBook(String isbn){
		for(int i = 0; i < books.size(); i++){
			if(books.get(i).isbn.equals(isbn)){
				books.get(i).SetAvailable(true);
				return true;
				}
			}
			return false;
	}	

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
		Library Lib =  new Library();
		do{
			System.out.println("please pick a choice from this list:\n1. to add a book\n2. to remove a book");
			System.out.println("3. to display all books\n4. to search by title\n 5. to search by author");
			System.out.println("6. to check out a book\n7. to return a book\n8. to exit");
			menu = scan.nextInt();
			if (menu == 1){
				System.out.println("please enter the title of the book");
				String Btitle = scan.nextLine();
				System.out.println("please enter the author of the book");
				String Bauthor = scan.nextLine();
				System.out.println("please enter the bin of the book");
				String Bbn = scan.nextLine();
				System.out.println("is this book available?");
				String BYN = scan.nextLine();
				Boolean avl;
				if(BYN.equalsIgnoreCase("yes")|| BYN.equalsIgnoreCase("y")){
					avl = true;
				}
				else{
					avl = false;
				}
				Book newBook = new Book(Btitle, Bauthor, Bbn, avl);
				Lib.addBook(newBook);
			}
			else if(menu == 2){
				System.out.println("enter 1 if you know the title of the book you would like to remove");
				System.out.println("enter 2 if you know the author of the book you would like to remove");
				int choose = scan.nextInt();
				if(choose == 1){
					System.out.println("Enter the title of the book would you like to remove?");
					String removeT = scan.nextLine();
					Book b = Lib.SearchByTitle(removeT);
					if (b != null){
						Lib.removeBook(b.isbn);
					}
					else{
						System.out.println("Book not found");
					}
				}
				else if(choose == 2){
					System.out.println("Enter the author of the book you would like to search");
					String removeA = scan.nextLine();
					Book bo = Lib.searchByAuthor(removeA);
					if (bo != null){
						Lib.removeBook(bo.isbn);
					}
					else{
						System.out.println("Book not found");
					}
					
				}
			}
			else if (menu == 3){
				Lib.displayAllBooks();
			}
			else if (menu == 4){
				System.out.println("Enter the title of the book you would like to search");
				String STitle = scan.nextLine();
				Book b = Lib.SearchByTitle(STitle);
				if (b != null){
					System.out.println(b);
				}
				else{
					System.out.println("Book not found");
				}
			}
			else if (menu == 5){
				System.out.println("Enter the author of the book you would like to search");
				String SAuthor = scan.nextLine();
				Book b = Lib.searchByAuthor(SAuthor);
				if (b != null){
					System.out.println(b);
				}
				else{
					System.out.println("Book not found");
				}
			}
			else if (menu == 6){
				Lib.displayAllBooks();
				System.out.println("Enter the title of the book you would like to check out");
				String STitle = scan.nextLine();
				Book B = Lib.SearchByTitle(STitle);
				if (B != null){
					if(Lib.checkOutBook(B.isbn)){
						System.out.println("Book has been checked out");
					}
					else{
						System.out.println("Cant check out book");
					}
				}
				else{
					System.out.println("Book has not been found");
				}
			}
			else if (menu == 7){
				Lib.displayAllBooks();
				System.out.println("Enter the title of the book you would like to return");
				String STitle = scan.next();
				Book b = Lib.SearchByTitle(STitle);
				if (b != null){
					if(Lib.returnBook(b.isbn)){
						System.out.println("Book has been returned");
					}
					else{
						System.out.println("Cant return book");
					}
				}
				else{
					System.out.println("Book has not been found");
				}
			}
			else if (menu == 8){
				System.out.println("Thank you");
			}
			else{
				System.out.println("Try again. Please pick a number from 1 to 8");
			}

		}while(menu != 8);
		scan.close();

		
	}

}
