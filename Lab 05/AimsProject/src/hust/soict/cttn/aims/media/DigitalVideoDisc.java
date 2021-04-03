package hust.soict.cttn.aims.media;

import java.util.Random;

public class DigitalVideoDisc extends Media {
	
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	
	private int nums;
	public void setNums(int num) {
		this.nums = this.nums + num;
		if(this.nums < 0) {
			this.nums = 0;
		}
	}
	
	public int getNums() {
		return nums;
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
		super(title);
		this.title =title;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(director);
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}

}
