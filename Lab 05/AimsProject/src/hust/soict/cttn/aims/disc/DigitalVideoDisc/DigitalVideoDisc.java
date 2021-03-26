package hust.soict.cttn.aims.disc.DigitalVideoDisc;

import java.util.Random;

public class DigitalVideoDisc {
	
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private int status; 
	private boolean lucky = false;
	Random generator = new Random();
	
	public int getLuckyItem(int rd) {
		int a = generator.nextInt(rd);
		return a;
	}
	public boolean search(String title) {
		String[] spaceStrings = title.split(" ");
		int b = 0; //b check title, b = 1 while spaceStrings[i] exist in title
		for(int i = 0; i < spaceStrings.length; ++i) {
			int a = spaceStrings[i].length();
			b = 0;
			for(int j = 0; j <= this.title.length() - a; ++j) {
				if(spaceStrings[i].equals(this.title.substring(j, j + a))) {
					b = 1;
					break;
				}
			}
			if(b == 0 ) {
				return false;
			}
		}
		if(b == 1) {
			return true;
		}
		else {
			return false;
		}
	}
	public void setStatus(int a) {
		if(a == 1) {
			status = a; 
		}
		else {
			status = 0;
		}
	}
	
	public int getStatus() {
		return status;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title =title;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}

}
