package hust.soict.cttn.aims.media;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Book extends Media{
	private ArrayList<String> authors = new ArrayList<String>();
	private String content;
	private ArrayList<String> contentTokens = new ArrayList<String>();
	private Map<String, Integer> wordFrequency = new TreeMap<String, Integer>();
	private Set<Map.Entry<String, Integer>> setWordFrequency = wordFrequency.entrySet();
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
	
	public boolean search(String title) {
		String[] spaceStrings = title.split(" ");
		String[] tt = this.title.trim().split(" ");
		int b = 0; //b check title, b = 1 while spaceStrings[i] exist in title
		if(spaceStrings.length > tt.length) return false;
		else {
		for(int i = 0; i < spaceStrings.length; ++i) {
			int a = spaceStrings[i].length();
			b = 0;
			for(int j = 0; j < tt.length; ++j) {
				if(spaceStrings[i].equals(tt[j])) {
					tt[j] = ""; 
					b = 1;
					break;
				}
			}
			if(b == 0 ) {
				return false;
			}
		}
		}
		if(b == 1) {
			return true;
		}
		else {
			return false;
		}
	}

	public void setCategory(String category) {
		// TODO Auto-generated method stub
		this.category = category;
	}
	
	public void addContens(String content) {
		this.content = content;
	}
	public void ProcessContent() {
		int length = content.length();
		String[] spaces = content.split(" ");
		for(int i = 0; i < spaces.length; ++i) {
			if(spaces[i].endsWith(".") || spaces[i].endsWith(":") || spaces[i].endsWith(",") || spaces[i].endsWith(";")) {
				String a = spaces[i];
				spaces[i] = a.substring(0, a.length() -1) + a.substring(a.length()); 
			}
		}
		for(int i = 0; i < spaces.length; ++i) {
			if(!wordFrequency.containsKey(spaces[i])) {
				wordFrequency.put(spaces[i], 1);
			}
			else {
				wordFrequency.replace(spaces[i], wordFrequency.get(spaces[i]), wordFrequency.get(spaces[i]) +1);
			}
		}
		System.out.println("Book: " + this.title + "\nLeng of content: " + length);
		System.out.println(wordFrequency.toString());
	}
	
	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		this.title = title;
	}
	@Override
	public void setCost(float cost) {
		// TODO Auto-generated method stub
		this.cost = cost;
	}
	@Override
	public void setLength(int lenght) {
		// TODO Auto-generated method stub
		this.length = lenght;
	}
	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		this.id = id;
	}
	@Override
	public void setNums(int nums) {
		// TODO Auto-generated method stub
		this.nums = nums;
	}
}
