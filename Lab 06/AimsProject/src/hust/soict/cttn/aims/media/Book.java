package hust.soict.cttn.aims.media;

import java.util.ArrayList;

public class Book extends Media{
	private ArrayList<String> authors = new ArrayList<String>();
	
	public Book(String title) {
		super(title);
		}
	public Book(String title, String category){
		super(title, category);
		}
	public Book(String title, String category, ArrayList<String> authors){ 
		super(title, category);
		this.authors = authors;
//TODO: check author condition
}
	public void addAuthor(String atName) {
		int a = 0;
		for( int i = 0; i< this.authors.size(); i++) {
			if(atName.equals(this.authors.get(i))) {
				a = 1;
				break;
			}
		}
		if(a == 0) {
			authors.add(atName);
		}
	}
	
	public void removeAuthor(String atName) {
		int a = 0;
		for( int i = 0; i< this.authors.size(); i++) {
			if(atName.equals(this.authors.get(i))) {
				a = 1;
				authors.remove(i);
				break;
			}
		}
		if(a == 0) {
			System.out.println("Author '" + atName + "' no exist");
		}
	}

	public ArrayList<String> getAuthor() {
		return authors;
	}

	public void setAuthor(ArrayList<String> author) {
		this.authors = author;
	}
}
