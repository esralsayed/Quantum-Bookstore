package book;

import java.util.ArrayList;

import exceptions.NoOutBooks;

public class Test {
	
	public static void main(String[] args){
		Inventory v = new Inventory(); 
		Customer c = new Customer(); 
		c.setV(v);
		PaperBook b1 = new PaperBook("1234","Little women",1955,500); 
		EBook b2= new EBook("5555","Peter pan",1933,100); 

		PaperBook b3 = new PaperBook("4444","1984",1975,150); 

		EBook b4 = new EBook("5364","the hunger games",2008,300); 
		DemoBook b5= new DemoBook("1111","Oliver twist",1911,0); 
		
		
		//test adding
		v.addBook(b1);
		v.addBook(b2);
		v.addBook(b3);
		
//		System.out.print(v.getInv()); 
		
		//--------------------------------------//
		
		//test removing
		
		/*ArrayList<Book> outdated = new ArrayList<Book>(); 
		
		try {
			outdated = v.outDated(50);
		} catch (NoOutBooks e) {
			
			System.out.print(e.getMessage());  
		} */
		
		//System.out.print(outdated); 
		//System.out.print(v.getInv()); 
		
		//--------------------------------------------//
		
		
		
		//test buying b3 
		 
		 
	/*v.addBook(b4);
	  v.addBook(b3); 
	  v.addBook(b3); 
	   v.addBook(b3); 
		double price=0; 
		
		try {
			price = c.buy("4444", "1984", 2, "@esra", "yasmin");
		} catch (NoOutBooks e) {
			// TODO Auto-generated catch block
			System.out.print(e.getMessage());  
		}
		
		System.out.print(price); 
	

	*/
		
		//-------------------------------------------//
		
		//try purchasing a demobook
		
	/*	v.addBook(b5);
		double price=0; 
		
		try {
			price = c.buy("1111", "Oliver twist", 1, "@esra", "yasmin");
		} catch (NoOutBooks e) {
			// TODO Auto-generated catch block
			System.out.print(e.getMessage());  
		}
		
		*/
		
		v.addBook(b2);
		v.addBook(b2);
		v.addBook(b2);
	
		double price=0; 

		try {
			price = c.buy("5555", "Peter pan", 5, "@esra", "yasmin");
		} catch (NoOutBooks e) {
			// TODO Auto-generated catch block
			System.out.print(e.getMessage());  
		}
		
		System.out.print(price); 

	}

}
