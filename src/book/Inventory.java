package book;

import java.time.Year;
import java.util.ArrayList;
import java.util.HashMap;



import java.util.Iterator;

import exceptions.NoOutBooks;

public class Inventory {
	
	private HashMap<Book,Integer> inv;
	private ArrayList<Book> books; 
	
	public Inventory(){
		inv = new HashMap<>(); 
		books= new ArrayList<Book>(); 
	}
	
	
	
	public HashMap<Book, Integer> getInv() {
		return inv;
	}



	public ArrayList<Book> getBooks() {
		return books;
	}



	public void addBook(Book b){
		
		int count = inv.containsKey(b)? inv.get(b) : 0; 
		inv.put(b, count+1); 
		
		  if (!books.contains(b)) {
		        books.add(b);
		    }

		
	} 
	
	public ArrayList<Book> outDated(int year) throws NoOutBooks {
	    ArrayList<Book> outdatedBooks = new ArrayList<>();
	    Iterator<Book> it = books.iterator();
	    int currentYear = Year.now().getValue();

	    while (it.hasNext()) {
	        Book b = it.next();
	        int bookYear = b.getYear();

	        if ((currentYear - bookYear) >= year) {
	            it.remove(); 
	            inv.remove(b); 
	            outdatedBooks.add(b);
	        }
	    }

	    if (!outdatedBooks.isEmpty()) {
	        return outdatedBooks;
	    } else {
	        throw new NoOutBooks("No Outdated books to be displayed");
	    }
	}

	

	
	

}
