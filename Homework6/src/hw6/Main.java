package hw6;

//Add other classes here or separate java files in same package
class Book{
	String titl;
	String author;
	String isbn;
	Boolean isAvailable;
	
	public Book(String t, String a, String bn, Boolean isa){
		titl = t;
		author = a;
		isbn = bn;
		isAvailable = isa;
	}

	public String GetTitle(){
		return titl;
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

public Library {

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
		
	}

}
