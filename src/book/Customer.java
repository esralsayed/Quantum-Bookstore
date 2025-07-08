package book;

import java.util.ArrayList;

import exceptions.NoOutBooks;

public class Customer {
	
	ArrayList<Book> shipped; 
	ArrayList<Book> mailed; 
	ShippingService s; 
	MailService m; 
	Inventory v; 
	
	public Customer(){
		shipped = new ArrayList<Book>(); 
		mailed = new ArrayList<Book>(); 

		v = new Inventory(); 
		s = new ShippingService(shipped); 
		m= new MailService(mailed); 
	}
	
	
	
	public double buy(String isbn, String title, int quantity, String email, String address) throws NoOutBooks {
	    double price = 0;

	    for (int i = 0; i < v.getBooks().size(); i++) {
	        Book b = v.getBooks().get(i);

	        if (b instanceof DemoBook) {
	            throw new NoOutBooks("This is a demo book, cannot purchase it");
	        }

	        if (b.getIsbn().equals(isbn)) {
	            if (v.getInv().containsKey(b)) {
	                int currentQuan = v.getInv().get(b);
	                int purchasable = Math.min(currentQuan, quantity);

	                
	                price = purchasable * b.getPrice();

	                
	                int newQuan = currentQuan - purchasable;
	                if (newQuan > 0) {
	                    v.getInv().put(b, newQuan);
	                } else {
	                    v.getInv().remove(b);
	                    v.getBooks().remove(b);
	                }

	                
	                if (b instanceof PaperBook) {
	                    shipped.add(b);
	                    s.setAddress(address);
	                } else if (b instanceof EBook) {
	                    mailed.add(b);
	                    m.setEmail(email);
	                }

	                return price;
	            }
	        }
	    }

	    throw new NoOutBooks("No book available");
	}

	public Inventory getV() {
		return v;
	}

	public void setV(Inventory v) {
		this.v = v;
	}

	
	
	

}
