package hust.soict.cttn.aims.media;

import java.util.Random;

public class DigitalVideoDisc extends Disc implements Playable, Comparable{
	
	
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
		}
	
	
	public void setDirector(String directory) {
		this.director = directory;
	}
	public DigitalVideoDisc(String title) {
		super(title);
		this.title =title;
	}
	public DigitalVideoDisc(String title, String category, String directory, int length, float cost) {
		super(title);
		this.title = title;
		this.category = category;
		this.director = directory;
		this.length = length;
		this.cost = cost;
	}
	
	
}
