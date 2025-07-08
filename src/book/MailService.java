package book;

import java.util.ArrayList;

public class MailService {
	
	private ArrayList<Book> mailed; 
	String email; 
	
	public MailService(ArrayList<Book> mailed){
		this.mailed = mailed; 
	}

	public ArrayList<Book> getMailed() {
		return mailed;
	}
	
	public void setEmail(String email){
	this.email = email; 
	}


}
