package book;

import java.util.ArrayList;

public class ShippingService {
	
	private ArrayList<Book> shipped; 
	private String address; 
	
	public ShippingService(ArrayList<Book> shipped){
		this.shipped = shipped; 
	}

	public ArrayList<Book> getShipped() {
		return shipped;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

	
	

}
